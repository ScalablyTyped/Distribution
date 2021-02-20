package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterTaskDefinitionResponse extends StObject {
  
  /**
    * The list of tags associated with the task definition.
    */
  var tags: js.UndefOr[Tags] = js.native
  
  /**
    * The full description of the registered task definition.
    */
  var taskDefinition: js.UndefOr[TaskDefinition] = js.native
}
object RegisterTaskDefinitionResponse {
  
  @scala.inline
  def apply(): RegisterTaskDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterTaskDefinitionResponse]
  }
  
  @scala.inline
  implicit class RegisterTaskDefinitionResponseMutableBuilder[Self <: RegisterTaskDefinitionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTaskDefinition(value: TaskDefinition): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskDefinitionUndefined: Self = StObject.set(x, "taskDefinition", js.undefined)
  }
}
