package typings.contentfulManagement.anon

import typings.contentfulManagement.appDefinitionMod.AppDefinition
import typings.contentfulManagement.appDefinitionMod.AppDefinitionProps
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.QueryOptions
import typings.contentfulManagement.organizationInvitationMod.OrganizationInvitation
import typings.contentfulManagement.organizationMembershipMod.OrganizationMembership
import typings.contentfulManagement.organizationMembershipMod.OrganizationMembershipProps
import typings.contentfulManagement.spaceMembershipMod.SpaceMembership
import typings.contentfulManagement.spaceMembershipMod.SpaceMembershipProps
import typings.contentfulManagement.teamMembershipMod.TeamMembership
import typings.contentfulManagement.teamMembershipMod.TeamMembershipProps
import typings.contentfulManagement.teamMod.Team
import typings.contentfulManagement.teamMod.TeamProps
import typings.contentfulManagement.teamSpaceMembershipMod.TeamSpaceMembership
import typings.contentfulManagement.teamSpaceMembershipMod.TeamSpaceMembershipProps
import typings.contentfulManagement.userMod.User
import typings.contentfulManagement.userMod.UserProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAppDefinition extends StObject {
  
  /**
    * Creates an app definition
    * @param Object representation of the App Definition to be created
    * @return Promise for the newly created AppDefinition
    * @example ```javascript
    * const contentful = require('contentful-management')
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getOrganization('<org_id>')
    * .then((org) => org.createAppDefinition({
    *    name: 'Example app',
    *    locations: [{ location: 'app-config' }],
    *    src: "http://my-app-host.com/my-app"
    *  }))
    * .then((appDefinition) => console.log(appDefinition))
    * .catch(console.error)
    * ```
    */
  def createAppDefinition(data: OmitAppDefinitionPropssys): js.Promise[AppDefinition] = js.native
  
  /**
    * Create an Invitation in Organization
    * @return Promise for a OrganizationInvitation in an organization
    * @example ```javascript
    * const contentful = require('contentful-management')
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getOrganization('<org_id>')
    *  .then((organization) => organization.createOrganizationInvitation({
    *    email: 'user.email@example.com'
    *    firstName: 'User First Name'
    *    lastName: 'User Last Name'
    *    role: 'developer'
    *  })
    * .catch(console.error)
    * ```
    */
  def createOrganizationInvitation(data: OmitOrganizationInvitatio): js.Promise[OrganizationInvitation] = js.native
  
  /**
    * Creates a Team
    * @param Object representation of the Team to be created
    * @example ```javascript
    * const contentful = require('contentful-management')
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getOrganization('<org_id>')
    * .then((org) => org.createTeam({
    *    name: 'new team',
    *    description: 'new team description'
    *  }))
    * .then((team) => console.log(team))
    * .catch(console.error)
    * ```
    */
  def createTeam(data: OmitTeamPropssys): js.Promise[Team] = js.native
  
  /**
    * Creates a Team membership
    * @param data - Object representation of the Team Membership to be created
    * @return Promise for the newly created TeamMembership
    * @example ```javascript
    * const contentful = require('contentful-management')
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getOrganization('organizationId')
    * .then((org) => org.createTeamMembership('teamId', {
    *    admin: true,
    *    organizationMembershipId: 'organizationMembershipId'
    *  }))
    * .then((teamMembership) => console.log(teamMembership))
    * .catch(console.error)
    * ```
    */
  def createTeamMembership(teamId: String, data: OmitTeamMembershipPropssy): js.Promise[TeamMembership] = js.native
  
  /**
    * Gets an app definition
    * @return Promise for an App Definition
    * @example ```javascript
    * const contentful = require('contentful-management')
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getOrganization('<org_id>')
    * .then((org) => org.getAppDefinition('<app_definition_id>'))
    * .then((appDefinition) => console.log(appDefinition))
    * .catch(console.error)
    * ```
    */
  def getAppDefinition(id: String): js.Promise[AppDefinition] = js.native
  
  /**
    * Gets all app definitions
    * @return Promise for a collection of App Definitions
    * @example ```javascript
    * const contentful = require('contentful-management')
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getOrganization('<org_id>')
    * .then((org) => org.getAppDefinitions())
    * .then((response) => console.log(response.items))
    * .catch(console.error)
    * ```
    */
  def getAppDefinitions(): js.Promise[Collection[AppDefinition, AppDefinitionProps]] = js.native
  def getAppDefinitions(query: QueryOptions): js.Promise[Collection[AppDefinition, AppDefinitionProps]] = js.native
  
  /**
    * Gets an Invitation in Organization
    * @return Promise for a OrganizationInvitation in an organization
    * @example ```javascript
    * const contentful = require('contentful-management')
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getOrganization('<org_id>')
    * .then((organization) => organization.getOrganizationInvitation('invitation_id'))
    * .then((invitation) => console.log(invitation))
    * .catch(console.error)
    * ```
    */
  def getOrganizationInvitation(invitationId: String): js.Promise[OrganizationInvitation] = js.native
  
  /**
    * Gets an Organization Membership
    * @param id - Organization Membership ID
    * @return Promise for an Organization Membership
    * @example ```javascript
    * const contentful = require('contentful-management')
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getOrganization('organization_id')
    * .then((organization) => organization.getOrganizationMembership('organizationMembership_id'))
    * .then((organizationMembership) => console.log(organizationMembership))
    * .catch(console.error)
    * ```
    */
  def getOrganizationMembership(id: String): js.Promise[OrganizationMembership] = js.native
  
  /**
    * Gets a collection of Organization Memberships
    * @param  query - Object with search parameters. Check the <a href="https://www.contentful.com/developers/docs/javascript/tutorials/using-js-cda-sdk/#retrieving-entries-with-search-parameters">JS SDK tutorial</a> and the <a href="https://www.contentful.com/developers/docs/references/content-delivery-api/#/reference/search-parameters">REST API reference</a> for more details.
    * @return Promise for a collection of Organization Memberships
    * @example ```javascript
    * const contentful = require('contentful-management')
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getOrganization('organization_id')
    * .then((organization) => organization.getOrganizationMemberships({'limit': 100})) // you can add more queries as 'key': 'value'
    * .then((response) => console.log(response.items))
    * .catch(console.error)
    * ```
    */
  def getOrganizationMemberships(): js.Promise[Collection[OrganizationMembership, OrganizationMembershipProps]] = js.native
  def getOrganizationMemberships(query: QueryOptions): js.Promise[Collection[OrganizationMembership, OrganizationMembershipProps]] = js.native
  
  /**
    * Gets an Space Membership in Organization
    * @param id - Organiztion Space Membership ID
    * @return Promise for a Space Membership in an organization
    * @example ```javascript
    * const contentful = require('contentful-management')
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getOrganization('organization_id')
    * .then((organization) => organization.getOrganizationSpaceMembership('organizationSpaceMembership_id'))
    * .then((organizationMembership) => console.log(organizationMembership))
    * .catch(console.error)
    * ```
    */
  def getOrganizationSpaceMembership(id: String): js.Promise[SpaceMembership] = js.native
  
  /**
    * Gets a collection Space Memberships in organization
    * @param query - Object with search parameters. Check the <a href="https://www.contentful.com/developers/docs/javascript/tutorials/using-js-cda-sdk/#retrieving-entries-with-search-parameters">JS SDK tutorial</a> and the <a href="https://www.contentful.com/developers/docs/references/content-delivery-api/#/reference/search-parameters">REST API reference</a> for more details.
    * @return Promise for a Space Membership collection across all spaces in the organization
    * @example ```javascript
    * const contentful = require('contentful-management')
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getOrganization('organization_id')
    * .then((organization) => organization.getOrganizationSpaceMemberships()) // you can add queries like 'limit': 100
    * .then((response) => console.log(response.items))
    * .catch(console.error)
    * ```
    */
  def getOrganizationSpaceMemberships(): js.Promise[Collection[SpaceMembership, SpaceMembershipProps]] = js.native
  def getOrganizationSpaceMemberships(query: QueryOptions): js.Promise[Collection[SpaceMembership, SpaceMembershipProps]] = js.native
  
  /**
    * Gets an Team
    * @example ```javascript
    * const contentful = require('contentful-management')
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getOrganization('orgId')
    * .then((organization) => organization.getTeam('teamId'))
    * .then((team) => console.log(team))
    * .catch(console.error)
    * ```
    */
  def getTeam(teamId: String): js.Promise[Team] = js.native
  
  /**
    * Gets an Team Membership from the team with given teamId
    * @return Promise for an Team Membership
    * @example ```javascript
    * const contentful = require('contentful-management')
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getOrganization('organizationId')
    * .then((organization) => organization.getTeamMembership('teamId', 'teamMembership_id'))
    * .then((teamMembership) => console.log(teamMembership))
    * .catch(console.error)
    * ```
    */
  def getTeamMembership(teamId: String, teamMembershipId: String): js.Promise[TeamMembership] = js.native
  
  /**
    * Get all Team Memberships. If teamID is provided in the optional config object, it will return all Team Memberships in that team. By default, returns all team memberships for the organization.
    * @return Promise for a Team Membership Collection
    * @example ```javascript
    * const contentful = require('contentful-management')
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getOrganization('organizationId')
    * .then((organization) => organization.getTeamMemberships('teamId'))
    * .then((teamMemberships) => console.log(teamMemberships))
    * .catch(console.error)
    * ```
    */
  def getTeamMemberships(): js.Promise[Collection[TeamMembership, TeamMembershipProps]] = js.native
  def getTeamMemberships(opts: Query): js.Promise[Collection[TeamMembership, TeamMembershipProps]] = js.native
  
  /**
    * Get a Team Space Membership with given teamSpaceMembershipId
    * @return Promise for a Team Space Membership
    * @example ```javascript
    * const contentful = require('contentful-management')
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getOrganization('organizationId')
    * .then((organization) => organization.getTeamSpaceMembership('teamSpaceMembershipId'))
    * .then((teamSpaceMembership) => console.log(teamSpaceMembership))
    * .catch(console.error)]
    * ```
    */
  def getTeamSpaceMembership(teamSpaceMembershipId: String): js.Promise[TeamSpaceMembership] = js.native
  
  /**
    * Get all Team Space Memberships. If teamID is provided in the optional config object, it will return all Team Space Memberships in that team. By default, returns all team space memberships across all teams in the organization.
    * @return Promise for a Team Space Membership Collection
    * @example ```javascript
    * const contentful = require('contentful-management')
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getOrganization('organizationId')
    * .then((organization) => organization.getTeamSpaceMemberships('teamId'))
    * .then((teamSpaceMemberships) => console.log(teamSpaceMemberships))
    * .catch(console.error)
    * ```
    */
  def getTeamSpaceMemberships(): js.Promise[Collection[TeamSpaceMembership, TeamSpaceMembershipProps]] = js.native
  def getTeamSpaceMemberships(opts: Query): js.Promise[Collection[TeamSpaceMembership, TeamSpaceMembershipProps]] = js.native
  
  /**
    * Gets all Teams in an organization
    * @example ```javascript
    * const contentful = require('contentful-management')
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getOrganization('orgId')
    * .then((organization) => organization.getTeams())
    * .then((teams) => console.log(teams))
    * .catch(console.error)
    * ```
    */
  def getTeams(): js.Promise[Collection[Team, TeamProps]] = js.native
  def getTeams(query: QueryOptions): js.Promise[Collection[Team, TeamProps]] = js.native
  
  /**
    * Gets a User
    * @return Promise for a User
    * @example ```javascript
    * const contentful = require('contentful-management')
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getOrganization('<organization_id>')
    * .then((organization) => organization.getUser('id'))
    * .then((user) => console.log(user))
    * .catch(console.error)
    * ```
    */
  def getUser(id: String): js.Promise[User] = js.native
  
  /**
    * Gets a collection of Users in organization
    * @param query - Object with search parameters. Check the <a href="https://www.contentful.com/developers/docs/javascript/tutorials/using-js-cda-sdk/#retrieving-entries-with-search-parameters">JS SDK tutorial</a> and the <a href="https://www.contentful.com/developers/docs/references/content-delivery-api/#/reference/search-parameters">REST API reference</a> for more details.
    * @return Promise a collection of Users in organization
    * @example ```javascript
    * const contentful = require('contentful-management')
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getOrganization('<organization_id>')
    * .then((organization) => organization.getUsers())
    * .then((user) => console.log(user))
    * .catch(console.error)
    * ```
    */
  def getUsers(): js.Promise[Collection[User, UserProps]] = js.native
  def getUsers(query: QueryOptions): js.Promise[Collection[User, UserProps]] = js.native
}
