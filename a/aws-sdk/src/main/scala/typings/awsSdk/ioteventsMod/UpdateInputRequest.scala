package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInputRequest extends StObject {
  
  /**
    * The definition of the input.
    */
  var inputDefinition: InputDefinition
  
  /**
    * A brief description of the input.
    */
  var inputDescription: js.UndefOr[InputDescription] = js.undefined
  
  /**
    * The name of the input you want to update.
    */
  var inputName: InputName
}
object UpdateInputRequest {
  
  inline def apply(inputDefinition: InputDefinition, inputName: InputName): UpdateInputRequest = {
    val __obj = js.Dynamic.literal(inputDefinition = inputDefinition.asInstanceOf[js.Any], inputName = inputName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInputRequest]
  }
  
  extension [Self <: UpdateInputRequest](x: Self) {
    
    inline def setInputDefinition(value: InputDefinition): Self = StObject.set(x, "inputDefinition", value.asInstanceOf[js.Any])
    
    inline def setInputDescription(value: InputDescription): Self = StObject.set(x, "inputDescription", value.asInstanceOf[js.Any])
    
    inline def setInputDescriptionUndefined: Self = StObject.set(x, "inputDescription", js.undefined)
    
    inline def setInputName(value: InputName): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
  }
}
