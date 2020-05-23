package typings.css.mod

import typings.css.anon.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Declaration extends Node {
  /** The property name, trimmed from whitespace and comments. May not be empty. */
  var property: js.UndefOr[String] = js.undefined
  /** The value of the property, trimmed from whitespace and comments. Empty values are allowed. */
  var value: js.UndefOr[String] = js.undefined
}

object Declaration {
  @scala.inline
  def apply(
    parent: Node = null,
    position: Content = null,
    property: String = null,
    `type`: String = null,
    value: String = null
  ): Declaration = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
}

