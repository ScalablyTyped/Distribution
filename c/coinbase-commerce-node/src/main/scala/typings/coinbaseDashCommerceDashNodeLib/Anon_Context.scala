package typings
package coinbaseDashCommerceDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  /**
    * Timeline entry context.
    */
  var context: js.UndefOr[
    coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.UNDERPAID | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.OVERPAID | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.DELAYED | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.MULTIPLE | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.MANUAL | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.OTHER
  ] = js.undefined
  /**
    * Timeline entry status.
    */
  var status: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.PaymentStatus
  /**
    * Timeline entry timestamp.
    */
  var time: Timestamp
}

object Anon_Context {
  @scala.inline
  def apply(
    status: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.PaymentStatus,
    time: Timestamp,
    context: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.UNDERPAID | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.OVERPAID | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.DELAYED | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.MULTIPLE | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.MANUAL | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.OTHER = null
  ): Anon_Context = {
    val __obj = js.Dynamic.literal(status = status, time = time)
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Context]
  }
}

