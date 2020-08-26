package typings.braintreeWeb.hostedFieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedFieldsHostedFieldsCard extends js.Object {
  var code: HostedFieldsCardCode = js.native
  var niceType: String = js.native
  var `type`: String = js.native
}

object HostedFieldsHostedFieldsCard {
  @scala.inline
  def apply(code: HostedFieldsCardCode, niceType: String, `type`: String): HostedFieldsHostedFieldsCard = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], niceType = niceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsHostedFieldsCard]
  }
  @scala.inline
  implicit class HostedFieldsHostedFieldsCardOps[Self <: HostedFieldsHostedFieldsCard] (val x: Self) extends AnyVal {
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
    def setCode(value: HostedFieldsCardCode): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setNiceType(value: String): Self = this.set("niceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

