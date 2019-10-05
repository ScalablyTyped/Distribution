package typings.baidumapDashWebDashSdk

import typings.baidumapDashWebDashSdk.BMap.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Points extends js.Object {
  var points: js.Array[Point]
  var status: Double
}

object Anon_Points {
  @scala.inline
  def apply(points: js.Array[Point], status: Double): Anon_Points = {
    val __obj = js.Dynamic.literal(points = points, status = status)
  
    __obj.asInstanceOf[Anon_Points]
  }
}

