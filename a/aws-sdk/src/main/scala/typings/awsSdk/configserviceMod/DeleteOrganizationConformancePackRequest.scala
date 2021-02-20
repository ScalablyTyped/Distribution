package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteOrganizationConformancePackRequest extends StObject {
  
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
  implicit class DeleteOrganizationConformancePackRequestMutableBuilder[Self <: DeleteOrganizationConformancePackRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganizationConformancePackName(value: OrganizationConformancePackName): Self = StObject.set(x, "OrganizationConformancePackName", value.asInstanceOf[js.Any])
  }
}
