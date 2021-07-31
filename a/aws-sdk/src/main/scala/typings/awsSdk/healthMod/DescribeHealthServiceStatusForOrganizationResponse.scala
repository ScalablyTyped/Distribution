package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHealthServiceStatusForOrganizationResponse extends StObject {
  
  /**
    * Information about the status of enabling or disabling AWS Health Organizational View in your organization. Valid values are ENABLED | DISABLED | PENDING. 
    */
  var healthServiceAccessStatusForOrganization: js.UndefOr[typings.awsSdk.healthMod.healthServiceAccessStatusForOrganization] = js.undefined
}
object DescribeHealthServiceStatusForOrganizationResponse {
  
  @scala.inline
  def apply(): DescribeHealthServiceStatusForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHealthServiceStatusForOrganizationResponse]
  }
  
  @scala.inline
  implicit class DescribeHealthServiceStatusForOrganizationResponseMutableBuilder[Self <: DescribeHealthServiceStatusForOrganizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthServiceAccessStatusForOrganization(value: healthServiceAccessStatusForOrganization): Self = StObject.set(x, "healthServiceAccessStatusForOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthServiceAccessStatusForOrganizationUndefined: Self = StObject.set(x, "healthServiceAccessStatusForOrganization", js.undefined)
  }
}
