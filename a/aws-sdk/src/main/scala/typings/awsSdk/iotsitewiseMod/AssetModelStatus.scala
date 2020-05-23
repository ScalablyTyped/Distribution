package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetModelStatus extends js.Object {
  /**
    * Contains associated error information, if any.
    */
  var error: js.UndefOr[ErrorDetails] = js.native
  /**
    * The current state of the asset model.
    */
  var state: AssetModelState = js.native
}

object AssetModelStatus {
  @scala.inline
  def apply(state: AssetModelState, error: ErrorDetails = null): AssetModelStatus = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetModelStatus]
  }
}

