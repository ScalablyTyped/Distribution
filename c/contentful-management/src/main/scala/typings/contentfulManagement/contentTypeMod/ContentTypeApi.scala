package typings.contentfulManagement.contentTypeMod

import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.editorInterfaceMod.EditorInterface
import typings.contentfulManagement.snapshotMod.Snapshot
import typings.contentfulManagement.snapshotMod.SnapshotProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentTypeApi extends js.Object {
  
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
    * .then((space) => space.getContentType('<contentType_id>'))
    * .then((contentType) => contentType.delete())
    * .then(() => console.log('contentType deleted'))
    * .catch(console.error)
    * ```
    */
  def delete(): js.Promise[Unit] = js.native
  
  /**
    * Gets the editor interface for the object <br />
    * <strong>Important note</strong>: The editor interface only represent a published contentType.<br />
    * To get the most recent representation of the contentType make sure to publish it first
    * @return Object returned from the server with the current editor interface.
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getContentType('<contentType_id>'))
    * .then((contentType) => contentType.getEditorInterface())
    * .then((editorInterface) => console.log(editorInterface.contorls))
    * .catch(console.error)
    * ```
    */
  def getEditorInterface(): js.Promise[EditorInterface] = js.native
  
  /**
    * Gets a snapshot of a contentType
    * @param snapshotId - Id of the snapshot
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getContentType('<content_type-id>'))
    * .then((entry) => entry.getSnapshot('<snapshot-id>'))
    * .then((snapshot) => console.log(snapshot))
    * .catch(console.error)
    * ```
    */
  def getSnapshot(id: String): js.Promise[SnapshotProps[ContentTypeProps]] = js.native
  
  /**
    * Gets all snapshots of a contentType
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getContentType('<contentType_id>'))
    * .then((entry) => entry.getSnapshots())
    * .then((snapshots) => console.log(snapshots.items))
    * .catch(console.error)
    * ```
    */
  def getSnapshots(): js.Promise[Collection[Snapshot[ContentTypeProps], SnapshotProps[ContentTypeProps]]] = js.native
  
  /**
    * Checks if the contentType is in draft mode. This means it is not published.
    */
  def isDraft(): Boolean = js.native
  
  /**
    * Checks if the contentType is published. A published contentType might have unpublished changes (@see {ContentType.isUpdated})
    */
  def isPublished(): Boolean = js.native
  
  /**
    * Checks if the contentType is updated. This means the contentType was previously published but has unpublished changes.
    */
  def isUpdated(): Boolean = js.native
  
  /**
    * Omits and deletes a field if it exists on the contentType. This is a convenience method which does both operations at once and potentially less
    * safe than the standard way. See note about deleting fields on the Update method.
    * @return Object returned from the server with updated metadata.
    */
  def omitAndDeleteField(id: String): js.Promise[ContentType] = js.native
  
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
    * .then((space) => space.getContentType('<contentType_id>'))
    * .then((contentType) => contentType.publish())
    * .then((contentType) => console.log(`${contentType.sys.id} is published`))
    * .catch(console.error)
    * ```
    */
  def publish(): js.Promise[ContentType] = js.native
  
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
    * .then((space) => space.getContentType('<contentType_id>'))
    * .then((contentType) => contentType.unpublish())
    * .then((contentType) => console.log(`${contentType.sys.id} is unpublished`))
    * .catch(console.error)
    * ```
    */
  def unpublish(): js.Promise[ContentType] = js.native
  
  /**
    * Sends an update to the server with any changes made to the object's properties. <br />
    * <strong>Important note about deleting fields</strong>: The standard way to delete a field is with two updates: first omit the property from your responses (set the field attribute "omitted" to true), and then
    * delete it by setting the attribute "deleted" to true. See the "Deleting fields" section in the
    * <a href="https://www.contentful.com/developers/docs/references/content-management-api/#/reference/content-types/content-type">API reference</a> for more reasoning. Alternatively,
    * you may use the convenience method omitAndDeleteField to do both steps at once.
    * @return Object returned from the server with updated changes.
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getContentType('<contentType_id>'))
    * .then((contentType) => {
    *  contentType.name = 'New name'
    *  return contentType.update()
    * })
    * .then(contentType => console.log(contentType))
    * .catch(console.error)
    * ```
    */
  def update(): js.Promise[ContentType] = js.native
}
object ContentTypeApi {
  
  @scala.inline
  def apply(
    delete: () => js.Promise[Unit],
    getEditorInterface: () => js.Promise[EditorInterface],
    getSnapshot: String => js.Promise[SnapshotProps[ContentTypeProps]],
    getSnapshots: () => js.Promise[Collection[Snapshot[ContentTypeProps], SnapshotProps[ContentTypeProps]]],
    isDraft: () => Boolean,
    isPublished: () => Boolean,
    isUpdated: () => Boolean,
    omitAndDeleteField: String => js.Promise[ContentType],
    publish: () => js.Promise[ContentType],
    unpublish: () => js.Promise[ContentType],
    update: () => js.Promise[ContentType]
  ): ContentTypeApi = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), getEditorInterface = js.Any.fromFunction0(getEditorInterface), getSnapshot = js.Any.fromFunction1(getSnapshot), getSnapshots = js.Any.fromFunction0(getSnapshots), isDraft = js.Any.fromFunction0(isDraft), isPublished = js.Any.fromFunction0(isPublished), isUpdated = js.Any.fromFunction0(isUpdated), omitAndDeleteField = js.Any.fromFunction1(omitAndDeleteField), publish = js.Any.fromFunction0(publish), unpublish = js.Any.fromFunction0(unpublish), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[ContentTypeApi]
  }
  
  @scala.inline
  implicit class ContentTypeApiOps[Self <: ContentTypeApi] (val x: Self) extends AnyVal {
    
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
    def setDelete(value: () => js.Promise[Unit]): Self = this.set("delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEditorInterface(value: () => js.Promise[EditorInterface]): Self = this.set("getEditorInterface", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSnapshot(value: String => js.Promise[SnapshotProps[ContentTypeProps]]): Self = this.set("getSnapshot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSnapshots(value: () => js.Promise[Collection[Snapshot[ContentTypeProps], SnapshotProps[ContentTypeProps]]]): Self = this.set("getSnapshots", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDraft(value: () => Boolean): Self = this.set("isDraft", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsPublished(value: () => Boolean): Self = this.set("isPublished", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsUpdated(value: () => Boolean): Self = this.set("isUpdated", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOmitAndDeleteField(value: String => js.Promise[ContentType]): Self = this.set("omitAndDeleteField", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPublish(value: () => js.Promise[ContentType]): Self = this.set("publish", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnpublish(value: () => js.Promise[ContentType]): Self = this.set("unpublish", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: () => js.Promise[ContentType]): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
