package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/convolutionPostProcess", JSImport.Namespace)
@js.native
object convolutionPostProcessMod extends js.Object {
  
  @js.native
  class ConvolutionPostProcess protected () extends PostProcess {
    /**
      * Creates a new instance ConvolutionPostProcess
      * @param name The name of the effect.
      * @param kernel Array of 9 values corresponding to the 3x3 kernel to be applied
      * @param options The required width/height ratio to downsize to before computing the render pass.
      * @param camera The camera to apply the render pass to.
      * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
      * @param engine The engine which the post process will be applied. (default: current engine)
      * @param reusable If the post process can be reused on the same frame. (default: false)
      * @param textureType Type of textures used when performing the post process. (default: 0)
      */
    def this(name: String, kernel: js.Array[Double], options: Double, camera: Nullable[Camera]) = this()
    def this(name: String, kernel: js.Array[Double], options: PostProcessOptions, camera: Nullable[Camera]) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: Double,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: Double,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: Double,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: Double,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[scala.Nothing],
      reusable: js.UndefOr[scala.Nothing],
      textureType: Double
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: Double,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean,
      textureType: Double
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: Double,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine,
      reusable: js.UndefOr[scala.Nothing],
      textureType: Double
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: Double,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine,
      reusable: Boolean,
      textureType: Double
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: js.UndefOr[scala.Nothing],
      reusable: js.UndefOr[scala.Nothing],
      textureType: Double
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean,
      textureType: Double
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: js.UndefOr[scala.Nothing],
      textureType: Double
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean,
      textureType: Double
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[scala.Nothing],
      reusable: js.UndefOr[scala.Nothing],
      textureType: Double
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean,
      textureType: Double
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine,
      reusable: js.UndefOr[scala.Nothing],
      textureType: Double
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine,
      reusable: Boolean,
      textureType: Double
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: js.UndefOr[scala.Nothing],
      reusable: js.UndefOr[scala.Nothing],
      textureType: Double
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean,
      textureType: Double
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: js.UndefOr[scala.Nothing],
      textureType: Double
    ) = this()
    def this(
      name: String,
      kernel: js.Array[Double],
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean,
      textureType: Double
    ) = this()
    
    /** Array of 9 values corresponding to the 3x3 kernel to be applied */
    var kernel: js.Array[Double] = js.native
  }
  /* static members */
  @js.native
  object ConvolutionPostProcess extends js.Object {
    
    /**
      * Edge detection 0 see https://en.wikipedia.org/wiki/Kernel_(image_processing)
      */
    var EdgeDetect0Kernel: js.Array[Double] = js.native
    
    /**
      * Edge detection 1 see https://en.wikipedia.org/wiki/Kernel_(image_processing)
      */
    var EdgeDetect1Kernel: js.Array[Double] = js.native
    
    /**
      * Edge detection 2 see https://en.wikipedia.org/wiki/Kernel_(image_processing)
      */
    var EdgeDetect2Kernel: js.Array[Double] = js.native
    
    /**
      * Kernel to emboss an image see https://en.wikipedia.org/wiki/Kernel_(image_processing)
      */
    var EmbossKernel: js.Array[Double] = js.native
    
    /**
      * Kernel to blur an image see https://en.wikipedia.org/wiki/Kernel_(image_processing)
      */
    var GaussianKernel: js.Array[Double] = js.native
    
    /**
      * Kernel to sharpen an image see https://en.wikipedia.org/wiki/Kernel_(image_processing)
      */
    var SharpenKernel: js.Array[Double] = js.native
    
    /** @hidden */
    def _Parse(parsedPostProcess: js.Any, targetCamera: Camera, scene: Scene, rootUrl: String): Nullable[ConvolutionPostProcess] = js.native
  }
}
