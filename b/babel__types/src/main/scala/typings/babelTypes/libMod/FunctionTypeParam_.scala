package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionTypeParam_
  extends StObject
     with BaseNode {
  
  var name: js.UndefOr[Identifier_ | Null] = js.undefined
  
  var optional: js.UndefOr[Boolean | Null] = js.undefined
  
  var typeAnnotation: FlowType
  
  @JSName("type")
  var type_FunctionTypeParam_ : "FunctionTypeParam"
}
object FunctionTypeParam_ {
  
  inline def apply(typeAnnotation: FlowType): FunctionTypeParam_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionTypeParam")
    __obj.asInstanceOf[FunctionTypeParam_]
  }
  
  extension [Self <: FunctionTypeParam_](x: Self) {
    
    inline def setName(value: Identifier_): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setType(value: "FunctionTypeParam"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: FlowType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
