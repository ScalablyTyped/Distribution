package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "DirectionalLight")
@js.native
open class DirectionalLight protected () extends StObject {
  def this(options: typings.cesium.anon.Color) = this()
  
  /**
    * The color of the light.
    */
  var color: Color = js.native
  
  /**
    * The direction in which light gets emitted.
    */
  var direction: Cartesian3 = js.native
  
  /**
    * The intensity of the light.
    */
  var intensity: Double = js.native
}
