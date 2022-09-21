package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.PostProcessOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ConvolutionPostProcess")
@js.native
open class ConvolutionPostProcess protected ()
  extends StObject
     with typings.babylonjs.BABYLON.ConvolutionPostProcess {
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
  def this(
    name: String,
    kernel: js.Array[Double],
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera]
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera]
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: typings.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: typings.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: Unit,
    reusable: Unit,
    textureType: Double
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Unit,
    textureType: Double
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: Unit,
    reusable: Unit,
    textureType: Double
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Unit,
    textureType: Double
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: Unit,
    reusable: Unit,
    textureType: Double
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Unit,
    textureType: Double
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: Unit,
    reusable: Unit,
    textureType: Double
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    kernel: js.Array[Double],
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Unit,
    textureType: Double
  ) = this()
}
/* static members */
object ConvolutionPostProcess {
  
  @JSGlobal("BABYLON.ConvolutionPostProcess")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Edge detection 0 see https://en.wikipedia.org/wiki/Kernel_(image_processing)
    */
  @JSGlobal("BABYLON.ConvolutionPostProcess.EdgeDetect0Kernel")
  @js.native
  def EdgeDetect0Kernel: js.Array[Double] = js.native
  inline def EdgeDetect0Kernel_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EdgeDetect0Kernel")(x.asInstanceOf[js.Any])
  
  /**
    * Edge detection 1 see https://en.wikipedia.org/wiki/Kernel_(image_processing)
    */
  @JSGlobal("BABYLON.ConvolutionPostProcess.EdgeDetect1Kernel")
  @js.native
  def EdgeDetect1Kernel: js.Array[Double] = js.native
  inline def EdgeDetect1Kernel_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EdgeDetect1Kernel")(x.asInstanceOf[js.Any])
  
  /**
    * Edge detection 2 see https://en.wikipedia.org/wiki/Kernel_(image_processing)
    */
  @JSGlobal("BABYLON.ConvolutionPostProcess.EdgeDetect2Kernel")
  @js.native
  def EdgeDetect2Kernel: js.Array[Double] = js.native
  inline def EdgeDetect2Kernel_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EdgeDetect2Kernel")(x.asInstanceOf[js.Any])
  
  /**
    * Kernel to emboss an image see https://en.wikipedia.org/wiki/Kernel_(image_processing)
    */
  @JSGlobal("BABYLON.ConvolutionPostProcess.EmbossKernel")
  @js.native
  def EmbossKernel: js.Array[Double] = js.native
  inline def EmbossKernel_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EmbossKernel")(x.asInstanceOf[js.Any])
  
  /**
    * Kernel to blur an image see https://en.wikipedia.org/wiki/Kernel_(image_processing)
    */
  @JSGlobal("BABYLON.ConvolutionPostProcess.GaussianKernel")
  @js.native
  def GaussianKernel: js.Array[Double] = js.native
  inline def GaussianKernel_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GaussianKernel")(x.asInstanceOf[js.Any])
  
  /**
    * Kernel to sharpen an image see https://en.wikipedia.org/wiki/Kernel_(image_processing)
    */
  @JSGlobal("BABYLON.ConvolutionPostProcess.SharpenKernel")
  @js.native
  def SharpenKernel: js.Array[Double] = js.native
  inline def SharpenKernel_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SharpenKernel")(x.asInstanceOf[js.Any])
  
  /**
    * @param parsedPostProcess
    * @param targetCamera
    * @param scene
    * @param rootUrl
    * @hidden
    */
  inline def _Parse(
    parsedPostProcess: Any,
    targetCamera: typings.babylonjs.BABYLON.Camera,
    scene: typings.babylonjs.BABYLON.Scene,
    rootUrl: String
  ): Nullable[typings.babylonjs.BABYLON.ConvolutionPostProcess] = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedPostProcess.asInstanceOf[js.Any], targetCamera.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.ConvolutionPostProcess]]
}
