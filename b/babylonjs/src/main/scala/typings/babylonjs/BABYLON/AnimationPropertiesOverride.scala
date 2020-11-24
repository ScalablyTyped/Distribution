package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationPropertiesOverride extends js.Object {
  
  /**
    * Gets or sets the blending speed to use when enableBlending is true
    */
  var blendingSpeed: Double = js.native
  
  /**
    * Gets or sets a value indicating if animation blending must be used
    */
  var enableBlending: Boolean = js.native
  
  /**
    * Gets or sets the default loop mode to use
    */
  var loopMode: Double = js.native
}
object AnimationPropertiesOverride {
  
  @scala.inline
  def apply(blendingSpeed: Double, enableBlending: Boolean, loopMode: Double): AnimationPropertiesOverride = {
    val __obj = js.Dynamic.literal(blendingSpeed = blendingSpeed.asInstanceOf[js.Any], enableBlending = enableBlending.asInstanceOf[js.Any], loopMode = loopMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationPropertiesOverride]
  }
  
  @scala.inline
  implicit class AnimationPropertiesOverrideOps[Self <: AnimationPropertiesOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlendingSpeed(value: Double): Self = this.set("blendingSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableBlending(value: Boolean): Self = this.set("enableBlending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopMode(value: Double): Self = this.set("loopMode", value.asInstanceOf[js.Any])
  }
}
