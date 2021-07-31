package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.Description
import typings.contentfulManagement.anon.Title
import typings.contentfulManagement.anon.localestringMetaSysProps
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import typings.contentfulManagement.commonTypesMod.MetadataProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetMod {
  
  @JSImport("contentful-management/dist/typings/entities/asset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def wrapAsset(http: AxiosInstance, data: AssetProps): Asset = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapAsset")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Asset]
  
  @scala.inline
  def wrapAssetCollection(http: AxiosInstance, data: CollectionProp[AssetProps]): Collection[Asset, AssetProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapAssetCollection")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Collection[Asset, AssetProps]]
  
  @js.native
  trait Asset
    extends StObject
       with AssetProps
       with DefaultElements[AssetProps]
       with AssetApi
  
  @js.native
  trait AssetApi extends StObject {
    
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
      * .then((space) => space.getAsset('<asset_id>'))
      * .then((asset) => asset.archive())
      * .then((asset) => console.log(`Asset ${asset.sys.id} archived.`)
      * .catch(console.error)
      * ```
      */
    def archive(): js.Promise[Asset] = js.native
    
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
      * .then((space) => space.getAsset('<asset_id>'))
      * .then((asset) => asset.delete())
      * .then((asset) => console.log(`Asset deleted.`)
      * .catch(console.error)
      * ```
      */
    def delete(): js.Promise[Unit] = js.native
    
    /**
      * Checks if asset is archived. This means it's not exposed to the Delivery/Preview APIs.
      */
    def isArchived(): Boolean = js.native
    
    /**
      * Checks if the asset is in draft mode. This means it is not published.
      */
    def isDraft(): Boolean = js.native
    
    /**
      * Checks if the asset is published. A published asset might have unpublished changes
      */
    def isPublished(): Boolean = js.native
    
    /**
      * Checks if the asset is updated. This means the asset was previously published but has unpublished changes.
      */
    def isUpdated(): Boolean = js.native
    
    /**
      * Triggers asset processing after an upload, for the files uploaded to all locales of an asset.
      * @param options - Additional options for processing
      * @prop options.processingCheckWait - Time in milliseconds to wait before checking again if the asset has been processed (default: 500ms)
      * @prop options.processingCheckRetries - Maximum amount of times to check if the asset has been processed (default: 5)
      * @return Object returned from the server with updated metadata.
      * @throws {AssetProcessingTimeout} If the asset takes too long to process. If this happens, retrieve the asset again, and if the url property is available, then processing has succeeded. If not, your file might be damaged.
      * @example ```javascript
      * const contentful = require('contentful-management')
      *
      * const client = contentful.createClient({
      *   accessToken: '<content_management_api_key>'
      * })
      * client.getSpace('<space_id>')
      * .then((space) => space.createAssetWithId('<asset_id>', {
      *   title: {
      *     'en-US': 'Playsam Streamliner',
      *     'de-DE': 'Playsam Streamliner'
      *   },
      *   file: {
      *     'en-US': {
      *       contentType: 'image/jpeg',
      *       fileName: 'example.jpeg',
      *       upload: 'https://example.com/example.jpg'
      *     },
      *     'de-DE': {
      *       contentType: 'image/jpeg',
      *       fileName: 'example.jpeg',
      *       upload: 'https://example.com/example-de.jpg'
      *     }
      *   }
      * }))
      * .then((asset) => asset.processForAllLocales())
      * .then((asset) => console.log(asset))
      * .catch(console.error)
      * ```
      */
    def processForAllLocales(): js.Promise[Asset] = js.native
    def processForAllLocales(options: AssetProcessingForLocale): js.Promise[Asset] = js.native
    
    /**
      * Triggers asset processing after an upload, for the file uploaded to a specific locale.
      * @param locale - Locale which processing should be triggered for
      * @param options - Additional options for processing
      * @prop options.processingCheckWait - Time in milliseconds to wait before checking again if the asset has been processed (default: 500ms)
      * @prop options.processingCheckRetries - Maximum amount of times to check if the asset has been processed (default: 5)
      * @return Object returned from the server with updated metadata.
      * @throws {AssetProcessingTimeout} If the asset takes too long to process. If this happens, retrieve the asset again, and if the url property is available, then processing has succeeded. If not, your file might be damaged.
      * @example ```javascript
      * const contentful = require('contentful-management')
      *
      * const client = contentful.createClient({
      *   accessToken: '<content_management_api_key>'
      * })
      * client.getSpace('<space_id>')
      * .then((space) => space.createAssetWithId('<asset_id>', {
      *   title: {
      *     'en-US': 'Playsam Streamliner',
      *   },
      *   file: {
      *     'en-US': {
      *       contentType: 'image/jpeg',
      *       fileName: 'example.jpeg',
      *       upload: 'https://example.com/example.jpg'
      *     }
      *   }
      * }))
      * .then((asset) => asset.processForLocale('en-US'))
      * .then((asset) => console.log(asset))
      * .catch(console.error)
      * ```
      */
    def processForLocale(locale: String): js.Promise[Asset] = js.native
    def processForLocale(locale: String, Options: AssetProcessingForLocale): js.Promise[Asset] = js.native
    
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
      * .then((space) => space.getAsset('<asset_id>'))
      * .then((asset) => asset.publish())
      * .then((asset) => console.log(`Asset ${asset.sys.id} published.`)
      * .catch(console.error)
      * ```
      */
    def publish(): js.Promise[Asset] = js.native
    
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
      * .then((space) => space.getAsset('<asset_id>'))
      * .then((asset) => asset.unarchive())
      * .then((asset) => console.log(`Asset ${asset.sys.id} unarchived.`)
      * .catch(console.error)
      * ```
      */
    def unarchive(): js.Promise[Asset] = js.native
    
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
      * .then((space) => space.getAsset('<asset_id>'))
      * .then((asset) => asset.unpublish())
      * .then((asset) => console.log(`Asset ${asset.sys.id} unpublished.`)
      * .catch(console.error)
      * ```
      */
    def unpublish(): js.Promise[Asset] = js.native
    
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
      * .then((space) => space.getAsset('<asset_id>'))
      * .then((asset) => {
      *   asset.fields.title['en-US'] = 'New asset title'
      *   return asset.update()
      * })
      * .then((asset) => console.log(`Asset ${asset.sys.id} updated.`)
      * .catch(console.error)
      * ```
      */
    def update(): js.Promise[Asset] = js.native
  }
  
  trait AssetFileProp extends StObject {
    
    var fields: Title
    
    var sys: MetaSysProps
  }
  object AssetFileProp {
    
    @scala.inline
    def apply(fields: Title, sys: MetaSysProps): AssetFileProp = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetFileProp]
    }
    
    @scala.inline
    implicit class AssetFilePropMutableBuilder[Self <: AssetFileProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: Title): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
  
  trait AssetProcessingForLocale extends StObject {
    
    var processingCheckRetries: js.UndefOr[Double] = js.undefined
    
    var processingCheckWait: js.UndefOr[Double] = js.undefined
  }
  object AssetProcessingForLocale {
    
    @scala.inline
    def apply(): AssetProcessingForLocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssetProcessingForLocale]
    }
    
    @scala.inline
    implicit class AssetProcessingForLocaleMutableBuilder[Self <: AssetProcessingForLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProcessingCheckRetries(value: Double): Self = StObject.set(x, "processingCheckRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessingCheckRetriesUndefined: Self = StObject.set(x, "processingCheckRetries", js.undefined)
      
      @scala.inline
      def setProcessingCheckWait(value: Double): Self = StObject.set(x, "processingCheckWait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessingCheckWaitUndefined: Self = StObject.set(x, "processingCheckWait", js.undefined)
    }
  }
  
  trait AssetProps extends StObject {
    
    var fields: Description
    
    var metadata: js.UndefOr[MetadataProps] = js.undefined
    
    var sys: localestringMetaSysProps
  }
  object AssetProps {
    
    @scala.inline
    def apply(fields: Description, sys: localestringMetaSysProps): AssetProps = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetProps]
    }
    
    @scala.inline
    implicit class AssetPropsMutableBuilder[Self <: AssetProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: Description): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: MetadataProps): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setSys(value: localestringMetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
