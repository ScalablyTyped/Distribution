package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDistributionRequest extends js.Object {
  /**
    * The distribution's configuration information.
    */
  var DistributionConfig: typings.awsSdk.cloudfrontMod.DistributionConfig = js.native
}

object CreateDistributionRequest {
  @scala.inline
  def apply(DistributionConfig: DistributionConfig): CreateDistributionRequest = {
    val __obj = js.Dynamic.literal(DistributionConfig = DistributionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDistributionRequest]
  }
  @scala.inline
  implicit class CreateDistributionRequestOps[Self <: CreateDistributionRequest] (val x: Self) extends AnyVal {
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
  }
  
}

