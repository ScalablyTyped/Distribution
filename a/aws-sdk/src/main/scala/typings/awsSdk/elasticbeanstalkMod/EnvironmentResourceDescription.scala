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
  def apply(): EnvironmentResourceDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentResourceDescription]
  }
  @scala.inline
  implicit class EnvironmentResourceDescriptionOps[Self <: EnvironmentResourceDescription] (val x: Self) extends AnyVal {
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
    def setAutoScalingGroupsVarargs(value: AutoScalingGroup*): Self = this.set("AutoScalingGroups", js.Array(value :_*))
    @scala.inline
    def setAutoScalingGroups(value: AutoScalingGroupList): Self = this.set("AutoScalingGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScalingGroups: Self = this.set("AutoScalingGroups", js.undefined)
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = this.set("EnvironmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentName: Self = this.set("EnvironmentName", js.undefined)
    @scala.inline
    def setInstancesVarargs(value: Instance*): Self = this.set("Instances", js.Array(value :_*))
    @scala.inline
    def setInstances(value: InstanceList): Self = this.set("Instances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstances: Self = this.set("Instances", js.undefined)
    @scala.inline
    def setLaunchConfigurationsVarargs(value: LaunchConfiguration*): Self = this.set("LaunchConfigurations", js.Array(value :_*))
    @scala.inline
    def setLaunchConfigurations(value: LaunchConfigurationList): Self = this.set("LaunchConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchConfigurations: Self = this.set("LaunchConfigurations", js.undefined)
    @scala.inline
    def setLaunchTemplatesVarargs(value: LaunchTemplate*): Self = this.set("LaunchTemplates", js.Array(value :_*))
    @scala.inline
    def setLaunchTemplates(value: LaunchTemplateList): Self = this.set("LaunchTemplates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplates: Self = this.set("LaunchTemplates", js.undefined)
    @scala.inline
    def setLoadBalancersVarargs(value: LoadBalancer*): Self = this.set("LoadBalancers", js.Array(value :_*))
    @scala.inline
    def setLoadBalancers(value: LoadBalancerList): Self = this.set("LoadBalancers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancers: Self = this.set("LoadBalancers", js.undefined)
    @scala.inline
    def setQueuesVarargs(value: Queue*): Self = this.set("Queues", js.Array(value :_*))
    @scala.inline
    def setQueues(value: QueueList): Self = this.set("Queues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueues: Self = this.set("Queues", js.undefined)
    @scala.inline
    def setTriggersVarargs(value: Trigger*): Self = this.set("Triggers", js.Array(value :_*))
    @scala.inline
    def setTriggers(value: TriggerList): Self = this.set("Triggers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggers: Self = this.set("Triggers", js.undefined)
  }
  
}

