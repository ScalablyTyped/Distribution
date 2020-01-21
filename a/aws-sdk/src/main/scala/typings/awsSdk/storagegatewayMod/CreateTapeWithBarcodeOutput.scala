package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTapeWithBarcodeOutput extends js.Object {
  /**
    * A unique Amazon Resource Name (ARN) that represents the virtual tape that was created.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARN] = js.native
}

object CreateTapeWithBarcodeOutput {
  @scala.inline
  def apply(TapeARN: TapeARN = null): CreateTapeWithBarcodeOutput = {
    val __obj = js.Dynamic.literal()
    if (TapeARN != null) __obj.updateDynamic("TapeARN")(TapeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTapeWithBarcodeOutput]
  }
}

