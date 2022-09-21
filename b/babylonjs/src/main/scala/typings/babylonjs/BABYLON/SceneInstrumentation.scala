package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneInstrumentation
  extends StObject
     with IDisposable {
  
  /* private */ var _activeMeshesEvaluationTime: Any = js.native
  
  /* private */ var _animationsTime: Any = js.native
  
  /* private */ var _cameraRenderTime: Any = js.native
  
  /* private */ var _captureActiveMeshesEvaluationTime: Any = js.native
  
  /* private */ var _captureAnimationsTime: Any = js.native
  
  /* private */ var _captureCameraRenderTime: Any = js.native
  
  /* private */ var _captureFrameTime: Any = js.native
  
  /* private */ var _captureInterFrameTime: Any = js.native
  
  /* private */ var _captureParticlesRenderTime: Any = js.native
  
  /* private */ var _capturePhysicsTime: Any = js.native
  
  /* private */ var _captureRenderTargetsRenderTime: Any = js.native
  
  /* private */ var _captureRenderTime: Any = js.native
  
  /* private */ var _captureSpritesRenderTime: Any = js.native
  
  /* private */ var _frameTime: Any = js.native
  
  /* private */ var _interFrameTime: Any = js.native
  
  /* private */ var _onAfterActiveMeshesEvaluationObserver: Any = js.native
  
  /* private */ var _onAfterAnimationsObserver: Any = js.native
  
  /* private */ var _onAfterCameraRenderObserver: Any = js.native
  
  /* private */ var _onAfterDrawPhaseObserver: Any = js.native
  
  /* private */ var _onAfterParticlesRenderingObserver: Any = js.native
  
  /* private */ var _onAfterPhysicsObserver: Any = js.native
  
  /* private */ var _onAfterRenderObserver: Any = js.native
  
  /* private */ var _onAfterRenderTargetsRenderObserver: Any = js.native
  
  /* private */ var _onAfterSpritesRenderingObserver: Any = js.native
  
  /* private */ var _onBeforeActiveMeshesEvaluationObserver: Any = js.native
  
  /* private */ var _onBeforeAnimationsObserver: Any = js.native
  
  /* private */ var _onBeforeCameraRenderObserver: Any = js.native
  
  /* private */ var _onBeforeDrawPhaseObserver: Any = js.native
  
  /* private */ var _onBeforeParticlesRenderingObserver: Any = js.native
  
  /* private */ var _onBeforePhysicsObserver: Any = js.native
  
  /* private */ var _onBeforeRenderTargetsRenderObserver: Any = js.native
  
  /* private */ var _onBeforeSpritesRenderingObserver: Any = js.native
  
  /* private */ var _particlesRenderTime: Any = js.native
  
  /* private */ var _physicsTime: Any = js.native
  
  /* private */ var _renderTargetsRenderTime: Any = js.native
  
  /* private */ var _renderTime: Any = js.native
  
  /* private */ var _spritesRenderTime: Any = js.native
  
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
