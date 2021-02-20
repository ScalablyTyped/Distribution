package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneInstrumentation extends IDisposable {
  
  var _activeMeshesEvaluationTime: js.Any = js.native
  
  var _animationsTime: js.Any = js.native
  
  var _cameraRenderTime: js.Any = js.native
  
  var _captureActiveMeshesEvaluationTime: js.Any = js.native
  
  var _captureAnimationsTime: js.Any = js.native
  
  var _captureCameraRenderTime: js.Any = js.native
  
  var _captureFrameTime: js.Any = js.native
  
  var _captureInterFrameTime: js.Any = js.native
  
  var _captureParticlesRenderTime: js.Any = js.native
  
  var _capturePhysicsTime: js.Any = js.native
  
  var _captureRenderTargetsRenderTime: js.Any = js.native
  
  var _captureRenderTime: js.Any = js.native
  
  var _captureSpritesRenderTime: js.Any = js.native
  
  var _frameTime: js.Any = js.native
  
  var _interFrameTime: js.Any = js.native
  
  var _onAfterActiveMeshesEvaluationObserver: js.Any = js.native
  
  var _onAfterAnimationsObserver: js.Any = js.native
  
  var _onAfterCameraRenderObserver: js.Any = js.native
  
  var _onAfterDrawPhaseObserver: js.Any = js.native
  
  var _onAfterParticlesRenderingObserver: js.Any = js.native
  
  var _onAfterPhysicsObserver: js.Any = js.native
  
  var _onAfterRenderObserver: js.Any = js.native
  
  var _onAfterRenderTargetsRenderObserver: js.Any = js.native
  
  var _onAfterSpritesRenderingObserver: js.Any = js.native
  
  var _onBeforeActiveMeshesEvaluationObserver: js.Any = js.native
  
  var _onBeforeAnimationsObserver: js.Any = js.native
  
  var _onBeforeCameraRenderObserver: js.Any = js.native
  
  var _onBeforeDrawPhaseObserver: js.Any = js.native
  
  var _onBeforeParticlesRenderingObserver: js.Any = js.native
  
  var _onBeforePhysicsObserver: js.Any = js.native
  
  var _onBeforeRenderTargetsRenderObserver: js.Any = js.native
  
  var _onBeforeSpritesRenderingObserver: js.Any = js.native
  
  var _particlesRenderTime: js.Any = js.native
  
  var _physicsTime: js.Any = js.native
  
  var _renderTargetsRenderTime: js.Any = js.native
  
  var _renderTime: js.Any = js.native
  
  var _spritesRenderTime: js.Any = js.native
  
  /**
    * Gets the perf counter used for active meshes evaluation time
    */
  def activeMeshesEvaluationTimeCounter: PerfCounter = js.native
  
  /**
    * Gets the perf counter used for animations time
    */
  def animationsTimeCounter: PerfCounter = js.native
  
  /**
    * Gets the perf counter used for camera render time capture
    */
  def cameraRenderTimeCounter: PerfCounter = js.native
  
  /**
    * Gets the active meshes evaluation time capture status
    */
  def captureActiveMeshesEvaluationTime: Boolean = js.native
  /**
    * Enable or disable the active meshes evaluation time capture
    */
  def captureActiveMeshesEvaluationTime_=(value: Boolean): Unit = js.native
  
  /**
    * Gets the animations time capture status
    */
  def captureAnimationsTime: Boolean = js.native
  /**
    * Enable or disable the animations time capture
    */
  def captureAnimationsTime_=(value: Boolean): Unit = js.native
  
  /**
    * Gets the camera render time capture status
    */
  def captureCameraRenderTime: Boolean = js.native
  /**
    * Enable or disable the camera render time capture
    */
  def captureCameraRenderTime_=(value: Boolean): Unit = js.native
  
  /**
    * Gets the frame time capture status
    */
  def captureFrameTime: Boolean = js.native
  /**
    * Enable or disable the frame time capture
    */
  def captureFrameTime_=(value: Boolean): Unit = js.native
  
  /**
    * Gets the inter-frames time capture status
    */
  def captureInterFrameTime: Boolean = js.native
  /**
    * Enable or disable the inter-frames time capture
    */
  def captureInterFrameTime_=(value: Boolean): Unit = js.native
  
  /**
    * Gets the particles render time capture status
    */
  def captureParticlesRenderTime: Boolean = js.native
  /**
    * Enable or disable the particles render time capture
    */
  def captureParticlesRenderTime_=(value: Boolean): Unit = js.native
  
  /**
    * Gets the physics time capture status
    */
  def capturePhysicsTime: Boolean = js.native
  /**
    * Enable or disable the physics time capture
    */
  def capturePhysicsTime_=(value: Boolean): Unit = js.native
  
  /**
    * Gets the render targets render time capture status
    */
  def captureRenderTargetsRenderTime: Boolean = js.native
  /**
    * Enable or disable the render targets render time capture
    */
  def captureRenderTargetsRenderTime_=(value: Boolean): Unit = js.native
  
  /**
    * Gets the render time capture status
    */
  def captureRenderTime: Boolean = js.native
  /**
    * Enable or disable the render time capture
    */
  def captureRenderTime_=(value: Boolean): Unit = js.native
  
  /**
    * Gets the sprites render time capture status
    */
  def captureSpritesRenderTime: Boolean = js.native
  /**
    * Enable or disable the sprites render time capture
    */
  def captureSpritesRenderTime_=(value: Boolean): Unit = js.native
  
  /**
    * Gets the perf counter used for draw calls
    */
  def drawCallsCounter: PerfCounter = js.native
  
  /**
    * Gets the perf counter used for frame time capture
    */
  def frameTimeCounter: PerfCounter = js.native
  
  /**
    * Gets the perf counter used for inter-frames time capture
    */
  def interFrameTimeCounter: PerfCounter = js.native
  
  /**
    * Gets the perf counter used for particles render time
    */
  def particlesRenderTimeCounter: PerfCounter = js.native
  
  /**
    * Gets the perf counter used for physics time
    */
  def physicsTimeCounter: PerfCounter = js.native
  
  /**
    * Gets the perf counter used for render targets render time
    */
  def renderTargetsRenderTimeCounter: PerfCounter = js.native
  
  /**
    * Gets the perf counter used for render time capture
    */
  def renderTimeCounter: PerfCounter = js.native
  
  /**
    * Defines the scene to instrument
    */
  var scene: Scene = js.native
  
  /**
    * Gets the perf counter used for sprites render time
    */
  def spritesRenderTimeCounter: PerfCounter = js.native
}
