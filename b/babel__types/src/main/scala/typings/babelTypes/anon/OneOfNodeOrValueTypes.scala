package typings.babelTypes.anon

import typings.babelTypes.libMod.NodeTypes
import typings.babelTypes.libMod.PrimitiveTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OneOfNodeOrValueTypes extends StObject {
  
  var oneOfNodeOrValueTypes: js.Array[NodeTypes | PrimitiveTypes]
}
object OneOfNodeOrValueTypes {
  
  inline def apply(oneOfNodeOrValueTypes: js.Array[NodeTypes | PrimitiveTypes]): OneOfNodeOrValueTypes = {
    val __obj = js.Dynamic.literal(oneOfNodeOrValueTypes = oneOfNodeOrValueTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneOfNodeOrValueTypes]
  }
  
  extension [Self <: OneOfNodeOrValueTypes](x: Self) {
    
    inline def setOneOfNodeOrValueTypes(value: js.Array[NodeTypes | PrimitiveTypes]): Self = StObject.set(x, "oneOfNodeOrValueTypes", value.asInstanceOf[js.Any])
    
    inline def setOneOfNodeOrValueTypesVarargs(value: (NodeTypes | PrimitiveTypes)*): Self = StObject.set(x, "oneOfNodeOrValueTypes", js.Array(value*))
  }
}
