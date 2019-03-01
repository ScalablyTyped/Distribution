package typings
package axeDashCoreLib.axeDashCoreMod.axeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var description: java.lang.String
  var help: java.lang.String
  var helpUrl: java.lang.String
  var id: java.lang.String
  var impact: ImpactValue
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
    impact: ImpactValue,
    nodes: js.Array[NodeResult],
    tags: js.Array[TagValue]
  ): Result = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("help")(help)
    __obj.updateDynamic("helpUrl")(helpUrl)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("impact")(impact)
    __obj.updateDynamic("nodes")(nodes)
    __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Result]
  }
}

