package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelingJobResourceConfig extends js.Object {
  /**
    * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance(s) that run the training job. The VolumeKmsKeyId can be any of the following formats:   // KMS Key ID  "1234abcd-12ab-34cd-56ef-1234567890ab"    // Amazon Resource Name (ARN) of a KMS Key  "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.native
}

object LabelingJobResourceConfig {
  @scala.inline
  def apply(): LabelingJobResourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelingJobResourceConfig]
  }
  @scala.inline
  implicit class LabelingJobResourceConfigOps[Self <: LabelingJobResourceConfig] (val x: Self) extends AnyVal {
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
    def setVolumeKmsKeyId(value: KmsKeyId): Self = this.set("VolumeKmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeKmsKeyId: Self = this.set("VolumeKmsKeyId", js.undefined)
  }
  
}

