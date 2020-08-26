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
  def apply(): BatchGetCustomDataIdentifiersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetCustomDataIdentifiersResponse]
  }
  @scala.inline
  implicit class BatchGetCustomDataIdentifiersResponseOps[Self <: BatchGetCustomDataIdentifiersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustomDataIdentifiersVarargs(value: BatchGetCustomDataIdentifierSummary*): Self = this.set("customDataIdentifiers", js.Array(value :_*))
    @scala.inline
    def setCustomDataIdentifiers(value: listOfBatchGetCustomDataIdentifierSummary): Self = this.set("customDataIdentifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomDataIdentifiers: Self = this.set("customDataIdentifiers", js.undefined)
    @scala.inline
    def setNotFoundIdentifierIdsVarargs(value: string*): Self = this.set("notFoundIdentifierIds", js.Array(value :_*))
    @scala.inline
    def setNotFoundIdentifierIds(value: listOfString): Self = this.set("notFoundIdentifierIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotFoundIdentifierIds: Self = this.set("notFoundIdentifierIds", js.undefined)
  }
  
}

