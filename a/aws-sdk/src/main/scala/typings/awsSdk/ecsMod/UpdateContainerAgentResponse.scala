package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContainerAgentResponse extends StObject {
  
  /**
    * The container instance for which the container agent was updated.
    */
  var containerInstance: js.UndefOr[ContainerInstance] = js.undefined
}
object UpdateContainerAgentResponse {
  
  inline def apply(): UpdateContainerAgentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContainerAgentResponse]
  }
  
  extension [Self <: UpdateContainerAgentResponse](x: Self) {
    
    inline def setContainerInstance(value: ContainerInstance): Self = StObject.set(x, "containerInstance", value.asInstanceOf[js.Any])
    
    inline def setContainerInstanceUndefined: Self = StObject.set(x, "containerInstance", js.undefined)
  }
}
