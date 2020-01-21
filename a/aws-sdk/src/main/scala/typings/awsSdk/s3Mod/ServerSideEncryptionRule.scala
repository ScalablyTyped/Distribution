package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerSideEncryptionRule extends js.Object {
  /**
    * Specifies the default server-side encryption to apply to new objects in the bucket. If a PUT Object request doesn't specify any server-side encryption, this default encryption will be applied.
    */
  var ApplyServerSideEncryptionByDefault: js.UndefOr[ServerSideEncryptionByDefault] = js.native
}

object ServerSideEncryptionRule {
  @scala.inline
  def apply(ApplyServerSideEncryptionByDefault: ServerSideEncryptionByDefault = null): ServerSideEncryptionRule = {
    val __obj = js.Dynamic.literal()
    if (ApplyServerSideEncryptionByDefault != null) __obj.updateDynamic("ApplyServerSideEncryptionByDefault")(ApplyServerSideEncryptionByDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSideEncryptionRule]
  }
}

