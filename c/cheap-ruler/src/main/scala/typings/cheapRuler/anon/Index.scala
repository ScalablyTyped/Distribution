package typings.cheapRuler.anon

import typings.cheapRuler.mod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var index: Double
  var point: Point
  var t: Double
}

object Index {
  @scala.inline
  def apply(index: Double, point: Point, t: Double): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

