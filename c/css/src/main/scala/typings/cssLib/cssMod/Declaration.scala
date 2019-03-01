package typings
package cssLib.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Declaration extends Node {
  /** The property name, trimmed from whitespace and comments. May not be empty. */
  var property: js.UndefOr[java.lang.String] = js.undefined
  /** The value of the property, trimmed from whitespace and comments. Empty values are allowed. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Declaration {
  @scala.inline
  def apply(
    parent: Node = null,
    position: cssLib.Anon_Content = null,
    property: java.lang.String = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): Declaration = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (position != null) __obj.updateDynamic("position")(position)
    if (property != null) __obj.updateDynamic("property")(property)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Declaration]
  }
}

