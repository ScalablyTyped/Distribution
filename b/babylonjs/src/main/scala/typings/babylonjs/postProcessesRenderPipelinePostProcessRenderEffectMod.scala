package typings.babylonjs

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.postProcessesPostProcessMod.PostProcess
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postProcessesRenderPipelinePostProcessRenderEffectMod {
  
  @JSImport("babylonjs/PostProcesses/RenderPipeline/postProcessRenderEffect", "PostProcessRenderEffect")
  @js.native
  open class PostProcessRenderEffect protected () extends StObject {
    /**
      * Instantiates a post process render effect.
      * A post process can be used to apply a shader to a texture after it is rendered.
      * @param engine The engine the effect is tied to
      * @param name The name of the effect
      * @param getPostProcesses A function that returns a set of post processes which the effect will run in order to be run.
      * @param singleInstance False if this post process can be run on multiple cameras. (default: true)
      */
    def this(
      engine: Engine,
      name: String,
      getPostProcesses: js.Function0[Nullable[PostProcess | js.Array[PostProcess]]]
    ) = this()
    def this(
      engine: Engine,
      name: String,
      getPostProcesses: js.Function0[Nullable[PostProcess | js.Array[PostProcess]]],
      singleInstance: Boolean
    ) = this()
    
    /**
      * Attaches the effect on cameras
      * @param cameras The camera to attach to.
      * @internal
      */
    def _attachCameras(cameras: js.Array[Camera]): Unit = js.native
    /**
      * Attaches the effect on cameras
      * @param cameras The camera to attach to.
      * @internal
      */
    def _attachCameras(cameras: Camera): Unit = js.native
    
    /* private */ var _cameras: Any = js.native
    
    /**
      * Detaches the effect on cameras
      * @param cameras The camera to detach from.
      * @internal
      */
    def _detachCameras(cameras: js.Array[Camera]): Unit = js.native
    /**
      * Detaches the effect on cameras
      * @param cameras The camera to detach from.
      * @internal
      */
    def _detachCameras(cameras: Camera): Unit = js.native
    
    /**
      * Disables the effect on the given cameras
      * @param cameras The camera to disable.
      * @internal
      */
    def _disable(cameras: Camera): Unit = js.native
    /**
      * Disables the effect on the given cameras
      * @param cameras The camera to disable.
      * @internal
      */
    def _disable(cameras: Nullable[js.Array[Camera]]): Unit = js.native
    
    /**
      * Enables the effect on given cameras
      * @param cameras The camera to enable.
      * @internal
      */
    def _enable(cameras: Camera): Unit = js.native
    /**
      * Enables the effect on given cameras
      * @param cameras The camera to enable.
      * @internal
      */
    def _enable(cameras: Nullable[js.Array[Camera]]): Unit = js.native
    
    /* private */ var _getPostProcesses: Any = js.native
    
    /* private */ var _indicesForCamera: Any = js.native
    
    /**
      * Name of the effect
      * @internal
      */
    var _name: String = js.native
    
    /* private */ var _postProcesses: Any = js.native
    
    /* private */ var _singleInstance: Any = js.native
    
    /**
      * Updates the current state of the effect
      * @internal
      */
    def _update(): Unit = js.native
    
    /**
      * Gets a list of the post processes contained in the effect.
      * @param camera The camera to get the post processes on.
      * @returns The list of the post processes in the effect.
      */
    def getPostProcesses(): Nullable[js.Array[PostProcess]] = js.native
    def getPostProcesses(camera: Camera): Nullable[js.Array[PostProcess]] = js.native
    
    /**
      * Checks if all the post processes in the effect are supported.
      */
    def isSupported: Boolean = js.native
  }
}
