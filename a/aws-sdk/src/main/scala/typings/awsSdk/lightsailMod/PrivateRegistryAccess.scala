package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateRegistryAccess extends StObject {
  
  /**
    * An object that describes the activation status of the role that you can use to grant a Lightsail container service access to Amazon ECR private repositories. If the role is activated, the Amazon Resource Name (ARN) of the role is also listed.
    */
  var ecrImagePullerRole: js.UndefOr[ContainerServiceECRImagePullerRole] = js.undefined
}
object PrivateRegistryAccess {
  
  inline def apply(): PrivateRegistryAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateRegistryAccess]
  }
  
  extension [Self <: PrivateRegistryAccess](x: Self) {
    
    inline def setEcrImagePullerRole(value: ContainerServiceECRImagePullerRole): Self = StObject.set(x, "ecrImagePullerRole", value.asInstanceOf[js.Any])
    
    inline def setEcrImagePullerRoleUndefined: Self = StObject.set(x, "ecrImagePullerRole", js.undefined)
  }
}
