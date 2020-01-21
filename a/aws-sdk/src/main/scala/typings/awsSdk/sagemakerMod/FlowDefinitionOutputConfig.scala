package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowDefinitionOutputConfig extends js.Object {
  /**
    * The Amazon Key Management Service (KMS) key ID for server-side encryption.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.sagemakerMod.KmsKeyId] = js.native
  /**
    * The Amazon S3 path where the object containing human output will be made available.
    */
  var S3OutputPath: S3Uri = js.native
}

object FlowDefinitionOutputConfig {
  @scala.inline
  def apply(S3OutputPath: S3Uri, KmsKeyId: KmsKeyId = null): FlowDefinitionOutputConfig = {
    val __obj = js.Dynamic.literal(S3OutputPath = S3OutputPath.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDefinitionOutputConfig]
  }
}

