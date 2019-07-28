package typings.dc.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderDataPointOptions extends js.Object {
  var fillOpacity: Double
  var radius: Double
  var strokeOpacity: Double
}

object RenderDataPointOptions {
  @scala.inline
  def apply(fillOpacity: Double, radius: Double, strokeOpacity: Double): RenderDataPointOptions = {
    val __obj = js.Dynamic.literal(fillOpacity = fillOpacity, radius = radius, strokeOpacity = strokeOpacity)
  
    __obj.asInstanceOf[RenderDataPointOptions]
  }
}

