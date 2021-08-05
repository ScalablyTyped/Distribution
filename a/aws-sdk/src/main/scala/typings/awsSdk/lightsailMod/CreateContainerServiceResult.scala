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
  
  inline def apply(): CreateContainerServiceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContainerServiceResult]
  }
  
  extension [Self <: CreateContainerServiceResult](x: Self) {
    
    inline def setContainerService(value: ContainerService): Self = StObject.set(x, "containerService", value.asInstanceOf[js.Any])
    
    inline def setContainerServiceUndefined: Self = StObject.set(x, "containerService", js.undefined)
  }
}
