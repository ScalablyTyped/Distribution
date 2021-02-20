package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PositionPropertyArray")
@js.native
class PositionPropertyArray () extends PositionProperty {
  def this(value: js.Array[Property]) = this()
  
  def getValue(time: js.UndefOr[scala.Nothing], result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  def getValue(time: JulianDate, result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  
  def setValue(value: js.Array[Property]): Unit = js.native
}
