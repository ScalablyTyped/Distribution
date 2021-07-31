package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamKeySummary extends StObject {
  
  /**
    * Stream-key ARN.
    */
  var arn: js.UndefOr[StreamKeyArn] = js.undefined
  
  /**
    * Channel ARN for the stream.
    */
  var channelArn: js.UndefOr[ChannelArn] = js.undefined
  
  /**
    * Array of 1-50 maps, each of the form string:string (key:value).
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object StreamKeySummary {
  
  @scala.inline
  def apply(): StreamKeySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamKeySummary]
  }
  
  @scala.inline
  implicit class StreamKeySummaryMutableBuilder[Self <: StreamKeySummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: StreamKeyArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setChannelArn(value: ChannelArn): Self = StObject.set(x, "channelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelArnUndefined: Self = StObject.set(x, "channelArn", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
