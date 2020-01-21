package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PropertyArray")
@js.native
class PropertyArray () extends Property {
  def this(value: js.Array[Property]) = this()
  def getValue(): js.Array[_] = js.native
  def getValue(time: JulianDate, result: js.Array[_]): js.Array[_] = js.native
  def setValue(value: js.Array[Property]): Unit = js.native
}

