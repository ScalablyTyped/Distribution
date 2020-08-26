package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDistributionWithTagsRequest extends js.Object {
  /**
    * The distribution's configuration information. 
    */
  var DistributionConfigWithTags: typings.awsSdk.cloudfrontMod.DistributionConfigWithTags = js.native
}

object CreateDistributionWithTagsRequest {
  @scala.inline
  def apply(DistributionConfigWithTags: DistributionConfigWithTags): CreateDistributionWithTagsRequest = {
    val __obj = js.Dynamic.literal(DistributionConfigWithTags = DistributionConfigWithTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDistributionWithTagsRequest]
  }
  @scala.inline
  implicit class CreateDistributionWithTagsRequestOps[Self <: CreateDistributionWithTagsRequest] (val x: Self) extends AnyVal {
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
    def setDistributionConfigWithTags(value: DistributionConfigWithTags): Self = this.set("DistributionConfigWithTags", value.asInstanceOf[js.Any])
  }
  
}

