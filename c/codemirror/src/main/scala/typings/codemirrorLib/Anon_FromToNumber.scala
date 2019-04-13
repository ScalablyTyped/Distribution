package typings
package codemirrorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromToNumber extends js.Object {
  var from: codemirrorLib.codemirrorMod.Position | scala.Double
  var to: codemirrorLib.codemirrorMod.Position | scala.Double
}

object Anon_FromToNumber {
  @scala.inline
  def apply(
    from: codemirrorLib.codemirrorMod.Position | scala.Double,
    to: codemirrorLib.codemirrorMod.Position | scala.Double
  ): Anon_FromToNumber = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FromToNumber]
  }
}

