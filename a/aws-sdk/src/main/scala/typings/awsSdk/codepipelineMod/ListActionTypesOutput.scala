package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListActionTypesOutput extends js.Object {
  /**
    * Provides details of the action types.
    */
  var actionTypes: ActionTypeList = js.native
  /**
    * If the amount of returned information is significantly large, an identifier is also returned. It can be used in a subsequent list action types call to return the next set of action types in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListActionTypesOutput {
  @scala.inline
  def apply(actionTypes: ActionTypeList): ListActionTypesOutput = {
    val __obj = js.Dynamic.literal(actionTypes = actionTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListActionTypesOutput]
  }
  @scala.inline
  implicit class ListActionTypesOutputOps[Self <: ListActionTypesOutput] (val x: Self) extends AnyVal {
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
    def setActionTypesVarargs(value: ActionType*): Self = this.set("actionTypes", js.Array(value :_*))
    @scala.inline
    def setActionTypes(value: ActionTypeList): Self = this.set("actionTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

