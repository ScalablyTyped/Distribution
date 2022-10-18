package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ShadowMap")
@js.native
open class ShadowMap () extends StObject {
  
  /**
    * Determines the darkness of the shadows.
    */
  var darkness: Double = js.native
  
  /**
    * Determines if the shadow map will be shown.
    */
  var enabled: Boolean = js.native
  
  /**
    * Determines whether shadows start to fade out once the light gets closer to the horizon.
    */
  var fadingEnabled: Boolean = js.native
  
  /**
    * Determines the maximum distance of the shadow map. Only applicable for cascaded shadows. Larger distances may result in lower quality shadows.
    */
  var maximumDistance: Double = js.native
  
  /**
    * Determines if a normal bias will be applied to shadows.
    */
  var normalOffset: Boolean = js.native
  
  /**
    * The width and height, in pixels, of each shadow map.
    */
  var size: Double = js.native
  
  /**
    * Determines if soft shadows are enabled. Uses pcf filtering which requires more texture reads and may hurt performance.
    */
  var softShadows: Boolean = js.native
}
