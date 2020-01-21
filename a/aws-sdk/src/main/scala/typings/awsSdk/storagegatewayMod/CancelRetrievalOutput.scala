package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelRetrievalOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the virtual tape for which retrieval was canceled.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARN] = js.native
}

object CancelRetrievalOutput {
  @scala.inline
  def apply(TapeARN: TapeARN = null): CancelRetrievalOutput = {
    val __obj = js.Dynamic.literal()
    if (TapeARN != null) __obj.updateDynamic("TapeARN")(TapeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelRetrievalOutput]
  }
}

