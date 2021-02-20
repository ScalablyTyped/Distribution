package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateInputRequest extends StObject {
  
  /**
    * The definition of the input.
    */
  var inputDefinition: InputDefinition = js.native
  
  /**
    * A brief description of the input.
    */
  var inputDescription: js.UndefOr[InputDescription] = js.native
  
  /**
    * The name of the input you want to update.
    */
  var inputName: InputName = js.native
}
object UpdateInputRequest {
  
  @scala.inline
  def apply(inputDefinition: InputDefinition, inputName: InputName): UpdateInputRequest = {
    val __obj = js.Dynamic.literal(inputDefinition = inputDefinition.asInstanceOf[js.Any], inputName = inputName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInputRequest]
  }
  
  @scala.inline
  implicit class UpdateInputRequestMutableBuilder[Self <: UpdateInputRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputDefinition(value: InputDefinition): Self = StObject.set(x, "inputDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDescription(value: InputDescription): Self = StObject.set(x, "inputDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDescriptionUndefined: Self = StObject.set(x, "inputDescription", js.undefined)
    
    @scala.inline
    def setInputName(value: InputName): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
  }
}
