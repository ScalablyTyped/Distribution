package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComprehendMedicalAsyncJobProperties extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that gives Amazon Comprehend Medical read access to your input data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * The time that the detection job completed.
    */
  var EndTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The date and time that job metadata is deleted from the server. Output files in your S3 bucket will not be deleted. After the metadata is deleted, the job will no longer appear in the results of the ListEntitiesDetectionV2Job or the ListPHIDetectionJobs operation.
    */
  var ExpirationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The input data configuration that you supplied when you created the detection job.
    */
  var InputDataConfig: js.UndefOr[typings.awsSdk.comprehendmedicalMod.InputDataConfig] = js.undefined
  
  /**
    * The identifier assigned to the detection job.
    */
  var JobId: js.UndefOr[typings.awsSdk.comprehendmedicalMod.JobId] = js.undefined
  
  /**
    * The name that you assigned to the detection job.
    */
  var JobName: js.UndefOr[typings.awsSdk.comprehendmedicalMod.JobName] = js.undefined
  
  /**
    * The current status of the detection job. If the status is FAILED, the Message field shows the reason for the failure.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.comprehendmedicalMod.JobStatus] = js.undefined
  
  /**
    * The AWS Key Management Service key, if any, used to encrypt the output files. 
    */
  var KMSKey: js.UndefOr[typings.awsSdk.comprehendmedicalMod.KMSKey] = js.undefined
  
  /**
    * The language code of the input documents.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.comprehendmedicalMod.LanguageCode] = js.undefined
  
  /**
    * The path to the file that describes the results of a batch job.
    */
  var ManifestFilePath: js.UndefOr[typings.awsSdk.comprehendmedicalMod.ManifestFilePath] = js.undefined
  
  /**
    * A description of the status of a job.
    */
  var Message: js.UndefOr[AnyLengthString] = js.undefined
  
  /**
    * The version of the model used to analyze the documents. The version number looks like X.X.X. You can use this information to track the model used for a particular batch of documents.
    */
  var ModelVersion: js.UndefOr[typings.awsSdk.comprehendmedicalMod.ModelVersion] = js.undefined
  
  /**
    * The output data configuration that you supplied when you created the detection job.
    */
  var OutputDataConfig: js.UndefOr[typings.awsSdk.comprehendmedicalMod.OutputDataConfig] = js.undefined
  
  /**
    * The time that the detection job was submitted for processing.
    */
  var SubmitTime: js.UndefOr[Timestamp] = js.undefined
}
object ComprehendMedicalAsyncJobProperties {
  
  @scala.inline
  def apply(): ComprehendMedicalAsyncJobProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComprehendMedicalAsyncJobProperties]
  }
  
  @scala.inline
  implicit class ComprehendMedicalAsyncJobPropertiesMutableBuilder[Self <: ComprehendMedicalAsyncJobProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setExpirationTime(value: Timestamp): Self = StObject.set(x, "ExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeUndefined: Self = StObject.set(x, "ExpirationTime", js.undefined)
    
    @scala.inline
    def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDataConfigUndefined: Self = StObject.set(x, "InputDataConfig", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    @scala.inline
    def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    @scala.inline
    def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    @scala.inline
    def setKMSKey(value: KMSKey): Self = StObject.set(x, "KMSKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSKeyUndefined: Self = StObject.set(x, "KMSKey", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    @scala.inline
    def setManifestFilePath(value: ManifestFilePath): Self = StObject.set(x, "ManifestFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestFilePathUndefined: Self = StObject.set(x, "ManifestFilePath", js.undefined)
    
    @scala.inline
    def setMessage(value: AnyLengthString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setModelVersion(value: ModelVersion): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVersionUndefined: Self = StObject.set(x, "ModelVersion", js.undefined)
    
    @scala.inline
    def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputDataConfigUndefined: Self = StObject.set(x, "OutputDataConfig", js.undefined)
    
    @scala.inline
    def setSubmitTime(value: Timestamp): Self = StObject.set(x, "SubmitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitTimeUndefined: Self = StObject.set(x, "SubmitTime", js.undefined)
  }
}
