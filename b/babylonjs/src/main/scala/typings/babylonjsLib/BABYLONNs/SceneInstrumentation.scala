package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This class can be used to get instrumentation data from a Babylon engine
     * @see http://doc.babylonjs.com/how_to/optimizing_your_scene#sceneinstrumentation
     */
@JSGlobal("BABYLON.SceneInstrumentation")
@js.native
class SceneInstrumentation protected () extends IDisposable {
  /**
           * Instantiates a new scene instrumentation.
           * This class can be used to get instrumentation data from a Babylon engine
           * @see http://doc.babylonjs.com/how_to/optimizing_your_scene#sceneinstrumentation
           * @param scene Defines the scene to instrument
           */
  def this(/**
           * Defines the scene to instrument
           */
  scene: Scene) = this()
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
  val activeMeshesEvaluationTimeCounter: PerfCounter = js.native
  /**
           * Gets the perf counter used for animations time
           */
  val animationsTimeCounter: PerfCounter = js.native
  /**
           * Gets the perf counter used for camera render time capture
           */
  val cameraRenderTimeCounter: PerfCounter = js.native
  /**
           * Gets the active meshes evaluation time capture status
           */
  /**
          * Enable or disable the active meshes evaluation time capture
          */
  var captureActiveMeshesEvaluationTime: scala.Boolean = js.native
  /**
           * Gets the animations time capture status
           */
  /**
          * Enable or disable the animations time capture
          */
  var captureAnimationsTime: scala.Boolean = js.native
  /**
           * Gets the camera render time capture status
           */
  /**
          * Enable or disable the camera render time capture
          */
  var captureCameraRenderTime: scala.Boolean = js.native
  /**
           * Gets the frame time capture status
           */
  /**
          * Enable or disable the frame time capture
          */
  var captureFrameTime: scala.Boolean = js.native
  /**
           * Gets the inter-frames time capture status
           */
  /**
          * Enable or disable the inter-frames time capture
          */
  var captureInterFrameTime: scala.Boolean = js.native
  /**
           * Gets the particles render time capture status
           */
  /**
          * Enable or disable the particles render time capture
          */
  var captureParticlesRenderTime: scala.Boolean = js.native
  /**
           * Gets the physics time capture status
           */
  /**
          * Enable or disable the physics time capture
          */
  var capturePhysicsTime: scala.Boolean = js.native
  /**
           * Gets the render targets render time capture status
           */
  /**
          * Enable or disable the render targets render time capture
          */
  var captureRenderTargetsRenderTime: scala.Boolean = js.native
  /**
           * Gets the render time capture status
           */
  /**
          * Enable or disable the render time capture
          */
  var captureRenderTime: scala.Boolean = js.native
  /**
           * Gets the sprites render time capture status
           */
  /**
          * Enable or disable the sprites render time capture
          */
  var captureSpritesRenderTime: scala.Boolean = js.native
  /**
           * Gets the perf counter used for draw calls
           */
  val drawCallsCounter: PerfCounter = js.native
  /**
           * Gets the perf counter used for frame time capture
           */
  val frameTimeCounter: PerfCounter = js.native
  /**
           * Gets the perf counter used for inter-frames time capture
           */
  val interFrameTimeCounter: PerfCounter = js.native
  /**
           * Gets the perf counter used for particles render time
           */
  val particlesRenderTimeCounter: PerfCounter = js.native
  /**
           * Gets the perf counter used for physics time
           */
  val physicsTimeCounter: PerfCounter = js.native
  /**
           * Gets the perf counter used for render targets render time
           */
  val renderTargetsRenderTimeCounter: PerfCounter = js.native
  /**
           * Gets the perf counter used for render time capture
           */
  val renderTimeCounter: PerfCounter = js.native
  /**
           * Defines the scene to instrument
           */
  var scene: Scene = js.native
  /**
           * Gets the perf counter used for sprites render time
           */
  val spritesRenderTimeCounter: PerfCounter = js.native
  /**
           * Gets the perf counter used for texture collisions
           */
  val textureCollisionsCounter: PerfCounter = js.native
  /**
           * Releases all held resources
           */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
}

