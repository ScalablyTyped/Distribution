package typings
package codemirrorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Anchor extends js.Object {
  var anchor: codemirrorLib.codemirrorMod.CodeMirrorNs.Position
  var head: codemirrorLib.codemirrorMod.CodeMirrorNs.Position
}

object Anon_Anchor {
  @scala.inline
  def apply(
    anchor: codemirrorLib.codemirrorMod.CodeMirrorNs.Position,
    head: codemirrorLib.codemirrorMod.CodeMirrorNs.Position
  ): Anon_Anchor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("anchor")(anchor)
    __obj.updateDynamic("head")(head)
    __obj.asInstanceOf[Anon_Anchor]
  }
}

