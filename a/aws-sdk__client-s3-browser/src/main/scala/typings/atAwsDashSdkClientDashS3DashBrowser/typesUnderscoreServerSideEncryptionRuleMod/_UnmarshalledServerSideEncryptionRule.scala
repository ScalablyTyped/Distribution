package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreServerSideEncryptionRuleMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreServerSideEncryptionByDefaultMod._UnmarshalledServerSideEncryptionByDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledServerSideEncryptionRule extends _ServerSideEncryptionRule {
  /**
    * <p>Describes the default server-side encryption to apply to new objects in the bucket. If Put Object request does not specify any server-side encryption, this default encryption will be applied.</p>
    */
  @JSName("ApplyServerSideEncryptionByDefault")
  var ApplyServerSideEncryptionByDefault__UnmarshalledServerSideEncryptionRule: js.UndefOr[_UnmarshalledServerSideEncryptionByDefault] = js.undefined
}

object _UnmarshalledServerSideEncryptionRule {
  @scala.inline
  def apply(ApplyServerSideEncryptionByDefault: _UnmarshalledServerSideEncryptionByDefault = null): _UnmarshalledServerSideEncryptionRule = {
    val __obj = js.Dynamic.literal()
    if (ApplyServerSideEncryptionByDefault != null) __obj.updateDynamic("ApplyServerSideEncryptionByDefault")(ApplyServerSideEncryptionByDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledServerSideEncryptionRule]
  }
}

