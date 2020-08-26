package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringClusterConfig extends js.Object {
  /**
    * The number of ML compute instances to use in the model monitoring job. For distributed processing jobs, specify a value greater than 1. The default value is 1.
    */
  var InstanceCount: ProcessingInstanceCount = js.native
  /**
    * The ML compute instance type for the processing job.
    */
  var InstanceType: ProcessingInstanceType = js.native
  /**
    * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance(s) that run the model monitoring job.
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.native
  /**
    * The size of the ML storage volume, in gigabytes, that you want to provision. You must specify sufficient ML storage for your scenario.
    */
  var VolumeSizeInGB: ProcessingVolumeSizeInGB = js.native
}

object MonitoringClusterConfig {
  @scala.inline
  def apply(
    InstanceCount: ProcessingInstanceCount,
    InstanceType: ProcessingInstanceType,
    VolumeSizeInGB: ProcessingVolumeSizeInGB
  ): MonitoringClusterConfig = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any], VolumeSizeInGB = VolumeSizeInGB.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringClusterConfig]
  }
  @scala.inline
  implicit class MonitoringClusterConfigOps[Self <: MonitoringClusterConfig] (val x: Self) extends AnyVal {
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
    def setInstanceCount(value: ProcessingInstanceCount): Self = this.set("InstanceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceType(value: ProcessingInstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeSizeInGB(value: ProcessingVolumeSizeInGB): Self = this.set("VolumeSizeInGB", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeKmsKeyId(value: KmsKeyId): Self = this.set("VolumeKmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeKmsKeyId: Self = this.set("VolumeKmsKeyId", js.undefined)
  }
  
}

