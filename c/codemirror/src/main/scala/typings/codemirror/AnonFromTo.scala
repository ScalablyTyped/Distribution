package typings.codemirror

import typings.codemirror.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromTo extends js.Object {
  var from: Position | Double
  var to: Position | Double
}

object AnonFromTo {
  @scala.inline
  def apply(from: Position | Double, to: Position | Double): AnonFromTo = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFromTo]
  }
}

