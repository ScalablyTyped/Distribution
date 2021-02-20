package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group extends StObject {
  
  /**
    * The filter expression defining the parameters to include traces.
    */
  var FilterExpression: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the group generated based on the GroupName.
    */
  var GroupARN: js.UndefOr[String] = js.native
  
  /**
    * The unique case-sensitive name of the group.
    */
  var GroupName: js.UndefOr[String] = js.native
  
  /**
    * The structure containing configurations related to insights.   The InsightsEnabled boolean can be set to true to enable insights for the group or false to disable insights for the group.   The NotifcationsEnabled boolean can be set to true to enable insights notifications through Amazon EventBridge for the group.  
    */
  var InsightsConfiguration: js.UndefOr[typings.awsSdk.xrayMod.InsightsConfiguration] = js.native
}
object Group {
  
  @scala.inline
  def apply(): Group = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterExpression(value: String): Self = StObject.set(x, "FilterExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterExpressionUndefined: Self = StObject.set(x, "FilterExpression", js.undefined)
    
    @scala.inline
    def setGroupARN(value: String): Self = StObject.set(x, "GroupARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupARNUndefined: Self = StObject.set(x, "GroupARN", js.undefined)
    
    @scala.inline
    def setGroupName(value: String): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    @scala.inline
    def setInsightsConfiguration(value: InsightsConfiguration): Self = StObject.set(x, "InsightsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightsConfigurationUndefined: Self = StObject.set(x, "InsightsConfiguration", js.undefined)
  }
}
