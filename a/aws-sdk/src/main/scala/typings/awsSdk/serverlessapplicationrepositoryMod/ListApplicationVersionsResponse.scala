package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationVersionsResponse extends js.Object {
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * An array of version summaries for the application.
    */
  var Versions: js.UndefOr[listOfVersionSummary] = js.native
}

object ListApplicationVersionsResponse {
  @scala.inline
  def apply(NextToken: string = null, Versions: listOfVersionSummary = null): ListApplicationVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Versions != null) __obj.updateDynamic("Versions")(Versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationVersionsResponse]
  }
}

