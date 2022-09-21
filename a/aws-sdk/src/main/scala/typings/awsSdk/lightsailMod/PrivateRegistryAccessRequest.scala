package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateRegistryAccessRequest extends StObject {
  
  /**
    * An object to describe a request to activate or deactivate the role that you can use to grant an Amazon Lightsail container service access to Amazon Elastic Container Registry (Amazon ECR) private repositories.
    */
  var ecrImagePullerRole: js.UndefOr[ContainerServiceECRImagePullerRoleRequest] = js.undefined
}
object PrivateRegistryAccessRequest {
  
  inline def apply(): PrivateRegistryAccessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateRegistryAccessRequest]
  }
  
  extension [Self <: PrivateRegistryAccessRequest](x: Self) {
    
    inline def setEcrImagePullerRole(value: ContainerServiceECRImagePullerRoleRequest): Self = StObject.set(x, "ecrImagePullerRole", value.asInstanceOf[js.Any])
    
    inline def setEcrImagePullerRoleUndefined: Self = StObject.set(x, "ecrImagePullerRole", js.undefined)
  }
}
