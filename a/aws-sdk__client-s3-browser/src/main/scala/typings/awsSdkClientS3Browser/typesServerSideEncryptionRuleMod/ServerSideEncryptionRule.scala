package typings.awsSdkClientS3Browser.typesServerSideEncryptionRuleMod

import typings.awsSdkClientS3Browser.typesServerSideEncryptionByDefaultMod.ServerSideEncryptionByDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerSideEncryptionRule extends js.Object {
  /**
    * <p>Describes the default server-side encryption to apply to new objects in the bucket. If Put Object request does not specify any server-side encryption, this default encryption will be applied.</p>
    */
  var ApplyServerSideEncryptionByDefault: js.UndefOr[ServerSideEncryptionByDefault] = js.undefined
}

object ServerSideEncryptionRule {
  @scala.inline
  def apply(ApplyServerSideEncryptionByDefault: ServerSideEncryptionByDefault = null): ServerSideEncryptionRule = {
    val __obj = js.Dynamic.literal()
    if (ApplyServerSideEncryptionByDefault != null) __obj.updateDynamic("ApplyServerSideEncryptionByDefault")(ApplyServerSideEncryptionByDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSideEncryptionRule]
  }
}

