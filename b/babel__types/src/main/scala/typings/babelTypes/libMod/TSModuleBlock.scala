package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSModuleBlock
  extends StObject
     with BaseNode
     with Block
     with BlockParent
     with Node
     with Scopable
     with TypeScript {
  
  var body: js.Array[Statement]
  
  @JSName("type")
  var type_TSModuleBlock: typings.babelTypes.babelTypesStrings.TSModuleBlock
}
object TSModuleBlock {
  
  inline def apply(body: js.Array[Statement]): TSModuleBlock = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSModuleBlock")
    __obj.asInstanceOf[TSModuleBlock]
  }
  
  extension [Self <: TSModuleBlock](x: Self) {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSModuleBlock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
