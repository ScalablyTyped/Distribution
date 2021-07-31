package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeParameterDeclaration
  extends StObject
     with Node {
  
  var params: js.Array[TSTypeParameter]
  
  @JSName("type")
  var type_TSTypeParameterDeclaration: typings.babelTypes.babelTypesStrings.TSTypeParameterDeclaration
}
object TSTypeParameterDeclaration {
  
  @JSImport("babel-types/ts3.6", "TSTypeParameterDeclaration")
  @js.native
  def apply(params: js.Array[TSTypeParameter]): TSTypeParameterDeclaration = js.native
  
  @scala.inline
  implicit class TSTypeParameterDeclarationMutableBuilder[Self <: TSTypeParameterDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParams(value: js.Array[TSTypeParameter]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: TSTypeParameter*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSTypeParameterDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
