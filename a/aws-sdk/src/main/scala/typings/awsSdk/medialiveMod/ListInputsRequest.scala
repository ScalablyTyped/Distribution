package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInputsRequest extends js.Object {
  var MaxResults: js.UndefOr[typings.awsSdk.medialiveMod.MaxResults] = js.native
  var NextToken: js.UndefOr[string] = js.native
}

object ListInputsRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: string = null): ListInputsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInputsRequest]
  }
}

