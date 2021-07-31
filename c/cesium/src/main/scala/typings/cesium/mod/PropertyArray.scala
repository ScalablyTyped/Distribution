package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PropertyArray")
@js.native
class PropertyArray () extends Property {
  def this(value: js.Array[Property]) = this()
  
  def getValue(time: Unit, result: js.Array[js.Any]): js.Array[js.Any] = js.native
  def getValue(time: JulianDate, result: js.Array[js.Any]): js.Array[js.Any] = js.native
  
  def setValue(value: js.Array[Property]): Unit = js.native
}
