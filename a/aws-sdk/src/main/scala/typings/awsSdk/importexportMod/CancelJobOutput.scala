package typings.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelJobOutput extends js.Object {
  var Success: js.UndefOr[typings.awsSdk.importexportMod.Success] = js.native
}

object CancelJobOutput {
  @scala.inline
  def apply(Success: js.UndefOr[Success] = js.undefined): CancelJobOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Success)) __obj.updateDynamic("Success")(Success.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJobOutput]
  }
}

