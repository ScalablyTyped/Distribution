package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchThingsResponse extends js.Object {
  /**
    * The string to specify as nextToken when you request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * An array of things in the result set.
    */
  var things: js.UndefOr[Things] = js.native
}

object SearchThingsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, things: Things = null): SearchThingsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (things != null) __obj.updateDynamic("things")(things.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchThingsResponse]
  }
}

