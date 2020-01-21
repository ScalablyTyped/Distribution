package typings.codemirror

import typings.codemirror.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromToNumber extends js.Object {
  var from: Position | Double
  var to: Position | Double
}

object AnonFromToNumber {
  @scala.inline
  def apply(from: Position | Double, to: Position | Double): AnonFromToNumber = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFromToNumber]
  }
}

