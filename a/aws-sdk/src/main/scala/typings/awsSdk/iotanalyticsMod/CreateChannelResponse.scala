package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChannelResponse extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var channelArn: js.UndefOr[ChannelArn] = js.undefined
  
  /**
    * The name of the channel.
    */
  var channelName: js.UndefOr[ChannelName] = js.undefined
  
  /**
    * How long, in days, message data is kept for the channel.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
}
object CreateChannelResponse {
  
  @scala.inline
  def apply(): CreateChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelResponse]
  }
  
  @scala.inline
  implicit class CreateChannelResponseMutableBuilder[Self <: CreateChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChannelArn): Self = StObject.set(x, "channelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelArnUndefined: Self = StObject.set(x, "channelArn", js.undefined)
    
    @scala.inline
    def setChannelName(value: ChannelName): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
    
    @scala.inline
    def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
  }
}
