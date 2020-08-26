package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNetworkProfileRequest extends js.Object {
  /**
    * The ARN of the network profile to return information about.
    */
  var arn: AmazonResourceName = js.native
}

object GetNetworkProfileRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkProfileRequest]
  }
  @scala.inline
  implicit class GetNetworkProfileRequestOps[Self <: GetNetworkProfileRequest] (val x: Self) extends AnyVal {
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
    def setArn(value: AmazonResourceName): Self = this.set("arn", value.asInstanceOf[js.Any])
  }
  
}

