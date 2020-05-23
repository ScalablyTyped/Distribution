package typings.codemirror.anon

import typings.codemirror.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromTo extends js.Object {
  var from: Position | Double
  var to: Position | Double
}

object FromTo {
  @scala.inline
  def apply(from: Position | Double, to: Position | Double): FromTo = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromTo]
  }
}

