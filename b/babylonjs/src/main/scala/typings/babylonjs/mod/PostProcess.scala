package typings.babylonjs.mod

import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PostProcess")
@js.native
class PostProcess protected ()
  extends typings.babylonjs.legacyMod.PostProcess {
  /**
    * Creates a new instance PostProcess
    * @param name The name of the PostProcess.
    * @param fragmentUrl The url of the fragment shader to be used.
    * @param parameters Array of the names of uniform non-sampler2D variables that will be passed to the shader.
    * @param samplers Array of the names of uniform sampler2D variables that will be passed to the shader.
    * @param options The required width/height ratio to downsize to before computing the render pass. (Use 1.0 for full size)
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param defines String of defines that will be set when running the fragment shader. (default: null)
    * @param textureType Type of textures used when performing the post process. (default: 0)
    * @param vertexUrl The url of the vertex shader to be used. (default: "postprocess")
    * @param indexParameters The index parameters to be used for babylons include syntax "#include<kernelBlurVaryingDeclaration>[0..varyingCount]". (default: undefined) See usage in babylon.blurPostProcess.ts and kernelBlur.vertex.fx
    * @param blockCompilation If the shader should not be compiled immediatly. (default: false)
    * @param textureFormat Format of textures used when performing the post process. (default: TEXTUREFORMAT_RGBA)
    */
  def this(
    name: String,
    fragmentUrl: String,
    parameters: Nullable[js.Array[String]],
    samplers: Nullable[js.Array[String]],
    options: Double | PostProcessOptions,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typings.babylonjs.engineMod.Engine],
    reusable: js.UndefOr[Boolean],
    defines: js.UndefOr[Nullable[String]],
    textureType: js.UndefOr[Double],
    vertexUrl: js.UndefOr[String],
    indexParameters: js.UndefOr[js.Any],
    blockCompilation: js.UndefOr[Boolean],
    textureFormat: js.UndefOr[Double]
  ) = this()
}
/* static members */
@JSImport("babylonjs", "PostProcess")
@js.native
object PostProcess extends js.Object {
  
  /**
    * Creates a material from parsed material data
    * @param parsedPostProcess defines parsed post process data
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures
    * @returns a new post process
    */
  def Parse(parsedPostProcess: js.Any, scene: typings.babylonjs.sceneMod.Scene, rootUrl: String): Nullable[typings.babylonjs.postProcessMod.PostProcess] = js.native
}
