package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterTaskDefinitionResponse extends StObject {
  
  /**
    * The full description of the deregistered task.
    */
  var taskDefinition: js.UndefOr[TaskDefinition] = js.undefined
}
object DeregisterTaskDefinitionResponse {
  
  @scala.inline
  def apply(): DeregisterTaskDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterTaskDefinitionResponse]
  }
  
  @scala.inline
  implicit class DeregisterTaskDefinitionResponseMutableBuilder[Self <: DeregisterTaskDefinitionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskDefinition(value: TaskDefinition): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskDefinitionUndefined: Self = StObject.set(x, "taskDefinition", js.undefined)
  }
}
