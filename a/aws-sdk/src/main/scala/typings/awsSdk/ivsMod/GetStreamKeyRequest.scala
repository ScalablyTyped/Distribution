package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStreamKeyRequest extends js.Object {
  /**
    * ARN for the stream key to be retrieved.
    */
  var arn: StreamKeyArn = js.native
}

object GetStreamKeyRequest {
  @scala.inline
  def apply(arn: StreamKeyArn): GetStreamKeyRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamKeyRequest]
  }
  @scala.inline
  implicit class GetStreamKeyRequestOps[Self <: GetStreamKeyRequest] (val x: Self) extends AnyVal {
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
    def setArn(value: StreamKeyArn): Self = this.set("arn", value.asInstanceOf[js.Any])
  }
  
}

