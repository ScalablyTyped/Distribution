package typings
package dcLib.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderDataPointOptions extends js.Object {
  var fillOpacity: scala.Double
  var radius: scala.Double
  var strokeOpacity: scala.Double
}

object RenderDataPointOptions {
  @scala.inline
  def apply(fillOpacity: scala.Double, radius: scala.Double, strokeOpacity: scala.Double): RenderDataPointOptions = {
    val __obj = js.Dynamic.literal(fillOpacity = fillOpacity, radius = radius, strokeOpacity = strokeOpacity)
  
    __obj.asInstanceOf[RenderDataPointOptions]
  }
}

