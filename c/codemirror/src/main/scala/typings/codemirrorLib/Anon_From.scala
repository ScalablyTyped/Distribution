package typings
package codemirrorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From extends js.Object {
  var from: codemirrorLib.codemirrorMod.CodeMirrorNs.Position
  var to: codemirrorLib.codemirrorMod.CodeMirrorNs.Position
}

object Anon_From {
  @scala.inline
  def apply(
    from: codemirrorLib.codemirrorMod.CodeMirrorNs.Position,
    to: codemirrorLib.codemirrorMod.CodeMirrorNs.Position
  ): Anon_From = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Anon_From]
  }
}

