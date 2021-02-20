package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RulePlain
  extends CssNodeCommon
     with CssNodePlain {
  
  var block: BlockPlain = js.native
  
  var prelude: SelectorListPlain | Raw = js.native
  
  @JSName("type")
  var type_RulePlain: typings.cssTree.cssTreeStrings.Rule = js.native
}
object RulePlain {
  
  @scala.inline
  def apply(block: BlockPlain, prelude: SelectorListPlain | Raw, `type`: typings.cssTree.cssTreeStrings.Rule): RulePlain = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
