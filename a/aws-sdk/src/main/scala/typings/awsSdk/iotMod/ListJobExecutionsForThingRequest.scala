package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobExecutionsForThingRequest extends StObject {
  
  /**
    * The maximum number of results to be returned per request.
    */
  var maxResults: js.UndefOr[LaserMaxResults] = js.undefined
  
  /**
    * The namespace used to indicate that a job is a customer-managed job. When you specify a value for this parameter, AWS IoT Core sends jobs notifications to MQTT topics that contain the value in the following format.  $aws/things/THING_NAME/jobs/JOB_ID/notify-namespace-NAMESPACE_ID/   The namespaceId feature is in public preview. 
    */
  var namespaceId: js.UndefOr[NamespaceId] = js.undefined
  
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An optional filter that lets you search for jobs that have the specified status.
    */
  var status: js.UndefOr[JobExecutionStatus] = js.undefined
  
  /**
    * The thing name.
    */
  var thingName: ThingName
}
object ListJobExecutionsForThingRequest {
  
  @scala.inline
  def apply(thingName: ThingName): ListJobExecutionsForThingRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobExecutionsForThingRequest]
  }
  
  @scala.inline
  implicit class ListJobExecutionsForThingRequestMutableBuilder[Self <: ListJobExecutionsForThingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: LaserMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNamespaceId(value: NamespaceId): Self = StObject.set(x, "namespaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceIdUndefined: Self = StObject.set(x, "namespaceId", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setStatus(value: JobExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
