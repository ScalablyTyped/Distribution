package typings.axeDashCore.axeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axe-core", "getRules")
@js.native
object getRules extends js.Object {
  /**
  	 * Searches and returns rules that contain a tag in the list of tags.
  	 * @param  {Array}  tags  Optional array of tags
  	 * @return {Array}  Array of rules
  	 */
  def apply(): js.Array[RuleMetadata] = js.native
  def apply(tags: js.Array[String]): js.Array[RuleMetadata] = js.native
}

