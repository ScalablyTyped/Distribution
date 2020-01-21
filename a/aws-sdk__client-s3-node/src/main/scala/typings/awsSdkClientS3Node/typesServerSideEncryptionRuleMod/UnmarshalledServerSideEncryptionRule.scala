package typings.awsSdkClientS3Node.typesServerSideEncryptionRuleMod

import typings.awsSdkClientS3Node.typesServerSideEncryptionByDefaultMod.UnmarshalledServerSideEncryptionByDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledServerSideEncryptionRule extends ServerSideEncryptionRule {
  /**
    * <p>Describes the default server-side encryption to apply to new objects in the bucket. If Put Object request does not specify any server-side encryption, this default encryption will be applied.</p>
    */
  @JSName("ApplyServerSideEncryptionByDefault")
  var ApplyServerSideEncryptionByDefault_UnmarshalledServerSideEncryptionRule: js.UndefOr[UnmarshalledServerSideEncryptionByDefault] = js.undefined
}

object UnmarshalledServerSideEncryptionRule {
  @scala.inline
  def apply(ApplyServerSideEncryptionByDefault: UnmarshalledServerSideEncryptionByDefault = null): UnmarshalledServerSideEncryptionRule = {
    val __obj = js.Dynamic.literal()
    if (ApplyServerSideEncryptionByDefault != null) __obj.updateDynamic("ApplyServerSideEncryptionByDefault")(ApplyServerSideEncryptionByDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledServerSideEncryptionRule]
  }
}

