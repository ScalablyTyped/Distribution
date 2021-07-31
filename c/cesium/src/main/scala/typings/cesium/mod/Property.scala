package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Property")
@js.native
abstract class Property () extends StObject {
  
  val definitionChanged: Event[js.Array[js.Any]] = js.native
  
  def equals(): Boolean = js.native
  def equals(other: Property): Boolean = js.native
  
  def getValue(): js.Any = js.native
  def getValue(time: Unit, result: js.Any): js.Any = js.native
  def getValue(time: JulianDate): js.Any = js.native
  def getValue(time: JulianDate, result: js.Any): js.Any = js.native
  
  val isConstant: Boolean = js.native
}
