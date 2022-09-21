package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentParameterDetail extends StObject {
  
  /**
    * The default value of this parameter if no input is provided.
    */
  var defaultValue: js.UndefOr[ComponentParameterValueList] = js.undefined
  
  /**
    * Describes this parameter.
    */
  var description: js.UndefOr[ComponentParameterDescription] = js.undefined
  
  /**
    * The name of this input parameter.
    */
  var name: ComponentParameterName
  
  /**
    * The type of input this parameter provides. The currently supported value is "string".
    */
  var `type`: ComponentParameterType
}
object ComponentParameterDetail {
  
  inline def apply(name: ComponentParameterName, `type`: ComponentParameterType): ComponentParameterDetail = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentParameterDetail]
  }
  
  extension [Self <: ComponentParameterDetail](x: Self) {
    
    inline def setDefaultValue(value: ComponentParameterValueList): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDefaultValueVarargs(value: ComponentParameterValue*): Self = StObject.set(x, "defaultValue", js.Array(value*))
    
    inline def setDescription(value: ComponentParameterDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: ComponentParameterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ComponentParameterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
