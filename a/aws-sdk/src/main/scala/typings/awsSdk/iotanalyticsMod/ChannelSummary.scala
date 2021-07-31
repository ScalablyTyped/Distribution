package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelSummary extends StObject {
  
  /**
    * The name of the channel.
    */
  var channelName: js.UndefOr[ChannelName] = js.undefined
  
  /**
    * Where channel data is stored.
    */
  var channelStorage: js.UndefOr[ChannelStorageSummary] = js.undefined
  
  /**
    * When the channel was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The last time when a new message arrived in the channel. AWS IoT Analytics updates this value at most once per minute for one channel. Hence, the lastMessageArrivalTime value is an approximation. This feature only applies to messages that arrived in the data store after October 23, 2020. 
    */
  var lastMessageArrivalTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The last time the channel was updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The status of the channel.
    */
  var status: js.UndefOr[ChannelStatus] = js.undefined
}
object ChannelSummary {
  
  @scala.inline
  def apply(): ChannelSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelSummary]
  }
  
  @scala.inline
  implicit class ChannelSummaryMutableBuilder[Self <: ChannelSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelName(value: ChannelName): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
    
    @scala.inline
    def setChannelStorage(value: ChannelStorageSummary): Self = StObject.set(x, "channelStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelStorageUndefined: Self = StObject.set(x, "channelStorage", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setLastMessageArrivalTime(value: Timestamp): Self = StObject.set(x, "lastMessageArrivalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastMessageArrivalTimeUndefined: Self = StObject.set(x, "lastMessageArrivalTime", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: Timestamp): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    @scala.inline
    def setStatus(value: ChannelStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
