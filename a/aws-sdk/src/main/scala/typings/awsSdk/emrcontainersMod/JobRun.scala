package typings.awsSdk.emrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobRun extends StObject {
  
  /**
    * The ARN of job run.
    */
  var arn: js.UndefOr[JobArn] = js.undefined
  
  /**
    * The client token used to start a job run.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The configuration settings that are used to override default configuration.
    */
  var configurationOverrides: js.UndefOr[ConfigurationOverrides] = js.undefined
  
  /**
    * The date and time when the job run was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user who created the job run.
    */
  var createdBy: js.UndefOr[RequestIdentityUserArn] = js.undefined
  
  /**
    * The execution role ARN of the job run.
    */
  var executionRoleArn: js.UndefOr[IAMRoleArn] = js.undefined
  
  /**
    * The reasons why the job run has failed.
    */
  var failureReason: js.UndefOr[FailureReason] = js.undefined
  
  /**
    * The date and time when the job run has finished.
    */
  var finishedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the job run.
    */
  var id: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * Parameters of job driver for the job run.
    */
  var jobDriver: js.UndefOr[JobDriver] = js.undefined
  
  /**
    * The name of the job run.
    */
  var name: js.UndefOr[ResourceNameString] = js.undefined
  
  /**
    * The release version of Amazon EMR.
    */
  var releaseLabel: js.UndefOr[ReleaseLabel] = js.undefined
  
  /**
    * The state of the job run. 
    */
  var state: js.UndefOr[JobRunState] = js.undefined
  
  /**
    * Additional details of the job run state.
    */
  var stateDetails: js.UndefOr[String256] = js.undefined
  
  /**
    * The assigned tags of the job run.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The ID of the job run's virtual cluster.
    */
  var virtualClusterId: js.UndefOr[ResourceIdString] = js.undefined
}
object JobRun {
  
  inline def apply(): JobRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobRun]
  }
  
  extension [Self <: JobRun](x: Self) {
    
    inline def setArn(value: JobArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setConfigurationOverrides(value: ConfigurationOverrides): Self = StObject.set(x, "configurationOverrides", value.asInstanceOf[js.Any])
    
    inline def setConfigurationOverridesUndefined: Self = StObject.set(x, "configurationOverrides", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCreatedBy(value: RequestIdentityUserArn): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setExecutionRoleArn(value: IAMRoleArn): Self = StObject.set(x, "executionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "executionRoleArn", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setFinishedAt(value: js.Date): Self = StObject.set(x, "finishedAt", value.asInstanceOf[js.Any])
    
    inline def setFinishedAtUndefined: Self = StObject.set(x, "finishedAt", js.undefined)
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setJobDriver(value: JobDriver): Self = StObject.set(x, "jobDriver", value.asInstanceOf[js.Any])
    
    inline def setJobDriverUndefined: Self = StObject.set(x, "jobDriver", js.undefined)
    
    inline def setName(value: ResourceNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReleaseLabel(value: ReleaseLabel): Self = StObject.set(x, "releaseLabel", value.asInstanceOf[js.Any])
    
    inline def setReleaseLabelUndefined: Self = StObject.set(x, "releaseLabel", js.undefined)
    
    inline def setState(value: JobRunState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateDetails(value: String256): Self = StObject.set(x, "stateDetails", value.asInstanceOf[js.Any])
    
    inline def setStateDetailsUndefined: Self = StObject.set(x, "stateDetails", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setVirtualClusterId(value: ResourceIdString): Self = StObject.set(x, "virtualClusterId", value.asInstanceOf[js.Any])
    
    inline def setVirtualClusterIdUndefined: Self = StObject.set(x, "virtualClusterId", js.undefined)
  }
}
