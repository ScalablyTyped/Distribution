package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.organizationInvitationMod.OrganizationInvitation
import typings.contentfulManagement.organizationInvitationMod.OrganizationInvitationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeoforganizationInvitat extends js.Object {
  
  def wrapOrganizationInvitation(http: AxiosInstance, data: OrganizationInvitationProps): OrganizationInvitation = js.native
}
object TypeoforganizationInvitat {
  
  @scala.inline
  def apply(wrapOrganizationInvitation: (AxiosInstance, OrganizationInvitationProps) => OrganizationInvitation): TypeoforganizationInvitat = {
    val __obj = js.Dynamic.literal(wrapOrganizationInvitation = js.Any.fromFunction2(wrapOrganizationInvitation))
    __obj.asInstanceOf[TypeoforganizationInvitat]
  }
  
  @scala.inline
  implicit class TypeoforganizationInvitatOps[Self <: TypeoforganizationInvitat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWrapOrganizationInvitation(value: (AxiosInstance, OrganizationInvitationProps) => OrganizationInvitation): Self = this.set("wrapOrganizationInvitation", js.Any.fromFunction2(value))
  }
}
