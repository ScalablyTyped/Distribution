package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreServerSideEncryptionRuleMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreServerSideEncryptionByDefaultMod._ServerSideEncryptionByDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ServerSideEncryptionRule extends js.Object {
  /**
    * <p>Describes the default server-side encryption to apply to new objects in the bucket. If Put Object request does not specify any server-side encryption, this default encryption will be applied.</p>
    */
  var ApplyServerSideEncryptionByDefault: js.UndefOr[_ServerSideEncryptionByDefault] = js.undefined
}

object _ServerSideEncryptionRule {
  @scala.inline
  def apply(ApplyServerSideEncryptionByDefault: _ServerSideEncryptionByDefault = null): _ServerSideEncryptionRule = {
    val __obj = js.Dynamic.literal()
    if (ApplyServerSideEncryptionByDefault != null) __obj.updateDynamic("ApplyServerSideEncryptionByDefault")(ApplyServerSideEncryptionByDefault)
    __obj.asInstanceOf[_ServerSideEncryptionRule]
  }
}

