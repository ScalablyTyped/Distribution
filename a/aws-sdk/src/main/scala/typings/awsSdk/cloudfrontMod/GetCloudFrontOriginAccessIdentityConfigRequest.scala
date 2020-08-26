package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCloudFrontOriginAccessIdentityConfigRequest extends js.Object {
  /**
    * The identity's ID. 
    */
  var Id: String = js.native
}

object GetCloudFrontOriginAccessIdentityConfigRequest {
  @scala.inline
  def apply(Id: String): GetCloudFrontOriginAccessIdentityConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCloudFrontOriginAccessIdentityConfigRequest]
  }
  @scala.inline
  implicit class GetCloudFrontOriginAccessIdentityConfigRequestOps[Self <: GetCloudFrontOriginAccessIdentityConfigRequest] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
  }
  
}

