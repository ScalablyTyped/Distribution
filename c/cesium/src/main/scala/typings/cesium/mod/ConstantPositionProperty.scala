package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ConstantPositionProperty")
@js.native
class ConstantPositionProperty () extends js.Object {
  def this(value: Cartesian3) = this()
  def this(value: js.UndefOr[scala.Nothing], referenceFrame: ReferenceFrame) = this()
  def this(value: Cartesian3, referenceFrame: ReferenceFrame) = this()
  
  var definitionChanged: Event[js.Array[_]] = js.native
  
  def equals(): Boolean = js.native
  def equals(other: Property): Boolean = js.native
  
  def getValue(time: JulianDate): js.Any = js.native
  def getValue(time: JulianDate, result: js.Any): js.Any = js.native
  
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame): Cartesian3 = js.native
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame, result: Cartesian3): Cartesian3 = js.native
  
  var isConstant: Boolean = js.native
  
  var referenceFrame: ReferenceFrame = js.native
  
  def setValue(value: Cartesian3): Unit = js.native
  def setValue(value: Cartesian3, referenceFrame: ReferenceFrame): Unit = js.native
}
