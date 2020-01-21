package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPrincipalThingsResponse extends js.Object {
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The things.
    */
  var things: js.UndefOr[ThingNameList] = js.native
}

object ListPrincipalThingsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, things: ThingNameList = null): ListPrincipalThingsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (things != null) __obj.updateDynamic("things")(things.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPrincipalThingsResponse]
  }
}

