package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicsDetectionJobProperties extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read access to your job data. 
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * The time that the topic detection job was completed.
    */
  var EndTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The input data configuration supplied when you created the topic detection job.
    */
  var InputDataConfig: js.UndefOr[typings.awsSdk.comprehendMod.InputDataConfig] = js.undefined
  
  /**
    * The identifier assigned to the topic detection job.
    */
  var JobId: js.UndefOr[typings.awsSdk.comprehendMod.JobId] = js.undefined
  
  /**
    * The name of the topic detection job.
    */
  var JobName: js.UndefOr[typings.awsSdk.comprehendMod.JobName] = js.undefined
  
  /**
    * The current status of the topic detection job. If the status is Failed, the reason for the failure is shown in the Message field.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.comprehendMod.JobStatus] = js.undefined
  
  /**
    * A description for the status of a job.
    */
  var Message: js.UndefOr[AnyLengthString] = js.undefined
  
  /**
    * The number of topics to detect supplied when you created the topic detection job. The default is 10. 
    */
  var NumberOfTopics: js.UndefOr[Integer] = js.undefined
  
  /**
    * The output data configuration supplied when you created the topic detection job.
    */
  var OutputDataConfig: js.UndefOr[typings.awsSdk.comprehendMod.OutputDataConfig] = js.undefined
  
  /**
    * The time that the topic detection job was submitted for processing.
    */
  var SubmitTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you are using for your topic detection job. For more information, see Amazon VPC. 
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.comprehendMod.VpcConfig] = js.undefined
}
object TopicsDetectionJobProperties {
  
  @scala.inline
  def apply(): TopicsDetectionJobProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicsDetectionJobProperties]
  }
  
  @scala.inline
  implicit class TopicsDetectionJobPropertiesMutableBuilder[Self <: TopicsDetectionJobProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
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
    def setMessage(value: AnyLengthString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setNumberOfTopics(value: Integer): Self = StObject.set(x, "NumberOfTopics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfTopicsUndefined: Self = StObject.set(x, "NumberOfTopics", js.undefined)
    
    @scala.inline
    def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputDataConfigUndefined: Self = StObject.set(x, "OutputDataConfig", js.undefined)
    
    @scala.inline
    def setSubmitTime(value: Timestamp): Self = StObject.set(x, "SubmitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitTimeUndefined: Self = StObject.set(x, "SubmitTime", js.undefined)
    
    @scala.inline
    def setVolumeKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "VolumeKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeKmsKeyIdUndefined: Self = StObject.set(x, "VolumeKmsKeyId", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
