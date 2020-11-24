package typings.contentfulManagement.organizationInvitationMod

import typings.contentfulManagement.anon.MetaSysPropsorganizationM
import typings.contentfulManagement.commonTypesMod.DefaultElements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationInvitation
  extends OrganizationInvitationProps
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
