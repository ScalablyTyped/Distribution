package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.FunctionTypeParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait FunctionTypeParam_
  extends StObject
     with BaseNode
     with Flow {
  
  var name: Identifier_ | Null
  
  var optional: Boolean | Null
  
  var typeAnnotation: FlowType
  
  @JSName("type")
  var type_FunctionTypeParam_ : FunctionTypeParam
}
object FunctionTypeParam_ {
  
  inline def apply(typeAnnotation: FlowType): FunctionTypeParam_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, name = null, optional = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("FunctionTypeParam")
    __obj.asInstanceOf[FunctionTypeParam_]
  }
  
  extension [Self <: FunctionTypeParam_](x: Self) {
    
    inline def setName(value: Identifier_): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    inline def setType(value: FunctionTypeParam): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: FlowType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
