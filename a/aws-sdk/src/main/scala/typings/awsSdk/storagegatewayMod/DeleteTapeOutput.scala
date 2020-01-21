package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTapeOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the deleted virtual tape.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARN] = js.native
}

object DeleteTapeOutput {
  @scala.inline
  def apply(TapeARN: TapeARN = null): DeleteTapeOutput = {
    val __obj = js.Dynamic.literal()
    if (TapeARN != null) __obj.updateDynamic("TapeARN")(TapeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTapeOutput]
  }
}

