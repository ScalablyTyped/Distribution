package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSTypeParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeParameterDeclaration__
  extends StObject
     with BaseNode
     with Node
     with TypeScript {
  
  var params: js.Array[TSTypeParameter__]
  
  @JSName("type")
  var type_TSTypeParameterDeclaration__ : TSTypeParameterDeclaration
}
object TSTypeParameterDeclaration__ {
  
  inline def apply(params: js.Array[TSTypeParameter__]): TSTypeParameterDeclaration__ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeParameterDeclaration")
    __obj.asInstanceOf[TSTypeParameterDeclaration__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSTypeParameterDeclaration__] (val x: Self) extends AnyVal {
    
    inline def setParams(value: js.Array[TSTypeParameter__]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: TSTypeParameter__ *): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setType(value: TSTypeParameterDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
