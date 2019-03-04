package typings
package codemirrorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromToNumber extends js.Object {
  var from: codemirrorLib.codemirrorMod.CodeMirrorNs.Position | scala.Double
  var to: codemirrorLib.codemirrorMod.CodeMirrorNs.Position | scala.Double
}

object Anon_FromToNumber {
  @scala.inline
  def apply(
    from: codemirrorLib.codemirrorMod.CodeMirrorNs.Position | scala.Double,
    to: codemirrorLib.codemirrorMod.CodeMirrorNs.Position | scala.Double
  ): Anon_FromToNumber = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FromToNumber]
  }
}

