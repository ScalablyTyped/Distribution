package typings.cesium

import typings.cesium.cesiumMod.Cartesian2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndPosition extends js.Object {
  var endPosition: Cartesian2
  var startPosition: Cartesian2
}

object Anon_EndPosition {
  @scala.inline
  def apply(endPosition: Cartesian2, startPosition: Cartesian2): Anon_EndPosition = {
    val __obj = js.Dynamic.literal(endPosition = endPosition, startPosition = startPosition)
  
    __obj.asInstanceOf[Anon_EndPosition]
  }
}

