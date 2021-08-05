package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterContainerInstanceResponse extends StObject {
  
  /**
    * The container instance that was deregistered.
    */
  var containerInstance: js.UndefOr[ContainerInstance] = js.undefined
}
object DeregisterContainerInstanceResponse {
  
  inline def apply(): DeregisterContainerInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterContainerInstanceResponse]
  }
  
  extension [Self <: DeregisterContainerInstanceResponse](x: Self) {
    
    inline def setContainerInstance(value: ContainerInstance): Self = StObject.set(x, "containerInstance", value.asInstanceOf[js.Any])
    
    inline def setContainerInstanceUndefined: Self = StObject.set(x, "containerInstance", js.undefined)
  }
}
