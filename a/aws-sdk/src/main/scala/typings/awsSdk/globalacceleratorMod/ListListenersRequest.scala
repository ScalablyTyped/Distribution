package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListListenersRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the accelerator for which you want to list listener objects.
    */
  var AcceleratorArn: GenericString = js.native
  /**
    * The number of listener objects that you want to return with this call. The default value is 10.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.globalacceleratorMod.MaxResults] = js.native
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object ListListenersRequest {
  @scala.inline
  def apply(AcceleratorArn: GenericString, MaxResults: Int | Double = null, NextToken: GenericString = null): ListListenersRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListListenersRequest]
  }
}

