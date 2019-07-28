package typings.codemirror

import typings.codemirror.codemirrorMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromToNumber extends js.Object {
  var from: Position | Double
  var to: Position | Double
}

object Anon_FromToNumber {
  @scala.inline
  def apply(from: Position | Double, to: Position | Double): Anon_FromToNumber = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FromToNumber]
  }
}

