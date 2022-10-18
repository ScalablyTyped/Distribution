package typings.cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneBlendingStateMod {
  
  object default {
    
    /**
      * Blending is enabled using additive blending, <code>source(source.alpha) + destination</code>.
      */
    @JSImport("cesium/Source/Scene/BlendingState", "default.ADDITIVE_BLEND")
    @js.native
    val ADDITIVE_BLEND: Any = js.native
    
    /**
      * Blending is enabled using alpha blending, <code>source(source.alpha) + destination(1 - source.alpha)</code>.
      */
    @JSImport("cesium/Source/Scene/BlendingState", "default.ALPHA_BLEND")
    @js.native
    val ALPHA_BLEND: Any = js.native
    
    /**
      * Blending is disabled.
      */
    @JSImport("cesium/Source/Scene/BlendingState", "default.DISABLED")
    @js.native
    val DISABLED: Any = js.native
    
    /**
      * Blending is enabled using alpha blending with premultiplied alpha, <code>source + destination(1 - source.alpha)</code>.
      */
    @JSImport("cesium/Source/Scene/BlendingState", "default.PRE_MULTIPLIED_ALPHA_BLEND")
    @js.native
    val PRE_MULTIPLIED_ALPHA_BLEND: Any = js.native
  }
}
