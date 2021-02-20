package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGroupRequest extends StObject {
  
  /**
    * The filter expression defining criteria by which to group traces.
    */
  var FilterExpression: js.UndefOr[typings.awsSdk.xrayMod.FilterExpression] = js.native
  
  /**
    * The case-sensitive name of the new group. Default is a reserved name and names must be unique.
    */
  var GroupName: typings.awsSdk.xrayMod.GroupName = js.native
  
  /**
    * The structure containing configurations related to insights.   The InsightsEnabled boolean can be set to true to enable insights for the new group or false to disable insights for the new group.   The NotifcationsEnabled boolean can be set to true to enable insights notifications for the new group. Notifications may only be enabled on a group with InsightsEnabled set to true.  
    */
  var InsightsConfiguration: js.UndefOr[typings.awsSdk.xrayMod.InsightsConfiguration] = js.native
  
  /**
    * A map that contains one or more tag keys and tag values to attach to an X-Ray group. For more information about ways to use tags, see Tagging AWS resources in the AWS General Reference. The following restrictions apply to tags:   Maximum number of user-applied tags per resource: 50   Maximum tag key length: 128 Unicode characters   Maximum tag value length: 256 Unicode characters   Valid values for key and value: a-z, A-Z, 0-9, space, and the following characters: _ . : / = + - and @   Tag keys and values are case sensitive.   Don't use aws: as a prefix for keys; it's reserved for AWS use.  
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateGroupRequest {
  
  @scala.inline
  def apply(GroupName: GroupName): CreateGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupRequest]
  }
  
  @scala.inline
  implicit class CreateGroupRequestMutableBuilder[Self <: CreateGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterExpression(value: FilterExpression): Self = StObject.set(x, "FilterExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterExpressionUndefined: Self = StObject.set(x, "FilterExpression", js.undefined)
    
    @scala.inline
    def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightsConfiguration(value: InsightsConfiguration): Self = StObject.set(x, "InsightsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightsConfigurationUndefined: Self = StObject.set(x, "InsightsConfiguration", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
