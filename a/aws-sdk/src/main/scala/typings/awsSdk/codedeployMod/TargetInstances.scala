package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetInstances extends StObject {
  
  /**
    * The names of one or more Auto Scaling groups to identify a replacement environment for a blue/green deployment.
    */
  var autoScalingGroups: js.UndefOr[AutoScalingGroupNameList] = js.native
  
  /**
    * Information about the groups of EC2 instance tags that an instance must be identified by in order for it to be included in the replacement environment for a blue/green deployment. Cannot be used in the same call as tagFilters.
    */
  var ec2TagSet: js.UndefOr[EC2TagSet] = js.native
  
  /**
    * The tag filter key, type, and value used to identify Amazon EC2 instances in a replacement environment for a blue/green deployment. Cannot be used in the same call as ec2TagSet.
    */
  var tagFilters: js.UndefOr[EC2TagFilterList] = js.native
}
object TargetInstances {
  
  @scala.inline
  def apply(): TargetInstances = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetInstances]
  }
  
  @scala.inline
  implicit class TargetInstancesMutableBuilder[Self <: TargetInstances] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroups(value: AutoScalingGroupNameList): Self = StObject.set(x, "autoScalingGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingGroupsUndefined: Self = StObject.set(x, "autoScalingGroups", js.undefined)
    
    @scala.inline
    def setAutoScalingGroupsVarargs(value: AutoScalingGroupName*): Self = StObject.set(x, "autoScalingGroups", js.Array(value :_*))
    
    @scala.inline
    def setEc2TagSet(value: EC2TagSet): Self = StObject.set(x, "ec2TagSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2TagSetUndefined: Self = StObject.set(x, "ec2TagSet", js.undefined)
    
    @scala.inline
    def setTagFilters(value: EC2TagFilterList): Self = StObject.set(x, "tagFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagFiltersUndefined: Self = StObject.set(x, "tagFilters", js.undefined)
    
    @scala.inline
    def setTagFiltersVarargs(value: EC2TagFilter*): Self = StObject.set(x, "tagFilters", js.Array(value :_*))
  }
}
