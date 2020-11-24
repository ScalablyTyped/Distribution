package typings.contentfulManagement.entryMod

import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.snapshotMod.Snapshot
import typings.contentfulManagement.snapshotMod.SnapshotProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntryApi extends js.Object {
  
  /**
    * Archives the object
    * @return Object returned from the server with updated metadata.
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEntry('<entry_id>'))
    * .then((entry) => entry.archive())
    * .then((entry) => console.log(`Entry ${entry.sys.id} archived.`))
    * .catch(console.error)
    * ```
    */
  def archive(): js.Promise[Entry] = js.native
  
  /**
    * Deletes this object on the server.
    * @return Promise for the deletion. It contains no data, but the Promise error case should be handled.
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEntry('<entry_id>'))
    * .then((entry) => entry.delete())
    * .then(() => console.log(`Entry deleted.`))
    * .catch(console.error)
    * ```
    */
  def delete(): js.Promise[Unit] = js.native
  
  /**
    * Gets a snapshot of an entry
    * @param snapshotId - Id of the snapshot
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEntry('<entry_id>'))
    * .then((entry) => entry.getSnapshot('<snapshot_id>'))
    * .then((snapshot) => console.log(snapshot))
    * .catch(console.error)
    * ```
    */
  def getSnapshot(id: String): js.Promise[Snapshot[EntryProp]] = js.native
  
  /**
    * Gets all snapshots of an entry
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEntry('<entry_id>'))
    * .then((entry) => entry.getSnapshots())
    * .then((snapshots) => console.log(snapshots.items))
    * .catch(console.error)
    * ```
    */
  def getSnapshots(): js.Promise[Collection[Snapshot[EntryProp], SnapshotProps[EntryProp]]] = js.native
  
  /**
    * Checks if entry is archived. This means it's not exposed to the Delivery/Preview APIs.
    */
  def isArchived(): Boolean = js.native
  
  /**
    * Checks if the entry is in draft mode. This means it is not published.
    */
  def isDraft(): Boolean = js.native
  
  /**
    * Checks if the entry is published. A published entry might have unpublished changes
    */
  def isPublished(): Boolean = js.native
  
  /**
    * Checks if the entry is updated. This means the entry was previously published but has unpublished changes.
    */
  def isUpdated(): Boolean = js.native
  
  /**
    * Publishes the object
    * @return Object returned from the server with updated metadata.
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEntry('<entry_id>'))
    * .then((entry) => entry.publish())
    * .then((entry) => console.log(`Entry ${entry.sys.id} published.`))
    * .catch(console.error)
    * ```
    */
  def publish(): js.Promise[Entry] = js.native
  
  /**
    * Unarchives the object
    * @return Object returned from the server with updated metadata.
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEntry('<entry_id>'))
    * .then((entry) => entry.unarchive())
    * .then((entry) => console.log(`Entry ${entry.sys.id} unarchived.`))
    * .catch(console.error)
    * ```
    */
  def unarchive(): js.Promise[Entry] = js.native
  
  /**
    * Unpublishes the object
    * @return Object returned from the server with updated metadata.
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEntry('<entry_id>'))
    * .then((entry) => entry.unpublish())
    * .then((entry) => console.log(`Entry ${entry.sys.id} unpublished.`))
    * .catch(console.error)
    * ```
    */
  def unpublish(): js.Promise[Entry] = js.native
  
  /**
    * Sends an update to the server with any changes made to the object's properties
    * @return Object returned from the server with updated changes.
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEntry('<entry_id>'))
    * .then((entry) => {
    *   entry.fields.title['en-US'] = 'New entry title'
    *   return entry.update()
    * })
    * .then((entry) => console.log(`Entry ${entry.sys.id} updated.`))
    * .catch(console.error)
    * ```
    */
  def update(): js.Promise[Entry] = js.native
}
object EntryApi {
  
  @scala.inline
  def apply(
    archive: () => js.Promise[Entry],
    delete: () => js.Promise[Unit],
    getSnapshot: String => js.Promise[Snapshot[EntryProp]],
    getSnapshots: () => js.Promise[Collection[Snapshot[EntryProp], SnapshotProps[EntryProp]]],
    isArchived: () => Boolean,
    isDraft: () => Boolean,
    isPublished: () => Boolean,
    isUpdated: () => Boolean,
    publish: () => js.Promise[Entry],
    unarchive: () => js.Promise[Entry],
    unpublish: () => js.Promise[Entry],
    update: () => js.Promise[Entry]
  ): EntryApi = {
    val __obj = js.Dynamic.literal(archive = js.Any.fromFunction0(archive), delete = js.Any.fromFunction0(delete), getSnapshot = js.Any.fromFunction1(getSnapshot), getSnapshots = js.Any.fromFunction0(getSnapshots), isArchived = js.Any.fromFunction0(isArchived), isDraft = js.Any.fromFunction0(isDraft), isPublished = js.Any.fromFunction0(isPublished), isUpdated = js.Any.fromFunction0(isUpdated), publish = js.Any.fromFunction0(publish), unarchive = js.Any.fromFunction0(unarchive), unpublish = js.Any.fromFunction0(unpublish), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[EntryApi]
  }
  
  @scala.inline
  implicit class EntryApiOps[Self <: EntryApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArchive(value: () => js.Promise[Entry]): Self = this.set("archive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(value: () => js.Promise[Unit]): Self = this.set("delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSnapshot(value: String => js.Promise[Snapshot[EntryProp]]): Self = this.set("getSnapshot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSnapshots(value: () => js.Promise[Collection[Snapshot[EntryProp], SnapshotProps[EntryProp]]]): Self = this.set("getSnapshots", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsArchived(value: () => Boolean): Self = this.set("isArchived", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDraft(value: () => Boolean): Self = this.set("isDraft", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsPublished(value: () => Boolean): Self = this.set("isPublished", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsUpdated(value: () => Boolean): Self = this.set("isUpdated", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPublish(value: () => js.Promise[Entry]): Self = this.set("publish", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnarchive(value: () => js.Promise[Entry]): Self = this.set("unarchive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnpublish(value: () => js.Promise[Entry]): Self = this.set("unpublish", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: () => js.Promise[Entry]): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
