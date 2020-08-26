package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicsDetectionJobProperties extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read access to your job data. 
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.native
  /**
    * The time that the topic detection job was completed.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  /**
    * The input data configuration supplied when you created the topic detection job.
    */
  var InputDataConfig: js.UndefOr[typings.awsSdk.comprehendMod.InputDataConfig] = js.native
  /**
    * The identifier assigned to the topic detection job.
    */
  var JobId: js.UndefOr[typings.awsSdk.comprehendMod.JobId] = js.native
  /**
    * The name of the topic detection job.
    */
  var JobName: js.UndefOr[typings.awsSdk.comprehendMod.JobName] = js.native
  /**
    * The current status of the topic detection job. If the status is Failed, the reason for the failure is shown in the Message field.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.comprehendMod.JobStatus] = js.native
  /**
    * A description for the status of a job.
    */
  var Message: js.UndefOr[AnyLengthString] = js.native
  /**
    * The number of topics to detect supplied when you created the topic detection job. The default is 10. 
    */
  var NumberOfTopics: js.UndefOr[Integer] = js.native
  /**
    * The output data configuration supplied when you created the topic detection job.
    */
  var OutputDataConfig: js.UndefOr[typings.awsSdk.comprehendMod.OutputDataConfig] = js.native
  /**
    * The time that the topic detection job was submitted for processing.
    */
  var SubmitTime: js.UndefOr[Timestamp] = js.native
  /**
    * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.native
  /**
    * Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you are using for your topic detection job. For more information, see Amazon VPC. 
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.comprehendMod.VpcConfig] = js.native
}

object TopicsDetectionJobProperties {
  @scala.inline
  def apply(): TopicsDetectionJobProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicsDetectionJobProperties]
  }
  @scala.inline
  implicit class TopicsDetectionJobPropertiesOps[Self <: TopicsDetectionJobProperties] (val x: Self) extends AnyVal {
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
    def setDataAccessRoleArn(value: IamRoleArn): Self = this.set("DataAccessRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataAccessRoleArn: Self = this.set("DataAccessRoleArn", js.undefined)
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setInputDataConfig(value: InputDataConfig): Self = this.set("InputDataConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputDataConfig: Self = this.set("InputDataConfig", js.undefined)
    @scala.inline
    def setJobId(value: JobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("JobId", js.undefined)
    @scala.inline
    def setJobName(value: JobName): Self = this.set("JobName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobName: Self = this.set("JobName", js.undefined)
    @scala.inline
    def setJobStatus(value: JobStatus): Self = this.set("JobStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobStatus: Self = this.set("JobStatus", js.undefined)
    @scala.inline
    def setMessage(value: AnyLengthString): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setNumberOfTopics(value: Integer): Self = this.set("NumberOfTopics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfTopics: Self = this.set("NumberOfTopics", js.undefined)
    @scala.inline
    def setOutputDataConfig(value: OutputDataConfig): Self = this.set("OutputDataConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputDataConfig: Self = this.set("OutputDataConfig", js.undefined)
    @scala.inline
    def setSubmitTime(value: Timestamp): Self = this.set("SubmitTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmitTime: Self = this.set("SubmitTime", js.undefined)
    @scala.inline
    def setVolumeKmsKeyId(value: KmsKeyId): Self = this.set("VolumeKmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeKmsKeyId: Self = this.set("VolumeKmsKeyId", js.undefined)
    @scala.inline
    def setVpcConfig(value: VpcConfig): Self = this.set("VpcConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcConfig: Self = this.set("VpcConfig", js.undefined)
  }
  
}

