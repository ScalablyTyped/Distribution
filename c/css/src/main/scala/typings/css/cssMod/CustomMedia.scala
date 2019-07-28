package typings.css.cssMod

import typings.css.Anon_Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMedia
  extends Node
     with AtRule {
  /** The part following the name. */
  var media: js.UndefOr[String] = js.undefined
  /** The ---prefixed name. */
  var name: js.UndefOr[String] = js.undefined
}

object CustomMedia {
  @scala.inline
  def apply(
    media: String = null,
    name: String = null,
    parent: Node = null,
    position: Anon_Content = null,
    `type`: String = null
  ): CustomMedia = {
    val __obj = js.Dynamic.literal()
    if (media != null) __obj.updateDynamic("media")(media)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (position != null) __obj.updateDynamic("position")(position)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CustomMedia]
  }
}

