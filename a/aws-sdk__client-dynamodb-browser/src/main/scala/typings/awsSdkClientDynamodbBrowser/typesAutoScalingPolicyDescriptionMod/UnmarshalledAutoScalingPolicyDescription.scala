package typings.awsSdkClientDynamodbBrowser.typesAutoScalingPolicyDescriptionMod

import typings.awsSdkClientDynamodbBrowser.typesAutoScalingTargetTrackingScalingPolicyConfigurationDescriptionMod.UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledAutoScalingPolicyDescription extends AutoScalingPolicyDescription {
  
  /**
    * <p>Represents a target tracking scaling policy configuration.</p>
    */
  @JSName("TargetTrackingScalingPolicyConfiguration")
  var TargetTrackingScalingPolicyConfiguration_UnmarshalledAutoScalingPolicyDescription: js.UndefOr[UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationDescription] = js.native
}
object UnmarshalledAutoScalingPolicyDescription {
  
  @scala.inline
  def apply(): UnmarshalledAutoScalingPolicyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledAutoScalingPolicyDescription]
  }
  
  @scala.inline
  implicit class UnmarshalledAutoScalingPolicyDescriptionOps[Self <: UnmarshalledAutoScalingPolicyDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTargetTrackingScalingPolicyConfiguration(value: UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationDescription): Self = this.set("TargetTrackingScalingPolicyConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetTrackingScalingPolicyConfiguration: Self = this.set("TargetTrackingScalingPolicyConfiguration", js.undefined)
  }
}
