package typings
package braintreeDashWebLib.braintreeDashWebMod

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
    val __obj = js.Dynamic.literal(code = code, niceType = niceType)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HostedFieldsHostedFieldsCard]
  }
}

