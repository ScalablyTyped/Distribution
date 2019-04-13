package typings
package codemirrorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From extends js.Object {
  var from: codemirrorLib.codemirrorMod.Position
  var to: codemirrorLib.codemirrorMod.Position
}

object Anon_From {
  @scala.inline
  def apply(from: codemirrorLib.codemirrorMod.Position, to: codemirrorLib.codemirrorMod.Position): Anon_From = {
    val __obj = js.Dynamic.literal(from = from, to = to)
  
    __obj.asInstanceOf[Anon_From]
  }
}

