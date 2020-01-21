package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetrieveTapeArchiveOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the retrieved virtual tape.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARN] = js.native
}

object RetrieveTapeArchiveOutput {
  @scala.inline
  def apply(TapeARN: TapeARN = null): RetrieveTapeArchiveOutput = {
    val __obj = js.Dynamic.literal()
    if (TapeARN != null) __obj.updateDynamic("TapeARN")(TapeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveTapeArchiveOutput]
  }
}

