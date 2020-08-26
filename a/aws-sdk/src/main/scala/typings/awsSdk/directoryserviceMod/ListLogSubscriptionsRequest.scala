package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLogSubscriptionsRequest extends js.Object {
  /**
    * If a DirectoryID is provided, lists only the log subscription associated with that directory. If no DirectoryId is provided, lists all log subscriptions associated with your AWS account. If there are no log subscriptions for the AWS account or the directory, an empty list will be returned.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.native
  /**
    * The maximum number of items returned.
    */
  var Limit: js.UndefOr[typings.awsSdk.directoryserviceMod.Limit] = js.native
  /**
    * The token for the next set of items to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.native
}

object ListLogSubscriptionsRequest {
  @scala.inline
  def apply(): ListLogSubscriptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLogSubscriptionsRequest]
  }
  @scala.inline
  implicit class ListLogSubscriptionsRequestOps[Self <: ListLogSubscriptionsRequest] (val x: Self) extends AnyVal {
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
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryId: Self = this.set("DirectoryId", js.undefined)
    @scala.inline
    def setLimit(value: Limit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

