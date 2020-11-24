package typings.cssTree.mod

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
  implicit class RulePlainOps[Self <: RulePlain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlock(value: BlockPlain): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrelude(value: SelectorListPlain | Raw): Self = this.set("prelude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.Rule): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
