package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTasksRequest extends js.Object {
  /**
    * The maximum number of tasks to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.datasyncMod.MaxResults] = js.native
  /**
    * An opaque string that indicates the position at which to begin the next list of tasks.
    */
  var NextToken: js.UndefOr[typings.awsSdk.datasyncMod.NextToken] = js.native
}

object ListTasksRequest {
  @scala.inline
  def apply(): ListTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTasksRequest]
  }
  @scala.inline
  implicit class ListTasksRequestOps[Self <: ListTasksRequest] (val x: Self) extends AnyVal {
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
  }
  
}

