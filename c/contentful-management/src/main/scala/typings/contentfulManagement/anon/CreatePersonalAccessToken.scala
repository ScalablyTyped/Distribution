package typings.contentfulManagement.anon

import typings.axios.mod.AxiosRequestConfig
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.QueryOptions
import typings.contentfulManagement.organizationMod.Organization
import typings.contentfulManagement.organizationMod.OrganizationProp
import typings.contentfulManagement.personalAccessTokenMod.CreatePersonalAccessTokenProps
import typings.contentfulManagement.personalAccessTokenMod.PersonalAccessToken
import typings.contentfulManagement.personalAccessTokenMod.PersonalAccessTokenProp
import typings.contentfulManagement.spaceMod.Space
import typings.contentfulManagement.spaceMod.SpaceProps
import typings.contentfulManagement.usageMod.Usage
import typings.contentfulManagement.usageMod.UsageProps
import typings.contentfulManagement.usageMod.UsageQuery
import typings.contentfulManagement.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePersonalAccessToken extends js.Object {
  
  /**
    * Creates a personal access token
    * @param data - personal access token config
    * @return Promise for a Token
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.createPersonalAccessToken(
    *  {
    *    "name": "My Token",
    *    "scope": [
    *      "content_management_manage"
    *    ]
    *  }
    * )
    * .then(personalAccessToken => console.log(personalAccessToken.token))
    * .catch(console.error)
    * ```
    */
  def createPersonalAccessToken(data: CreatePersonalAccessTokenProps): js.Promise[PersonalAccessToken] = js.native
  
  /**
    * Creates a space
    * @param data - Object representation of the Space to be created
    * @param organizationId - Organization ID, if the associated token can manage more than one organization.
    * @return Promise for the newly created Space
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.createSpace({
    *   name: 'Name of new space'
    * })
    * .then((space) => console.log(space))
    * .catch(console.error)
    * ```
    */
  def createSpace(data: OmitSpacePropssys, organizationId: String): js.Promise[Space] = js.native
  
  /**
    * Gets the authenticated user
    * @return Promise for a User
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getCurrentUser()
    * .then(user => console.log(user.firstName))
    * .catch(console.error)
    * ```
    */
  def getCurrentUser(): js.Promise[User] = js.native
  
  /**
    * Gets an organization
    * @param  id - Organization ID
    * @return Promise for a Organization
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getOrganization('<org_id>')
    * .then((org) => console.log(org))
    * .catch(console.error)
    * ```
    */
  def getOrganization(id: String): js.Promise[Organization] = js.native
  
  /**
    * Get organization usage grouped by {@link UsageMetricEnum metric}
    *
    * @param organizationId - Id of an organization
    * @param query - Query parameters
    * @return Promise of a collection of usages
    * @example ```javascript
    *
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getOrganizationUsage('<organizationId>', {
    *    'metric[in]': 'cma,gql',
    *    'dateRange.startAt': '2019-10-22',
    *    'dateRange.endAt': '2019-11-10'
    *    }
    * })
    * .then(result => console.log(result.items))
    * .catch(console.error)
    * ```
    */
  def getOrganizationUsage(organizationId: String): js.Promise[Collection[Usage, UsageProps]] = js.native
  def getOrganizationUsage(organizationId: String, query: QueryOptions): js.Promise[Collection[Usage, UsageProps]] = js.native
  
  /**
    * Gets a collection of Organizations
    * @return Promise for a collection of Organizations
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getOrganizations()
    * .then(result => console.log(result.items))
    * .catch(console.error)
    * ```
    */
  def getOrganizations(): js.Promise[Collection[Organization, OrganizationProp]] = js.native
  
  /**
    * Gets a personal access token
    * @param data - personal access token config
    * @return Promise for a Token
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getPersonalAccessToken(tokenId)
    * .then(token => console.log(token.token))
    * .catch(console.error)
    * ```
    */
  def getPersonalAccessToken(tokenId: String): js.Promise[PersonalAccessToken] = js.native
  
  /**
    * Gets all personal access tokens
    * @return Promise for a Token
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getPersonalAccessTokens()
    * .then(response => console.log(reponse.items))
    * .catch(console.error)
    * ```
    */
  def getPersonalAccessTokens(): js.Promise[Collection[PersonalAccessToken, PersonalAccessTokenProp]] = js.native
  
  /**
    * Gets a space
    * @param id - Space ID
    * @return Promise for a Space
    * ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => console.log(space))
    * .catch(console.error)
    * ```
    */
  def getSpace(id: String): js.Promise[Space] = js.native
  
  /**
    * Get organization usage grouped by space and metric
    *
    * @param organizationId - Id of an organization
    * @param query - Query parameters
    * @return Promise of a collection of usages
    * ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpaceUsage('<organizationId>', {
    *    skip: 0,
    *    limit: 10,
    *    'metric[in]': 'cda,cpa,gql',
    *    'dateRange.startAt': '2019-10-22',
    *    'dateRange.endAt': '2020-11-30'
    *    }
    * })
    * .then(result => console.log(result.items))
    * .catch(console.error)
    * ```
    */
  def getSpaceUsage(organizationId: String): js.Promise[Collection[Usage, UsageProps]] = js.native
  def getSpaceUsage(organizationId: String, query: UsageQuery): js.Promise[Collection[Usage, UsageProps]] = js.native
  
  /**
    * Gets all spaces
    * @return Promise for a collection of Spaces
    * ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpaces()
    * .then((response) => console.log(response.items))
    * .catch(console.error)
    * ```
    */
  def getSpaces(): js.Promise[Collection[Space, SpaceProps]] = js.native
  def getSpaces(query: QueryOptions): js.Promise[Collection[Space, SpaceProps]] = js.native
  
  /**
    * Make a custom request to the Contentful management API's /spaces endpoint
    * @param opts - axios request options (https://github.com/mzabriskie/axios)
    * @return Promise for the response data
    * ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.rawRequest({
    *   method: 'GET',
    *   url: '/custom/path'
    * })
    * .then((responseData) => console.log(responseData))
    * .catch(console.error)
    * ```
    */
  def rawRequest(opts: AxiosRequestConfig): js.Promise[_] = js.native
}
