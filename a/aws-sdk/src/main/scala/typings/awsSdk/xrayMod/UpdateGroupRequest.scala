package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGroupRequest extends StObject {
  
  /**
    * The updated filter expression defining criteria by which to group traces.
    */
  var FilterExpression: js.UndefOr[typings.awsSdk.xrayMod.FilterExpression] = js.native
  
  /**
    * The ARN that was generated upon creation.
    */
  var GroupARN: js.UndefOr[typings.awsSdk.xrayMod.GroupARN] = js.native
  
  /**
    * The case-sensitive name of the group.
    */
  var GroupName: js.UndefOr[typings.awsSdk.xrayMod.GroupName] = js.native
  
  /**
    * The structure containing configurations related to insights.   The InsightsEnabled boolean can be set to true to enable insights for the group or false to disable insights for the group.   The NotifcationsEnabled boolean can be set to true to enable insights notifications for the group. Notifications can only be enabled on a group with InsightsEnabled set to true.  
    */
  var InsightsConfiguration: js.UndefOr[typings.awsSdk.xrayMod.InsightsConfiguration] = js.native
}
object UpdateGroupRequest {
  
  @scala.inline
  def apply(): UpdateGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGroupRequest]
  }
  
  @scala.inline
  implicit class UpdateGroupRequestMutableBuilder[Self <: UpdateGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterExpression(value: FilterExpression): Self = StObject.set(x, "FilterExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterExpressionUndefined: Self = StObject.set(x, "FilterExpression", js.undefined)
    
    @scala.inline
    def setGroupARN(value: GroupARN): Self = StObject.set(x, "GroupARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupARNUndefined: Self = StObject.set(x, "GroupARN", js.undefined)
    
    @scala.inline
    def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    @scala.inline
    def setInsightsConfiguration(value: InsightsConfiguration): Self = StObject.set(x, "InsightsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightsConfigurationUndefined: Self = StObject.set(x, "InsightsConfiguration", js.undefined)
  }
}
