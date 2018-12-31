package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DisplayPassPostProcess which produces an output the same as it's input
  */
@JSGlobal("BABYLON.DisplayPassPostProcess")
@js.native
class DisplayPassPostProcess protected () extends PostProcess {
  def this(name: java.lang.String, options: PostProcessOptions, camera: Nullable[Camera]) = this()
  /**
    * Creates the DisplayPassPostProcess
    * @param name The name of the effect.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    */
  def this(name: java.lang.String, options: scala.Double, camera: Nullable[Camera]) = this()
  def this(name: java.lang.String, options: PostProcessOptions, camera: Nullable[Camera], samplingMode: scala.Double) = this()
  def this(name: java.lang.String, options: scala.Double, camera: Nullable[Camera], samplingMode: scala.Double) = this()
  def this(name: java.lang.String, options: PostProcessOptions, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine) = this()
  def this(name: java.lang.String, options: scala.Double, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine) = this()
  def this(name: java.lang.String, options: PostProcessOptions, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean) = this()
  def this(name: java.lang.String, options: scala.Double, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean) = this()
}

