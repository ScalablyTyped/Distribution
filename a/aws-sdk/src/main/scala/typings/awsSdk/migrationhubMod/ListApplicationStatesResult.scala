package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationStatesResult extends js.Object {
  /**
    * A list of Applications that exist in Application Discovery Service.
    */
  var ApplicationStateList: js.UndefOr[typings.awsSdk.migrationhubMod.ApplicationStateList] = js.native
  /**
    * If a NextToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListApplicationStatesResult {
  @scala.inline
  def apply(ApplicationStateList: ApplicationStateList = null, NextToken: Token = null): ListApplicationStatesResult = {
    val __obj = js.Dynamic.literal()
    if (ApplicationStateList != null) __obj.updateDynamic("ApplicationStateList")(ApplicationStateList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationStatesResult]
  }
}

