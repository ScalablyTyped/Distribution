package typings
package cssLib.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Supports
  extends Node
     with AtRule {
  /** Array of nodes with the types rule, comment and any of the at-rule types. */
  var rules: js.UndefOr[js.Array[Rule | Comment | AtRule]] = js.undefined
  /** The part following @supports. */
  var supports: js.UndefOr[java.lang.String] = js.undefined
}

object Supports {
  @scala.inline
  def apply(
    parent: Node = null,
    position: cssLib.Anon_Content = null,
    rules: js.Array[Rule | Comment | AtRule] = null,
    supports: java.lang.String = null,
    `type`: java.lang.String = null
  ): Supports = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (position != null) __obj.updateDynamic("position")(position)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (supports != null) __obj.updateDynamic("supports")(supports)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Supports]
  }
}

