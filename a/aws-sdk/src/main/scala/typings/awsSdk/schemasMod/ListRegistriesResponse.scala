package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRegistriesResponse extends js.Object {
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * An array of registry summaries.
    */
  var Registries: js.UndefOr[listOfRegistrySummary] = js.native
}

object ListRegistriesResponse {
  @scala.inline
  def apply(NextToken: string = null, Registries: listOfRegistrySummary = null): ListRegistriesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Registries != null) __obj.updateDynamic("Registries")(Registries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRegistriesResponse]
  }
}

