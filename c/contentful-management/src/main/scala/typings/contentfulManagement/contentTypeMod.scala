package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.ExceptContentTypePropssys
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import typings.contentfulManagement.contentTypeFieldsMod.ContentFields
import typings.contentfulManagement.contentfulManagementStrings.description
import typings.contentfulManagement.contentfulManagementStrings.displayField
import typings.contentfulManagement.editorInterfaceMod.EditorInterface
import typings.contentfulManagement.snapshotMod.Snapshot
import typings.contentfulManagement.snapshotMod.SnapshotProps
import typings.typeFest.setOptionalMod.SetOptional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentTypeMod {
  
  @JSImport("contentful-management/dist/typings/entities/content-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def wrapContentType(http: AxiosInstance, data: ContentTypeProps): ContentType = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapContentType")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ContentType]
  
  @scala.inline
  def wrapContentTypeCollection(http: AxiosInstance, data: CollectionProp[ContentTypeProps]): Collection[ContentType, ContentTypeProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapContentTypeCollection")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Collection[ContentType, ContentTypeProps]]
  
  trait ContentType
    extends StObject
       with ContentTypeProps
       with DefaultElements[ContentTypeProps]
       with ContentTypeApi
  object ContentType {
    
    @scala.inline
    def apply(
      delete: () => js.Promise[Unit],
      description: String,
      displayField: String,
      fields: js.Array[ContentFields],
      getEditorInterface: () => js.Promise[EditorInterface],
      getSnapshot: String => js.Promise[SnapshotProps[ContentTypeProps]],
      getSnapshots: () => js.Promise[Collection[Snapshot[ContentTypeProps], SnapshotProps[ContentTypeProps]]],
      isDraft: () => Boolean,
      isPublished: () => Boolean,
      isUpdated: () => Boolean,
      name: String,
      omitAndDeleteField: String => js.Promise[ContentType],
      publish: () => js.Promise[ContentType],
      sys: MetaSysProps,
      toPlainObject: () => ContentTypeProps,
      unpublish: () => js.Promise[ContentType],
      update: () => js.Promise[ContentType]
    ): ContentType = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), description = description.asInstanceOf[js.Any], displayField = displayField.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], getEditorInterface = js.Any.fromFunction0(getEditorInterface), getSnapshot = js.Any.fromFunction1(getSnapshot), getSnapshots = js.Any.fromFunction0(getSnapshots), isDraft = js.Any.fromFunction0(isDraft), isPublished = js.Any.fromFunction0(isPublished), isUpdated = js.Any.fromFunction0(isUpdated), name = name.asInstanceOf[js.Any], omitAndDeleteField = js.Any.fromFunction1(omitAndDeleteField), publish = js.Any.fromFunction0(publish), sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), unpublish = js.Any.fromFunction0(unpublish), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[ContentType]
    }
  }
  
  trait ContentTypeApi extends StObject {
    
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
    def delete(): js.Promise[Unit]
    
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
    def getEditorInterface(): js.Promise[EditorInterface]
    
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
    def getSnapshot(id: String): js.Promise[SnapshotProps[ContentTypeProps]]
    
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
    def getSnapshots(): js.Promise[Collection[Snapshot[ContentTypeProps], SnapshotProps[ContentTypeProps]]]
    
    /**
      * Checks if the contentType is in draft mode. This means it is not published.
      */
    def isDraft(): Boolean
    
    /**
      * Checks if the contentType is published. A published contentType might have unpublished changes (@see {ContentType.isUpdated})
      */
    def isPublished(): Boolean
    
    /**
      * Checks if the contentType is updated. This means the contentType was previously published but has unpublished changes.
      */
    def isUpdated(): Boolean
    
    /**
      * Omits and deletes a field if it exists on the contentType. This is a convenience method which does both operations at once and potentially less
      * safe than the standard way. See note about deleting fields on the Update method.
      * @return Object returned from the server with updated metadata.
      */
    def omitAndDeleteField(id: String): js.Promise[ContentType]
    
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
    def publish(): js.Promise[ContentType]
    
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
    def unpublish(): js.Promise[ContentType]
    
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
    def update(): js.Promise[ContentType]
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
    implicit class ContentTypeApiMutableBuilder[Self <: ContentTypeApi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEditorInterface(value: () => js.Promise[EditorInterface]): Self = StObject.set(x, "getEditorInterface", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSnapshot(value: String => js.Promise[SnapshotProps[ContentTypeProps]]): Self = StObject.set(x, "getSnapshot", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSnapshots(value: () => js.Promise[Collection[Snapshot[ContentTypeProps], SnapshotProps[ContentTypeProps]]]): Self = StObject.set(x, "getSnapshots", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDraft(value: () => Boolean): Self = StObject.set(x, "isDraft", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPublished(value: () => Boolean): Self = StObject.set(x, "isPublished", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsUpdated(value: () => Boolean): Self = StObject.set(x, "isUpdated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOmitAndDeleteField(value: String => js.Promise[ContentType]): Self = StObject.set(x, "omitAndDeleteField", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPublish(value: () => js.Promise[ContentType]): Self = StObject.set(x, "publish", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnpublish(value: () => js.Promise[ContentType]): Self = StObject.set(x, "unpublish", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => js.Promise[ContentType]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait ContentTypeProps extends StObject {
    
    var description: String
    
    /** Field used as the main display field for Entries */
    var displayField: String
    
    /** All the fields contained in this Content Type */
    var fields: js.Array[ContentFields]
    
    var name: String
    
    var sys: MetaSysProps
  }
  object ContentTypeProps {
    
    @scala.inline
    def apply(
      description: String,
      displayField: String,
      fields: js.Array[ContentFields],
      name: String,
      sys: MetaSysProps
    ): ContentTypeProps = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayField = displayField.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentTypeProps]
    }
    
    @scala.inline
    implicit class ContentTypePropsMutableBuilder[Self <: ContentTypeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayField(value: String): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFields(value: js.Array[ContentFields]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsVarargs(value: ContentFields*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
  
  type CreateContentTypeProps = SetOptional[ExceptContentTypePropssys, description | displayField]
}
