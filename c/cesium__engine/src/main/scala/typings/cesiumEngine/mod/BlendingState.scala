package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlendingState {
  
  /**
    * Blending is enabled using additive blending, <code>source(source.alpha) + destination</code>.
    */
  @JSImport("@cesium/engine", "BlendingState.ADDITIVE_BLEND")
  @js.native
  val ADDITIVE_BLEND: Any = js.native
  
  /**
    * Blending is enabled using alpha blending, <code>source(source.alpha) + destination(1 - source.alpha)</code>.
    */
  @JSImport("@cesium/engine", "BlendingState.ALPHA_BLEND")
  @js.native
  val ALPHA_BLEND: Any = js.native
  
  /**
    * Blending is disabled.
    */
  @JSImport("@cesium/engine", "BlendingState.DISABLED")
  @js.native
  val DISABLED: Any = js.native
  
  /**
    * Blending is enabled using alpha blending with premultiplied alpha, <code>source + destination(1 - source.alpha)</code>.
    */
  @JSImport("@cesium/engine", "BlendingState.PRE_MULTIPLIED_ALPHA_BLEND")
  @js.native
  val PRE_MULTIPLIED_ALPHA_BLEND: Any = js.native
}
