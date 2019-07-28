package typings.css.cssMod

import typings.css.Anon_Content
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
    position: Anon_Content = null,
    rules: js.Array[Rule | Comment | AtRule] = null,
    `type`: String = null
  ): Media = {
    val __obj = js.Dynamic.literal()
    if (media != null) __obj.updateDynamic("media")(media)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (position != null) __obj.updateDynamic("position")(position)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Media]
  }
}

