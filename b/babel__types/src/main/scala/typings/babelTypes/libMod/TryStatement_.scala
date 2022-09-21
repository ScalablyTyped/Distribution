package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TryStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TryStatement_
  extends StObject
     with BaseNode
     with Node
     with Standardized
     with Statement {
  
  var block: BlockStatement_
  
  var finalizer: js.UndefOr[BlockStatement_ | Null] = js.undefined
  
  var handler: js.UndefOr[CatchClause_ | Null] = js.undefined
  
  @JSName("type")
  var type_TryStatement_ : TryStatement
}
object TryStatement_ {
  
  inline def apply(block: BlockStatement_): TryStatement_ = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TryStatement")
    __obj.asInstanceOf[TryStatement_]
  }
  
  extension [Self <: TryStatement_](x: Self) {
    
    inline def setBlock(value: BlockStatement_): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setFinalizer(value: BlockStatement_): Self = StObject.set(x, "finalizer", value.asInstanceOf[js.Any])
    
    inline def setFinalizerNull: Self = StObject.set(x, "finalizer", null)
    
    inline def setFinalizerUndefined: Self = StObject.set(x, "finalizer", js.undefined)
    
    inline def setHandler(value: CatchClause_): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerNull: Self = StObject.set(x, "handler", null)
    
    inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    inline def setType(value: TryStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
