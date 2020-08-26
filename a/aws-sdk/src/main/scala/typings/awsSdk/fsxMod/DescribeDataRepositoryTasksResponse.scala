package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDataRepositoryTasksResponse extends js.Object {
  /**
    * The collection of data repository task descriptions returned.
    */
  var DataRepositoryTasks: js.UndefOr[typings.awsSdk.fsxMod.DataRepositoryTasks] = js.native
  var NextToken: js.UndefOr[typings.awsSdk.fsxMod.NextToken] = js.native
}

object DescribeDataRepositoryTasksResponse {
  @scala.inline
  def apply(): DescribeDataRepositoryTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataRepositoryTasksResponse]
  }
  @scala.inline
  implicit class DescribeDataRepositoryTasksResponseOps[Self <: DescribeDataRepositoryTasksResponse] (val x: Self) extends AnyVal {
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
    def setDataRepositoryTasksVarargs(value: DataRepositoryTask*): Self = this.set("DataRepositoryTasks", js.Array(value :_*))
    @scala.inline
    def setDataRepositoryTasks(value: DataRepositoryTasks): Self = this.set("DataRepositoryTasks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataRepositoryTasks: Self = this.set("DataRepositoryTasks", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

