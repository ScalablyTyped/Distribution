package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTasksRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the tasks to list. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.native
  /**
    * The container instance ID or full ARN of the container instance with which to filter the ListTasks results. Specifying a containerInstance limits the results to tasks that belong to that container instance.
    */
  var containerInstance: js.UndefOr[String] = js.native
  /**
    * The task desired status with which to filter the ListTasks results. Specifying a desiredStatus of STOPPED limits the results to tasks that Amazon ECS has set the desired status to STOPPED. This can be useful for debugging tasks that are not starting properly or have died or finished. The default status filter is RUNNING, which shows tasks that Amazon ECS has set the desired status to RUNNING.  Although you can filter results based on a desired status of PENDING, this does not return any results. Amazon ECS never sets the desired status of a task to that value (only a task's lastStatus may have a value of PENDING). 
    */
  var desiredStatus: js.UndefOr[DesiredStatus] = js.native
  /**
    * The name of the family with which to filter the ListTasks results. Specifying a family limits the results to tasks that belong to that family.
    */
  var family: js.UndefOr[String] = js.native
  /**
    * The launch type for services to list.
    */
  var launchType: js.UndefOr[LaunchType] = js.native
  /**
    * The maximum number of task results returned by ListTasks in paginated output. When this parameter is used, ListTasks only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListTasks request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListTasks returns up to 100 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[BoxedInteger] = js.native
  /**
    * The nextToken value returned from a ListTasks request indicating that more results are available to fulfill the request and further calls will be needed. If maxResults was provided, it is possible the number of results to be fewer than maxResults.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The name of the service with which to filter the ListTasks results. Specifying a serviceName limits the results to tasks that belong to that service.
    */
  var serviceName: js.UndefOr[String] = js.native
  /**
    * The startedBy value with which to filter the task results. Specifying a startedBy value limits the results to tasks that were started with that value.
    */
  var startedBy: js.UndefOr[String] = js.native
}

object ListTasksRequest {
  @scala.inline
  def apply(
    cluster: String = null,
    containerInstance: String = null,
    desiredStatus: DesiredStatus = null,
    family: String = null,
    launchType: LaunchType = null,
    maxResults: js.UndefOr[BoxedInteger] = js.undefined,
    nextToken: String = null,
    serviceName: String = null,
    startedBy: String = null
  ): ListTasksRequest = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (containerInstance != null) __obj.updateDynamic("containerInstance")(containerInstance.asInstanceOf[js.Any])
    if (desiredStatus != null) __obj.updateDynamic("desiredStatus")(desiredStatus.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (launchType != null) __obj.updateDynamic("launchType")(launchType.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    if (startedBy != null) __obj.updateDynamic("startedBy")(startedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTasksRequest]
  }
}

