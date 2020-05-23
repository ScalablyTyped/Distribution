package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopQueryResponse extends js.Object {
  /**
    * This is true if the query was stopped by the StopQuery operation.
    */
  var success: js.UndefOr[Success] = js.native
}

object StopQueryResponse {
  @scala.inline
  def apply(success: js.UndefOr[Success] = js.undefined): StopQueryResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopQueryResponse]
  }
}

