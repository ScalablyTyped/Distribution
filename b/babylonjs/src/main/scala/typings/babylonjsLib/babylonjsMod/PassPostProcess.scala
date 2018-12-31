package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PassPostProcess which produces an output the same as it's input
  */
@JSImport("babylonjs", "PassPostProcess")
@js.native
class PassPostProcess protected ()
  extends babylonjsLib.BABYLONNs.PassPostProcess {
  def this(name: java.lang.String, options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera]], samplingMode: js.UndefOr[scala.Double], engine: js.UndefOr[babylonjsLib.BABYLONNs.Engine], reusable: js.UndefOr[scala.Boolean], textureType: js.UndefOr[scala.Double], blockCompilation: js.UndefOr[scala.Boolean]) = this()
  /**
    * Creates the PassPostProcess
    * @param name The name of the effect.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param textureType The type of texture to be used when performing the post processing.
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    */
  def this(name: java.lang.String, options: scala.Double, camera: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera]], samplingMode: js.UndefOr[scala.Double], engine: js.UndefOr[babylonjsLib.BABYLONNs.Engine], reusable: js.UndefOr[scala.Boolean], textureType: js.UndefOr[scala.Double], blockCompilation: js.UndefOr[scala.Boolean]) = this()
}

