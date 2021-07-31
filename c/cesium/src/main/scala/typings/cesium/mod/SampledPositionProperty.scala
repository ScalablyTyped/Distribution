package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "SampledPositionProperty")
@js.native
class SampledPositionProperty () extends SampledProperty {
  def this(referenceFrame: ReferenceFrame) = this()
  def this(referenceFrame: Unit, numberOfDerivatives: Double) = this()
  def this(referenceFrame: ReferenceFrame, numberOfDerivatives: Double) = this()
  
  def addSample(time: JulianDate, position: Cartesian3): Unit = js.native
  def addSample(time: JulianDate, position: Cartesian3, derivatives: js.Array[Cartesian3]): Unit = js.native
  
  var numberOfDerivatives: Boolean = js.native
}
