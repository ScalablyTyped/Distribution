package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.TypeParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeParameterDeclaration_
  extends Node
     with Flow {
  
  var params: js.Array[Identifier_] = js.native
  
  @JSName("type")
  var type_TypeParameterDeclaration_ : TypeParameterDeclaration = js.native
}
object TypeParameterDeclaration_ {
  
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    params: js.Array[Identifier_],
    start: Double,
    `type`: TypeParameterDeclaration
  ): TypeParameterDeclaration_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameterDeclaration_]
  }
  
  @scala.inline
  implicit class TypeParameterDeclaration_MutableBuilder[Self <: TypeParameterDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParams(value: js.Array[Identifier_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: Identifier_ *): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setType(value: TypeParameterDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
