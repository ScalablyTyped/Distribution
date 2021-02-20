package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateChannelRequest extends StObject {
  
  /**
    * The name of the channel to be updated.
    */
  var channelName: ChannelName = js.native
  
  /**
    * Where channel data is stored. You can choose one of serviceManagedS3 or customerManagedS3 storage. If not specified, the default is serviceManagedS3. You cannot change this storage option after the channel is created.
    */
  var channelStorage: js.UndefOr[ChannelStorage] = js.native
  
  /**
    * How long, in days, message data is kept for the channel. The retention period cannot be updated if the channel's S3 storage is customer-managed.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
}
object UpdateChannelRequest {
  
  @scala.inline
  def apply(channelName: ChannelName): UpdateChannelRequest = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelRequest]
  }
  
  @scala.inline
  implicit class UpdateChannelRequestMutableBuilder[Self <: UpdateChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelName(value: ChannelName): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelStorage(value: ChannelStorage): Self = StObject.set(x, "channelStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelStorageUndefined: Self = StObject.set(x, "channelStorage", js.undefined)
    
    @scala.inline
    def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
  }
}
