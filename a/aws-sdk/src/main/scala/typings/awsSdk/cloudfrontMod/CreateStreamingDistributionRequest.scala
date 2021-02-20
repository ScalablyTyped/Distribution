package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStreamingDistributionRequest extends StObject {
  
  /**
    * The streaming distribution's configuration information.
    */
  var StreamingDistributionConfig: typings.awsSdk.cloudfrontMod.StreamingDistributionConfig = js.native
}
object CreateStreamingDistributionRequest {
  
  @scala.inline
  def apply(StreamingDistributionConfig: StreamingDistributionConfig): CreateStreamingDistributionRequest = {
    val __obj = js.Dynamic.literal(StreamingDistributionConfig = StreamingDistributionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamingDistributionRequest]
  }
  
  @scala.inline
  implicit class CreateStreamingDistributionRequestMutableBuilder[Self <: CreateStreamingDistributionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamingDistributionConfig(value: StreamingDistributionConfig): Self = StObject.set(x, "StreamingDistributionConfig", value.asInstanceOf[js.Any])
  }
}
