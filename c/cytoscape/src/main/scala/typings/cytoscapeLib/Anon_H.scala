package typings
package cytoscapeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_H extends js.Object {
  var h: scala.Double
  var w: scala.Double
  var x1: scala.Double
  var x2: scala.Double
  var y1: scala.Double
  var y2: scala.Double
}

object Anon_H {
  @scala.inline
  def apply(
    h: scala.Double,
    w: scala.Double,
    x1: scala.Double,
    x2: scala.Double,
    y1: scala.Double,
    y2: scala.Double
  ): Anon_H = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("w")(w)
    __obj.updateDynamic("x1")(x1)
    __obj.updateDynamic("x2")(x2)
    __obj.updateDynamic("y1")(y1)
    __obj.updateDynamic("y2")(y2)
    __obj.asInstanceOf[Anon_H]
  }
}

