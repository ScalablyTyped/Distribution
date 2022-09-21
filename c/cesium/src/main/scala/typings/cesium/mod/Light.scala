package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Light")
@js.native
open class Light () extends StObject {
  
  /**
    * The color of the light.
    */
  var color: Color = js.native
  
  /**
    * The intensity controls the strength of the light. <code>intensity</code> has a minimum value of 0.0 and no maximum value.
    */
  var intensity: Double = js.native
}
