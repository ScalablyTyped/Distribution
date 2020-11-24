package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStreamingDistributionWithTagsRequest extends js.Object {
  
  /**
    *  The streaming distribution's configuration information. 
    */
  var StreamingDistributionConfigWithTags: typings.awsSdk.cloudfrontMod.StreamingDistributionConfigWithTags = js.native
}
object CreateStreamingDistributionWithTagsRequest {
  
  @scala.inline
  def apply(StreamingDistributionConfigWithTags: StreamingDistributionConfigWithTags): CreateStreamingDistributionWithTagsRequest = {
    val __obj = js.Dynamic.literal(StreamingDistributionConfigWithTags = StreamingDistributionConfigWithTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamingDistributionWithTagsRequest]
  }
  
  @scala.inline
  implicit class CreateStreamingDistributionWithTagsRequestOps[Self <: CreateStreamingDistributionWithTagsRequest] (val x: Self) extends AnyVal {
    
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
    def setStreamingDistributionConfigWithTags(value: StreamingDistributionConfigWithTags): Self = this.set("StreamingDistributionConfigWithTags", value.asInstanceOf[js.Any])
  }
}
