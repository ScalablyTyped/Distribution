package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeImportImageTasksResult extends js.Object {
  /**
    * A list of zero or more import image tasks that are currently active or were completed or canceled in the previous 7 days.
    */
  var ImportImageTasks: js.UndefOr[ImportImageTaskList] = js.native
  /**
    * The token to use to get the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeImportImageTasksResult {
  @scala.inline
  def apply(): DescribeImportImageTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImportImageTasksResult]
  }
  @scala.inline
  implicit class DescribeImportImageTasksResultOps[Self <: DescribeImportImageTasksResult] (val x: Self) extends AnyVal {
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
    def setImportImageTasksVarargs(value: ImportImageTask*): Self = this.set("ImportImageTasks", js.Array(value :_*))
    @scala.inline
    def setImportImageTasks(value: ImportImageTaskList): Self = this.set("ImportImageTasks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportImageTasks: Self = this.set("ImportImageTasks", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

