package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("codemirror", "normalizeKeyMap")
@js.native
object normalizeKeyMap extends js.Object {
  /** Modify a keymap to normalize modifier order and properly recognize multi-stroke bindings. */
  def apply(km: KeyMap): KeyMap = js.native
}

