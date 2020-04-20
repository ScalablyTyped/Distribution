package typings.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleMetadata extends js.Object {
  var description: String
  var help: String
  var helpUrl: String
  var ruleId: String
  var tags: js.Array[String]
}

object RuleMetadata {
  @scala.inline
  def apply(description: String, help: String, helpUrl: String, ruleId: String, tags: js.Array[String]): RuleMetadata = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpUrl = helpUrl.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleMetadata]
  }
}

