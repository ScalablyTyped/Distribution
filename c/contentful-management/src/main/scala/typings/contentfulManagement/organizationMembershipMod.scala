package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object organizationMembershipMod {
  
  @JSImport("contentful-management/dist/typings/entities/organization-membership", "wrapOrganizationMembership")
  @js.native
  def wrapOrganizationMembership(http: AxiosInstance, data: OrganizationMembershipProps): OrganizationMembership = js.native
  
  @JSImport("contentful-management/dist/typings/entities/organization-membership", "wrapOrganizationMembershipCollection")
  @js.native
  def wrapOrganizationMembershipCollection(http: AxiosInstance, data: CollectionProp[OrganizationMembershipProps]): Collection[OrganizationMembership, OrganizationMembershipProps] = js.native
  
  @js.native
  trait OrganizationMembership
    extends OrganizationMembershipProps
       with DefaultElements[OrganizationMembershipProps] {
    
    /**
      * Deletes this object on the server.
      * @example```javascript
      * const contentful = require('contentful-management')
      *
      * const client = contentful.createClient({
      *   accessToken: '<content_management_api_key>'
      * })
      *
      * client.getOrganization('organization_id')
      * .then(org => org.getOrganizationMembership('organizationMembership_id'))
      * .then((organizationMembership) => {
      *  organizationMembership.delete();
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
      * client.getOrganization('organization_id')
      * .then(org => org.getOrganizationMembership('organizationMembership_id'))
      * .then((organizationMembership) => {
      *  organizationMembership.role = 'member';
      *  organizationMembership.update();
      * })
      * .catch(console.error)
      */
    def update(): js.Promise[OrganizationMembership] = js.native
  }
  object OrganizationMembership {
    
    @scala.inline
    def apply(
      delete: () => js.Promise[Unit],
      role: String,
      status: Boolean,
      sys: MetaSysProps,
      toPlainObject: () => OrganizationMembershipProps,
      update: () => js.Promise[OrganizationMembership]
    ): OrganizationMembership = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), role = role.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[OrganizationMembership]
    }
    
    @scala.inline
    implicit class OrganizationMembershipMutableBuilder[Self <: OrganizationMembership] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => js.Promise[OrganizationMembership]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait OrganizationMembershipProps extends StObject {
    
    /**
      * Role
      */
    var role: String = js.native
    
    /**
      * status
      */
    var status: Boolean = js.native
    
    /**
      * System metadata
      */
    var sys: MetaSysProps = js.native
  }
  object OrganizationMembershipProps {
    
    @scala.inline
    def apply(role: String, status: Boolean, sys: MetaSysProps): OrganizationMembershipProps = {
      val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrganizationMembershipProps]
    }
    
    @scala.inline
    implicit class OrganizationMembershipPropsMutableBuilder[Self <: OrganizationMembershipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
