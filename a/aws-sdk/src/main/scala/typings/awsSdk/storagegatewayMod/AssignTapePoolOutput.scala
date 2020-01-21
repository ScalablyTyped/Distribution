package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignTapePoolOutput extends js.Object {
  /**
    * The unique Amazon Resource Names (ARN) of the virtual tape that was added to the tape pool.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARN] = js.native
}

object AssignTapePoolOutput {
  @scala.inline
  def apply(TapeARN: TapeARN = null): AssignTapePoolOutput = {
    val __obj = js.Dynamic.literal()
    if (TapeARN != null) __obj.updateDynamic("TapeARN")(TapeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignTapePoolOutput]
  }
}

