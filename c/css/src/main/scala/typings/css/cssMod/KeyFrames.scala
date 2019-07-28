package typings.css.cssMod

import typings.css.Anon_Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyFrames
  extends Node
     with AtRule {
  /** Array of nodes with the types keyframe and comment. */
  var keyframes: js.UndefOr[js.Array[KeyFrame | Comment]] = js.undefined
  /** The name of the keyframes rule. */
  var name: js.UndefOr[String] = js.undefined
  /** The vendor prefix in @keyframes, or undefined if there is none. */
  var vendor: js.UndefOr[String] = js.undefined
}

object KeyFrames {
  @scala.inline
  def apply(
    keyframes: js.Array[KeyFrame | Comment] = null,
    name: String = null,
    parent: Node = null,
    position: Anon_Content = null,
    `type`: String = null,
    vendor: String = null
  ): KeyFrames = {
    val __obj = js.Dynamic.literal()
    if (keyframes != null) __obj.updateDynamic("keyframes")(keyframes)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (position != null) __obj.updateDynamic("position")(position)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (vendor != null) __obj.updateDynamic("vendor")(vendor)
    __obj.asInstanceOf[KeyFrames]
  }
}

