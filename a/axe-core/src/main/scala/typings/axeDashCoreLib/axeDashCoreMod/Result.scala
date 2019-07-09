package typings
package axeDashCoreLib.axeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var description: java.lang.String
  var help: java.lang.String
  var helpUrl: java.lang.String
  var id: java.lang.String
  var impact: js.UndefOr[ImpactValue] = js.undefined
  var nodes: js.Array[NodeResult]
  var tags: js.Array[TagValue]
}

object Result {
  @scala.inline
  def apply(
    description: java.lang.String,
    help: java.lang.String,
    helpUrl: java.lang.String,
    id: java.lang.String,
    nodes: js.Array[NodeResult],
    tags: js.Array[TagValue],
    impact: ImpactValue = null
  ): Result = {
    val __obj = js.Dynamic.literal(description = description, help = help, helpUrl = helpUrl, id = id, nodes = nodes, tags = tags)
    if (impact != null) __obj.updateDynamic("impact")(impact)
    __obj.asInstanceOf[Result]
  }
}

