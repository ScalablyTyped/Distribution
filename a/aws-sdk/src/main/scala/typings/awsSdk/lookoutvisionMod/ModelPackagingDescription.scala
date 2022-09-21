package typings.awsSdk.lookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelPackagingDescription extends StObject {
  
  /**
    *  The Unix timestamp for the time and date that the model packaging job was created. 
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The name of the model packaging job. 
    */
  var JobName: js.UndefOr[ModelPackagingJobName] = js.undefined
  
  /**
    *  The Unix timestamp for the time and date that the model packaging job was last updated. 
    */
  var LastUpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The configuration information used in the model packaging job. 
    */
  var ModelPackagingConfiguration: js.UndefOr[typings.awsSdk.lookoutvisionMod.ModelPackagingConfiguration] = js.undefined
  
  /**
    * The description for the model packaging job. 
    */
  var ModelPackagingJobDescription: js.UndefOr[typings.awsSdk.lookoutvisionMod.ModelPackagingJobDescription] = js.undefined
  
  /**
    * The AWS service used to package the job. Currently Lookout for Vision can package jobs with AWS IoT Greengrass. 
    */
  var ModelPackagingMethod: js.UndefOr[typings.awsSdk.lookoutvisionMod.ModelPackagingMethod] = js.undefined
  
  /**
    * Information about the output of the model packaging job. For more information, see DescribeModelPackagingJob. 
    */
  var ModelPackagingOutputDetails: js.UndefOr[typings.awsSdk.lookoutvisionMod.ModelPackagingOutputDetails] = js.undefined
  
  /**
    * The version of the model used in the model packaging job. 
    */
  var ModelVersion: js.UndefOr[typings.awsSdk.lookoutvisionMod.ModelVersion] = js.undefined
  
  /**
    * The name of the project that's associated with a model that's in the model package. 
    */
  var ProjectName: js.UndefOr[typings.awsSdk.lookoutvisionMod.ProjectName] = js.undefined
  
  /**
    *  The status of the model packaging job. 
    */
  var Status: js.UndefOr[ModelPackagingJobStatus] = js.undefined
  
  /**
    *  The status message for the model packaging job. 
    */
  var StatusMessage: js.UndefOr[ModelPackagingStatusMessage] = js.undefined
}
object ModelPackagingDescription {
  
  inline def apply(): ModelPackagingDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelPackagingDescription]
  }
  
  extension [Self <: ModelPackagingDescription](x: Self) {
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setJobName(value: ModelPackagingJobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    inline def setModelPackagingConfiguration(value: ModelPackagingConfiguration): Self = StObject.set(x, "ModelPackagingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setModelPackagingConfigurationUndefined: Self = StObject.set(x, "ModelPackagingConfiguration", js.undefined)
    
    inline def setModelPackagingJobDescription(value: ModelPackagingJobDescription): Self = StObject.set(x, "ModelPackagingJobDescription", value.asInstanceOf[js.Any])
    
    inline def setModelPackagingJobDescriptionUndefined: Self = StObject.set(x, "ModelPackagingJobDescription", js.undefined)
    
    inline def setModelPackagingMethod(value: ModelPackagingMethod): Self = StObject.set(x, "ModelPackagingMethod", value.asInstanceOf[js.Any])
    
    inline def setModelPackagingMethodUndefined: Self = StObject.set(x, "ModelPackagingMethod", js.undefined)
    
    inline def setModelPackagingOutputDetails(value: ModelPackagingOutputDetails): Self = StObject.set(x, "ModelPackagingOutputDetails", value.asInstanceOf[js.Any])
    
    inline def setModelPackagingOutputDetailsUndefined: Self = StObject.set(x, "ModelPackagingOutputDetails", js.undefined)
    
    inline def setModelVersion(value: ModelVersion): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    inline def setModelVersionUndefined: Self = StObject.set(x, "ModelVersion", js.undefined)
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "ProjectName", js.undefined)
    
    inline def setStatus(value: ModelPackagingJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: ModelPackagingStatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
