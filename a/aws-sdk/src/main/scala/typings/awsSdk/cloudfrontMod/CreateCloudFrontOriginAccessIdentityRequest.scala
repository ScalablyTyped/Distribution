package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCloudFrontOriginAccessIdentityRequest extends js.Object {
  /**
    * The current configuration information for the identity.
    */
  var CloudFrontOriginAccessIdentityConfig: typings.awsSdk.cloudfrontMod.CloudFrontOriginAccessIdentityConfig = js.native
}

object CreateCloudFrontOriginAccessIdentityRequest {
  @scala.inline
  def apply(CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig): CreateCloudFrontOriginAccessIdentityRequest = {
    val __obj = js.Dynamic.literal(CloudFrontOriginAccessIdentityConfig = CloudFrontOriginAccessIdentityConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCloudFrontOriginAccessIdentityRequest]
  }
  @scala.inline
  implicit class CreateCloudFrontOriginAccessIdentityRequestOps[Self <: CreateCloudFrontOriginAccessIdentityRequest] (val x: Self) extends AnyVal {
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
    def setCloudFrontOriginAccessIdentityConfig(value: CloudFrontOriginAccessIdentityConfig): Self = this.set("CloudFrontOriginAccessIdentityConfig", value.asInstanceOf[js.Any])
  }
  
}

