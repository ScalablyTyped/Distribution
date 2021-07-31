package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingDistributionConfigWithTags extends StObject {
  
  /**
    * A streaming distribution Configuration.
    */
  var StreamingDistributionConfig: typings.awsSdk.cloudfrontMod.StreamingDistributionConfig
  
  /**
    * A complex type that contains zero or more Tag elements.
    */
  var Tags: typings.awsSdk.cloudfrontMod.Tags
}
object StreamingDistributionConfigWithTags {
  
  @scala.inline
  def apply(StreamingDistributionConfig: StreamingDistributionConfig, Tags: Tags): StreamingDistributionConfigWithTags = {
    val __obj = js.Dynamic.literal(StreamingDistributionConfig = StreamingDistributionConfig.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingDistributionConfigWithTags]
  }
  
  @scala.inline
  implicit class StreamingDistributionConfigWithTagsMutableBuilder[Self <: StreamingDistributionConfigWithTags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamingDistributionConfig(value: StreamingDistributionConfig): Self = StObject.set(x, "StreamingDistributionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
