package typings
package codemirrorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnchorHead extends js.Object {
  var anchor: codemirrorLib.codemirrorMod.CodeMirrorNs.Position
  var head: codemirrorLib.codemirrorMod.CodeMirrorNs.Position
}

object Anon_AnchorHead {
  @scala.inline
  def apply(
    anchor: codemirrorLib.codemirrorMod.CodeMirrorNs.Position,
    head: codemirrorLib.codemirrorMod.CodeMirrorNs.Position
  ): Anon_AnchorHead = {
    val __obj = js.Dynamic.literal(anchor = anchor, head = head)
  
    __obj.asInstanceOf[Anon_AnchorHead]
  }
}

