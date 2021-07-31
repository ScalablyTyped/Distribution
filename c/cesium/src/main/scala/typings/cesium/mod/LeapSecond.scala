package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "LeapSecond")
@js.native
class LeapSecond () extends StObject {
  def this(date: JulianDate) = this()
  def this(date: Unit, offset: Double) = this()
  def this(date: JulianDate, offset: Double) = this()
  
  var julianDate: JulianDate = js.native
  
  var offset: Double = js.native
}
