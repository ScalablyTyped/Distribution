package typings.awsSdk.migrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServiceRequest extends StObject {
  
  /**
    * Deletes a Refactor Spaces service.  The RefactorSpacesSecurityGroup security group must be removed from all Amazon Web Services resources in the virtual private cloud (VPC) prior to deleting a service with a URL endpoint in a VPC. 
    */
  var ApplicationIdentifier: ApplicationId
  
  /**
    * The ID of the environment that the service is in.
    */
  var EnvironmentIdentifier: EnvironmentId
  
  /**
    * The ID of the service to delete.
    */
  var ServiceIdentifier: ServiceId
}
object DeleteServiceRequest {
  
  inline def apply(
    ApplicationIdentifier: ApplicationId,
    EnvironmentIdentifier: EnvironmentId,
    ServiceIdentifier: ServiceId
  ): DeleteServiceRequest = {
    val __obj = js.Dynamic.literal(ApplicationIdentifier = ApplicationIdentifier.asInstanceOf[js.Any], EnvironmentIdentifier = EnvironmentIdentifier.asInstanceOf[js.Any], ServiceIdentifier = ServiceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServiceRequest]
  }
  
  extension [Self <: DeleteServiceRequest](x: Self) {
    
    inline def setApplicationIdentifier(value: ApplicationId): Self = StObject.set(x, "ApplicationIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdentifier(value: EnvironmentId): Self = StObject.set(x, "EnvironmentIdentifier", value.asInstanceOf[js.Any])
    
    inline def setServiceIdentifier(value: ServiceId): Self = StObject.set(x, "ServiceIdentifier", value.asInstanceOf[js.Any])
  }
}
