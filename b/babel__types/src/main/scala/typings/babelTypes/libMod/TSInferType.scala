package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSInferType
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var typeParameter: TSTypeParameter
  
  @JSName("type")
  var type_TSInferType: typings.babelTypes.babelTypesStrings.TSInferType
}
object TSInferType {
  
  inline def apply(typeParameter: TSTypeParameter): TSInferType = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSInferType")
    __obj.asInstanceOf[TSInferType]
  }
  
  extension [Self <: TSInferType](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSInferType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameter(value: TSTypeParameter): Self = StObject.set(x, "typeParameter", value.asInstanceOf[js.Any])
  }
}
