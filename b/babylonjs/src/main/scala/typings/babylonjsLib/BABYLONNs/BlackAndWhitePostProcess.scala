package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Post process used to render in black and white
  */
@JSGlobal("BABYLON.BlackAndWhitePostProcess")
@js.native
class BlackAndWhitePostProcess protected () extends PostProcess {
  def this(name: java.lang.String, options: PostProcessOptions, camera: Camera) = this()
  /**
    * Creates a black and white post process
    * @see https://doc.babylonjs.com/how_to/how_to_use_postprocesses#black-and-white
    * @param name The name of the effect.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    */
  def this(name: java.lang.String, options: scala.Double, camera: Camera) = this()
  def this(name: java.lang.String, options: PostProcessOptions, camera: Camera, samplingMode: scala.Double) = this()
  def this(name: java.lang.String, options: scala.Double, camera: Camera, samplingMode: scala.Double) = this()
  def this(name: java.lang.String, options: PostProcessOptions, camera: Camera, samplingMode: scala.Double, engine: Engine) = this()
  def this(name: java.lang.String, options: scala.Double, camera: Camera, samplingMode: scala.Double, engine: Engine) = this()
  def this(name: java.lang.String, options: PostProcessOptions, camera: Camera, samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean) = this()
  def this(name: java.lang.String, options: scala.Double, camera: Camera, samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean) = this()
  /**
    * Linear about to convert he result to black and white (default: 1)
    */
  var degree: scala.Double = js.native
}

