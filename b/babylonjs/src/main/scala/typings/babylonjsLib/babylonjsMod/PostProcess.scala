package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PostProcess can be used to apply a shader to a texture after it has been rendered
  * See https://doc.babylonjs.com/how_to/how_to_use_postprocesses
  */
@JSImport("babylonjs", "PostProcess")
@js.native
class PostProcess protected ()
  extends babylonjsLib.BABYLONNs.PostProcess {
  def this(/** Name of the PostProcess. */
  name: java.lang.String, fragmentUrl: java.lang.String, parameters: babylonjsLib.BABYLONNs.Nullable[js.Array[java.lang.String]], samplers: babylonjsLib.BABYLONNs.Nullable[js.Array[java.lang.String]], options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: js.UndefOr[scala.Double], engine: js.UndefOr[babylonjsLib.BABYLONNs.Engine], reusable: js.UndefOr[scala.Boolean], defines: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[java.lang.String]], textureType: js.UndefOr[scala.Double], vertexUrl: js.UndefOr[java.lang.String], indexParameters: js.UndefOr[js.Any], blockCompilation: js.UndefOr[scala.Boolean]) = this()
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
    * @param blockCompilation If the shader should not be compiled imediatly. (default: false)
    */
  def this(/** Name of the PostProcess. */
  name: java.lang.String, fragmentUrl: java.lang.String, parameters: babylonjsLib.BABYLONNs.Nullable[js.Array[java.lang.String]], samplers: babylonjsLib.BABYLONNs.Nullable[js.Array[java.lang.String]], options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: js.UndefOr[scala.Double], engine: js.UndefOr[babylonjsLib.BABYLONNs.Engine], reusable: js.UndefOr[scala.Boolean], defines: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[java.lang.String]], textureType: js.UndefOr[scala.Double], vertexUrl: js.UndefOr[java.lang.String], indexParameters: js.UndefOr[js.Any], blockCompilation: js.UndefOr[scala.Boolean]) = this()
}

