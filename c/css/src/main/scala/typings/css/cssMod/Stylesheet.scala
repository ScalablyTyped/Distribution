package typings.css.cssMod

import typings.css.Anon_Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stylesheet extends Node {
  var stylesheet: js.UndefOr[StyleRules] = js.undefined
}

object Stylesheet {
  @scala.inline
  def apply(
    parent: Node = null,
    position: Anon_Content = null,
    stylesheet: StyleRules = null,
    `type`: String = null
  ): Stylesheet = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (stylesheet != null) __obj.updateDynamic("stylesheet")(stylesheet.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stylesheet]
  }
}

