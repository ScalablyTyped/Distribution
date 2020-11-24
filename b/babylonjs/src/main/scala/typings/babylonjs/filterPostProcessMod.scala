package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/filterPostProcess", JSImport.Namespace)
@js.native
object filterPostProcessMod extends js.Object {
  
  @js.native
  class FilterPostProcess protected () extends PostProcess {
    /**
      *
      * @param name The name of the effect.
      * @param kernelMatrix The matrix to be applied to the image
      * @param options The required width/height ratio to downsize to before computing the render pass.
      * @param camera The camera to apply the render pass to.
      * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
      * @param engine The engine which the post process will be applied. (default: current engine)
      * @param reusable If the post process can be reused on the same frame. (default: false)
      */
    def this(name: String, kernelMatrix: Matrix, options: Double, camera: Nullable[Camera]) = this()
    def this(name: String, kernelMatrix: Matrix, options: PostProcessOptions, camera: Nullable[Camera]) = this()
    def this(
      name: String,
      kernelMatrix: Matrix,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double
    ) = this()
    def this(
      name: String,
      kernelMatrix: Matrix,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double
    ) = this()
    def this(
      name: String,
      kernelMatrix: Matrix,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine
    ) = this()
    def this(
      name: String,
      kernelMatrix: Matrix,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine
    ) = this()
    def this(
      name: String,
      kernelMatrix: Matrix,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine
    ) = this()
    def this(
      name: String,
      kernelMatrix: Matrix,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine
    ) = this()
    def this(
      name: String,
      kernelMatrix: Matrix,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      kernelMatrix: Matrix,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      kernelMatrix: Matrix,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      kernelMatrix: Matrix,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      kernelMatrix: Matrix,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      kernelMatrix: Matrix,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      kernelMatrix: Matrix,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      kernelMatrix: Matrix,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean
    ) = this()
    
    /** The matrix to be applied to the image */
    var kernelMatrix: Matrix = js.native
  }
  /* static members */
  @js.native
  object FilterPostProcess extends js.Object {
    
    /** @hidden */
    def _Parse(parsedPostProcess: js.Any, targetCamera: Camera, scene: Scene, rootUrl: String): Nullable[FilterPostProcess] = js.native
  }
}
