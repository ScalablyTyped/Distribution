package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListExclusionsResponse extends js.Object {
  /**
    * A list of exclusions' ARNs returned by the action.
    */
  var exclusionArns: ListReturnedArnList = js.native
  /**
    * When a response is generated, if there is more data to be listed, this parameters is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListExclusionsResponse {
  @scala.inline
  def apply(exclusionArns: ListReturnedArnList, nextToken: PaginationToken = null): ListExclusionsResponse = {
    val __obj = js.Dynamic.literal(exclusionArns = exclusionArns.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListExclusionsResponse]
  }
}

