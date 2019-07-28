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
    val __obj = js.Dynamic.literal(eciFlag = eciFlag)
    if (cavv != null) __obj.updateDynamic("cavv")(cavv)
    if (threeDSecureVision != null) __obj.updateDynamic("threeDSecureVision")(threeDSecureVision)
    if (xid != null) __obj.updateDynamic("xid")(xid)
    __obj.asInstanceOf[Anon_Cavv]
  }
}

