package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteOrganizationConformancePackRequest extends js.Object {
  
  /**
    * The name of organization conformance pack that you want to delete.
    */
  var OrganizationConformancePackName: typings.awsSdk.configserviceMod.OrganizationConformancePackName = js.native
}
object DeleteOrganizationConformancePackRequest {
  
  @scala.inline
  def apply(OrganizationConformancePackName: OrganizationConformancePackName): DeleteOrganizationConformancePackRequest = {
    val __obj = js.Dynamic.literal(OrganizationConformancePackName = OrganizationConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOrganizationConformancePackRequest]
  }
  
  @scala.inline
  implicit class DeleteOrganizationConformancePackRequestOps[Self <: DeleteOrganizationConformancePackRequest] (val x: Self) extends AnyVal {
    
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
    def setOrganizationConformancePackName(value: OrganizationConformancePackName): Self = this.set("OrganizationConformancePackName", value.asInstanceOf[js.Any])
  }
}
