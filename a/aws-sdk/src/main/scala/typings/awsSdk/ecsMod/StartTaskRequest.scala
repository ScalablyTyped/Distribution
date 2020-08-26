package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTaskRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster on which to start your task. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.native
  /**
    * The container instance IDs or full ARN entries for the container instances on which you would like to place your task. You can specify up to 10 container instances.
    */
  var containerInstances: StringList = js.native
  /**
    * Specifies whether to enable Amazon ECS managed tags for the task. For more information, see Tagging Your Amazon ECS Resources in the Amazon Elastic Container Service Developer Guide.
    */
  var enableECSManagedTags: js.UndefOr[Boolean] = js.native
  /**
    * The name of the task group to associate with the task. The default value is the family name of the task definition (for example, family:my-family-name).
    */
  var group: js.UndefOr[String] = js.native
  /**
    * The VPC subnet and security group configuration for tasks that receive their own elastic network interface by using the awsvpc networking mode.
    */
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.native
  /**
    * A list of container overrides in JSON format that specify the name of a container in the specified task definition and the overrides it should receive. You can override the default command for a container (that is specified in the task definition or Docker image) with a command override. You can also override existing environment variables (that are specified in the task definition or Docker image) on a container or add new environment variables to it with an environment override.  A total of 8192 characters are allowed for overrides. This limit includes the JSON formatting characters of the override structure. 
    */
  var overrides: js.UndefOr[TaskOverride] = js.native
  /**
    * Specifies whether to propagate the tags from the task definition or the service to the task. If no value is specified, the tags are not propagated.
    */
  var propagateTags: js.UndefOr[PropagateTags] = js.native
  /**
    * The reference ID to use for the task.
    */
  var referenceId: js.UndefOr[String] = js.native
  /**
    * An optional tag specified when a task is started. For example, if you automatically trigger a task to run a batch process job, you could apply a unique identifier for that job to your task with the startedBy parameter. You can then identify which tasks belong to that job by filtering the results of a ListTasks call with the startedBy value. Up to 36 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed. If a task is started by an Amazon ECS service, then the startedBy parameter contains the deployment ID of the service that starts it.
    */
  var startedBy: js.UndefOr[String] = js.native
  /**
    * The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.native
  /**
    * The family and revision (family:revision) or full ARN of the task definition to start. If a revision is not specified, the latest ACTIVE revision is used.
    */
  var taskDefinition: String = js.native
}

object StartTaskRequest {
  @scala.inline
  def apply(containerInstances: StringList, taskDefinition: String): StartTaskRequest = {
    val __obj = js.Dynamic.literal(containerInstances = containerInstances.asInstanceOf[js.Any], taskDefinition = taskDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTaskRequest]
  }
  @scala.inline
  implicit class StartTaskRequestOps[Self <: StartTaskRequest] (val x: Self) extends AnyVal {
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
    def setContainerInstancesVarargs(value: String*): Self = this.set("containerInstances", js.Array(value :_*))
    @scala.inline
    def setContainerInstances(value: StringList): Self = this.set("containerInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskDefinition(value: String): Self = this.set("taskDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setCluster(value: String): Self = this.set("cluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
    @scala.inline
    def setEnableECSManagedTags(value: Boolean): Self = this.set("enableECSManagedTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableECSManagedTags: Self = this.set("enableECSManagedTags", js.undefined)
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setNetworkConfiguration(value: NetworkConfiguration): Self = this.set("networkConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkConfiguration: Self = this.set("networkConfiguration", js.undefined)
    @scala.inline
    def setOverrides(value: TaskOverride): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setPropagateTags(value: PropagateTags): Self = this.set("propagateTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropagateTags: Self = this.set("propagateTags", js.undefined)
    @scala.inline
    def setReferenceId(value: String): Self = this.set("referenceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceId: Self = this.set("referenceId", js.undefined)
    @scala.inline
    def setStartedBy(value: String): Self = this.set("startedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartedBy: Self = this.set("startedBy", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

