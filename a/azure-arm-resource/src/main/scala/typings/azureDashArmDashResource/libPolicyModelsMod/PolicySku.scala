package typings.azureDashArmDashResource.libPolicyModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicySku extends js.Object {
  /**
    * The name of the policy sku. Possible values are A0 and A1.
    */
  var name: String
  /**
    * The policy sku tier. Possible values are Free and Standard.
    */
  var tier: js.UndefOr[String] = js.undefined
}

object PolicySku {
  @scala.inline
  def apply(name: String, tier: String = null): PolicySku = {
    val __obj = js.Dynamic.literal(name = name)
    if (tier != null) __obj.updateDynamic("tier")(tier)
    __obj.asInstanceOf[PolicySku]
  }
}

