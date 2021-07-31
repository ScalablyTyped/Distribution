package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.TryStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TryStatement_
  extends StObject
     with Node
     with Statement {
  
  var block: BlockStatement_
  
  var finalizer: BlockStatement_
  
  var handler: CatchClause_
  
  @JSName("type")
  var type_TryStatement_ : TryStatement
}
object TryStatement_ {
  
  @scala.inline
  def apply(
    block: BlockStatement_,
    end: Double,
    finalizer: BlockStatement_,
    handler: CatchClause_,
    loc: SourceLocation,
    start: Double
  ): TryStatement_ = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], finalizer = finalizer.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TryStatement")
    __obj.asInstanceOf[TryStatement_]
  }
  
  @scala.inline
  implicit class TryStatement_MutableBuilder[Self <: TryStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: BlockStatement_): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalizer(value: BlockStatement_): Self = StObject.set(x, "finalizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandler(value: CatchClause_): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TryStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
