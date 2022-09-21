package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableAWSServiceAccessRequest extends StObject {
  
  /**
    * The service principal name of the Amazon Web Services service for which you want to disable integration with your organization. This is typically in the form of a URL, such as  service-abbreviation.amazonaws.com.
    */
  var ServicePrincipal: typings.awsSdk.organizationsMod.ServicePrincipal
}
object DisableAWSServiceAccessRequest {
  
  inline def apply(ServicePrincipal: ServicePrincipal): DisableAWSServiceAccessRequest = {
    val __obj = js.Dynamic.literal(ServicePrincipal = ServicePrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableAWSServiceAccessRequest]
  }
  
  extension [Self <: DisableAWSServiceAccessRequest](x: Self) {
    
    inline def setServicePrincipal(value: ServicePrincipal): Self = StObject.set(x, "ServicePrincipal", value.asInstanceOf[js.Any])
  }
}
