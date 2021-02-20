package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutOrganizationConformancePackResponse extends StObject {
  
  /**
    * ARN of the organization conformance pack.
    */
  var OrganizationConformancePackArn: js.UndefOr[StringWithCharLimit256] = js.native
}
object PutOrganizationConformancePackResponse {
  
  @scala.inline
  def apply(): PutOrganizationConformancePackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutOrganizationConformancePackResponse]
  }
  
  @scala.inline
  implicit class PutOrganizationConformancePackResponseMutableBuilder[Self <: PutOrganizationConformancePackResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganizationConformancePackArn(value: StringWithCharLimit256): Self = StObject.set(x, "OrganizationConformancePackArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationConformancePackArnUndefined: Self = StObject.set(x, "OrganizationConformancePackArn", js.undefined)
  }
}
