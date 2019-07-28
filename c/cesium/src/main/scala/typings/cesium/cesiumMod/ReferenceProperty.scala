package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ReferenceProperty")
@js.native
class ReferenceProperty protected () extends Property {
  def this(targetCollection: EntityCollection, targetId: String, targetPropertyNames: String) = this()
  val referenceFrame: ReferenceFrame = js.native
  val resolvedProperty: Property = js.native
  val targetCollection: EntityCollection = js.native
  val targetId: String = js.native
  val targetPropertyNames: js.Array[String] = js.native
  def getType(time: JulianDate): String = js.native
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame): Cartesian3 = js.native
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame, result: Cartesian3): Cartesian3 = js.native
}

/* static members */
@JSImport("cesium", "ReferenceProperty")
@js.native
object ReferenceProperty extends js.Object {
  def fromString(targetCollection: Entity, referenceString: String): ReferenceProperty = js.native
}

