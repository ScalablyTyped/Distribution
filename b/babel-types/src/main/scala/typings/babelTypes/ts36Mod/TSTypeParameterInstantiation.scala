package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeParameterInstantiation
  extends StObject
     with Node {
  
  var params: js.Array[TSType]
  
  @JSName("type")
  var type_TSTypeParameterInstantiation: typings.babelTypes.babelTypesStrings.TSTypeParameterInstantiation
}
object TSTypeParameterInstantiation {
  
  @JSImport("babel-types/ts3.6", "TSTypeParameterInstantiation")
  @js.native
  def apply(params: js.Array[TSType]): TSTypeParameterInstantiation = js.native
  
  @scala.inline
  implicit class TSTypeParameterInstantiationMutableBuilder[Self <: TSTypeParameterInstantiation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParams(value: js.Array[TSType]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: TSType*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSTypeParameterInstantiation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
