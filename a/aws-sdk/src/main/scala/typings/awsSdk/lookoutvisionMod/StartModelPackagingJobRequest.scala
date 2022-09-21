package typings.awsSdk.lookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartModelPackagingJobRequest extends StObject {
  
  /**
    * ClientToken is an idempotency token that ensures a call to StartModelPackagingJob completes only once. You choose the value to pass. For example, An issue might prevent you from getting a response from StartModelPackagingJob. In this case, safely retry your call to StartModelPackagingJob by using the same ClientToken parameter value. If you don't supply a value for ClientToken, the AWS SDK you are using inserts a value for you. This prevents retries after a network error from making multiple dataset creation requests. You'll need to provide your own value for other use cases.  An error occurs if the other input parameters are not the same as in the first request. Using a different value for ClientToken is considered a new call to StartModelPackagingJob. An idempotency token is active for 8 hours. 
    */
  var ClientToken: js.UndefOr[typings.awsSdk.lookoutvisionMod.ClientToken] = js.undefined
  
  /**
    * The configuration for the model packaging job. 
    */
  var Configuration: ModelPackagingConfiguration
  
  /**
    * A description for the model packaging job. 
    */
  var Description: js.UndefOr[ModelPackagingJobDescription] = js.undefined
  
  /**
    * A name for the model packaging job. If you don't supply a value, the service creates a job name for you. 
    */
  var JobName: js.UndefOr[ModelPackagingJobName] = js.undefined
  
  /**
    *  The version of the model within the project that you want to package. 
    */
  var ModelVersion: typings.awsSdk.lookoutvisionMod.ModelVersion
  
  /**
    *  The name of the project which contains the version of the model that you want to package. 
    */
  var ProjectName: typings.awsSdk.lookoutvisionMod.ProjectName
}
object StartModelPackagingJobRequest {
  
  inline def apply(Configuration: ModelPackagingConfiguration, ModelVersion: ModelVersion, ProjectName: ProjectName): StartModelPackagingJobRequest = {
    val __obj = js.Dynamic.literal(Configuration = Configuration.asInstanceOf[js.Any], ModelVersion = ModelVersion.asInstanceOf[js.Any], ProjectName = ProjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartModelPackagingJobRequest]
  }
  
  extension [Self <: StartModelPackagingJobRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setConfiguration(value: ModelPackagingConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ModelPackagingJobDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setJobName(value: ModelPackagingJobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setModelVersion(value: ModelVersion): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
  }
}
