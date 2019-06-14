package typings
package baidumapDashWebDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Points extends js.Object {
  var points: js.Array[baidumapDashWebDashSdkLib.BMapNs.Point]
  var status: scala.Double
}

object Anon_Points {
  @scala.inline
  def apply(points: js.Array[baidumapDashWebDashSdkLib.BMapNs.Point], status: scala.Double): Anon_Points = {
    val __obj = js.Dynamic.literal(points = points, status = status)
  
    __obj.asInstanceOf[Anon_Points]
  }
}

