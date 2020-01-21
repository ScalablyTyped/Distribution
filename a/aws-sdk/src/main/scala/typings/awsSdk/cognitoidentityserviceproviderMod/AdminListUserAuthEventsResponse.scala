package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminListUserAuthEventsResponse extends js.Object {
  /**
    * The response object. It includes the EventID, EventType, CreationDate, EventRisk, and EventResponse.
    */
  var AuthEvents: js.UndefOr[AuthEventsType] = js.native
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.native
}

object AdminListUserAuthEventsResponse {
  @scala.inline
  def apply(AuthEvents: AuthEventsType = null, NextToken: PaginationKey = null): AdminListUserAuthEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (AuthEvents != null) __obj.updateDynamic("AuthEvents")(AuthEvents.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminListUserAuthEventsResponse]
  }
}

