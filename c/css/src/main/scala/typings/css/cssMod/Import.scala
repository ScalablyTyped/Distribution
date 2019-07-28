package typings.css.cssMod

import typings.css.Anon_Content
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
  def apply(`import`: String = null, parent: Node = null, position: Anon_Content = null, `type`: String = null): Import = {
    val __obj = js.Dynamic.literal()
    if (`import` != null) __obj.updateDynamic("import")(`import`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (position != null) __obj.updateDynamic("position")(position)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Import]
  }
}

