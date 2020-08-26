package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleAction extends js.Object {
  /**
    * Instructs AWS WAF to allow the web request.
    */
  var Allow: js.UndefOr[AllowAction] = js.native
  /**
    * Instructs AWS WAF to block the web request.
    */
  var Block: js.UndefOr[BlockAction] = js.native
  /**
    * Instructs AWS WAF to count the web request and allow it.
    */
  var Count: js.UndefOr[CountAction] = js.native
}

object RuleAction {
  @scala.inline
  def apply(): RuleAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleAction]
  }
  @scala.inline
  implicit class RuleActionOps[Self <: RuleAction] (val x: Self) extends AnyVal {
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
    def setAllow(value: AllowAction): Self = this.set("Allow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow: Self = this.set("Allow", js.undefined)
    @scala.inline
    def setBlock(value: BlockAction): Self = this.set("Block", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlock: Self = this.set("Block", js.undefined)
    @scala.inline
    def setCount(value: CountAction): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("Count", js.undefined)
  }
  
}

