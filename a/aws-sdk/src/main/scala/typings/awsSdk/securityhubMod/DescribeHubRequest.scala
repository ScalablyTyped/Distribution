package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHubRequest extends js.Object {
  /**
    * The ARN of the Hub resource to retrieve.
    */
  var HubArn: js.UndefOr[NonEmptyString] = js.native
}

object DescribeHubRequest {
  @scala.inline
  def apply(): DescribeHubRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHubRequest]
  }
  @scala.inline
  implicit class DescribeHubRequestOps[Self <: DescribeHubRequest] (val x: Self) extends AnyVal {
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
    def setHubArn(value: NonEmptyString): Self = this.set("HubArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHubArn: Self = this.set("HubArn", js.undefined)
  }
  
}

