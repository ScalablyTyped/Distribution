package typings
package d3DashInterpolateDashPathLib.d3DashInterpolateDashPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathCommandObject extends js.Object {
  var `type`: java.lang.String
  var x: scala.Double
  var y: scala.Double
}

object PathCommandObject {
  @scala.inline
  def apply(`type`: java.lang.String, x: scala.Double, y: scala.Double): PathCommandObject = {
    val __obj = js.Dynamic.literal(x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PathCommandObject]
  }
}

