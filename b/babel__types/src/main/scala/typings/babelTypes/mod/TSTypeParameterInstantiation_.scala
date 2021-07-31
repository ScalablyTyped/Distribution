package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSTypeParameterInstantiation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeParameterInstantiation_
  extends StObject
     with BaseNode
     with _Node {
  
  var params: js.Array[TSType]
  
  @JSName("type")
  var type_TSTypeParameterInstantiation_ : TSTypeParameterInstantiation
}
object TSTypeParameterInstantiation_ {
  
  @scala.inline
  def apply(params: js.Array[TSType]): TSTypeParameterInstantiation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTypeParameterInstantiation")
    __obj.asInstanceOf[TSTypeParameterInstantiation_]
  }
  
  @scala.inline
  implicit class TSTypeParameterInstantiation_MutableBuilder[Self <: TSTypeParameterInstantiation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParams(value: js.Array[TSType]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: TSType*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setType(value: TSTypeParameterInstantiation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
