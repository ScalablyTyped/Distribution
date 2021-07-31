package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.MetaSysPropsorganizationM
import typings.contentfulManagement.commonTypesMod.DefaultElements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object organizationInvitationMod {
  
  @JSImport("contentful-management/dist/typings/entities/organization-invitation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def wrapOrganizationInvitation(http: AxiosInstance, data: OrganizationInvitationProps): OrganizationInvitation = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapOrganizationInvitation")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[OrganizationInvitation]
  
  trait OrganizationInvitation
    extends StObject
       with OrganizationInvitationProps
       with DefaultElements[OrganizationInvitationProps]
  object OrganizationInvitation {
    
    @scala.inline
    def apply(
      email: String,
      firstName: String,
      lastName: String,
      role: String,
      sys: MetaSysPropsorganizationM,
      toPlainObject: () => OrganizationInvitationProps
    ): OrganizationInvitation = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject))
      __obj.asInstanceOf[OrganizationInvitation]
    }
  }
  
  trait OrganizationInvitationProps extends StObject {
    
    var email: String
    
    var firstName: String
    
    var lastName: String
    
    var role: String
    
    var sys: MetaSysPropsorganizationM
  }
  object OrganizationInvitationProps {
    
    @scala.inline
    def apply(email: String, firstName: String, lastName: String, role: String, sys: MetaSysPropsorganizationM): OrganizationInvitationProps = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrganizationInvitationProps]
    }
    
    @scala.inline
    implicit class OrganizationInvitationPropsMutableBuilder[Self <: OrganizationInvitationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: MetaSysPropsorganizationM): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
