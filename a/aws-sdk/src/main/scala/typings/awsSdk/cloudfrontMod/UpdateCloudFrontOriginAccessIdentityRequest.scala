package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCloudFrontOriginAccessIdentityRequest extends js.Object {
  /**
    * The identity's configuration information.
    */
  var CloudFrontOriginAccessIdentityConfig: typings.awsSdk.cloudfrontMod.CloudFrontOriginAccessIdentityConfig = js.native
  /**
    * The identity's id.
    */
  var Id: String = js.native
  /**
    * The value of the ETag header that you received when retrieving the identity's configuration. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.native
}

object UpdateCloudFrontOriginAccessIdentityRequest {
  @scala.inline
  def apply(CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig, Id: String): UpdateCloudFrontOriginAccessIdentityRequest = {
    val __obj = js.Dynamic.literal(CloudFrontOriginAccessIdentityConfig = CloudFrontOriginAccessIdentityConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCloudFrontOriginAccessIdentityRequest]
  }
  @scala.inline
  implicit class UpdateCloudFrontOriginAccessIdentityRequestOps[Self <: UpdateCloudFrontOriginAccessIdentityRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIfMatch(value: String): Self = this.set("IfMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfMatch: Self = this.set("IfMatch", js.undefined)
  }
  
}

