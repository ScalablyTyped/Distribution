package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListByoipCidrsRequest extends js.Object {
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.globalacceleratorMod.MaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object ListByoipCidrsRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: GenericString = null): ListByoipCidrsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListByoipCidrsRequest]
  }
}

