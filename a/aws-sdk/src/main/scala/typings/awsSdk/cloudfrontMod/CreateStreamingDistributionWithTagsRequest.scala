package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStreamingDistributionWithTagsRequest extends StObject {
  
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
  implicit class CreateStreamingDistributionWithTagsRequestMutableBuilder[Self <: CreateStreamingDistributionWithTagsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamingDistributionConfigWithTags(value: StreamingDistributionConfigWithTags): Self = StObject.set(x, "StreamingDistributionConfigWithTags", value.asInstanceOf[js.Any])
  }
}
