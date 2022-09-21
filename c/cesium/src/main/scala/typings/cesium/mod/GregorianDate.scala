package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "GregorianDate")
@js.native
open class GregorianDate protected () extends StObject {
  def this(
    year: js.UndefOr[Double],
    month: js.UndefOr[Double],
    day: js.UndefOr[Double],
    hour: js.UndefOr[Double],
    minute: js.UndefOr[Double],
    second: js.UndefOr[Double],
    millisecond: js.UndefOr[Double],
    isLeapSecond: js.UndefOr[Boolean]
  ) = this()
  
  /**
    * Gets or sets the day of the month as a whole number starting at 1.
    */
  var day: Double = js.native
  
  /**
    * Gets or sets the hour as a whole number with range [0, 23].
    */
  var hour: Double = js.native
  
  /**
    * Gets or sets whether this time is during a leap second.
    */
  var isLeapSecond: Boolean = js.native
  
  /**
    * Gets or sets the millisecond of the second as a floating point number with range [0.0, 1000.0).
    */
  var millisecond: Double = js.native
  
  /**
    * Gets or sets the minute of the hour as a whole number with range [0, 59].
    */
  var minute: Double = js.native
  
  /**
    * Gets or sets the month as a whole number with range [1, 12].
    */
  var month: Double = js.native
  
  /**
    * Gets or sets the second of the minute as a whole number with range [0, 60], with 60 representing a leap second.
    */
  var second: Double = js.native
  
  /**
    * Gets or sets the year as a whole number.
    */
  var year: Double = js.native
}
