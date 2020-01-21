package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PositionPropertyArray")
@js.native
class PositionPropertyArray () extends PositionProperty {
  def this(value: js.Array[Property]) = this()
  def getValue(): js.Array[Cartesian3] = js.native
  def getValue(time: JulianDate, result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  def setValue(value: js.Array[Property]): Unit = js.native
}

