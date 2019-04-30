package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndPosition extends js.Object {
  var endPosition: cesiumLib.cesiumMod.Cartesian2
  var startPosition: cesiumLib.cesiumMod.Cartesian2
}

object Anon_EndPosition {
  @scala.inline
  def apply(endPosition: cesiumLib.cesiumMod.Cartesian2, startPosition: cesiumLib.cesiumMod.Cartesian2): Anon_EndPosition = {
    val __obj = js.Dynamic.literal(endPosition = endPosition, startPosition = startPosition)
  
    __obj.asInstanceOf[Anon_EndPosition]
  }
}

