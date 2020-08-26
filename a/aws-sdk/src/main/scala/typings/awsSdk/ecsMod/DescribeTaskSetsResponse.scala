package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTaskSetsResponse extends js.Object {
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.native
  /**
    * The list of task sets described.
    */
  var taskSets: js.UndefOr[TaskSets] = js.native
}

object DescribeTaskSetsResponse {
  @scala.inline
  def apply(): DescribeTaskSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTaskSetsResponse]
  }
  @scala.inline
  implicit class DescribeTaskSetsResponseOps[Self <: DescribeTaskSetsResponse] (val x: Self) extends AnyVal {
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
    def setFailuresVarargs(value: Failure*): Self = this.set("failures", js.Array(value :_*))
    @scala.inline
    def setFailures(value: Failures): Self = this.set("failures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailures: Self = this.set("failures", js.undefined)
    @scala.inline
    def setTaskSetsVarargs(value: TaskSet*): Self = this.set("taskSets", js.Array(value :_*))
    @scala.inline
    def setTaskSets(value: TaskSets): Self = this.set("taskSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskSets: Self = this.set("taskSets", js.undefined)
  }
  
}

