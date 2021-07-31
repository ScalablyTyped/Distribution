package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulePlain
  extends StObject
     with CssNodeCommon
     with CssNodePlain {
  
  var block: BlockPlain
  
  var prelude: SelectorListPlain | Raw
  
  @JSName("type")
  var type_RulePlain: typings.cssTree.cssTreeStrings.Rule
}
object RulePlain {
  
  @scala.inline
  def apply(block: BlockPlain, prelude: SelectorListPlain | Raw): RulePlain = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Rule")
    __obj.asInstanceOf[RulePlain]
  }
  
  @scala.inline
  implicit class RulePlainMutableBuilder[Self <: RulePlain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: BlockPlain): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrelude(value: SelectorListPlain | Raw): Self = StObject.set(x, "prelude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.Rule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
