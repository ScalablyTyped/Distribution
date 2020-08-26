package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsAutoScalingAutoScalingGroupDetails extends js.Object {
  /**
    * The datetime when the auto scaling group was created.
    */
  var CreatedTime: js.UndefOr[NonEmptyString] = js.native
  /**
    * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before it checks the health status of an EC2 instance that has come into service.
    */
  var HealthCheckGracePeriod: js.UndefOr[Integer] = js.native
  /**
    * The service to use for the health checks.
    */
  var HealthCheckType: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the launch configuration.
    */
  var LaunchConfigurationName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The list of load balancers associated with the group.
    */
  var LoadBalancerNames: js.UndefOr[StringList] = js.native
}

object AwsAutoScalingAutoScalingGroupDetails {
  @scala.inline
  def apply(): AwsAutoScalingAutoScalingGroupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsAutoScalingAutoScalingGroupDetails]
  }
  @scala.inline
  implicit class AwsAutoScalingAutoScalingGroupDetailsOps[Self <: AwsAutoScalingAutoScalingGroupDetails] (val x: Self) extends AnyVal {
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
    def setCreatedTime(value: NonEmptyString): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    @scala.inline
    def setHealthCheckGracePeriod(value: Integer): Self = this.set("HealthCheckGracePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthCheckGracePeriod: Self = this.set("HealthCheckGracePeriod", js.undefined)
    @scala.inline
    def setHealthCheckType(value: NonEmptyString): Self = this.set("HealthCheckType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthCheckType: Self = this.set("HealthCheckType", js.undefined)
    @scala.inline
    def setLaunchConfigurationName(value: NonEmptyString): Self = this.set("LaunchConfigurationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchConfigurationName: Self = this.set("LaunchConfigurationName", js.undefined)
    @scala.inline
    def setLoadBalancerNamesVarargs(value: NonEmptyString*): Self = this.set("LoadBalancerNames", js.Array(value :_*))
    @scala.inline
    def setLoadBalancerNames(value: StringList): Self = this.set("LoadBalancerNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancerNames: Self = this.set("LoadBalancerNames", js.undefined)
  }
  
}

