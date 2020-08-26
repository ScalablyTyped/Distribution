package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUploadRequest extends js.Object {
  /**
    * The upload's ARN.
    */
  var arn: AmazonResourceName = js.native
}

object GetUploadRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetUploadRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUploadRequest]
  }
  @scala.inline
  implicit class GetUploadRequestOps[Self <: GetUploadRequest] (val x: Self) extends AnyVal {
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

