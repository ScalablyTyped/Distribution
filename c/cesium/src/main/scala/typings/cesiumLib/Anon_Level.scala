package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Level extends js.Object {
  var level: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Anon_Level {
  @scala.inline
  def apply(level: scala.Double, x: scala.Double, y: scala.Double): Anon_Level = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_Level]
  }
}

