package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetCustomDataIdentifiersResponse extends js.Object {
  /**
    * An array of objects, one for each custom data identifier that meets the criteria specified in the request.
    */
  var customDataIdentifiers: js.UndefOr[listOfBatchGetCustomDataIdentifierSummary] = js.native
  /**
    * An array of identifiers, one for each identifier that was specified in the request, but doesn't correlate to an existing custom data identifier.
    */
  var notFoundIdentifierIds: js.UndefOr[listOfString] = js.native
}

object BatchGetCustomDataIdentifiersResponse {
  @scala.inline
  def apply(
    customDataIdentifiers: listOfBatchGetCustomDataIdentifierSummary = null,
    notFoundIdentifierIds: listOfString = null
  ): BatchGetCustomDataIdentifiersResponse = {
    val __obj = js.Dynamic.literal()
    if (customDataIdentifiers != null) __obj.updateDynamic("customDataIdentifiers")(customDataIdentifiers.asInstanceOf[js.Any])
    if (notFoundIdentifierIds != null) __obj.updateDynamic("notFoundIdentifierIds")(notFoundIdentifierIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetCustomDataIdentifiersResponse]
  }
}

