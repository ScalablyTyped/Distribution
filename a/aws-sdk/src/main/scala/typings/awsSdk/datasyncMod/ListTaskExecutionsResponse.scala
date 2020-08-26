package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTaskExecutionsResponse extends js.Object {
  /**
    * An opaque string that indicates the position at which to begin returning the next list of executed tasks.
    */
  var NextToken: js.UndefOr[typings.awsSdk.datasyncMod.NextToken] = js.native
  /**
    * A list of executed tasks.
    */
  var TaskExecutions: js.UndefOr[TaskExecutionList] = js.native
}

object ListTaskExecutionsResponse {
  @scala.inline
  def apply(): ListTaskExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTaskExecutionsResponse]
  }
  @scala.inline
  implicit class ListTaskExecutionsResponseOps[Self <: ListTaskExecutionsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTaskExecutionsVarargs(value: TaskExecutionListEntry*): Self = this.set("TaskExecutions", js.Array(value :_*))
    @scala.inline
    def setTaskExecutions(value: TaskExecutionList): Self = this.set("TaskExecutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskExecutions: Self = this.set("TaskExecutions", js.undefined)
  }
  
}

