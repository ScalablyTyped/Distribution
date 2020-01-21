package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationsResponse extends js.Object {
  /**
    * An array of application summaries.
    */
  var Applications: js.UndefOr[listOfApplicationSummary] = js.native
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListApplicationsResponse {
  @scala.inline
  def apply(Applications: listOfApplicationSummary = null, NextToken: string = null): ListApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    if (Applications != null) __obj.updateDynamic("Applications")(Applications.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationsResponse]
  }
}

