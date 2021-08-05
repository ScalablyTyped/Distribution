package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChannelRequest extends StObject {
  
  /**
    * The name of the channel to be updated.
    */
  var channelName: ChannelName
  
  /**
    * Where channel data is stored. You can choose one of serviceManagedS3 or customerManagedS3 storage. If not specified, the default is serviceManagedS3. You cannot change this storage option after the channel is created.
    */
  var channelStorage: js.UndefOr[ChannelStorage] = js.undefined
  
  /**
    * How long, in days, message data is kept for the channel. The retention period cannot be updated if the channel's S3 storage is customer-managed.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
}
object UpdateChannelRequest {
  
  inline def apply(channelName: ChannelName): UpdateChannelRequest = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelRequest]
  }
  
  extension [Self <: UpdateChannelRequest](x: Self) {
    
    inline def setChannelName(value: ChannelName): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    inline def setChannelStorage(value: ChannelStorage): Self = StObject.set(x, "channelStorage", value.asInstanceOf[js.Any])
    
    inline def setChannelStorageUndefined: Self = StObject.set(x, "channelStorage", js.undefined)
    
    inline def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
  }
}
