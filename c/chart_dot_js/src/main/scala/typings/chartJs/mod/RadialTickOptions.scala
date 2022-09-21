package typings.chartJs.mod

import typings.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadialTickOptions
  extends StObject
     with TickOptions {
  
  /**
    * User defined number of ticks
    */
  var count: Double = js.native
  
  /**
    * The Intl.NumberFormat options used by the default label formatter
    */
  var format: NumberFormatOptions = js.native
  
  /**
    * Maximum number of ticks and gridlines to show.
    * @default 11
    */
  var maxTicksLimit: Double = js.native
  
  /**
    * if defined and stepSize is not specified, the step size will be rounded to this many decimal places.
    */
  var precision: Double = js.native
  
  /**
    * User defined fixed step size for the scale.
    */
  var stepSize: Double = js.native
}
