package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCustomDataIdentifiersResponse extends js.Object {
  /**
    * An array of objects, one for each custom data identifier.
    */
  var items: js.UndefOr[listOfCustomDataIdentifierSummary] = js.native
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.native
}

object ListCustomDataIdentifiersResponse {
  @scala.inline
  def apply(items: listOfCustomDataIdentifierSummary = null, nextToken: string = null): ListCustomDataIdentifiersResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCustomDataIdentifiersResponse]
  }
}

