package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CompositePositionProperty")
@js.native
class CompositePositionProperty () extends js.Object {
  var definitionChanged: Event[js.Array[_]] = js.native
  var intervals: TimeIntervalCollection = js.native
  var isConstant: scala.Boolean = js.native
  var referenceFrame: ReferenceFrame = js.native
  def equals(): scala.Boolean = js.native
  def equals(other: Property): scala.Boolean = js.native
  def getValue(time: JulianDate): js.Any = js.native
  def getValue(time: JulianDate, result: js.Any): js.Any = js.native
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame): Cartesian3 = js.native
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame, result: Cartesian3): Cartesian3 = js.native
}

