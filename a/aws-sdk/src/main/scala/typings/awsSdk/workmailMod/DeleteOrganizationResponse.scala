package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteOrganizationResponse extends js.Object {
  
  /**
    * The organization ID.
    */
  var OrganizationId: js.UndefOr[typings.awsSdk.workmailMod.OrganizationId] = js.native
  
  /**
    * The state of the organization.
    */
  var State: js.UndefOr[String] = js.native
}
object DeleteOrganizationResponse {
  
  @scala.inline
  def apply(): DeleteOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteOrganizationResponse]
  }
  
  @scala.inline
  implicit class DeleteOrganizationResponseOps[Self <: DeleteOrganizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationId: Self = this.set("OrganizationId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
