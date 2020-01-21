package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentClassifierOutputDataConfig extends js.Object {
  /**
    * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the output results from an analysis job. The KmsKeyId can be one of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"    KMS Key Alias: "alias/ExampleAlias"    ARN of a KMS Key Alias: "arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"   
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.comprehendMod.KmsKeyId] = js.native
  /**
    * When you use the OutputDataConfig object while creating a custom classifier, you specify the Amazon S3 location where you want to write the confusion matrix. The URI must be in the same region as the API endpoint that you are calling. The location is used as the prefix for the actual location of this output file. When the custom classifier job is finished, the service creates the output file in a directory specific to the job. The S3Uri field contains the location of the output file, called output.tar.gz. It is a compressed archive that contains the confusion matrix.
    */
  var S3Uri: js.UndefOr[typings.awsSdk.comprehendMod.S3Uri] = js.native
}

object DocumentClassifierOutputDataConfig {
  @scala.inline
  def apply(KmsKeyId: KmsKeyId = null, S3Uri: S3Uri = null): DocumentClassifierOutputDataConfig = {
    val __obj = js.Dynamic.literal()
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (S3Uri != null) __obj.updateDynamic("S3Uri")(S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentClassifierOutputDataConfig]
  }
}

