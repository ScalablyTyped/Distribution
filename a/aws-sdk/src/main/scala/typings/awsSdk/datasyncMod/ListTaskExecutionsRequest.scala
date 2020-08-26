package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTaskExecutionsRequest extends js.Object {
  /**
    * The maximum number of executed tasks to list.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.datasyncMod.MaxResults] = js.native
  /**
    * An opaque string that indicates the position at which to begin the next list of the executed tasks.
    */
  var NextToken: js.UndefOr[typings.awsSdk.datasyncMod.NextToken] = js.native
  /**
    * The Amazon Resource Name (ARN) of the task whose tasks you want to list.
    */
  var TaskArn: js.UndefOr[typings.awsSdk.datasyncMod.TaskArn] = js.native
}

object ListTaskExecutionsRequest {
  @scala.inline
  def apply(): ListTaskExecutionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTaskExecutionsRequest]
  }
  @scala.inline
  implicit class ListTaskExecutionsRequestOps[Self <: ListTaskExecutionsRequest] (val x: Self) extends AnyVal {
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
    def setTaskArn(value: TaskArn): Self = this.set("TaskArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskArn: Self = this.set("TaskArn", js.undefined)
  }
  
}

