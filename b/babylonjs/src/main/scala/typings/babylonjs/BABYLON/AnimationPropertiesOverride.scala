package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationPropertiesOverride extends StObject {
  
  /**
    * Gets or sets the blending speed to use when enableBlending is true
    */
  var blendingSpeed: Double
  
  /**
    * Gets or sets a value indicating if animation blending must be used
    */
  var enableBlending: Boolean
  
  /**
    * Gets or sets the default loop mode to use
    */
  var loopMode: Double
}
object AnimationPropertiesOverride {
  
  inline def apply(blendingSpeed: Double, enableBlending: Boolean, loopMode: Double): AnimationPropertiesOverride = {
    val __obj = js.Dynamic.literal(blendingSpeed = blendingSpeed.asInstanceOf[js.Any], enableBlending = enableBlending.asInstanceOf[js.Any], loopMode = loopMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationPropertiesOverride]
  }
  
  extension [Self <: AnimationPropertiesOverride](x: Self) {
    
    inline def setBlendingSpeed(value: Double): Self = StObject.set(x, "blendingSpeed", value.asInstanceOf[js.Any])
    
    inline def setEnableBlending(value: Boolean): Self = StObject.set(x, "enableBlending", value.asInstanceOf[js.Any])
    
    inline def setLoopMode(value: Double): Self = StObject.set(x, "loopMode", value.asInstanceOf[js.Any])
  }
}
