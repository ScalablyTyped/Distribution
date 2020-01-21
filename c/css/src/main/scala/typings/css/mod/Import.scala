package typings.css.mod

import typings.css.AnonContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Import
  extends Node
     with AtRule {
  /** The part following @import. */
  var `import`: js.UndefOr[String] = js.undefined
}

object Import {
  @scala.inline
  def apply(`import`: String = null, parent: Node = null, position: AnonContent = null, `type`: String = null): Import = {
    val __obj = js.Dynamic.literal()
    if (`import` != null) __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Import]
  }
}

