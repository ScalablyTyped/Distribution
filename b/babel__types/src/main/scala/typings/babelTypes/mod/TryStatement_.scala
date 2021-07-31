package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TryStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TryStatement_
  extends StObject
     with BaseNode
     with Statement {
  
  var block: BlockStatement_
  
  var finalizer: BlockStatement_ | Null
  
  var handler: CatchClause_ | Null
  
  @JSName("type")
  var type_TryStatement_ : TryStatement
}
object TryStatement_ {
  
  @scala.inline
  def apply(block: BlockStatement_): TryStatement_ = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], end = null, finalizer = null, handler = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
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
    def setFinalizerNull: Self = StObject.set(x, "finalizer", null)
    
    @scala.inline
    def setHandler(value: CatchClause_): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlerNull: Self = StObject.set(x, "handler", null)
    
    @scala.inline
    def setType(value: TryStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
