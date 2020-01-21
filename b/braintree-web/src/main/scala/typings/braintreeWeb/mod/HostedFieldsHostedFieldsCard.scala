package typings.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedFieldsHostedFieldsCard extends js.Object {
  var code: HostedFieldsCardCode
  var niceType: String
  var `type`: String
}

object HostedFieldsHostedFieldsCard {
  @scala.inline
  def apply(code: HostedFieldsCardCode, niceType: String, `type`: String): HostedFieldsHostedFieldsCard = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], niceType = niceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsHostedFieldsCard]
  }
}

