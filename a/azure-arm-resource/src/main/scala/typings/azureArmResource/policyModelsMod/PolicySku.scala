package typings.azureArmResource.policyModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicySku extends js.Object {
  /**
    * The name of the policy sku. Possible values are A0 and A1.
    */
  var name: String = js.native
  /**
    * The policy sku tier. Possible values are Free and Standard.
    */
  var tier: js.UndefOr[String] = js.native
}

object PolicySku {
  @scala.inline
  def apply(name: String): PolicySku = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicySku]
  }
  @scala.inline
  implicit class PolicySkuOps[Self <: PolicySku] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTier(value: String): Self = this.set("tier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTier: Self = this.set("tier", js.undefined)
  }
  
}

