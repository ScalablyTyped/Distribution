package typings.commitlintLoad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitlintConfig extends js.Object {
  var `extends`: js.UndefOr[js.Array[String]] = js.native
  var rules: Rules = js.native
}

object CommitlintConfig {
  @scala.inline
  def apply(rules: Rules): CommitlintConfig = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitlintConfig]
  }
  @scala.inline
  implicit class CommitlintConfigOps[Self <: CommitlintConfig] (val x: Self) extends AnyVal {
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
    def setRules(value: Rules): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtendsVarargs(value: String*): Self = this.set("extends", js.Array(value :_*))
    @scala.inline
    def setExtends(value: js.Array[String]): Self = this.set("extends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
  }
  
}

