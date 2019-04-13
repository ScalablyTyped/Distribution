package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ReferenceProperty")
@js.native
class ReferenceProperty protected () extends Property {
  def this(targetCollection: EntityCollection, targetId: java.lang.String, targetPropertyNames: java.lang.String) = this()
  val referenceFrame: ReferenceFrame = js.native
  val resolvedProperty: Property = js.native
  val targetCollection: EntityCollection = js.native
  val targetId: java.lang.String = js.native
  val targetPropertyNames: js.Array[java.lang.String] = js.native
  def getType(time: JulianDate): java.lang.String = js.native
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame): Cartesian3 = js.native
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame, result: Cartesian3): Cartesian3 = js.native
}

/* static members */
@JSImport("cesium", "ReferenceProperty")
@js.native
object ReferenceProperty extends js.Object {
  def fromString(targetCollection: cesiumLib.cesiumMod.Entity, referenceString: java.lang.String): cesiumLib.cesiumMod.ReferenceProperty = js.native
}

