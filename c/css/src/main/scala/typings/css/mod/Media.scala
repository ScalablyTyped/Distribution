package typings.css.mod

import typings.css.anon.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Media
  extends Node
     with AtRule {
  /** The part following @media. */
  var media: js.UndefOr[String] = js.undefined
  /** Array of nodes with the types rule, comment and any of the at-rule types. */
  var rules: js.UndefOr[js.Array[Rule | Comment | AtRule]] = js.undefined
}

object Media {
  @scala.inline
  def apply(
    media: String = null,
    parent: Node = null,
    position: Content = null,
    rules: js.Array[Rule | Comment | AtRule] = null,
    `type`: String = null
  ): Media = {
    val __obj = js.Dynamic.literal()
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Media]
  }
}

