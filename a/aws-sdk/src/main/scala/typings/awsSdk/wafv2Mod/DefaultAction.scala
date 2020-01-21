package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultAction extends js.Object {
  /**
    * Specifies that AWS WAF should allow requests by default.
    */
  var Allow: js.UndefOr[AllowAction] = js.native
  /**
    * Specifies that AWS WAF should block requests by default. 
    */
  var Block: js.UndefOr[BlockAction] = js.native
}

object DefaultAction {
  @scala.inline
  def apply(Allow: AllowAction = null, Block: BlockAction = null): DefaultAction = {
    val __obj = js.Dynamic.literal()
    if (Allow != null) __obj.updateDynamic("Allow")(Allow.asInstanceOf[js.Any])
    if (Block != null) __obj.updateDynamic("Block")(Block.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultAction]
  }
}

