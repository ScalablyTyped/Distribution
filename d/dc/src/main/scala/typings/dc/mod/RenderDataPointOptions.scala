package typings.dc.mod

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
    val __obj = js.Dynamic.literal(fillOpacity = fillOpacity.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenderDataPointOptions]
  }
}

