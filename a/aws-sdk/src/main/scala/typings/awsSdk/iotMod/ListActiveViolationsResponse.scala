package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListActiveViolationsResponse extends js.Object {
  /**
    * The list of active violations.
    */
  var activeViolations: js.UndefOr[ActiveViolations] = js.native
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListActiveViolationsResponse {
  @scala.inline
  def apply(activeViolations: ActiveViolations = null, nextToken: NextToken = null): ListActiveViolationsResponse = {
    val __obj = js.Dynamic.literal()
    if (activeViolations != null) __obj.updateDynamic("activeViolations")(activeViolations.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListActiveViolationsResponse]
  }
}

