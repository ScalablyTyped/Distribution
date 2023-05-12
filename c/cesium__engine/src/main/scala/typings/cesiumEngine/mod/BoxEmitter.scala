package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "BoxEmitter")
@js.native
open class BoxEmitter protected () extends StObject {
  def this(dimensions: Cartesian3) = this()
  
  /**
    * The width, height and depth dimensions of the box in meters.
    */
  var dimensions: Cartesian3 = js.native
}
