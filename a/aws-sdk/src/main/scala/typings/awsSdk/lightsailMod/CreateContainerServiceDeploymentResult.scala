package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContainerServiceDeploymentResult extends StObject {
  
  /**
    * An object that describes a container service.
    */
  var containerService: js.UndefOr[ContainerService] = js.undefined
}
object CreateContainerServiceDeploymentResult {
  
  inline def apply(): CreateContainerServiceDeploymentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContainerServiceDeploymentResult]
  }
  
  extension [Self <: CreateContainerServiceDeploymentResult](x: Self) {
    
    inline def setContainerService(value: ContainerService): Self = StObject.set(x, "containerService", value.asInstanceOf[js.Any])
    
    inline def setContainerServiceUndefined: Self = StObject.set(x, "containerService", js.undefined)
  }
}
