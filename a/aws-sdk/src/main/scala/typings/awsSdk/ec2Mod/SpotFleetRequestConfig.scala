package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotFleetRequestConfig extends StObject {
  
  /**
    * The progress of the Spot Fleet request. If there is an error, the status is error. After all requests are placed, the status is pending_fulfillment. If the size of the fleet is equal to or greater than its target capacity, the status is fulfilled. If the size of the fleet is decreased, the status is pending_termination while Spot Instances are terminating.
    */
  var ActivityStatus: js.UndefOr[typings.awsSdk.ec2Mod.ActivityStatus] = js.native
  
  /**
    * The creation date and time of the request.
    */
  var CreateTime: js.UndefOr[MillisecondDateTime] = js.native
  
  /**
    * The configuration of the Spot Fleet request.
    */
  var SpotFleetRequestConfig: js.UndefOr[SpotFleetRequestConfigData] = js.native
  
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: js.UndefOr[String] = js.native
  
  /**
    * The state of the Spot Fleet request.
    */
  var SpotFleetRequestState: js.UndefOr[BatchState] = js.native
  
  /**
    * The tags for a Spot Fleet resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object SpotFleetRequestConfig {
  
  @scala.inline
  def apply(): SpotFleetRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotFleetRequestConfig]
  }
  
  @scala.inline
  implicit class SpotFleetRequestConfigMutableBuilder[Self <: SpotFleetRequestConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityStatus(value: ActivityStatus): Self = StObject.set(x, "ActivityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityStatusUndefined: Self = StObject.set(x, "ActivityStatus", js.undefined)
    
    @scala.inline
    def setCreateTime(value: MillisecondDateTime): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    @scala.inline
    def setSpotFleetRequestConfig(value: SpotFleetRequestConfigData): Self = StObject.set(x, "SpotFleetRequestConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotFleetRequestConfigUndefined: Self = StObject.set(x, "SpotFleetRequestConfig", js.undefined)
    
    @scala.inline
    def setSpotFleetRequestId(value: String): Self = StObject.set(x, "SpotFleetRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotFleetRequestIdUndefined: Self = StObject.set(x, "SpotFleetRequestId", js.undefined)
    
    @scala.inline
    def setSpotFleetRequestState(value: BatchState): Self = StObject.set(x, "SpotFleetRequestState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotFleetRequestStateUndefined: Self = StObject.set(x, "SpotFleetRequestState", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
