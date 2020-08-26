package typings.awsSdkClientS3Browser.typesServerSideEncryptionConfigurationMod

import typings.awsSdkClientS3Browser.typesServerSideEncryptionRuleMod.ServerSideEncryptionRule
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerSideEncryptionConfiguration extends js.Object {
  /**
    * <p>Container for information about a particular server-side encryption configuration rule.</p>
    */
  var Rules: js.Array[ServerSideEncryptionRule] | Iterable[ServerSideEncryptionRule] = js.native
}

object ServerSideEncryptionConfiguration {
  @scala.inline
  def apply(Rules: js.Array[ServerSideEncryptionRule] | Iterable[ServerSideEncryptionRule]): ServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSideEncryptionConfiguration]
  }
  @scala.inline
  implicit class ServerSideEncryptionConfigurationOps[Self <: ServerSideEncryptionConfiguration] (val x: Self) extends AnyVal {
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
    def setRulesVarargs(value: ServerSideEncryptionRule*): Self = this.set("Rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[ServerSideEncryptionRule] | Iterable[ServerSideEncryptionRule]): Self = this.set("Rules", value.asInstanceOf[js.Any])
  }
  
}

