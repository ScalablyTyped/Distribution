package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object motionBlurPostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/motionBlurPostProcess", "MotionBlurPostProcess")
  @js.native
  class MotionBlurPostProcess protected () extends PostProcess {
    /**
      * Creates a new instance MotionBlurPostProcess
      * @param name The name of the effect.
      * @param scene The scene containing the objects to blur according to their velocity.
      * @param options The required width/height ratio to downsize to before computing the render pass.
      * @param camera The camera to apply the render pass to.
      * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
      * @param engine The engine which the post process will be applied. (default: current engine)
      * @param reusable If the post process can be reused on the same frame. (default: false)
      * @param textureType Type of textures used when performing the post process. (default: 0)
      * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: true)
      * @param forceGeometryBuffer If this post process should use geometry buffer instead of prepass (default: false)
      */
    def this(
      name: String,
      scene: Scene,
      options: Double | PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[Double],
      engine: js.UndefOr[Engine],
      reusable: js.UndefOr[Boolean],
      textureType: js.UndefOr[Double],
      blockCompilation: js.UndefOr[Boolean],
      forceGeometryBuffer: js.UndefOr[Boolean]
    ) = this()
    
    /**
      * Called on the mode changed (object based or screen based).
      */
    var _applyMode: js.Any = js.native
    
    var _forceGeometryBuffer: js.Any = js.native
    
    var _geometryBufferRenderer: js.Any = js.native
    
    var _invViewProjection: js.Any = js.native
    
    var _isObjectBased: js.Any = js.native
    
    var _motionBlurSamples: js.Any = js.native
    
    /**
      * Called on the effect is applied when the motion blur post-process is in object based mode.
      */
    var _onApplyObjectBased: js.Any = js.native
    
    /**
      * Called on the effect is applied when the motion blur post-process is in screen based mode.
      */
    var _onApplyScreenBased: js.Any = js.native
    
    var _prePassRenderer: js.Any = js.native
    
    var _previousViewProjection: js.Any = js.native
    
    /**
      * Called on the effect must be updated (changed mode, samples count, etc.).
      */
    var _updateEffect: js.Any = js.native
    
    /**
      * Excludes the given skinned mesh from computing bones velocities.
      * Computing bones velocities can have a cost and that cost. The cost can be saved by calling this function and by passing the skinned mesh reference to ignore.
      * @param skinnedMesh The mesh containing the skeleton to ignore when computing the velocity map.
      */
    def excludeSkinnedMesh(skinnedMesh: AbstractMesh): Unit = js.native
    
    /**
      * Gets wether or not the motion blur post-process is in object based mode.
      */
    def isObjectBased: Boolean = js.native
    /**
      * Sets wether or not the motion blur post-process is in object based mode.
      */
    def isObjectBased_=(value: Boolean): Unit = js.native
    
    /**
      * Gets the number of iterations are used for motion blur quality. Default value is equal to 32
      */
    def motionBlurSamples: Double = js.native
    /**
      * Sets the number of iterations to be used for motion blur quality
      */
    def motionBlurSamples_=(samples: Double): Unit = js.native
    
    /**
      * Defines how much the image is blurred by the movement. Default value is equal to 1
      */
    var motionStrength: Double = js.native
    
    /**
      * Removes the given skinned mesh from the excluded meshes to integrate bones velocities while rendering the velocity map.
      * @param skinnedMesh The mesh containing the skeleton that has been ignored previously.
      * @see excludeSkinnedMesh to exclude a skinned mesh from bones velocity computation.
      */
    def removeExcludedSkinnedMesh(skinnedMesh: AbstractMesh): Unit = js.native
  }
  /* static members */
  object MotionBlurPostProcess {
    
    /** @hidden */
    @JSImport("babylonjs/PostProcesses/motionBlurPostProcess", "MotionBlurPostProcess._Parse")
    @js.native
    def _Parse(parsedPostProcess: js.Any, targetCamera: Camera, scene: Scene, rootUrl: String): Nullable[MotionBlurPostProcess] = js.native
  }
}
