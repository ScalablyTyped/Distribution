package typings.d3DashInterpolateDashPath.d3DashInterpolateDashPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathCommandObject extends js.Object {
  var `type`: String
  var x: Double
  var y: Double
}

object PathCommandObject {
  @scala.inline
  def apply(`type`: String, x: Double, y: Double): PathCommandObject = {
    val __obj = js.Dynamic.literal(x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PathCommandObject]
  }
}

