package typings.axeDashCore.axeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var description: String
  var help: String
  var helpUrl: String
  var id: String
  var impact: js.UndefOr[ImpactValue] = js.undefined
  var nodes: js.Array[NodeResult]
  var tags: js.Array[TagValue]
}

object Result {
  @scala.inline
  def apply(
    description: String,
    help: String,
    helpUrl: String,
    id: String,
    nodes: js.Array[NodeResult],
    tags: js.Array[TagValue],
    impact: ImpactValue = null
  ): Result = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpUrl = helpUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    if (impact != null) __obj.updateDynamic("impact")(impact.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

