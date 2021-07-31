package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStreamingDistributionRequest extends StObject {
  
  /**
    * The streaming distribution's id.
    */
  var Id: String
  
  /**
    * The value of the ETag header that you received when retrieving the streaming distribution's configuration. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
  
  /**
    * The streaming distribution's configuration information.
    */
  var StreamingDistributionConfig: typings.awsSdk.cloudfrontMod.StreamingDistributionConfig
}
object UpdateStreamingDistributionRequest {
  
  @scala.inline
  def apply(Id: String, StreamingDistributionConfig: StreamingDistributionConfig): UpdateStreamingDistributionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], StreamingDistributionConfig = StreamingDistributionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStreamingDistributionRequest]
  }
  
  @scala.inline
  implicit class UpdateStreamingDistributionRequestMutableBuilder[Self <: UpdateStreamingDistributionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
    
    @scala.inline
    def setStreamingDistributionConfig(value: StreamingDistributionConfig): Self = StObject.set(x, "StreamingDistributionConfig", value.asInstanceOf[js.Any])
  }
}
