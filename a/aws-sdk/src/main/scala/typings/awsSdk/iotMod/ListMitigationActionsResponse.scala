package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMitigationActionsResponse extends js.Object {
  /**
    * A set of actions that matched the specified filter criteria.
    */
  var actionIdentifiers: js.UndefOr[MitigationActionIdentifierList] = js.native
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListMitigationActionsResponse {
  @scala.inline
  def apply(): ListMitigationActionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMitigationActionsResponse]
  }
  @scala.inline
  implicit class ListMitigationActionsResponseOps[Self <: ListMitigationActionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionIdentifiersVarargs(value: MitigationActionIdentifier*): Self = this.set("actionIdentifiers", js.Array(value :_*))
    @scala.inline
    def setActionIdentifiers(value: MitigationActionIdentifierList): Self = this.set("actionIdentifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionIdentifiers: Self = this.set("actionIdentifiers", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

