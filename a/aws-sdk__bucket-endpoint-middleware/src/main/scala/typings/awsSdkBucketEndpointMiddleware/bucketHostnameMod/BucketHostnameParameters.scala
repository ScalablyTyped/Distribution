package typings.awsSdkBucketEndpointMiddleware.bucketHostnameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketHostnameParameters extends js.Object {
  var accelerateEndpoint: js.UndefOr[Boolean] = js.native
  var baseHostname: String = js.native
  var bucketName: String = js.native
  var dualstackEndpoint: js.UndefOr[Boolean] = js.native
  var pathStyleEndpoint: js.UndefOr[Boolean] = js.native
  var sslCompatible: js.UndefOr[Boolean] = js.native
}

object BucketHostnameParameters {
  @scala.inline
  def apply(baseHostname: String, bucketName: String): BucketHostnameParameters = {
    val __obj = js.Dynamic.literal(baseHostname = baseHostname.asInstanceOf[js.Any], bucketName = bucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketHostnameParameters]
  }
  @scala.inline
  implicit class BucketHostnameParametersOps[Self <: BucketHostnameParameters] (val x: Self) extends AnyVal {
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
    def setBaseHostname(value: String): Self = this.set("baseHostname", value.asInstanceOf[js.Any])
    @scala.inline
    def setBucketName(value: String): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccelerateEndpoint(value: Boolean): Self = this.set("accelerateEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccelerateEndpoint: Self = this.set("accelerateEndpoint", js.undefined)
    @scala.inline
    def setDualstackEndpoint(value: Boolean): Self = this.set("dualstackEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDualstackEndpoint: Self = this.set("dualstackEndpoint", js.undefined)
    @scala.inline
    def setPathStyleEndpoint(value: Boolean): Self = this.set("pathStyleEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathStyleEndpoint: Self = this.set("pathStyleEndpoint", js.undefined)
    @scala.inline
    def setSslCompatible(value: Boolean): Self = this.set("sslCompatible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslCompatible: Self = this.set("sslCompatible", js.undefined)
  }
  
}

