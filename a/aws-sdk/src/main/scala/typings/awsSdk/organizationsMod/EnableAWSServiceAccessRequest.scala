package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableAWSServiceAccessRequest extends StObject {
  
  /**
    * The service principal name of the AWS service for which you want to enable integration with your organization. This is typically in the form of a URL, such as  service-abbreviation.amazonaws.com.
    */
  var ServicePrincipal: typings.awsSdk.organizationsMod.ServicePrincipal
}
object EnableAWSServiceAccessRequest {
  
  @scala.inline
  def apply(ServicePrincipal: ServicePrincipal): EnableAWSServiceAccessRequest = {
    val __obj = js.Dynamic.literal(ServicePrincipal = ServicePrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableAWSServiceAccessRequest]
  }
  
  @scala.inline
  implicit class EnableAWSServiceAccessRequestMutableBuilder[Self <: EnableAWSServiceAccessRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServicePrincipal(value: ServicePrincipal): Self = StObject.set(x, "ServicePrincipal", value.asInstanceOf[js.Any])
  }
}
