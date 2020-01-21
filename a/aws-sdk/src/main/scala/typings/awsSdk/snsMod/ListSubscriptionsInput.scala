package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSubscriptionsInput extends js.Object {
  /**
    * Token returned by the previous ListSubscriptions request.
    */
  var NextToken: js.UndefOr[nextToken] = js.native
}

object ListSubscriptionsInput {
  @scala.inline
  def apply(NextToken: nextToken = null): ListSubscriptionsInput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSubscriptionsInput]
  }
}

