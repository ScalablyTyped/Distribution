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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryMod {
  
  @JSImport("contentful-management/dist/typings/entities/entry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapEntry(http: AxiosInstance, data: EntryProp): Entry = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapEntry")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Entry]
  
  inline def wrapEntryCollection(http: AxiosInstance, data: CollectionProp[EntryProp]): Collection[Entry, EntryProp] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapEntryCollection")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Collection[Entry, EntryProp]]
  
  trait Entry
    extends StObject
       with EntryProp
       with DefaultElements[EntryProp]
       with EntryApi
  object Entry {
    
    inline def apply(
      archive: () => js.Promise[Entry],
      delete: () => js.Promise[Unit],
      fields: Record[String, js.Any],
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
    def archive(): js.Promise[Entry]
    
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
    def delete(): js.Promise[Unit]
    
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
    def getSnapshot(id: String): js.Promise[Snapshot[EntryProp]]
    
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
    def getSnapshots(): js.Promise[Collection[Snapshot[EntryProp], SnapshotProps[EntryProp]]]
    
    /**
      * Checks if entry is archived. This means it's not exposed to the Delivery/Preview APIs.
      */
    def isArchived(): Boolean
    
    /**
      * Checks if the entry is in draft mode. This means it is not published.
      */
    def isDraft(): Boolean
    
    /**
      * Checks if the entry is published. A published entry might have unpublished changes
      */
    def isPublished(): Boolean
    
    /**
      * Checks if the entry is updated. This means the entry was previously published but has unpublished changes.
      */
    def isUpdated(): Boolean
    
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
    def publish(): js.Promise[Entry]
    
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
    def unarchive(): js.Promise[Entry]
    
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
    def unpublish(): js.Promise[Entry]
    
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
    def update(): js.Promise[Entry]
  }
  object EntryApi {
    
    inline def apply(
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
    
    extension [Self <: EntryApi](x: Self) {
      
      inline def setArchive(value: () => js.Promise[Entry]): Self = StObject.set(x, "archive", js.Any.fromFunction0(value))
      
      inline def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      inline def setGetSnapshot(value: String => js.Promise[Snapshot[EntryProp]]): Self = StObject.set(x, "getSnapshot", js.Any.fromFunction1(value))
      
      inline def setGetSnapshots(value: () => js.Promise[Collection[Snapshot[EntryProp], SnapshotProps[EntryProp]]]): Self = StObject.set(x, "getSnapshots", js.Any.fromFunction0(value))
      
      inline def setIsArchived(value: () => Boolean): Self = StObject.set(x, "isArchived", js.Any.fromFunction0(value))
      
      inline def setIsDraft(value: () => Boolean): Self = StObject.set(x, "isDraft", js.Any.fromFunction0(value))
      
      inline def setIsPublished(value: () => Boolean): Self = StObject.set(x, "isPublished", js.Any.fromFunction0(value))
      
      inline def setIsUpdated(value: () => Boolean): Self = StObject.set(x, "isUpdated", js.Any.fromFunction0(value))
      
      inline def setPublish(value: () => js.Promise[Entry]): Self = StObject.set(x, "publish", js.Any.fromFunction0(value))
      
      inline def setUnarchive(value: () => js.Promise[Entry]): Self = StObject.set(x, "unarchive", js.Any.fromFunction0(value))
      
      inline def setUnpublish(value: () => js.Promise[Entry]): Self = StObject.set(x, "unpublish", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: () => js.Promise[Entry]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait EntryProp extends StObject {
    
    var fields: Record[String, js.Any]
    
    var metadata: js.UndefOr[MetadataProps] = js.undefined
    
    var sys: EntrySys
  }
  object EntryProp {
    
    inline def apply(fields: Record[String, js.Any], sys: EntrySys): EntryProp = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryProp]
    }
    
    extension [Self <: EntryProp](x: Self) {
      
      inline def setFields(value: Record[String, js.Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: MetadataProps): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setSys(value: EntrySys): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
  
  trait EntrySys
    extends StObject
       with MetaSysProps {
    
    var contentType: Sys
    
    var environment: Sys
    
    var firstPublishedAt: js.UndefOr[String] = js.undefined
    
    var publishedAt: js.UndefOr[String] = js.undefined
    
    var publishedBy: js.UndefOr[Sys] = js.undefined
    
    var publishedCounter: js.UndefOr[Double] = js.undefined
  }
  object EntrySys {
    
    inline def apply(
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
    
    extension [Self <: EntrySys](x: Self) {
      
      inline def setContentType(value: Sys): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setEnvironment(value: Sys): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setFirstPublishedAt(value: String): Self = StObject.set(x, "firstPublishedAt", value.asInstanceOf[js.Any])
      
      inline def setFirstPublishedAtUndefined: Self = StObject.set(x, "firstPublishedAt", js.undefined)
      
      inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
      
      inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
      
      inline def setPublishedBy(value: Sys): Self = StObject.set(x, "publishedBy", value.asInstanceOf[js.Any])
      
      inline def setPublishedByUndefined: Self = StObject.set(x, "publishedBy", js.undefined)
      
      inline def setPublishedCounter(value: Double): Self = StObject.set(x, "publishedCounter", value.asInstanceOf[js.Any])
      
      inline def setPublishedCounterUndefined: Self = StObject.set(x, "publishedCounter", js.undefined)
    }
  }
}
