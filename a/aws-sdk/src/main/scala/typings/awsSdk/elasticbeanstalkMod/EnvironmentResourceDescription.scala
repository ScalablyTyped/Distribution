package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentResourceDescription extends js.Object {
  /**
    *  The AutoScalingGroups used by this environment. 
    */
  var AutoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.native
  /**
    * The name of the environment.
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  /**
    * The Amazon EC2 instances used by this environment.
    */
  var Instances: js.UndefOr[InstanceList] = js.native
  /**
    * The Auto Scaling launch configurations in use by this environment.
    */
  var LaunchConfigurations: js.UndefOr[LaunchConfigurationList] = js.native
  /**
    * The Amazon EC2 launch templates in use by this environment.
    */
  var LaunchTemplates: js.UndefOr[LaunchTemplateList] = js.native
  /**
    * The LoadBalancers in use by this environment.
    */
  var LoadBalancers: js.UndefOr[LoadBalancerList] = js.native
  /**
    * The queues used by this environment.
    */
  var Queues: js.UndefOr[QueueList] = js.native
  /**
    * The AutoScaling triggers in use by this environment. 
    */
  var Triggers: js.UndefOr[TriggerList] = js.native
}

object EnvironmentResourceDescription {
  @scala.inline
  def apply(
    AutoScalingGroups: AutoScalingGroupList = null,
    EnvironmentName: EnvironmentName = null,
    Instances: InstanceList = null,
    LaunchConfigurations: LaunchConfigurationList = null,
    LaunchTemplates: LaunchTemplateList = null,
    LoadBalancers: LoadBalancerList = null,
    Queues: QueueList = null,
    Triggers: TriggerList = null
  ): EnvironmentResourceDescription = {
    val __obj = js.Dynamic.literal()
    if (AutoScalingGroups != null) __obj.updateDynamic("AutoScalingGroups")(AutoScalingGroups.asInstanceOf[js.Any])
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName.asInstanceOf[js.Any])
    if (Instances != null) __obj.updateDynamic("Instances")(Instances.asInstanceOf[js.Any])
    if (LaunchConfigurations != null) __obj.updateDynamic("LaunchConfigurations")(LaunchConfigurations.asInstanceOf[js.Any])
    if (LaunchTemplates != null) __obj.updateDynamic("LaunchTemplates")(LaunchTemplates.asInstanceOf[js.Any])
    if (LoadBalancers != null) __obj.updateDynamic("LoadBalancers")(LoadBalancers.asInstanceOf[js.Any])
    if (Queues != null) __obj.updateDynamic("Queues")(Queues.asInstanceOf[js.Any])
    if (Triggers != null) __obj.updateDynamic("Triggers")(Triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentResourceDescription]
  }
}

