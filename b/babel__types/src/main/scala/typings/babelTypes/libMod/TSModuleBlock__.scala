package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSModuleBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSModuleBlock__
  extends StObject
     with BaseNode
     with Block
     with BlockParent
     with FunctionParent
     with Node
     with Scopable
     with TypeScript {
  
  var body: js.Array[Statement]
  
  @JSName("type")
  var type_TSModuleBlock__ : TSModuleBlock
}
object TSModuleBlock__ {
  
  inline def apply(body: js.Array[Statement]): TSModuleBlock__ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSModuleBlock")
    __obj.asInstanceOf[TSModuleBlock__]
  }
  
  extension [Self <: TSModuleBlock__](x: Self) {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setType(value: TSModuleBlock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
