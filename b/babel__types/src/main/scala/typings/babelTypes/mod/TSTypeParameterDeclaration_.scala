package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSTypeParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeParameterDeclaration_
  extends BaseNode
     with _Node {
  
  var params: js.Array[TSTypeParameter_] = js.native
  
  @JSName("type")
  var type_TSTypeParameterDeclaration_ : TSTypeParameterDeclaration = js.native
}
object TSTypeParameterDeclaration_ {
  
  @scala.inline
  def apply(params: js.Array[TSTypeParameter_], `type`: TSTypeParameterDeclaration): TSTypeParameterDeclaration_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeParameterDeclaration_]
  }
  
  @scala.inline
  implicit class TSTypeParameterDeclaration_MutableBuilder[Self <: TSTypeParameterDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParams(value: js.Array[TSTypeParameter_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: TSTypeParameter_ *): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setType(value: TSTypeParameterDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
