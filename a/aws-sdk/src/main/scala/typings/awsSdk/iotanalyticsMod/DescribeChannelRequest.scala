package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeChannelRequest extends StObject {
  
  /**
    * The name of the channel whose information is retrieved.
    */
  var channelName: ChannelName = js.native
  
  /**
    * If true, additional statistical information about the channel is included in the response. This feature cannot be used with a channel whose S3 storage is customer-managed.
    */
  var includeStatistics: js.UndefOr[IncludeStatisticsFlag] = js.native
}
object DescribeChannelRequest {
  
  @scala.inline
  def apply(channelName: ChannelName): DescribeChannelRequest = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChannelRequest]
  }
  
  @scala.inline
  implicit class DescribeChannelRequestMutableBuilder[Self <: DescribeChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelName(value: ChannelName): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeStatistics(value: IncludeStatisticsFlag): Self = StObject.set(x, "includeStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeStatisticsUndefined: Self = StObject.set(x, "includeStatistics", js.undefined)
  }
}
