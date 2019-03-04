package typings
package axeDashCoreLib.axeDashCoreMod.axeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckResult extends js.Object {
  var data: js.Any
  var id: java.lang.String
  var impact: java.lang.String
  var message: java.lang.String
  var relatedNodes: js.UndefOr[js.Array[RelatedNode]] = js.undefined
}

object CheckResult {
  @scala.inline
  def apply(
    data: js.Any,
    id: java.lang.String,
    impact: java.lang.String,
    message: java.lang.String,
    relatedNodes: js.Array[RelatedNode] = null
  ): CheckResult = {
    val __obj = js.Dynamic.literal(data = data, id = id, impact = impact, message = message)
    if (relatedNodes != null) __obj.updateDynamic("relatedNodes")(relatedNodes)
    __obj.asInstanceOf[CheckResult]
  }
}

