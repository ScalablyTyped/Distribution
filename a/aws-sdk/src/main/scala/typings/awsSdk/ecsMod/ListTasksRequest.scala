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
  def apply(): ListTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTasksRequest]
  }
  @scala.inline
  implicit class ListTasksRequestOps[Self <: ListTasksRequest] (val x: Self) extends AnyVal {
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
    def setCluster(value: String): Self = this.set("cluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
    @scala.inline
    def setContainerInstance(value: String): Self = this.set("containerInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerInstance: Self = this.set("containerInstance", js.undefined)
    @scala.inline
    def setDesiredStatus(value: DesiredStatus): Self = this.set("desiredStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredStatus: Self = this.set("desiredStatus", js.undefined)
    @scala.inline
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    @scala.inline
    def setLaunchType(value: LaunchType): Self = this.set("launchType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchType: Self = this.set("launchType", js.undefined)
    @scala.inline
    def setMaxResults(value: BoxedInteger): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
    @scala.inline
    def setStartedBy(value: String): Self = this.set("startedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartedBy: Self = this.set("startedBy", js.undefined)
  }
  
}

