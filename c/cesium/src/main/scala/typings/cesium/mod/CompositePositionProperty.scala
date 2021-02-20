package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CompositePositionProperty")
@js.native
class CompositePositionProperty () extends StObject {
  
  var definitionChanged: Event[js.Array[_]] = js.native
  
  def equals(): Boolean = js.native
  def equals(other: Property): Boolean = js.native
  
  def getValue(time: JulianDate): js.Any = js.native
  def getValue(time: JulianDate, result: js.Any): js.Any = js.native
  
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame): Cartesian3 = js.native
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame, result: Cartesian3): Cartesian3 = js.native
  
  var intervals: TimeIntervalCollection = js.native
  
  var isConstant: Boolean = js.native
  
  var referenceFrame: ReferenceFrame = js.native
}
