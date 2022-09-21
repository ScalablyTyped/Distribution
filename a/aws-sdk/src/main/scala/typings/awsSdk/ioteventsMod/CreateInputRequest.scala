package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInputRequest extends StObject {
  
  /**
    * The definition of the input.
    */
  var inputDefinition: InputDefinition
  
  /**
    * A brief description of the input.
    */
  var inputDescription: js.UndefOr[InputDescription] = js.undefined
  
  /**
    * The name you want to give to the input.
    */
  var inputName: InputName
  
  /**
    * Metadata that can be used to manage the input.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object CreateInputRequest {
  
  inline def apply(inputDefinition: InputDefinition, inputName: InputName): CreateInputRequest = {
    val __obj = js.Dynamic.literal(inputDefinition = inputDefinition.asInstanceOf[js.Any], inputName = inputName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInputRequest]
  }
  
  extension [Self <: CreateInputRequest](x: Self) {
    
    inline def setInputDefinition(value: InputDefinition): Self = StObject.set(x, "inputDefinition", value.asInstanceOf[js.Any])
    
    inline def setInputDescription(value: InputDescription): Self = StObject.set(x, "inputDescription", value.asInstanceOf[js.Any])
    
    inline def setInputDescriptionUndefined: Self = StObject.set(x, "inputDescription", js.undefined)
    
    inline def setInputName(value: InputName): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
