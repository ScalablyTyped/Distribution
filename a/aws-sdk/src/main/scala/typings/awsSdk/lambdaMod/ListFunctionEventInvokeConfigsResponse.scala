package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFunctionEventInvokeConfigsResponse extends js.Object {
  /**
    * A list of configurations.
    */
  var FunctionEventInvokeConfigs: js.UndefOr[FunctionEventInvokeConfigList] = js.native
  /**
    * The pagination token that's included if more results are available.
    */
  var NextMarker: js.UndefOr[String] = js.native
}

object ListFunctionEventInvokeConfigsResponse {
  @scala.inline
  def apply(FunctionEventInvokeConfigs: FunctionEventInvokeConfigList = null, NextMarker: String = null): ListFunctionEventInvokeConfigsResponse = {
    val __obj = js.Dynamic.literal()
    if (FunctionEventInvokeConfigs != null) __obj.updateDynamic("FunctionEventInvokeConfigs")(FunctionEventInvokeConfigs.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFunctionEventInvokeConfigsResponse]
  }
}

