package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTestGridSessionActionsResult extends js.Object {
  /**
    * The action taken by the session.
    */
  var actions: js.UndefOr[TestGridSessionActions] = js.native
  /**
    * Pagination token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListTestGridSessionActionsResult {
  @scala.inline
  def apply(actions: TestGridSessionActions = null, nextToken: PaginationToken = null): ListTestGridSessionActionsResult = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTestGridSessionActionsResult]
  }
}

