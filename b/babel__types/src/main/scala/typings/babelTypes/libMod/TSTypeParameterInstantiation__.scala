package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSTypeParameterInstantiation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeParameterInstantiation__
  extends StObject
     with BaseNode
     with Node
     with TypeScript {
  
  var params: js.Array[TSType]
  
  @JSName("type")
  var type_TSTypeParameterInstantiation__ : TSTypeParameterInstantiation
}
object TSTypeParameterInstantiation__ {
  
  inline def apply(params: js.Array[TSType]): TSTypeParameterInstantiation__ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeParameterInstantiation")
    __obj.asInstanceOf[TSTypeParameterInstantiation__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSTypeParameterInstantiation__] (val x: Self) extends AnyVal {
    
    inline def setParams(value: js.Array[TSType]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: TSType*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setType(value: TSTypeParameterInstantiation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
