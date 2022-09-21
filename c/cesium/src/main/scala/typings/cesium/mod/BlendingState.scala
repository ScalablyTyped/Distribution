package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlendingState {
  
  /**
    * Blending is enabled using additive blending, <code>source(source.alpha) + destination</code>.
    */
  @JSImport("cesium", "BlendingState.ADDITIVE_BLEND")
  @js.native
  val ADDITIVE_BLEND: Any = js.native
  
  /**
    * Blending is enabled using alpha blending, <code>source(source.alpha) + destination(1 - source.alpha)</code>.
    */
  @JSImport("cesium", "BlendingState.ALPHA_BLEND")
  @js.native
  val ALPHA_BLEND: Any = js.native
  
  /**
    * Blending is disabled.
    */
  @JSImport("cesium", "BlendingState.DISABLED")
  @js.native
  val DISABLED: Any = js.native
  
  /**
    * Blending is enabled using alpha blending with premultiplied alpha, <code>source + destination(1 - source.alpha)</code>.
    */
  @JSImport("cesium", "BlendingState.PRE_MULTIPLIED_ALPHA_BLEND")
  @js.native
  val PRE_MULTIPLIED_ALPHA_BLEND: Any = js.native
}
