package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformResources extends js.Object {
  /**
    * The number of ML compute instances to use in the transform job. For distributed transform jobs, specify a value greater than 1. The default value is 1.
    */
  var InstanceCount: TransformInstanceCount = js.native
  /**
    * The ML compute instance type for the transform job. If you are using built-in algorithms to transform moderately sized datasets, we recommend using ml.m4.xlarge or ml.m5.large instance types.
    */
  var InstanceType: TransformInstanceType = js.native
  /**
    * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt model data on the storage volume attached to the ML compute instance(s) that run the batch transform job. The VolumeKmsKeyId can be any of the following formats:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias name ARN: arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.native
}

object TransformResources {
  @scala.inline
  def apply(InstanceCount: TransformInstanceCount, InstanceType: TransformInstanceType): TransformResources = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformResources]
  }
  @scala.inline
  implicit class TransformResourcesOps[Self <: TransformResources] (val x: Self) extends AnyVal {
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
    def setInstanceCount(value: TransformInstanceCount): Self = this.set("InstanceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceType(value: TransformInstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeKmsKeyId(value: KmsKeyId): Self = this.set("VolumeKmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeKmsKeyId: Self = this.set("VolumeKmsKeyId", js.undefined)
  }
  
}

