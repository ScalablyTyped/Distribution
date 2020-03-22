package typings.commitlintLoad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitlintConfig extends js.Object {
  var `extends`: js.UndefOr[js.Array[String]] = js.undefined
  var rules: Rules
}

object CommitlintConfig {
  @scala.inline
  def apply(rules: Rules, `extends`: js.Array[String] = null): CommitlintConfig = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitlintConfig]
  }
}

