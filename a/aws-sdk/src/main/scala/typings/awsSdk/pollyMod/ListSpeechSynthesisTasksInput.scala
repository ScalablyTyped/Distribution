package typings.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSpeechSynthesisTasksInput extends js.Object {
  /**
    * Maximum number of speech synthesis tasks returned in a List operation.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.pollyMod.MaxResults] = js.native
  /**
    * The pagination token to use in the next request to continue the listing of speech synthesis tasks. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.pollyMod.NextToken] = js.native
  /**
    * Status of the speech synthesis tasks returned in a List operation
    */
  var Status: js.UndefOr[TaskStatus] = js.native
}

object ListSpeechSynthesisTasksInput {
  @scala.inline
  def apply(): ListSpeechSynthesisTasksInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSpeechSynthesisTasksInput]
  }
  @scala.inline
  implicit class ListSpeechSynthesisTasksInputOps[Self <: ListSpeechSynthesisTasksInput] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setStatus(value: TaskStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

