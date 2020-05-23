package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvokeAsyncResponse extends js.Object {
  /**
    * The status code.
    */
  var Status: js.UndefOr[HttpStatus] = js.native
}

object InvokeAsyncResponse {
  @scala.inline
  def apply(Status: js.UndefOr[HttpStatus] = js.undefined): InvokeAsyncResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Status)) __obj.updateDynamic("Status")(Status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeAsyncResponse]
  }
}

