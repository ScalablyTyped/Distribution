package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cavv extends js.Object {
  var cavv: js.UndefOr[java.lang.String] = js.undefined
  var eciFlag: java.lang.String
  var threeDSecureVision: js.UndefOr[java.lang.String] = js.undefined
  var xid: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Cavv {
  @scala.inline
  def apply(
    eciFlag: java.lang.String,
    cavv: java.lang.String = null,
    threeDSecureVision: java.lang.String = null,
    xid: java.lang.String = null
  ): Anon_Cavv = {
    val __obj = js.Dynamic.literal(eciFlag = eciFlag)
    if (cavv != null) __obj.updateDynamic("cavv")(cavv)
    if (threeDSecureVision != null) __obj.updateDynamic("threeDSecureVision")(threeDSecureVision)
    if (xid != null) __obj.updateDynamic("xid")(xid)
    __obj.asInstanceOf[Anon_Cavv]
  }
}

