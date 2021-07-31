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
  
  @scala.inline
  def apply(): CreateContainerServiceDeploymentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContainerServiceDeploymentResult]
  }
  
  @scala.inline
  implicit class CreateContainerServiceDeploymentResultMutableBuilder[Self <: CreateContainerServiceDeploymentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerService(value: ContainerService): Self = StObject.set(x, "containerService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerServiceUndefined: Self = StObject.set(x, "containerService", js.undefined)
  }
}
