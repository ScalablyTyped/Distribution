package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListActionTypesInput extends js.Object {
  /**
    * Filters the list of action types to those created by a specified entity.
    */
  var actionOwnerFilter: js.UndefOr[ActionOwner] = js.native
  /**
    * An identifier that was returned from the previous list action types call, which can be used to return the next set of action types in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListActionTypesInput {
  @scala.inline
  def apply(): ListActionTypesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListActionTypesInput]
  }
  @scala.inline
  implicit class ListActionTypesInputOps[Self <: ListActionTypesInput] (val x: Self) extends AnyVal {
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
    def setActionOwnerFilter(value: ActionOwner): Self = this.set("actionOwnerFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionOwnerFilter: Self = this.set("actionOwnerFilter", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

