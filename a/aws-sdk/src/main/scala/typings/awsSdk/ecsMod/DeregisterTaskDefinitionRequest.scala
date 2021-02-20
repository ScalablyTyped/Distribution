package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterTaskDefinitionRequest extends StObject {
  
  /**
    * The family and revision (family:revision) or full Amazon Resource Name (ARN) of the task definition to deregister. You must specify a revision.
    */
  var taskDefinition: String = js.native
}
object DeregisterTaskDefinitionRequest {
  
  @scala.inline
  def apply(taskDefinition: String): DeregisterTaskDefinitionRequest = {
    val __obj = js.Dynamic.literal(taskDefinition = taskDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterTaskDefinitionRequest]
  }
  
  @scala.inline
  implicit class DeregisterTaskDefinitionRequestMutableBuilder[Self <: DeregisterTaskDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskDefinition(value: String): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
  }
}
