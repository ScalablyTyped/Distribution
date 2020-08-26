package typings.awsSdkClientS3Node.typesServerSideEncryptionRuleMod

import typings.awsSdkClientS3Node.typesServerSideEncryptionByDefaultMod.UnmarshalledServerSideEncryptionByDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledServerSideEncryptionRule extends ServerSideEncryptionRule {
  /**
    * <p>Describes the default server-side encryption to apply to new objects in the bucket. If Put Object request does not specify any server-side encryption, this default encryption will be applied.</p>
    */
  @JSName("ApplyServerSideEncryptionByDefault")
  var ApplyServerSideEncryptionByDefault_UnmarshalledServerSideEncryptionRule: js.UndefOr[UnmarshalledServerSideEncryptionByDefault] = js.native
}

object UnmarshalledServerSideEncryptionRule {
  @scala.inline
  def apply(): UnmarshalledServerSideEncryptionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledServerSideEncryptionRule]
  }
  @scala.inline
  implicit class UnmarshalledServerSideEncryptionRuleOps[Self <: UnmarshalledServerSideEncryptionRule] (val x: Self) extends AnyVal {
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
    def setApplyServerSideEncryptionByDefault(value: UnmarshalledServerSideEncryptionByDefault): Self = this.set("ApplyServerSideEncryptionByDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyServerSideEncryptionByDefault: Self = this.set("ApplyServerSideEncryptionByDefault", js.undefined)
  }
  
}

