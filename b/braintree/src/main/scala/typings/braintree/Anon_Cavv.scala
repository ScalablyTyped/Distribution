package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cavv extends js.Object {
  var cavv: js.UndefOr[String] = js.undefined
  var eciFlag: String
  var threeDSecureVision: js.UndefOr[String] = js.undefined
  var xid: js.UndefOr[String] = js.undefined
}

object Anon_Cavv {
  @scala.inline
  def apply(eciFlag: String, cavv: String = null, threeDSecureVision: String = null, xid: String = null): Anon_Cavv = {
    val __obj = js.Dynamic.literal(eciFlag = eciFlag.asInstanceOf[js.Any])
    if (cavv != null) __obj.updateDynamic("cavv")(cavv.asInstanceOf[js.Any])
    if (threeDSecureVision != null) __obj.updateDynamic("threeDSecureVision")(threeDSecureVision.asInstanceOf[js.Any])
    if (xid != null) __obj.updateDynamic("xid")(xid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cavv]
  }
}

