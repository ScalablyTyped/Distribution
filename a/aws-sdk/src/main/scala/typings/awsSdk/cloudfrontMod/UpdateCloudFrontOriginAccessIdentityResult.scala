package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCloudFrontOriginAccessIdentityResult extends js.Object {
  /**
    * The origin access identity's information.
    */
  var CloudFrontOriginAccessIdentity: js.UndefOr[typings.awsSdk.cloudfrontMod.CloudFrontOriginAccessIdentity] = js.native
  /**
    * The current version of the configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
}

object UpdateCloudFrontOriginAccessIdentityResult {
  @scala.inline
  def apply(): UpdateCloudFrontOriginAccessIdentityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCloudFrontOriginAccessIdentityResult]
  }
  @scala.inline
  implicit class UpdateCloudFrontOriginAccessIdentityResultOps[Self <: UpdateCloudFrontOriginAccessIdentityResult] (val x: Self) extends AnyVal {
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
    def setCloudFrontOriginAccessIdentity(value: CloudFrontOriginAccessIdentity): Self = this.set("CloudFrontOriginAccessIdentity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudFrontOriginAccessIdentity: Self = this.set("CloudFrontOriginAccessIdentity", js.undefined)
    @scala.inline
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
  }
  
}

