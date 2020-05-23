package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetStatus extends js.Object {
  /**
    * Contains associated error information, if any.
    */
  var error: js.UndefOr[ErrorDetails] = js.native
  /**
    * The current status of the asset.
    */
  var state: AssetState = js.native
}

object AssetStatus {
  @scala.inline
  def apply(state: AssetState, error: ErrorDetails = null): AssetStatus = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetStatus]
  }
}

