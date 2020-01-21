package typings.css.mod

import typings.css.AnonContent
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
    position: AnonContent = null,
    `type`: String = null,
    vendor: String = null
  ): KeyFrames = {
    val __obj = js.Dynamic.literal()
    if (keyframes != null) __obj.updateDynamic("keyframes")(keyframes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (vendor != null) __obj.updateDynamic("vendor")(vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyFrames]
  }
}

