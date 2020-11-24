package typings.babylonjs.thinEngineMod

import typings.std.WebGLContextAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EngineOptions extends WebGLContextAttributes {
  
  /**
    * Defines if webaudio should be initialized as well
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music
    */
  var audioEngine: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines if webvr should be enabled automatically
    * @see https://doc.babylonjs.com/how_to/webvr_camera
    */
  var autoEnableWebVR: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines if animations should run using a deterministic lock step
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  var deterministicLockstep: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines if webgl2 should be turned off even if supported
    * @see https://doc.babylonjs.com/features/webgl2
    */
  var disableWebGL2Support: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines that engine should ignore context lost events
    * If this event happens when this parameter is true, you will have to reload the page to restore rendering
    */
  var doNotHandleContextLost: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines that engine should ignore modifying touch action attribute and style
    * If not handle, you might need to set it up on your side for expected touch devices behavior.
    */
  var doNotHandleTouchAction: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines if the engine should no exceed a specified device ratio
    * @see https://developer.mozilla.org/en-US/docs/Web/API/Window/devicePixelRatio
    */
  var limitDeviceRatio: js.UndefOr[Double] = js.native
  
  /** Defines the maximum steps to use with deterministic lock step mode */
  var lockstepMaxSteps: js.UndefOr[Double] = js.native
  
  /** Defines the seconds between each deterministic lock step */
  var timeStep: js.UndefOr[Double] = js.native
  
  /**
    * Defines that engine should compile shaders with high precision floats (if supported). True by default
    */
  var useHighPrecisionFloats: js.UndefOr[Boolean] = js.native
  
  /**
    * Make the matrix computations to be performed in 64 bits instead of 32 bits. False by default
    */
  var useHighPrecisionMatrix: js.UndefOr[Boolean] = js.native
  
  /**
    * Make the canvas XR Compatible for XR sessions
    */
  var xrCompatible: js.UndefOr[Boolean] = js.native
}
object EngineOptions {
  
  @scala.inline
  def apply(): EngineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EngineOptions]
  }
  
  @scala.inline
  implicit class EngineOptionsOps[Self <: EngineOptions] (val x: Self) extends AnyVal {
    
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
    def setAudioEngine(value: Boolean): Self = this.set("audioEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioEngine: Self = this.set("audioEngine", js.undefined)
    
    @scala.inline
    def setAutoEnableWebVR(value: Boolean): Self = this.set("autoEnableWebVR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoEnableWebVR: Self = this.set("autoEnableWebVR", js.undefined)
    
    @scala.inline
    def setDeterministicLockstep(value: Boolean): Self = this.set("deterministicLockstep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeterministicLockstep: Self = this.set("deterministicLockstep", js.undefined)
    
    @scala.inline
    def setDisableWebGL2Support(value: Boolean): Self = this.set("disableWebGL2Support", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableWebGL2Support: Self = this.set("disableWebGL2Support", js.undefined)
    
    @scala.inline
    def setDoNotHandleContextLost(value: Boolean): Self = this.set("doNotHandleContextLost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoNotHandleContextLost: Self = this.set("doNotHandleContextLost", js.undefined)
    
    @scala.inline
    def setDoNotHandleTouchAction(value: Boolean): Self = this.set("doNotHandleTouchAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoNotHandleTouchAction: Self = this.set("doNotHandleTouchAction", js.undefined)
    
    @scala.inline
    def setLimitDeviceRatio(value: Double): Self = this.set("limitDeviceRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitDeviceRatio: Self = this.set("limitDeviceRatio", js.undefined)
    
    @scala.inline
    def setLockstepMaxSteps(value: Double): Self = this.set("lockstepMaxSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockstepMaxSteps: Self = this.set("lockstepMaxSteps", js.undefined)
    
    @scala.inline
    def setTimeStep(value: Double): Self = this.set("timeStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeStep: Self = this.set("timeStep", js.undefined)
    
    @scala.inline
    def setUseHighPrecisionFloats(value: Boolean): Self = this.set("useHighPrecisionFloats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHighPrecisionFloats: Self = this.set("useHighPrecisionFloats", js.undefined)
    
    @scala.inline
    def setUseHighPrecisionMatrix(value: Boolean): Self = this.set("useHighPrecisionMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHighPrecisionMatrix: Self = this.set("useHighPrecisionMatrix", js.undefined)
    
    @scala.inline
    def setXrCompatible(value: Boolean): Self = this.set("xrCompatible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXrCompatible: Self = this.set("xrCompatible", js.undefined)
  }
}
