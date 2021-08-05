package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ReferenceProperty")
@js.native
class ReferenceProperty protected () extends Property {
  def this(targetCollection: EntityCollection, targetId: String, targetPropertyNames: String) = this()
  
  def getType(time: JulianDate): String = js.native
  
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame): Cartesian3 = js.native
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame, result: Cartesian3): Cartesian3 = js.native
  
  val referenceFrame: ReferenceFrame = js.native
  
  val resolvedProperty: Property = js.native
  
  val targetCollection: EntityCollection = js.native
  
  val targetId: String = js.native
  
  val targetPropertyNames: js.Array[String] = js.native
}
object ReferenceProperty {
  
  @JSImport("cesium", "ReferenceProperty")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromString(targetCollection: Entity, referenceString: String): ReferenceProperty = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(targetCollection.asInstanceOf[js.Any], referenceString.asInstanceOf[js.Any])).asInstanceOf[ReferenceProperty]
}
