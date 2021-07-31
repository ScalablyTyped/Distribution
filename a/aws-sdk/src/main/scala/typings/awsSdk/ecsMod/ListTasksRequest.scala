package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTasksRequest extends StObject {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the tasks to list. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.undefined
  
  /**
    * The container instance ID or full ARN of the container instance with which to filter the ListTasks results. Specifying a containerInstance limits the results to tasks that belong to that container instance.
    */
  var containerInstance: js.UndefOr[String] = js.undefined
  
  /**
    * The task desired status with which to filter the ListTasks results. Specifying a desiredStatus of STOPPED limits the results to tasks that Amazon ECS has set the desired status to STOPPED. This can be useful for debugging tasks that are not starting properly or have died or finished. The default status filter is RUNNING, which shows tasks that Amazon ECS has set the desired status to RUNNING.  Although you can filter results based on a desired status of PENDING, this does not return any results. Amazon ECS never sets the desired status of a task to that value (only a task's lastStatus may have a value of PENDING). 
    */
  var desiredStatus: js.UndefOr[DesiredStatus] = js.undefined
  
  /**
    * The name of the family with which to filter the ListTasks results. Specifying a family limits the results to tasks that belong to that family.
    */
  var family: js.UndefOr[String] = js.undefined
  
  /**
    * The launch type for services to list.
    */
  var launchType: js.UndefOr[LaunchType] = js.undefined
  
  /**
    * The maximum number of task results returned by ListTasks in paginated output. When this parameter is used, ListTasks only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListTasks request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListTasks returns up to 100 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The nextToken value returned from a ListTasks request indicating that more results are available to fulfill the request and further calls will be needed. If maxResults was provided, it is possible the number of results to be fewer than maxResults.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the service with which to filter the ListTasks results. Specifying a serviceName limits the results to tasks that belong to that service.
    */
  var serviceName: js.UndefOr[String] = js.undefined
  
  /**
    * The startedBy value with which to filter the task results. Specifying a startedBy value limits the results to tasks that were started with that value.
    */
  var startedBy: js.UndefOr[String] = js.undefined
}
object ListTasksRequest {
  
  @scala.inline
  def apply(): ListTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTasksRequest]
  }
  
  @scala.inline
  implicit class ListTasksRequestMutableBuilder[Self <: ListTasksRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    @scala.inline
    def setContainerInstance(value: String): Self = StObject.set(x, "containerInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerInstanceUndefined: Self = StObject.set(x, "containerInstance", js.undefined)
    
    @scala.inline
    def setDesiredStatus(value: DesiredStatus): Self = StObject.set(x, "desiredStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredStatusUndefined: Self = StObject.set(x, "desiredStatus", js.undefined)
    
    @scala.inline
    def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    @scala.inline
    def setLaunchType(value: LaunchType): Self = StObject.set(x, "launchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTypeUndefined: Self = StObject.set(x, "launchType", js.undefined)
    
    @scala.inline
    def setMaxResults(value: BoxedInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    @scala.inline
    def setStartedBy(value: String): Self = StObject.set(x, "startedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedByUndefined: Self = StObject.set(x, "startedBy", js.undefined)
  }
}
