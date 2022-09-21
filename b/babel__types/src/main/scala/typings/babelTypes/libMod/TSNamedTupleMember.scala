package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSNamedTupleMember
  extends StObject
     with BaseNode
     with Node
     with TypeScript {
  
  var elementType: TSType
  
  var label: Identifier_
  
  var optional: Boolean
  
  @JSName("type")
  var type_TSNamedTupleMember: typings.babelTypes.babelTypesStrings.TSNamedTupleMember
}
object TSNamedTupleMember {
  
  inline def apply(elementType: TSType, label: Identifier_, optional: Boolean): TSNamedTupleMember = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNamedTupleMember")
    __obj.asInstanceOf[TSNamedTupleMember]
  }
  
  extension [Self <: TSNamedTupleMember](x: Self) {
    
    inline def setElementType(value: TSType): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Identifier_): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSNamedTupleMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
