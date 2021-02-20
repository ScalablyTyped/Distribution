package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.Sys
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import typings.contentfulManagement.commonTypesMod.MetadataProps
import typings.contentfulManagement.snapshotMod.Snapshot
import typings.contentfulManagement.snapshotMod.SnapshotProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryMod {
  
  @JSImport("contentful-management/dist/typings/entities/entry", "wrapEntry")
  @js.native
  def wrapEntry(http: AxiosInstance, data: EntryProp): Entry = js.native
  
  @JSImport("contentful-management/dist/typings/entities/entry", "wrapEntryCollection")
  @js.native
  def wrapEntryCollection(http: AxiosInstance, data: CollectionProp[EntryProp]): Collection[Entry, EntryProp] = js.native
  
  @js.native
  trait Entry
    extends EntryProp
       with DefaultElements[EntryProp]
       with EntryApi
  object Entry {
    
    @scala.inline
    def apply(
      archive: () => js.Promise[Entry],
      delete: () => js.Promise[Unit],
      fields: Record[String, _],
      getSnapshot: String => js.Promise[Snapshot[EntryProp]],
      getSnapshots: () => js.Promise[Collection[Snapshot[EntryProp], SnapshotProps[EntryProp]]],
      isArchived: () => Boolean,
      isDraft: () => Boolean,
      isPublished: () => Boolean,
      isUpdated: () => Boolean,
      publish: () => js.Promise[Entry],
      sys: EntrySys,
      toPlainObject: () => EntryProp,
      unarchive: () => js.Promise[Entry],
      unpublish: () => js.Promise[Entry],
      update: () => js.Promise[Entry]
    ): Entry = {
      val __obj = js.Dynamic.literal(archive = js.Any.fromFunction0(archive), delete = js.Any.fromFunction0(delete), fields = fields.asInstanceOf[js.Any], getSnapshot = js.Any.fromFunction1(getSnapshot), getSnapshots = js.Any.fromFunction0(getSnapshots), isArchived = js.Any.fromFunction0(isArchived), isDraft = js.Any.fromFunction0(isDraft), isPublished = js.Any.fromFunction0(isPublished), isUpdated = js.Any.fromFunction0(isUpdated), publish = js.Any.fromFunction0(publish), sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), unarchive = js.Any.fromFunction0(unarchive), unpublish = js.Any.fromFunction0(unpublish), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[Entry]
    }
  }
  
  @js.native
  trait EntryApi extends StObject {
    
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
    implicit class EntryApiMutableBuilder[Self <: EntryApi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArchive(value: () => js.Promise[Entry]): Self = StObject.set(x, "archive", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSnapshot(value: String => js.Promise[Snapshot[EntryProp]]): Self = StObject.set(x, "getSnapshot", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSnapshots(value: () => js.Promise[Collection[Snapshot[EntryProp], SnapshotProps[EntryProp]]]): Self = StObject.set(x, "getSnapshots", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsArchived(value: () => Boolean): Self = StObject.set(x, "isArchived", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDraft(value: () => Boolean): Self = StObject.set(x, "isDraft", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPublished(value: () => Boolean): Self = StObject.set(x, "isPublished", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsUpdated(value: () => Boolean): Self = StObject.set(x, "isUpdated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPublish(value: () => js.Promise[Entry]): Self = StObject.set(x, "publish", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnarchive(value: () => js.Promise[Entry]): Self = StObject.set(x, "unarchive", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnpublish(value: () => js.Promise[Entry]): Self = StObject.set(x, "unpublish", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => js.Promise[Entry]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait EntryProp extends StObject {
    
    var fields: Record[String, _] = js.native
    
    var metadata: js.UndefOr[MetadataProps] = js.native
    
    var sys: EntrySys = js.native
  }
  object EntryProp {
    
    @scala.inline
    def apply(fields: Record[String, _], sys: EntrySys): EntryProp = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryProp]
    }
    
    @scala.inline
    implicit class EntryPropMutableBuilder[Self <: EntryProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: Record[String, _]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: MetadataProps): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setSys(value: EntrySys): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EntrySys extends MetaSysProps {
    
    var contentType: Sys = js.native
    
    var environment: Sys = js.native
    
    var firstPublishedAt: js.UndefOr[String] = js.native
    
    var publishedAt: js.UndefOr[String] = js.native
    
    var publishedBy: js.UndefOr[Sys] = js.native
    
    var publishedCounter: js.UndefOr[Double] = js.native
  }
  object EntrySys {
    
    @scala.inline
    def apply(
      contentType: Sys,
      createdAt: String,
      environment: Sys,
      id: String,
      `type`: String,
      updatedAt: String,
      version: Double
    ): EntrySys = {
      val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntrySys]
    }
    
    @scala.inline
    implicit class EntrySysMutableBuilder[Self <: EntrySys] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: Sys): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironment(value: Sys): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstPublishedAt(value: String): Self = StObject.set(x, "firstPublishedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstPublishedAtUndefined: Self = StObject.set(x, "firstPublishedAt", js.undefined)
      
      @scala.inline
      def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
      
      @scala.inline
      def setPublishedBy(value: Sys): Self = StObject.set(x, "publishedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishedByUndefined: Self = StObject.set(x, "publishedBy", js.undefined)
      
      @scala.inline
      def setPublishedCounter(value: Double): Self = StObject.set(x, "publishedCounter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishedCounterUndefined: Self = StObject.set(x, "publishedCounter", js.undefined)
    }
  }
}
