package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDistributionRequest extends js.Object {
  /**
    * The distribution's configuration information.
    */
  var DistributionConfig: typings.awsSdk.cloudfrontMod.DistributionConfig = js.native
  /**
    * The distribution's id.
    */
  var Id: String = js.native
  /**
    * The value of the ETag header that you received when retrieving the distribution's configuration. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.native
}

object UpdateDistributionRequest {
  @scala.inline
  def apply(DistributionConfig: DistributionConfig, Id: String): UpdateDistributionRequest = {
    val __obj = js.Dynamic.literal(DistributionConfig = DistributionConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDistributionRequest]
  }
  @scala.inline
  implicit class UpdateDistributionRequestOps[Self <: UpdateDistributionRequest] (val x: Self) extends AnyVal {
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
    def setDistributionConfig(value: DistributionConfig): Self = this.set("DistributionConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIfMatch(value: String): Self = this.set("IfMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfMatch: Self = this.set("IfMatch", js.undefined)
  }
  
}

