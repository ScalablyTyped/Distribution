package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedFieldsHostedFieldsCard extends js.Object {
  var code: HostedFieldsCardCode
  var niceType: java.lang.String
  var `type`: java.lang.String
}

object HostedFieldsHostedFieldsCard {
  @scala.inline
  def apply(code: HostedFieldsCardCode, niceType: java.lang.String, `type`: java.lang.String): HostedFieldsHostedFieldsCard = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("niceType")(niceType)
    __obj.asInstanceOf[HostedFieldsHostedFieldsCard]
  }
}

