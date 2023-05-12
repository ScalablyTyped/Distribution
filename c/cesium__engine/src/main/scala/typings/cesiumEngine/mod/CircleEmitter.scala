package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "CircleEmitter")
@js.native
open class CircleEmitter () extends StObject {
  def this(radius: Double) = this()
  
  /**
    * The angle of the cone in radians.
    */
  var angle: Double = js.native
  
  /**
    * The radius of the circle in meters.
    */
  var radius: Double = js.native
}
