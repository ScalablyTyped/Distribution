package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStateMachinesOutput extends js.Object {
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var nextToken: js.UndefOr[PageToken] = js.native
  var stateMachines: StateMachineList = js.native
}

object ListStateMachinesOutput {
  @scala.inline
  def apply(stateMachines: StateMachineList): ListStateMachinesOutput = {
    val __obj = js.Dynamic.literal(stateMachines = stateMachines.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStateMachinesOutput]
  }
  @scala.inline
  implicit class ListStateMachinesOutputOps[Self <: ListStateMachinesOutput] (val x: Self) extends AnyVal {
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
    def setStateMachinesVarargs(value: StateMachineListItem*): Self = this.set("stateMachines", js.Array(value :_*))
    @scala.inline
    def setStateMachines(value: StateMachineList): Self = this.set("stateMachines", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: PageToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

