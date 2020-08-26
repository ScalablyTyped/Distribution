package typings.awsSdkClientS3Browser.typesServerSideEncryptionRuleMod

import typings.awsSdkClientS3Browser.typesServerSideEncryptionByDefaultMod.ServerSideEncryptionByDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerSideEncryptionRule extends js.Object {
  /**
    * <p>Describes the default server-side encryption to apply to new objects in the bucket. If Put Object request does not specify any server-side encryption, this default encryption will be applied.</p>
    */
  var ApplyServerSideEncryptionByDefault: js.UndefOr[ServerSideEncryptionByDefault] = js.native
}

object ServerSideEncryptionRule {
  @scala.inline
  def apply(): ServerSideEncryptionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerSideEncryptionRule]
  }
  @scala.inline
  implicit class ServerSideEncryptionRuleOps[Self <: ServerSideEncryptionRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplyServerSideEncryptionByDefault(value: ServerSideEncryptionByDefault): Self = this.set("ApplyServerSideEncryptionByDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyServerSideEncryptionByDefault: Self = this.set("ApplyServerSideEncryptionByDefault", js.undefined)
  }
  
}

