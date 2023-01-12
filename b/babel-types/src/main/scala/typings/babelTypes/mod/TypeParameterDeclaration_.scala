package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TypeParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeParameterDeclaration_
  extends StObject
     with Node
     with Flow {
  
  var params: js.Array[Identifier_]
  
  @JSName("type")
  var type_TypeParameterDeclaration_ : TypeParameterDeclaration
}
object TypeParameterDeclaration_ {
  
  inline def apply(end: Double, loc: SourceLocation, params: js.Array[Identifier_], start: Double): TypeParameterDeclaration_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeParameterDeclaration")
    __obj.asInstanceOf[TypeParameterDeclaration_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeParameterDeclaration_] (val x: Self) extends AnyVal {
    
    inline def setParams(value: js.Array[Identifier_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: Identifier_ *): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setType(value: TypeParameterDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
