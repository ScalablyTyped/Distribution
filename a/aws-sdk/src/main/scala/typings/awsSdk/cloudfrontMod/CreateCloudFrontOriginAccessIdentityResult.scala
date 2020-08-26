package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCloudFrontOriginAccessIdentityResult extends js.Object {
  /**
    * The origin access identity's information.
    */
  var CloudFrontOriginAccessIdentity: js.UndefOr[typings.awsSdk.cloudfrontMod.CloudFrontOriginAccessIdentity] = js.native
  /**
    * The current version of the origin access identity created.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * The fully qualified URI of the new origin access identity just created.
    */
  var Location: js.UndefOr[String] = js.native
}

object CreateCloudFrontOriginAccessIdentityResult {
  @scala.inline
  def apply(): CreateCloudFrontOriginAccessIdentityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCloudFrontOriginAccessIdentityResult]
  }
  @scala.inline
  implicit class CreateCloudFrontOriginAccessIdentityResultOps[Self <: CreateCloudFrontOriginAccessIdentityResult] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setLocation(value: String): Self = this.set("Location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
  }
  
}

