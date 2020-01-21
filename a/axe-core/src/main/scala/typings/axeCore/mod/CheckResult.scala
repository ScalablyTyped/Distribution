package typings.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckResult extends js.Object {
  var data: js.Any
  var id: String
  var impact: String
  var message: String
  var relatedNodes: js.UndefOr[js.Array[RelatedNode]] = js.undefined
}

object CheckResult {
  @scala.inline
  def apply(
    data: js.Any,
    id: String,
    impact: String,
    message: String,
    relatedNodes: js.Array[RelatedNode] = null
  ): CheckResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    if (relatedNodes != null) __obj.updateDynamic("relatedNodes")(relatedNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckResult]
  }
}

