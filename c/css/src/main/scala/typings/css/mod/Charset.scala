package typings.css.mod

import typings.css.AnonContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Charset
  extends Node
     with AtRule {
  /** The part following @charset. */
  var charset: js.UndefOr[String] = js.undefined
}

object Charset {
  @scala.inline
  def apply(charset: String = null, parent: Node = null, position: AnonContent = null, `type`: String = null): Charset = {
    val __obj = js.Dynamic.literal()
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Charset]
  }
}

