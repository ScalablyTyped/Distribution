package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelArchivalOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the virtual tape for which archiving was canceled.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARN] = js.native
}

object CancelArchivalOutput {
  @scala.inline
  def apply(TapeARN: TapeARN = null): CancelArchivalOutput = {
    val __obj = js.Dynamic.literal()
    if (TapeARN != null) __obj.updateDynamic("TapeARN")(TapeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelArchivalOutput]
  }
}

