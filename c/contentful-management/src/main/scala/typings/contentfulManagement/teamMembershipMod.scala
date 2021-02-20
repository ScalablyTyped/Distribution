package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.MetaSysPropsteamsysMetaLi
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object teamMembershipMod {
  
  @JSImport("contentful-management/dist/typings/entities/team-membership", "wrapTeamMembership")
  @js.native
  def wrapTeamMembership(http: AxiosInstance, data: TeamMembershipProps): TeamMembership = js.native
  
  @JSImport("contentful-management/dist/typings/entities/team-membership", "wrapTeamMembershipCollection")
  @js.native
  def wrapTeamMembershipCollection(http: AxiosInstance, data: CollectionProp[TeamMembershipProps]): Collection[TeamMembership, TeamMembershipProps] = js.native
  
  @js.native
  trait TeamMembership
    extends TeamMembershipProps
       with DefaultElements[TeamMembershipProps] {
    
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
      * client.getOrganization('organizationId')
      * .then(org => org.getTeamMembership('teamId', 'teamMembershipId'))
      * .then((teamMembership) => {
      *  teamMembership.delete();
      * })
      * .catch(console.error)
      * ```
      */
    def delete(): js.Promise[Unit] = js.native
    
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
      * client.getOrganization('organizationId')
      * .then(org => org.getTeamMembership('teamId', 'teamMembershipId'))
      * .then((teamMembership) => {
      *  teamMembership.admin = true;
      *  teamMembership.update();
      * })
      * .catch(console.error)
      * ```
      */
    def update(): js.Promise[TeamMembership] = js.native
  }
  object TeamMembership {
    
    @scala.inline
    def apply(
      admin: Boolean,
      delete: () => js.Promise[Unit],
      organizationMembershipId: String,
      sys: MetaSysPropsteamsysMetaLi,
      toPlainObject: () => TeamMembershipProps,
      update: () => js.Promise[TeamMembership]
    ): TeamMembership = {
      val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), organizationMembershipId = organizationMembershipId.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[TeamMembership]
    }
    
    @scala.inline
    implicit class TeamMembershipMutableBuilder[Self <: TeamMembership] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => js.Promise[TeamMembership]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TeamMembershipProps extends StObject {
    
    /**
      * Is admin
      */
    var admin: Boolean = js.native
    
    /**
      * Organization membership id
      */
    var organizationMembershipId: String = js.native
    
    /**
      * System metadata
      */
    var sys: MetaSysPropsteamsysMetaLi = js.native
  }
  object TeamMembershipProps {
    
    @scala.inline
    def apply(admin: Boolean, organizationMembershipId: String, sys: MetaSysPropsteamsysMetaLi): TeamMembershipProps = {
      val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], organizationMembershipId = organizationMembershipId.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[TeamMembershipProps]
    }
    
    @scala.inline
    implicit class TeamMembershipPropsMutableBuilder[Self <: TeamMembershipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganizationMembershipId(value: String): Self = StObject.set(x, "organizationMembershipId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: MetaSysPropsteamsysMetaLi): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
