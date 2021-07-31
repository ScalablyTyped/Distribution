package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContainerServiceResult extends StObject {
  
  /**
    * An object that describes a container service.
    */
  var containerService: js.UndefOr[ContainerService] = js.undefined
}
object CreateContainerServiceResult {
  
  @scala.inline
  def apply(): CreateContainerServiceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContainerServiceResult]
  }
  
  @scala.inline
  implicit class CreateContainerServiceResultMutableBuilder[Self <: CreateContainerServiceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerService(value: ContainerService): Self = StObject.set(x, "containerService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerServiceUndefined: Self = StObject.set(x, "containerService", js.undefined)
  }
}
