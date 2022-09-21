package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Fog")
@js.native
open class Fog () extends StObject {
  
  /**
    * A scalar that determines the density of the fog. Terrain that is in full fog are culled.
    * The density of the fog increases as this number approaches 1.0 and becomes less dense as it approaches zero.
    * The more dense the fog is, the more aggressively the terrain is culled. For example, if the camera is a height of
    * 1000.0m above the ellipsoid, increasing the value to 3.0e-3 will cause many tiles close to the viewer be culled.
    * Decreasing the value will push the fog further from the viewer, but decrease performance as more of the terrain is rendered.
    */
  var density: Double = js.native
  
  /**
    * <code>true</code> if fog is enabled, <code>false</code> otherwise.
    */
  var enabled: Boolean = js.native
  
  /**
    * The minimum brightness of the fog color from lighting. A value of 0.0 can cause the fog to be completely black. A value of 1.0 will not affect
    * the brightness at all.
    */
  var minimumBrightness: Double = js.native
  
  /**
    * <code>true</code> if fog is renderable in shaders, <code>false</code> otherwise.
    * This allows to benefits from optimized tile loading strategy based on fog density without the actual visual rendering.
    */
  var renderable: Boolean = js.native
  
  /**
    * A factor used to increase the screen space error of terrain tiles when they are partially in fog. The effect is to reduce
    * the number of terrain tiles requested for rendering. If set to zero, the feature will be disabled. If the value is increased
    * for mountainous regions, less tiles will need to be requested, but the terrain meshes near the horizon may be a noticeably
    * lower resolution. If the value is increased in a relatively flat area, there will be little noticeable change on the horizon.
    */
  var screenSpaceErrorFactor: Double = js.native
}
