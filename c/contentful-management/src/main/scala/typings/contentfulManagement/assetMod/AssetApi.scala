package typings.contentfulManagement.assetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetApi extends js.Object {
  
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
