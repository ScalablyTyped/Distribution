package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceProperty extends Property {
  val referenceFrame: ReferenceFrame = js.native
  val resolvedProperty: Property = js.native
  val targetCollection: EntityCollection = js.native
  val targetId: java.lang.String = js.native
  val targetPropertyNames: js.Array[java.lang.String] = js.native
  def getType(time: JulianDate): java.lang.String = js.native
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame): Cartesian3 = js.native
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame, result: Cartesian3): Cartesian3 = js.native
}

