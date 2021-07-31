package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAutoScalingPolicyOutput extends StObject {
  
  /**
    * The automatic scaling policy definition.
    */
  var AutoScalingPolicy: js.UndefOr[AutoScalingPolicyDescription] = js.undefined
  
  /**
    * The Amazon Resource Name of the cluster.
    */
  var ClusterArn: js.UndefOr[ArnType] = js.undefined
  
  /**
    * Specifies the ID of a cluster. The instance group to which the automatic scaling policy is applied is within this cluster.
    */
  var ClusterId: js.UndefOr[typings.awsSdk.emrMod.ClusterId] = js.undefined
  
  /**
    * Specifies the ID of the instance group to which the scaling policy is applied.
    */
  var InstanceGroupId: js.UndefOr[typings.awsSdk.emrMod.InstanceGroupId] = js.undefined
}
object PutAutoScalingPolicyOutput {
  
  @scala.inline
  def apply(): PutAutoScalingPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAutoScalingPolicyOutput]
  }
  
  @scala.inline
  implicit class PutAutoScalingPolicyOutputMutableBuilder[Self <: PutAutoScalingPolicyOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingPolicy(value: AutoScalingPolicyDescription): Self = StObject.set(x, "AutoScalingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingPolicyUndefined: Self = StObject.set(x, "AutoScalingPolicy", js.undefined)
    
    @scala.inline
    def setClusterArn(value: ArnType): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "ClusterId", js.undefined)
    
    @scala.inline
    def setInstanceGroupId(value: InstanceGroupId): Self = StObject.set(x, "InstanceGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceGroupIdUndefined: Self = StObject.set(x, "InstanceGroupId", js.undefined)
  }
}
