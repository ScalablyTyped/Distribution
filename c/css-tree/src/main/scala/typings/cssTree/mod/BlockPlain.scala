package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockPlain
  extends StObject
     with CssNodeCommon
     with CssNodePlain {
  
  var children: js.Array[CssNodePlain]
  
  @JSName("type")
  var type_BlockPlain: typings.cssTree.cssTreeStrings.Block
}
object BlockPlain {
  
  inline def apply(children: js.Array[CssNodePlain]): BlockPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Block")
    __obj.asInstanceOf[BlockPlain]
  }
  
  extension [Self <: BlockPlain](x: Self) {
    
    inline def setChildren(value: js.Array[CssNodePlain]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: CssNodePlain*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setType(value: typings.cssTree.cssTreeStrings.Block): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
