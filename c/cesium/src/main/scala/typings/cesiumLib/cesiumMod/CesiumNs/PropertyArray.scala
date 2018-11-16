package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyArray extends Property {
  def getValue(): js.Array[_] = js.native
  def getValue(time: JulianDate, result: js.Array[_]): js.Array[_] = js.native
  def setValue(value: js.Array[Property]): scala.Unit = js.native
}

