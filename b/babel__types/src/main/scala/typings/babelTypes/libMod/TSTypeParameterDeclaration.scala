package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeParameterDeclaration
  extends StObject
     with BaseNode
     with Node
     with TypeScript {
  
  var params: js.Array[TSTypeParameter]
  
  @JSName("type")
  var type_TSTypeParameterDeclaration: typings.babelTypes.babelTypesStrings.TSTypeParameterDeclaration
}
object TSTypeParameterDeclaration {
  
  inline def apply(params: js.Array[TSTypeParameter]): TSTypeParameterDeclaration = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeParameterDeclaration")
    __obj.asInstanceOf[TSTypeParameterDeclaration]
  }
  
  extension [Self <: TSTypeParameterDeclaration](x: Self) {
    
    inline def setParams(value: js.Array[TSTypeParameter]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: TSTypeParameter*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSTypeParameterDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
