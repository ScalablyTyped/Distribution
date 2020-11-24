package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutAutoScalingPolicyOutput extends js.Object {
  
  /**
    * The automatic scaling policy definition.
    */
  var AutoScalingPolicy: js.UndefOr[AutoScalingPolicyDescription] = js.native
  
  /**
    * The Amazon Resource Name of the cluster.
    */
  var ClusterArn: js.UndefOr[ArnType] = js.native
  
  /**
    * Specifies the ID of a cluster. The instance group to which the automatic scaling policy is applied is within this cluster.
    */
  var ClusterId: js.UndefOr[typings.awsSdk.emrMod.ClusterId] = js.native
  
  /**
    * Specifies the ID of the instance group to which the scaling policy is applied.
    */
  var InstanceGroupId: js.UndefOr[typings.awsSdk.emrMod.InstanceGroupId] = js.native
}
object PutAutoScalingPolicyOutput {
  
  @scala.inline
  def apply(): PutAutoScalingPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAutoScalingPolicyOutput]
  }
  
  @scala.inline
  implicit class PutAutoScalingPolicyOutputOps[Self <: PutAutoScalingPolicyOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoScalingPolicy(value: AutoScalingPolicyDescription): Self = this.set("AutoScalingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScalingPolicy: Self = this.set("AutoScalingPolicy", js.undefined)
    
    @scala.inline
    def setClusterArn(value: ArnType): Self = this.set("ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterArn: Self = this.set("ClusterArn", js.undefined)
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = this.set("ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterId: Self = this.set("ClusterId", js.undefined)
    
    @scala.inline
    def setInstanceGroupId(value: InstanceGroupId): Self = this.set("InstanceGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceGroupId: Self = this.set("InstanceGroupId", js.undefined)
  }
}
