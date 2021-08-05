package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteJobExecutionRequest extends StObject {
  
  /**
    * The ID of the job execution to be deleted. The executionNumber refers to the execution of a particular job on a particular device. Note that once a job execution is deleted, the executionNumber may be reused by IoT, so be sure you get and use the correct value here.
    */
  var executionNumber: ExecutionNumber
  
  /**
    * (Optional) When true, you can delete a job execution which is "IN_PROGRESS". Otherwise, you can only delete a job execution which is in a terminal state ("SUCCEEDED", "FAILED", "REJECTED", "REMOVED" or "CANCELED") or an exception will occur. The default is false.  Deleting a job execution which is "IN_PROGRESS", will cause the device to be unable to access job information or update the job execution status. Use caution and ensure that the device is able to recover to a valid state. 
    */
  var force: js.UndefOr[ForceFlag] = js.undefined
  
  /**
    * The ID of the job whose execution on a particular device will be deleted.
    */
  var jobId: JobId
  
  /**
    * The namespace used to indicate that a job is a customer-managed job. When you specify a value for this parameter, AWS IoT Core sends jobs notifications to MQTT topics that contain the value in the following format.  $aws/things/THING_NAME/jobs/JOB_ID/notify-namespace-NAMESPACE_ID/   The namespaceId feature is in public preview. 
    */
  var namespaceId: js.UndefOr[NamespaceId] = js.undefined
  
  /**
    * The name of the thing whose job execution will be deleted.
    */
  var thingName: ThingName
}
object DeleteJobExecutionRequest {
  
  inline def apply(executionNumber: ExecutionNumber, jobId: JobId, thingName: ThingName): DeleteJobExecutionRequest = {
    val __obj = js.Dynamic.literal(executionNumber = executionNumber.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJobExecutionRequest]
  }
  
  extension [Self <: DeleteJobExecutionRequest](x: Self) {
    
    inline def setExecutionNumber(value: ExecutionNumber): Self = StObject.set(x, "executionNumber", value.asInstanceOf[js.Any])
    
    inline def setForce(value: ForceFlag): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setNamespaceId(value: NamespaceId): Self = StObject.set(x, "namespaceId", value.asInstanceOf[js.Any])
    
    inline def setNamespaceIdUndefined: Self = StObject.set(x, "namespaceId", js.undefined)
    
    inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
