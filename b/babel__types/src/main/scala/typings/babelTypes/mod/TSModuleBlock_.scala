package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSModuleBlock_
  extends StObject
     with BaseNode {
  
  var body: js.Array[Statement]
  
  @JSName("type")
  var type_TSModuleBlock_ : "TSModuleBlock"
}
object TSModuleBlock_ {
  
  inline def apply(body: js.Array[Statement]): TSModuleBlock_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSModuleBlock")
    __obj.asInstanceOf[TSModuleBlock_]
  }
  
  extension [Self <: TSModuleBlock_](x: Self) {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setType(value: "TSModuleBlock"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
