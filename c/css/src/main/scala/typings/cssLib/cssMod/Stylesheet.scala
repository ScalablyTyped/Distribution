package typings
package cssLib.cssMod

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
    position: cssLib.Anon_Content = null,
    stylesheet: StyleRules = null,
    `type`: java.lang.String = null
  ): Stylesheet = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (position != null) __obj.updateDynamic("position")(position)
    if (stylesheet != null) __obj.updateDynamic("stylesheet")(stylesheet)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Stylesheet]
  }
}

