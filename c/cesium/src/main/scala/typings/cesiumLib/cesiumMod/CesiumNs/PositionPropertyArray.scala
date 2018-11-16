package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PositionPropertyArray extends PositionProperty {
  def getValue(): js.Array[Cartesian3] = js.native
  def getValue(time: JulianDate, result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  def setValue(value: js.Array[Property]): scala.Unit = js.native
}

