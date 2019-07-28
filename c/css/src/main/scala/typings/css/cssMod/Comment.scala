package typings.css.cssMod

import typings.css.Anon_Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends Node {
  var comment: js.UndefOr[String] = js.undefined
}

object Comment {
  @scala.inline
  def apply(comment: String = null, parent: Node = null, position: Anon_Content = null, `type`: String = null): Comment = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (position != null) __obj.updateDynamic("position")(position)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Comment]
  }
}

