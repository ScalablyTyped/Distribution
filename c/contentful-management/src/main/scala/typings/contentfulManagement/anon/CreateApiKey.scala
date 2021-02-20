package typings.contentfulManagement.anon

import typings.contentfulManagement.apiKeyMod.ApiKey
import typings.contentfulManagement.apiKeyMod.ApiKeyProps
import typings.contentfulManagement.apiKeyMod.CreateApiKeyProps
import typings.contentfulManagement.assetMod.Asset
import typings.contentfulManagement.assetMod.AssetProps
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.QueryOptions
import typings.contentfulManagement.contentTypeMod.ContentTypeProps
import typings.contentfulManagement.contentTypeMod.CreateContentTypeProps
import typings.contentfulManagement.editorInterfaceMod.EditorInterface
import typings.contentfulManagement.entryMod.Entry
import typings.contentfulManagement.entryMod.EntryProp
import typings.contentfulManagement.environmentAliasMod.EnvironmentAlias
import typings.contentfulManagement.environmentAliasMod.EnvironmentAliasProps
import typings.contentfulManagement.environmentMod.Environment
import typings.contentfulManagement.environmentMod.EnvironmentProps
import typings.contentfulManagement.localeMod.CreateLocaleProps
import typings.contentfulManagement.localeMod.Locale
import typings.contentfulManagement.localeMod.LocaleProps
import typings.contentfulManagement.previewApiKeyMod.PreviewApiKey
import typings.contentfulManagement.previewApiKeyMod.PreviewApiKeyProps
import typings.contentfulManagement.roleMod.Role
import typings.contentfulManagement.roleMod.RoleProps
import typings.contentfulManagement.snapshotMod.Snapshot
import typings.contentfulManagement.snapshotMod.SnapshotProps
import typings.contentfulManagement.spaceMemberMod.SpaceMemberProps
import typings.contentfulManagement.spaceMembershipMod.SpaceMembership
import typings.contentfulManagement.spaceMembershipMod.SpaceMembershipProps
import typings.contentfulManagement.spaceMod.Space
import typings.contentfulManagement.teamSpaceMembershipMod.TeamSpaceMembership
import typings.contentfulManagement.teamSpaceMembershipMod.TeamSpaceMembershipProps
import typings.contentfulManagement.uiExtensionMod.UIExtension
import typings.contentfulManagement.uiExtensionMod.UIExtensionProps
import typings.contentfulManagement.userMod.User
import typings.contentfulManagement.userMod.UserProps
import typings.contentfulManagement.webhookMod.WebHooks
import typings.contentfulManagement.webhookMod.WebhookProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApiKey extends StObject {
  
  /**
    * Creates a Api Key
    * @param data - Object representation of the Api Key to be created
    * @return Promise for the newly created Api Key
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.createApiKey({
    *   name: 'API Key name',
    *   environments:[
    *    {
    *     sys: {
    *      type: 'Link'
    *      linkType: 'Environment',
    *      id:'<environment_id>'
    *     }
    *    }
    *   ]
    *   }
    * }))
    * .then((apiKey) => console.log(apiKey))
    * .catch(console.error)
    * ```
    */
  def createApiKey(data: CreateApiKeyProps): js.Promise[ApiKey] = js.native
  
  /**
    * Creates a Api Key with a custom ID
    * @param id - Api Key ID
    * @param data - Object representation of the Api Key to be created
    * @return Promise for the newly created Api Key
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.createApiKeyWithId('<api-key-id>', {
    *   name: 'API Key name'
    *   environments:[
    *    {
    *     sys: {
    *      type: 'Link'
    *      linkType: 'Environment',
    *      id:'<environment_id>'
    *     }
    *    }
    *   ]
    *   }
    * }))
    * .then((apiKey) => console.log(apiKey))
    * .catch(console.error)
    * ```
    */
  def createApiKeyWithId(id: String, data: CreateApiKeyProps): js.Promise[ApiKey] = js.native
  
  /**
    * Creates a Asset. After creation, call asset.processForLocale or asset.processForAllLocales to start asset processing.
    * @deprecated since version 5.0
    * @param data - Object representation of the Asset to be created. Note that the field object should have an upload property on asset creation, which will be removed and replaced with an url property when processing is finished.
    * @return Promise for the newly created Asset
    * @example ```javascript
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * // Create asset
    * client.getSpace('<space_id>')
    * .then((space) => space.createAsset({
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
    * @deprecated since version 5.0
    * @param data - Object representation of the Asset to be created. Note that the field object should have an uploadFrom property on asset creation, which will be removed and replaced with an url property when processing is finished.
    * @param data.fields.file.[LOCALE].file - Can be a string, an ArrayBuffer or a Stream.
    * @return Promise for the newly created Asset
    * @example ```javascript
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    * client.getSpace('<space_id>')
    * .then((space) => space.createAssetFromFiles({
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
    * @deprecated since version 5.0
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
    * .then((space) => space.createAssetWithId('<asset_id>', {
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
    * @deprecated since version 5.0
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
    * .then((space) => space.createContentType({
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
    * @deprecated since version 5.0
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
    * .then((space) => space.createContentTypeWithId('<content-type-id>', {
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
    * @deprecated since version 5.0
    * @param contentTypeId - The Content Type which this Entry is based on
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
    * .then((space) => space.createEntry('<content_type_id>', {
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
    * @deprecated since version 5.0
    * @param contentTypeId - The Content Type which this Entry is based on
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
    * .then((space) => space.createEntryWithId('<content_type_id>', '<entry_id>', {
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
    * Creates an Environement
    * @param data - Object representation of the Environment to be created
    * @return Promise for the newly created Environment
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.createEnvironment({ name: 'Staging' }))
    * .then((environment) => console.log(environment))
    * .catch(console.error)
    * ```
    */
  def createEnvironment(): js.Promise[Environment] = js.native
  def createEnvironment(data: js.Object): js.Promise[Environment] = js.native
  
  /**
    * Creates an Environment with a custom ID
    * @param id - Environment ID
    * @param data - Object representation of the Environment to be created
    * @param sourceEnvironmentId - ID of the source environment that will be copied to create the new environment. Default is "master"
    * @return Promise for the newly created Environment
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.createEnvironmentWithId('<environment-id>', { name: 'Staging'}, 'master'))
    * .then((environment) => console.log(environment))
    * .catch(console.error)
    * ```
    */
  def createEnvironmentWithId(id: String, data: OmitEnvironmentPropssys): js.Promise[Environment] = js.native
  def createEnvironmentWithId(id: String, data: OmitEnvironmentPropssys, sourceEnvironmentId: String): js.Promise[Environment] = js.native
  
  /**
    * Creates a Locale
    * @deprecated since version 5.0
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
    * .then((space) => space.createLocale({
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
  
  /**
    * Creates a Role
    * @param data - Object representation of the Role to be created
    * @return  Promise for the newly created Role
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    * client.getSpace('<space_id>')
    * .then((space) => space.createRole({
    *   name: 'My Role',
    *   description: 'foobar role',
    *   permissions: {
    *     ContentDelivery: 'all',
    *     ContentModel: ['read'],
    *     Settings: []
    *   },
    *   policies: [
    *     {
    *       effect: 'allow',
    *       actions: 'all',
    *       constraint: {
    *         and: [
    *           {
    *             equals: [
    *               { doc: 'sys.type' },
    *               'Entry'
    *             ]
    *           },
    *           {
    *             equals: [
    *               { doc: 'sys.type' },
    *               'Asset'
    *             ]
    *           }
    *         ]
    *       }
    *     }
    *   ]
    * }))
    * .then((role) => console.log(role))
    * .catch(console.error)
    * ```
    */
  def createRole(data: OmitRolePropssys): js.Promise[Role] = js.native
  
  /**
    * Creates a Role with a custom ID
    * @param id - Role ID
    * @param data - Object representation of the Role to be created
    * @return Promise for the newly created Role
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    * client.getSpace('<space_id>')
    * .then((space) => space.createRoleWithId('<role-id>', {
    *   name: 'My Role',
    *   description: 'foobar role',
    *   permissions: {
    *     ContentDelivery: 'all',
    *     ContentModel: ['read'],
    *     Settings: []
    *   },
    *   policies: [
    *     {
    *       effect: 'allow',
    *       actions: 'all',
    *       constraint: {
    *         and: [
    *           {
    *             equals: [
    *               { doc: 'sys.type' },
    *               'Entry'
    *             ]
    *           },
    *           {
    *             equals: [
    *               { doc: 'sys.type' },
    *               'Asset'
    *             ]
    *           }
    *         ]
    *       }
    *     }
    *   ]
    * }))
    * .then((role) => console.log(role))
    * .catch(console.error)
    * ```
    */
  def createRoleWithId(id: String, data: OmitRolePropssys): js.Promise[Role] = js.native
  
  /**
    * Creates a Space Membership
    * Warning: the user attribute in the space membership root is deprecated. The attribute has been moved inside the sys  object (i.e. sys.user).
    * @param  data - Object representation of the Space Membership to be created
    * @return Promise for the newly created Space Membership
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.createSpaceMembership({
    *   admin: false,
    *   roles: [
    *     {
    *       type: 'Link',
    *       linkType: 'Role',
    *       id: '<role_id>'
    *     }
    *   ],
    *   email: 'foo@example.com'
    * }))
    * .then((spaceMembership) => console.log(spaceMembership))
    * .catch(console.error)
    * ```
    */
  def createSpaceMembership(data: OmitSpaceMembershipPropss): js.Promise[SpaceMembership] = js.native
  
  /**
    * Creates a Space Membership with a custom ID
    * Warning: the user attribute in the space membership root is deprecated. The attribute has been moved inside the sys  object (i.e. sys.user).
    * @param id - Space Membership ID
    * @param data - Object representation of the Space Membership to be created
    * @return Promise for the newly created Space Membership
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.createSpaceMembershipWithId('<space-membership-id>', {
    *   admin: false,
    *   roles: [
    *     {
    *       type: 'Link',
    *       linkType: 'Role',
    *       id: '<role_id>'
    *     }
    *   ],
    *   email: 'foo@example.com'
    * }))
    * .then((spaceMembership) => console.log(spaceMembership))
    * .catch(console.error)
    * ```
    */
  def createSpaceMembershipWithId(id: String, data: OmitSpaceMembershipPropss): js.Promise[SpaceMembership] = js.native
  
  /**
    * Creates a Team Space Membership
    * @param id - Team ID
    * @param data - Object representation of the Team Space Membership to be created
    * @return Promise for the newly created Team Space Membership
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.createTeamSpaceMembership('team_id', {
    *   admin: false,
    *   roles: [
    *    {
    sys: {
    *       type: 'Link',
    *       linkType: 'Role',
    *       id: '<role_id>'
    *      }
    *    }
    *   ],
    * }))
    * .then((teamSpaceMembership) => console.log(teamSpaceMembership))
    * .catch(console.error)
    * ```
    */
  def createTeamSpaceMembership(teamId: String, data: OmitTeamSpaceMembershipPr): js.Promise[TeamSpaceMembership] = js.native
  
  /**
    * Creates a UI Extension
    * @deprecated since version 5.0
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
    * .then((space) => space.createUiExtension({
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
    * @deprecated since version 5.0
    * @param id - UI Extension ID
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
    * .then((space) => space.createUiExtensionWithId('<extension_id>', {
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
    * @deprecated since version 5.0
    * @param data - Object with file information.
    * @param data.file - Actual file content. Can be a string, an ArrayBuffer or a Stream.
    * @return Upload object containing information about the uploaded file.
    * @example ```javascript
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    * const uploadStream = createReadStream('path/to/filename_english.jpg')
    * client.getSpace('<space_id>')
    * .then((space) => space.createUpload({file: uploadStream, 'image/png'})
    * .then((upload) => console.log(upload))
    * .catch(console.error)
    * ```
    */
  def createUpload(data: `0`): js.Promise[deletePromisevoidtoPlainO] = js.native
  
  /**
    * Creates a Webhook
    * @param data - Object representation of the Webhook to be created
    * @return Promise for the newly created Webhook
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.createWebhook({
    *   'name': 'My webhook',
    *   'url': 'https://www.example.com/test',
    *   'topics': [
    *     'Entry.create',
    *     'ContentType.create',
    *     '*.publish',
    *     'Asset.*'
    *   ]
    * }))
    * .then((webhook) => console.log(webhook))
    * .catch(console.error)
    * ```
    */
  def createWebhook(data: OmitWebhookPropssys): js.Promise[WebHooks] = js.native
  
  /**
    * Creates a Webhook with a custom ID
    * @param id - Webhook ID
    * @param  data - Object representation of the Webhook to be created
    * @return Promise for the newly created Webhook
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.createWebhookWithId('<webhook_id>', {
    *   'name': 'My webhook',
    *   'url': 'https://www.example.com/test',
    *   'topics': [
    *     'Entry.create',
    *     'ContentType.create',
    *     '*.publish',
    *     'Asset.*'
    *   ]
    * }))
    * .then((webhook) => console.log(webhook))
    * .catch(console.error)
    * ```
    */
  def createWebhookWithId(id: String, data: OmitWebhookPropssys): js.Promise[WebHooks] = js.native
  
  /**
    * Deletes the space
    * @return Promise for the deletion. It contains no data, but the Promise error case should be handled.
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    *   .then((space) => space.delete())
    *   .then(() => console.log('Space deleted.'))
    *   .catch(console.error)
    * ```
    */
  def delete(): js.Promise[Unit] = js.native
  
  /**
    * Gets a Api Key
    * @param id - API Key ID
    * @return  Promise for a Api Key
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getApiKey('<apikey-id>'))
    * .then((apikey) => console.log(apikey))
    * .catch(console.error)
    * ```
    */
  def getApiKey(id: String): js.Promise[ApiKey] = js.native
  
  /**
    * Gets a collection of Api Keys
    * @return Promise for a collection of Api Keys
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getApiKeys())
    * .then((response) => console.log(response.items))
    * .catch(console.error)
    * ```
    */
  def getApiKeys(): js.Promise[Collection[ApiKey, ApiKeyProps]] = js.native
  
  /**
    * Gets an Asset
    * Warning: if you are using the select operator, when saving, any field that was not selected will be removed
    * from your entry in the backend
    * @deprecated since version 5.0
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
    * .then((space) => space.getAsset('<asset_id>'))
    * .then((asset) => console.log(asset))
    * .catch(console.error)
    * ```
    */
  def getAsset(id: String): js.Promise[Asset] = js.native
  def getAsset(id: String, query: QueryOptions): js.Promise[Asset] = js.native
  
  /**
    * Gets a collection of Assets
    * Warning: if you are using the select operator, when saving, any field that was not selected will be removed
    * from your entry in the backend
    * @deprecated since version 5.0
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
    * .then((space) => space.getAssets())
    * .then((response) => console.log(response.items))
    * .catch(console.error)
    * ```
    */
  def getAssets(): js.Promise[Collection[Asset, AssetProps]] = js.native
  def getAssets(query: QueryOptions): js.Promise[Collection[Asset, AssetProps]] = js.native
  
  /**
    * Gets a Content Type
    * @deprecated since version 5.0
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
    * .then((space) => space.getContentType('<content_type_id>'))
    * .then((contentType) => console.log(contentType))
    * .catch(console.error)
    * ```
    */
  def getContentType(id: String): js.Promise[typings.contentfulManagement.contentTypeMod.ContentType] = js.native
  
  /**
    * Gets all snapshots of a contentType
    * @deprecated since version 5.0
    * @param contentTypeId - Content Type ID
    * @param query - additional query paramaters
    * @return Promise for a collection of Content Type Snapshots
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getContentTypeSnapshots('<contentTypeId>'))
    * .then((snapshots) => console.log(snapshots.items))
    * .catch(console.error)
    * ```
    */
  def getContentTypeSnapshots(contentTypeId: String): js.Promise[Collection[Snapshot[_], SnapshotProps[_]]] = js.native
  def getContentTypeSnapshots(contentTypeId: String, query: QueryOptions): js.Promise[Collection[Snapshot[_], SnapshotProps[_]]] = js.native
  
  /**
    * Gets a collection of Content Types
    * @deprecated since version 5.0
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
    * .then((space) => space.getContentTypes())
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
    * @deprecated since version 5.0
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
    * .then((space) => space.getEditorInterfaceForContentType('<content_type_id>'))
    * .then((EditorInterface) => console.log(EditorInterface))
    * .catch(console.error)
    * ```
    */
  def getEditorInterfaceForContentType(contentTypeId: String): js.Promise[EditorInterface] = js.native
  
  /**
    * Gets a collection of Entries
    * Warning: if you are using the select operator, when saving, any field that was not selected will be removed
    * from your entry in the backend
    * @deprecated since version 5.0
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
    * .then((space) => space.getEntries({'content_type': 'foo'})) // you can add more queries as 'key': 'value'
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
    * @deprecated since version 5.0
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
    * .then((space) => space.getEntry('<entry-id>'))
    * .then((entry) => console.log(entry))
    * .catch(console.error)
    * ```
    */
  def getEntry(id: String): js.Promise[Entry] = js.native
  def getEntry(id: String, query: QueryOptions): js.Promise[Entry] = js.native
  
  /**
    * Gets all snapshots of an entry
    * @deprecated since version 5.0
    * @param entryId - Entry ID
    * @param query - additional query paramaters
    * @return Promise for a collection of Entry Snapshots
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEntrySnapshots('<entry_id>'))
    * .then((snapshots) => console.log(snapshots.items))
    * .catch(console.error)
    * ```
    */
  def getEntrySnapshots(entryId: String): js.Promise[Collection[Snapshot[_], SnapshotProps[_]]] = js.native
  def getEntrySnapshots(entryId: String, query: QueryOptions): js.Promise[Collection[Snapshot[_], SnapshotProps[_]]] = js.native
  
  /**
    * Gets an environment
    * @param id - Environment ID
    * @return Promise for an Environment
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironment('<environement_id>'))
    * .then((environment) => console.log(environment))
    * .catch(console.error)
    * ```
    */
  def getEnvironment(id: String): js.Promise[Environment] = js.native
  
  /**
    * Gets an Environment Alias
    * @param Environment Alias ID
    * @return Promise for an Environment Alias
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironmentAlias('<alias-id>'))
    * .then((alias) => console.log(alias))
    * .catch(console.error)
    * ```
    */
  def getEnvironmentAlias(id: String): js.Promise[EnvironmentAlias] = js.native
  
  /**
    * Gets a collection of Environment Aliases
    * @return Promise for a collection of Environment Aliases
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironmentAliases()
    * .then((response) => console.log(response.items))
    * .catch(console.error)
    * ```
    */
  def getEnvironmentAliases(): js.Promise[Collection[EnvironmentAlias, EnvironmentAliasProps]] = js.native
  
  /**
    * Gets a collection of Environments
    * @return Promise for a collection of Environment
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironments())
    * .then((response) => console.log(response.items))
    * .catch(console.error)
    * ```
    */
  def getEnvironments(): js.Promise[Collection[Environment, EnvironmentProps]] = js.native
  
  /**
    * Gets a Locale
    * @deprecated since version 5.0
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
    * .then((space) => space.getLocale('<locale_id>'))
    * .then((locale) => console.log(locale))
    * .catch(console.error)
    * ```
    */
  def getLocale(id: String): js.Promise[Locale] = js.native
  
  /**
    * Gets a collection of Locales
    * @deprecated since version 5.0
    * @return Promise for a collection of Locales
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getLocales())
    * .then((response) => console.log(response.items))
    * .catch(console.error)
    * ```
    */
  def getLocales(): js.Promise[Collection[Locale, LocaleProps]] = js.native
  
  /**
    * Gets a preview Api Key
    * @param id - Preview API Key ID
    * @return  Promise for a Preview Api Key
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getPreviewApiKey('<preview-apikey-id>'))
    * .then((previewApikey) => console.log(previewApikey))
    * .catch(console.error)
    * ```
    */
  def getPreviewApiKey(id: String): js.Promise[PreviewApiKey] = js.native
  
  /**
    * Gets a collection of preview Api Keys
    * @return Promise for a collection of Preview Api Keys
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getPreviewApiKeys())
    * .then((response) => console.log(response.items))
    * .catch(console.error)
    * ```
    */
  def getPreviewApiKeys(): js.Promise[Collection[PreviewApiKey, PreviewApiKeyProps]] = js.native
  
  /**
    * Gets a Role
    * @param id - Role ID
    * @return Promise for a Role
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.createRole({
    *   fields: {
    *     title: {
    *       'en-US': 'Role title'
    *     }
    *   }
    * }))
    * .then((role) => console.log(role))
    * .catch(console.error)
    * ```
    */
  def getRole(id: String): js.Promise[Role] = js.native
  
  /**
    * Gets a collection of Roles
    * @return Promise for a collection of Roles
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getRoles())
    * .then((response) => console.log(response.items))
    * .catch(console.error)
    * ```
    */
  def getRoles(): js.Promise[Collection[Role, RoleProps]] = js.native
  
  /**
    * Gets a Space Member
    * @param id Get Space Member by user_id
    * @return Promise for a Space Member
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getSpaceMember(id))
    * .then((spaceMember) => console.log(spaceMember))
    * .catch(console.error)
    * ```
    */
  def getSpaceMember(id: String): js.Promise[SpaceMemberPropstoPlainOb] = js.native
  
  /**
    * Gets a collection of Space Members
    * @param query
    * @return Promise for a collection of Space Members
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getSpaceMembers({'limit': 100}))
    * .then((spaceMemberCollection) => console.log(spaceMemberCollection))
    * .catch(console.error)
    * ```
    */
  def getSpaceMembers(): js.Promise[Collection[SpaceMemberPropstoPlainOb, SpaceMemberProps]] = js.native
  def getSpaceMembers(query: QueryOptions): js.Promise[Collection[SpaceMemberPropstoPlainOb, SpaceMemberProps]] = js.native
  
  /**
    * Gets a Space Membership
    * Warning: the user attribute in the space membership root is deprecated. The attribute has been moved inside the sys  object (i.e. sys.user).
    * @param id - Space Membership ID
    * @return Promise for a Space Membership
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getSpaceMembership('id'))
    * .then((spaceMembership) => console.log(spaceMembership))
    * .catch(console.error)
    * ```
    */
  def getSpaceMembership(id: String): js.Promise[SpaceMembership] = js.native
  
  /**
    * Gets a collection of Space Memberships
    * Warning: the user attribute in the space membership root is deprecated. The attribute has been moved inside the sys  object (i.e. sys.user).
    * @param query - Object with search parameters. Check the <a href="https://www.contentful.com/developers/docs/javascript/tutorials/using-js-cda-sdk/#retrieving-entries-with-search-parameters">JS SDK tutorial</a> and the <a href="https://www.contentful.com/developers/docs/references/content-delivery-api/#/reference/search-parameters">REST API reference</a> for more details.
    * @return Promise for a collection of Space Memberships
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getSpaceMemberships({'limit': 100})) // you can add more queries as 'key': 'value'
    * .then((response) => console.log(response.items))
    * .catch(console.error)
    * ```
    */
  def getSpaceMemberships(): js.Promise[Collection[SpaceMembership, SpaceMembershipProps]] = js.native
  def getSpaceMemberships(query: QueryOptions): js.Promise[Collection[SpaceMembership, SpaceMembershipProps]] = js.native
  
  /**
    * Gets a User
    * @param id - User ID
    * @return Promise for a User
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getSpaceUser('id'))
    * .then((user) => console.log(user))
    * .catch(console.error)
    * ```
    */
  def getSpaceUser(id: String): js.Promise[User] = js.native
  
  /**
    * Gets a collection of Users in a space
    * @param query - Object with search parameters. Check the <a href="https://www.contentful.com/developers/docs/javascript/tutorials/using-js-cda-sdk/#retrieving-entries-with-search-parameters">JS SDK tutorial</a> and the <a href="https://www.contentful.com/developers/docs/references/content-delivery-api/#/reference/search-parameters">REST API reference</a> for more details.
    * @return Promise a collection of Users in a space
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getSpaceUsers(query))
    * .then((data) => console.log(data))
    * .catch(console.error)
    * ```
    */
  def getSpaceUsers(): js.Promise[Collection[User, UserProps]] = js.native
  def getSpaceUsers(query: QueryOptions): js.Promise[Collection[User, UserProps]] = js.native
  
  /**
    * Gets a Team Space Membership
    * @param id - Team Space Membership ID
    * @return Promise for a Team Space Membership
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getTeamSpaceMembership('team_space_membership_id'))
    * .then((teamSpaceMembership) => console.log(teamSpaceMembership))
    * .catch(console.error)
    * ```
    */
  def getTeamSpaceMembership(teamSpaceMembershipId: String): js.Promise[TeamSpaceMembership] = js.native
  
  /**
    * Gets a collection of Team Space Memberships
    * @param query - Object with search parameters. Check the <a href="https://www.contentful.com/developers/docs/javascript/tutorials/using-js-cda-sdk/#retrieving-entries-with-search-parameters">JS SDK tutorial</a> and the <a href="https://www.contentful.com/developers/docs/references/content-delivery-api/#/reference/search-parameters">REST API reference</a> for more details.
    * @return Promise for a collection of Team Space Memberships
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getTeamSpaceMemberships())
    * .then((response) => console.log(response.items))
    * .catch(console.error)
    * ```
    */
  def getTeamSpaceMemberships(): js.Promise[Collection[TeamSpaceMembership, TeamSpaceMembershipProps]] = js.native
  def getTeamSpaceMemberships(query: QueryOptions): js.Promise[Collection[TeamSpaceMembership, TeamSpaceMembershipProps]] = js.native
  
  /**
    * Gets an UI Extension
    * @deprecated since version 5.0
    * @param id - UI Extension ID
    * @return Promise for an UI Extension
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getUiExtension('<extension-id>'))
    * .then((uiExtension) => console.log(uiExtension))
    * .catch(console.error)
    * ```
    */
  def getUiExtension(id: String): js.Promise[UIExtension] = js.native
  
  /**
    * Gets a collection of UI Extension
    * @deprecated since version 5.0
    * @return Promise for a collection of UI Extensions
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getUiExtensions()
    * .then((response) => console.log(response.items))
    * .catch(console.error)
    * ```
    */
  def getUiExtensions(): js.Promise[Collection[UIExtension, UIExtensionProps]] = js.native
  
  /**
    * Gets an Upload
    * @deprecated since version 5.0
    * @param id - Upload ID
    * @return Promise for an Upload
    * @example ```javascript
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    * const uploadStream = createReadStream('path/to/filename_english.jpg')
    * client.getSpace('<space_id>')
    * .then((space) => space.getUpload('<upload-id>')
    * .then((upload) => console.log(upload))
    * .catch(console.error)
    * ```
    */
  def getUpload(id: String): js.Promise[deletePromisevoidtoPlainO] = js.native
  
  /**
    * Gets a Webhook
    * @param id - Webhook ID
    * @return Promise for a Webhook
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getWebhook('<webhook_id>'))
    * .then((webhook) => console.log(webhook))
    * .catch(console.error)
    * ```
    */
  def getWebhook(id: String): js.Promise[WebHooks] = js.native
  
  /**
    * Gets a collection of Webhooks
    * @return Promise for a collection of Webhooks
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getWebhooks())
    * .then((response) => console.log(response.items))
    * .catch(console.error)
    * ```
    */
  def getWebhooks(): js.Promise[Collection[WebHooks, WebhookProps]] = js.native
  
  /**
    * Updates the space
    * @return Promise for the updated space.
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => {
    *   space.name = 'New name'
    *   return space.update()
    * })
    * .then((space) => console.log(`Space ${space.sys.id} renamed.`)
    * .catch(console.error)
    * ```
    */
  def update(): js.Promise[Space] = js.native
}
