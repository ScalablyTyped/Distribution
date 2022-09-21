package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "LeapSecond")
@js.native
open class LeapSecond () extends StObject {
  def this(date: JulianDate) = this()
  def this(date: Unit, offset: Double) = this()
  def this(date: JulianDate, offset: Double) = this()
  
  /**
    * Gets or sets the date at which this leap second occurs.
    */
  var julianDate: JulianDate = js.native
  
  /**
    * Gets or sets the cumulative number of seconds between the UTC and TAI time standards at the time
    * of this leap second.
    */
  var offset: Double = js.native
}
