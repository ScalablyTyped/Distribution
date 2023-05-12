package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "Interval")
@js.native
open class Interval () extends StObject {
  def this(start: Double) = this()
  def this(start: Double, stop: Double) = this()
  def this(start: Unit, stop: Double) = this()
  
  /**
    * The beginning of the interval.
    */
  var start: Double = js.native
  
  /**
    * The end of the interval.
    */
  var stop: Double = js.native
}
