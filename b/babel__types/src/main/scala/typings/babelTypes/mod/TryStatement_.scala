package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TryStatement_
  extends StObject
     with BaseNode {
  
  var block: BlockStatement_
  
  var finalizer: BlockStatement_ | Null
  
  var handler: CatchClause_ | Null
  
  @JSName("type")
  var type_TryStatement_ : "TryStatement"
}
object TryStatement_ {
  
  inline def apply(block: BlockStatement_): TryStatement_ = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], end = null, finalizer = null, handler = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TryStatement")
    __obj.asInstanceOf[TryStatement_]
  }
  
  extension [Self <: TryStatement_](x: Self) {
    
    inline def setBlock(value: BlockStatement_): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setFinalizer(value: BlockStatement_): Self = StObject.set(x, "finalizer", value.asInstanceOf[js.Any])
    
    inline def setFinalizerNull: Self = StObject.set(x, "finalizer", null)
    
    inline def setHandler(value: CatchClause_): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerNull: Self = StObject.set(x, "handler", null)
    
    inline def setType(value: "TryStatement"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
