package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Property")
@js.native
abstract class Property () extends js.Object {
  val definitionChanged: Event[js.Array[_]] = js.native
  val isConstant: Boolean = js.native
  def equals(): Boolean = js.native
  def equals(other: Property): Boolean = js.native
  def getValue(): js.Any = js.native
  def getValue(time: JulianDate): js.Any = js.native
  def getValue(time: JulianDate, result: js.Any): js.Any = js.native
}

