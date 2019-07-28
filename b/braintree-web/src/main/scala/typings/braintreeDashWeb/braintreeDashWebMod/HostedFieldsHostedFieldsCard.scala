package typings.braintreeDashWeb.braintreeDashWebMod

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
    val __obj = js.Dynamic.literal(code = code, niceType = niceType)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HostedFieldsHostedFieldsCard]
  }
}

