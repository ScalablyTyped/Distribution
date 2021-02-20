package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateContainerAgentResponse extends StObject {
  
  /**
    * The container instance for which the container agent was updated.
    */
  var containerInstance: js.UndefOr[ContainerInstance] = js.native
}
object UpdateContainerAgentResponse {
  
  @scala.inline
  def apply(): UpdateContainerAgentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContainerAgentResponse]
  }
  
  @scala.inline
  implicit class UpdateContainerAgentResponseMutableBuilder[Self <: UpdateContainerAgentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerInstance(value: ContainerInstance): Self = StObject.set(x, "containerInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerInstanceUndefined: Self = StObject.set(x, "containerInstance", js.undefined)
  }
}
