package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrganizationResponse extends StObject {
  
  /**
    * A structure that contains information about the organization.  The AvailablePolicyTypes part of the response is deprecated, and you shouldn't use it in your apps. It doesn't include any policy type supported by Organizations other than SCPs. To determine which policy types are enabled in your organization, use the  ListRoots  operation. 
    */
  var Organization: js.UndefOr[typings.awsSdk.organizationsMod.Organization] = js.undefined
}
object DescribeOrganizationResponse {
  
  @scala.inline
  def apply(): DescribeOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationResponse]
  }
  
  @scala.inline
  implicit class DescribeOrganizationResponseMutableBuilder[Self <: DescribeOrganizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganization(value: Organization): Self = StObject.set(x, "Organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationUndefined: Self = StObject.set(x, "Organization", js.undefined)
  }
}
