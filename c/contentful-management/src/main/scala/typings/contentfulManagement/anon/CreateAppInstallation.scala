package typings.contentfulManagement.anon

import typings.contentfulManagement.appInstallationMod.AppInstallation
import typings.contentfulManagement.appInstallationMod.AppInstallationProps
import typings.contentfulManagement.assetMod.Asset
import typings.contentfulManagement.assetMod.AssetProps
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.QueryOptions
import typings.contentfulManagement.contentTypeMod.ContentTypeProps
import typings.contentfulManagement.contentTypeMod.CreateContentTypeProps
import typings.contentfulManagement.editorInterfaceMod.EditorInterface
import typings.contentfulManagement.entryMod.Entry
import typings.contentfulManagement.entryMod.EntryProp
import typings.contentfulManagement.environmentMod.Environment
import typings.contentfulManagement.localeMod.CreateLocaleProps
import typings.contentfulManagement.localeMod.Locale
import typings.contentfulManagement.localeMod.LocaleProps
import typings.contentfulManagement.snapshotMod.Snapshot
import typings.contentfulManagement.snapshotMod.SnapshotProps
import typings.contentfulManagement.tagMod.Tag
import typings.contentfulManagement.tagMod.TagProps
import typings.contentfulManagement.uiExtensionMod.UIExtension
import typings.contentfulManagement.uiExtensionMod.UIExtensionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAppInstallation extends StObject {
  
  /**
    * Gets an App Installation
    * @param appDefinitionId - AppDefinition ID
    * @param data - AppInstallation data
    * @return Promise for an App Installation
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    *  .then((space) => space.getEnvironment('<environment-id>'))
    *  .then((environment) => environment.createAppInstallation('<app_definition_id>', {
    *    parameters: {
    *      someParameter: someValue
    *    }
    *   })
    *  .then((appInstallation) => console.log(appInstallation))
    *  .catch(console.error)
    *  ```
    */
  def createAppInstallation(appDefinitionId: String, data: OmitAppInstallationPropss): js.Promise[AppInstallation] = js.native
  
  /**
    * Creates a Asset. After creation, call asset.processForLocale or asset.processForAllLocales to start asset processing.
    * @param data - Object representation of the Asset to be created. Note that the field object should have an upload property on asset creation, which will be removed and replaced with an url property when processing is finished.
    * @return Promise for the newly created Asset
    * @example ```javascript
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * // Create asset
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.createAsset({
    *   fields: {
    *     title: {
    *       'en-US': 'Playsam Streamliner'
    *    },
    *    file: {
    *       'en-US': {
    *         contentType: 'image/jpeg',
    *        fileName: 'example.jpeg',
    *        upload: 'https://example.com/example.jpg'
    *      }
    *    }
    *   }
    * }))
    * .then((asset) => asset.processForLocale("en-US")) // OR asset.processForAllLocales()
    * .then((asset) => console.log(asset))
    * .catch(console.error)
    * ```
    */
  def createAsset(data: OmitAssetPropssys): js.Promise[Asset] = js.native
  
  /**
    * Creates a Asset based on files. After creation, call asset.processForLocale or asset.processForAllLocales to start asset processing.
    * @param data - Object representation of the Asset to be created. Note that the field object should have an uploadFrom property on asset creation, which will be removed and replaced with an url property when processing is finished.
    * @param data.fields.file.[LOCALE].file - Can be a string, an ArrayBuffer or a Stream.
    * @return Promise for the newly created Asset
    * @example ```javascript
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.createAssetFromFiles({
    *   fields: {
    *     file: {
    *       'en-US': {
    *          contentType: 'image/jpeg',
    *          fileName: 'filename_english.jpg',
    *          file: createReadStream('path/to/filename_english.jpg')
    *       },
    *       'de-DE': {
    *          contentType: 'image/svg+xml',
    *          fileName: 'filename_german.svg',
    *          file: '<svg><path fill="red" d="M50 50h150v50H50z"/></svg>'
    *       }
    *     }
    *   }
    * }))
    * .then((asset) => console.log(asset))
    * .catch(console.error)
    * ```
    */
  def createAssetFromFiles(data: OmitAssetFilePropsys): js.Promise[Asset] = js.native
  
  /**
    * Creates a Asset with a custom ID. After creation, call asset.processForLocale or asset.processForAllLocales to start asset processing.
    * @param id - Asset ID
    * @param data - Object representation of the Asset to be created. Note that the field object should have an upload property on asset creation, which will be removed and replaced with an url property when processing is finished.
    * @return Promise for the newly created Asset
    * @example ```javascript
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * // Create asset
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.createAssetWithId('<asset_id>', {
    *   title: {
    *     'en-US': 'Playsam Streamliner'
    *   },
    *   file: {
    *     'en-US': {
    *       contentType: 'image/jpeg',
    *       fileName: 'example.jpeg',
    *       upload: 'https://example.com/example.jpg'
    *     }
    *   }
    * }))
    * .then((asset) => asset.process())
    * .then((asset) => console.log(asset))
    * .catch(console.error)
    * ```
    */
  def createAssetWithId(id: String, data: OmitAssetPropssys): js.Promise[Asset] = js.native
  
  /**
    * Creates a Content Type
    * @param data - Object representation of the Content Type to be created
    * @return Promise for the newly created Content Type
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.createContentType({
    *   name: 'Blog Post',
    *   fields: [
    *     {
    *       id: 'title',
    *       name: 'Title',
    *       required: true,
    *       localized: false,
    *       type: 'Text'
    *     }
    *   ]
    * }))
    * .then((contentType) => console.log(contentType))
    * .catch(console.error)
    * ```
    */
  def createContentType(data: CreateContentTypeProps): js.Promise[typings.contentfulManagement.contentTypeMod.ContentType] = js.native
  
  /**
    * Creates a Content Type with a custom ID
    * @param id - Content Type ID
    * @param data - Object representation of the Content Type to be created
    * @return Promise for the newly created Content Type
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.createContentTypeWithId('<content-type-id>', {
    *   name: 'Blog Post',
    *   fields: [
    *     {
    *       id: 'title',
    *       name: 'Title',
    *       required: true,
    *       localized: false,
    *       type: 'Text'
    *     }
    *   ]
    * }))
    * .then((contentType) => console.log(contentType))
    * .catch(console.error)
    * ```
    */
  def createContentTypeWithId(id: String, data: CreateContentTypeProps): js.Promise[typings.contentfulManagement.contentTypeMod.ContentType] = js.native
  
  /**
    * Creates a Entry
    * @param contentTypeId - The Content Type ID of the newly created Entry
    * @param data - Object representation of the Entry to be created
    * @return Promise for the newly created Entry
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.createEntry('<content_type_id>', {
    *   fields: {
    *     title: {
    *       'en-US': 'Entry title'
    *     }
    *   }
    * }))
    * .then((entry) => console.log(entry))
    * .catch(console.error)
    * ```
    */
  def createEntry(contentTypeId: String, data: OmitEntryPropsys): js.Promise[Entry] = js.native
  
  /**
    * Creates a Entry with a custom ID
    * @param contentTypeId - The Content Type of the newly created Entry
    * @param id - Entry ID
    * @param data - Object representation of the Entry to be created
    * @return Promise for the newly created Entry
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * // Create entry
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.createEntryWithId('<content_type_id>', '<entry_id>', {
    *   fields: {
    *     title: {
    *       'en-US': 'Entry title'
    *     }
    *   }
    * }))
    * .then((entry) => console.log(entry))
    * .catch(console.error)
    * ```
    */
  def createEntryWithId(contentTypeId: String, id: String, data: OmitEntryPropsys): js.Promise[Entry] = js.native
  
  /**
    * Creates a Locale
    * @param data - Object representation of the Locale to be created
    * @return Promise for the newly created Locale
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * // Create locale
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.createLocale({
    *   name: 'German (Austria)',
    *   code: 'de-AT',
    *   fallbackCode: 'de-DE',
    *   optional: true
    * }))
    * .then((locale) => console.log(locale))
    * .catch(console.error)
    * ```
    */
  def createLocale(data: CreateLocaleProps): js.Promise[Locale] = js.native
  
  def createTag(id: String, name: String): js.Promise[Tag] = js.native
  
  /**
    * Creates a UI Extension
    * @param data - Object representation of the UI Extension to be created
    * @return Promise for the newly created UI Extension
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.createUiExtension({
    *   extension: {
    *     name: 'My awesome extension',
    *     src: 'https://example.com/my',
    *     fieldTypes: [
    *       {
    *         type: 'Symbol'
    *       },
    *       {
    *         type: 'Text'
    *       }
    *     ],
    *     sidebar: false
    *   }
    * }))
    * .then((uiExtension) => console.log(uiExtension))
    * .catch(console.error)
    * ```
    */
  def createUiExtension(data: OmitUIExtensionPropssys): js.Promise[UIExtension] = js.native
  
  /**
    * Creates a UI Extension with a custom ID
    * @param id - Extension ID
    * @param data - Object representation of the UI Extension to be created
    * @return Promise for the newly created UI Extension
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.createUiExtensionWithId('<extension_id>', {
    *   extension: {
    *     name: 'My awesome extension',
    *     src: 'https://example.com/my',
    *     fieldTypes: [
    *       {
    *         type: 'Symbol'
    *       },
    *       {
    *         type: 'Text'
    *       }
    *     ],
    *     sidebar: false
    *   }
    * }))
    * .then((uiExtension) => console.log(uiExtension))
    * .catch(console.error)
    * ```
    */
  def createUiExtensionWithId(id: String, data: OmitUIExtensionPropssys): js.Promise[UIExtension] = js.native
  
  /**
    * Creates a Upload.
    * @param data - Object with file information.
    * @param data.file - Actual file content. Can be a string, an ArrayBuffer or a Stream.
    * @return Upload object containing information about the uploaded file.
    * @example ```javascript
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    * const uploadStream = createReadStream('path/to/filename_english.jpg')
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.createUpload({file: uploadStream})
    * .then((upload) => console.log(upload))
    * .catch(console.error)
    * ```
    */
  def createUpload(data: `0`): js.Promise[deletePromisevoidtoPlainO] = js.native
  
  /**
    * Deletes the environment
    * @return Promise for the deletion. It contains no data, but the Promise error case should be handled.
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.delete())
    * .then(() => console.log('Environment deleted.'))
    * .catch(console.error)
    * ```
    */
  def delete(): js.Promise[Unit] = js.native
  
  /**
    * Gets an App Installation
    * @param id - AppDefintion ID
    * @return Promise for an App Installation
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    *  .then((space) => space.getEnvironment('<environment-id>'))
    *  .then((environment) => environment.getAppInstallation('<app-definition-id>'))
    *  .then((appInstallation) => console.log(appInstallation))
    *  .catch(console.error)
    *  ```
    */
  def getAppInstallation(id: String): js.Promise[AppInstallation] = js.native
  
  /**
    * Gets a collection of App Installation
    * @return Promise for a collection of App Installations
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    *  .then((space) => space.getEnvironment('<environment-id>'))
    *  .then((environment) => environment.getAppInstallations()
    *  .then((response) => console.log(response.items))
    *  .catch(console.error)
    *  ```
    */
  def getAppInstallations(): js.Promise[Collection[AppInstallation, AppInstallationProps]] = js.native
  
  /**
    * Gets an Asset
    * Warning: if you are using the select operator, when saving, any field that was not selected will be removed
    * from your entry in the backend
    * @param id - Asset ID
    * @param query - Object with search parameters. In this method it's only useful for `locale`.
    * @return Promise for an Asset
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.getAsset('<asset_id>'))
    * .then((asset) => console.log(asset))
    * .catch(console.error)
    * ```
    */
  def getAsset(id: String): js.Promise[Asset] = js.native
  def getAsset(id: String, query: QueryOptions): js.Promise[Asset] = js.native
  
  /**
    * Creates SDK Asset object (locally) from entry data
    * @param assetData - Asset ID
    * @return Asset
    * @example ```javascript
    * environment.getAsset('asset_id').then(asset => {
    *
    *   // Build a plainObject in order to make it usable for React (saving in state or redux)
    *   const plainObject = asset.toPlainObject();
    *
    *   // The asset is being updated in some way as plainObject:
    *   const updatedPlainObject = {
    *     ...plainObject,
    *     fields: {
    *       ...plainObject.fields,
    *       title: {
    *         'en-US': 'updatedTitle'
    *       }
    *     }
    *   };
    *
    *   // Rebuild an sdk object out of the updated plainObject:
    *   const assetWithMethodsAgain = environment.getAssetFromData(updatedPlainObject);
    *
    *   // Update with help of the sdk method:
    *   assetWithMethodsAgain.update();
    *
    * });
    * ```
    */
  def getAssetFromData(assetData: AssetProps): Asset = js.native
  
  /**
    * Gets a collection of Assets
    * Warning: if you are using the select operator, when saving, any field that was not selected will be removed
    * from your entry in the backend
    * @param query - Object with search parameters. Check the <a href="https://www.contentful.com/developers/docs/javascript/tutorials/using-js-cda-sdk/#retrieving-entries-with-search-parameters">JS SDK tutorial</a> and the <a href="https://www.contentful.com/developers/docs/references/content-delivery-api/#/reference/search-parameters">REST API reference</a> for more details.
    * @return Promise for a collection of Assets
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.getAssets())
    * .then((response) => console.log(response.items))
    * .catch(console.error)
    * ```
    */
  def getAssets(): js.Promise[Collection[Asset, AssetProps]] = js.native
  def getAssets(query: QueryOptions): js.Promise[Collection[Asset, AssetProps]] = js.native
  
  /**
    * Gets a Content Type
    * @param id - Content Type ID
    * @return Promise for a Content Type
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.getContentType('<content_type_id>'))
    * .then((contentType) => console.log(contentType))
    * .catch(console.error)
    * ```
    */
  def getContentType(id: String): js.Promise[typings.contentfulManagement.contentTypeMod.ContentType] = js.native
  
  /**
    * Gets all snapshots of a contentType
    * @func getContentTypeSnapshots
    * @param contentTypeId - Content Type ID
    * @param query - query additional query paramaters
    * @return Promise for a collection of Content Type Snapshots
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.getContentTypeSnapshots('<contentTypeId>'))
    * .then((snapshots) => console.log(snapshots.items))
    * .catch(console.error)
    * ```
    */
  def getContentTypeSnapshots(contentTypeId: String): js.Promise[
    Collection[
      Snapshot[typings.contentfulManagement.contentTypeMod.ContentType], 
      SnapshotProps[typings.contentfulManagement.contentTypeMod.ContentType]
    ]
  ] = js.native
  def getContentTypeSnapshots(contentTypeId: String, query: QueryOptions): js.Promise[
    Collection[
      Snapshot[typings.contentfulManagement.contentTypeMod.ContentType], 
      SnapshotProps[typings.contentfulManagement.contentTypeMod.ContentType]
    ]
  ] = js.native
  
  /**
    * Gets a collection of Content Types
    * @param query - Object with search parameters. Check the <a href="https://www.contentful.com/developers/docs/javascript/tutorials/using-js-cda-sdk/#retrieving-entries-with-search-parameters">JS SDK tutorial</a> and the <a href="https://www.contentful.com/developers/docs/references/content-delivery-api/#/reference/search-parameters">REST API reference</a> for more details.
    * @return Promise for a collection of Content Types
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.getContentTypes())
    * .then((response) => console.log(response.items))
    * .catch(console.error)
    * ```
    */
  def getContentTypes(): js.Promise[
    Collection[typings.contentfulManagement.contentTypeMod.ContentType, ContentTypeProps]
  ] = js.native
  def getContentTypes(query: QueryOptions): js.Promise[
    Collection[typings.contentfulManagement.contentTypeMod.ContentType, ContentTypeProps]
  ] = js.native
  
  /**
    * Gets an EditorInterface for a ContentType
    * @param contentTypeId - Content Type ID
    * @return Promise for an EditorInterface
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.getEditorInterfaceForContentType('<content_type_id>'))
    * .then((EditorInterface) => console.log(EditorInterface))
    * .catch(console.error)
    * ```
    */
  def getEditorInterfaceForContentType(contentTypeId: String): js.Promise[EditorInterface] = js.native
  
  /**
    * Gets a collection of Entries
    * Warning: if you are using the select operator, when saving, any field that was not selected will be removed
    * from your entry in the backend
    * @param query - Object with search parameters. Check the <a href="https://www.contentful.com/developers/docs/javascript/tutorials/using-js-cda-sdk/#retrieving-entries-with-search-parameters">JS SDK tutorial</a> and the <a href="https://www.contentful.com/developers/docs/references/content-delivery-api/#/reference/search-parameters">REST API reference</a> for more details.
    * @return Promise for a collection of Entries
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.getEntries({'content_type': 'foo'})) // you can add more queries as 'key': 'value'
    * .then((response) => console.log(response.items))
    * .catch(console.error)
    * ```
    */
  def getEntries(): js.Promise[Collection[Entry, EntryProp]] = js.native
  def getEntries(query: QueryOptions): js.Promise[Collection[Entry, EntryProp]] = js.native
  
  /**
    * Gets an Entry
    * Warning: if you are using the select operator, when saving, any field that was not selected will be removed
    * from your entry in the backend
    * @param id - Entry ID
    * @param query - Object with search parameters. In this method it's only useful for `locale`.
    * @return Promise for an Entry
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.getEntry('<entry-id>'))
    * .then((entry) => console.log(entry))
    * .catch(console.error)
    * ```
    */
  def getEntry(id: String): js.Promise[Entry] = js.native
  def getEntry(id: String, query: QueryOptions): js.Promise[Entry] = js.native
  
  /**
    * Creates SDK Entry object (locally) from entry data
    * @param entryData - Entry Data
    * @return Entry
    * @example ```javascript
    * environment.getEntry('entryId').then(entry => {
    *
    *   // Build a plainObject in order to make it usable for React (saving in state or redux)
    *   const plainObject = entry.toPlainObject();
    *
    *   // The entry is being updated in some way as plainObject:
    *   const updatedPlainObject = {
    *     ...plainObject,
    *     fields: {
    *       ...plainObject.fields,
    *       title: {
    *         'en-US': 'updatedTitle'
    *       }
    *     }
    *   };
    *
    *   // Rebuild an sdk object out of the updated plainObject:
    *   const entryWithMethodsAgain = environment.getEntryFromData(updatedPlainObject);
    *
    *   // Update with help of the sdk method:
    *   entryWithMethodsAgain.update();
    *
    * });
    * ```
    **/
  def getEntryFromData(entryData: EntryProp): Entry = js.native
  
  /**
    * Gets all snapshots of an entry
    * @func getEntrySnapshots
    * @param entryId - Entry ID
    * @param query - query additional query paramaters
    * @return Promise for a collection of Entry Snapshots
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.getEntrySnapshots('<entry_id>'))
    * .then((snapshots) => console.log(snapshots.items))
    * .catch(console.error)
    * ```
    */
  def getEntrySnapshots(entryId: String): js.Promise[Collection[Snapshot[Entry], SnapshotProps[Entry]]] = js.native
  def getEntrySnapshots(entryId: String, query: QueryOptions): js.Promise[Collection[Snapshot[Entry], SnapshotProps[Entry]]] = js.native
  
  /**
    * Gets a Locale
    * @param id - Locale ID
    * @return Promise for an Locale
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.getLocale('<locale_id>'))
    * .then((locale) => console.log(locale))
    * .catch(console.error)
    * ```
    */
  def getLocale(id: String): js.Promise[Locale] = js.native
  
  /**
    * Gets a collection of Locales
    * @return Promise for a collection of Locales
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.getLocales())
    * .then((response) => console.log(response.items))
    * .catch(console.error)
    * ```
    */
  def getLocales(): js.Promise[Collection[Locale, LocaleProps]] = js.native
  
  def getTag(id: String): js.Promise[Tag] = js.native
  
  def getTags(): js.Promise[Collection[Tag, TagProps]] = js.native
  def getTags(skip: Double): js.Promise[Collection[Tag, TagProps]] = js.native
  def getTags(skip: Double, limit: Double): js.Promise[Collection[Tag, TagProps]] = js.native
  def getTags(skip: Unit, limit: Double): js.Promise[Collection[Tag, TagProps]] = js.native
  
  /**
    * Gets an UI Extension
    * @param id - Extension ID
    * @return Promise for an UI Extension
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.getUiExtension('<extension-id>'))
    * .then((uiExtension) => console.log(uiExtension))
    * .catch(console.error)
    * ```
    */
  def getUiExtension(id: String): js.Promise[UIExtension] = js.native
  
  /**
    * Gets a collection of UI Extension
    * @return Promise for a collection of UI Extensions
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.getUiExtensions()
    * .then((response) => console.log(response.items))
    * .catch(console.error)
    * ```
    */
  def getUiExtensions(): js.Promise[Collection[UIExtension, UIExtensionProps]] = js.native
  
  /**
    * Gets an Upload
    * @param id - Upload ID
    * @return Promise for an Upload
    * @example ```javascript
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    * const uploadStream = createReadStream('path/to/filename_english.jpg')
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => environment.getUpload('<upload-id>')
    * .then((upload) => console.log(upload))
    * .catch(console.error)
    */
  def getUpload(id: String): js.Promise[deletePromisevoidtoPlainO] = js.native
  
  /**
    * Updates the environment
    * @return Promise for the updated environment.
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environment-id>'))
    * .then((environment) => {
    *   environment.name = 'New name'
    *   return environment.update()
    * })
    * .then((environment) => console.log(`Environment ${environment.sys.id} renamed.`)
    * .catch(console.error)
    * ```
    */
  def update(): js.Promise[Environment] = js.native
}
