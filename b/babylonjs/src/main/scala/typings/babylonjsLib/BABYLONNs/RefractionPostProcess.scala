package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Post process which applies a refractin texture
  * @see https://doc.babylonjs.com/how_to/how_to_use_postprocesses#refraction
  */
@JSGlobal("BABYLON.RefractionPostProcess")
@js.native
class RefractionPostProcess protected () extends PostProcess {
  def this(name: java.lang.String, refractionTextureUrl: java.lang.String, /** the base color of the refraction (used to taint the rendering) */
  color: Color3, /** simulated refraction depth */
  depth: scala.Double, /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: scala.Double, options: PostProcessOptions, camera: Camera) = this()
  /**
    * Initializes the RefractionPostProcess
    * @see https://doc.babylonjs.com/how_to/how_to_use_postprocesses#refraction
    * @param name The name of the effect.
    * @param refractionTextureUrl Url of the refraction texture to use
    * @param color the base color of the refraction (used to taint the rendering)
    * @param depth simulated refraction depth
    * @param colorLevel the coefficient of the base color (0 to remove base color tainting)
    * @param camera The camera to apply the render pass to.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    */
  def this(name: java.lang.String, refractionTextureUrl: java.lang.String, /** the base color of the refraction (used to taint the rendering) */
  color: Color3, /** simulated refraction depth */
  depth: scala.Double, /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: scala.Double, options: scala.Double, camera: Camera) = this()
  def this(name: java.lang.String, refractionTextureUrl: java.lang.String, /** the base color of the refraction (used to taint the rendering) */
  color: Color3, /** simulated refraction depth */
  depth: scala.Double, /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: scala.Double, options: PostProcessOptions, camera: Camera, samplingMode: scala.Double) = this()
  def this(name: java.lang.String, refractionTextureUrl: java.lang.String, /** the base color of the refraction (used to taint the rendering) */
  color: Color3, /** simulated refraction depth */
  depth: scala.Double, /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: scala.Double, options: scala.Double, camera: Camera, samplingMode: scala.Double) = this()
  def this(name: java.lang.String, refractionTextureUrl: java.lang.String, /** the base color of the refraction (used to taint the rendering) */
  color: Color3, /** simulated refraction depth */
  depth: scala.Double, /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: scala.Double, options: PostProcessOptions, camera: Camera, samplingMode: scala.Double, engine: Engine) = this()
  def this(name: java.lang.String, refractionTextureUrl: java.lang.String, /** the base color of the refraction (used to taint the rendering) */
  color: Color3, /** simulated refraction depth */
  depth: scala.Double, /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: scala.Double, options: scala.Double, camera: Camera, samplingMode: scala.Double, engine: Engine) = this()
  def this(name: java.lang.String, refractionTextureUrl: java.lang.String, /** the base color of the refraction (used to taint the rendering) */
  color: Color3, /** simulated refraction depth */
  depth: scala.Double, /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: scala.Double, options: PostProcessOptions, camera: Camera, samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean) = this()
  def this(name: java.lang.String, refractionTextureUrl: java.lang.String, /** the base color of the refraction (used to taint the rendering) */
  color: Color3, /** simulated refraction depth */
  depth: scala.Double, /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: scala.Double, options: scala.Double, camera: Camera, samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean) = this()
  var _ownRefractionTexture: js.Any = js.native
  var _refTexture: js.Any = js.native
  /** the base color of the refraction (used to taint the rendering) */
  var color: Color3 = js.native
  /** the coefficient of the base color (0 to remove base color tainting) */
  var colorLevel: scala.Double = js.native
  /** simulated refraction depth */
  var depth: scala.Double = js.native
  /**
    * Gets or sets the refraction texture
    * Please note that you are responsible for disposing the texture if you set it manually
    */
  var refractionTexture: Texture = js.native
}

