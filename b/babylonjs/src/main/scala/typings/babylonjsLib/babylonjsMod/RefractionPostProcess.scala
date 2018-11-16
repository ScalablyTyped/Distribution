package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Post process which applies a refractin texture
     * @see https://doc.babylonjs.com/how_to/how_to_use_postprocesses#refraction
     */
@JSImport("babylonjs", "RefractionPostProcess")
@js.native
class RefractionPostProcess protected ()
  extends babylonjsLib.BABYLONNs.RefractionPostProcess {
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
  color: babylonjsLib.BABYLONNs.Color3, /** simulated refraction depth */
  depth: scala.Double, /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: scala.Double, options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Camera) = this()
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
  color: babylonjsLib.BABYLONNs.Color3, /** simulated refraction depth */
  depth: scala.Double, /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: scala.Double, options: scala.Double, camera: babylonjsLib.BABYLONNs.Camera) = this()
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
  color: babylonjsLib.BABYLONNs.Color3, /** simulated refraction depth */
  depth: scala.Double, /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: scala.Double, options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Camera, samplingMode: scala.Double) = this()
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
  color: babylonjsLib.BABYLONNs.Color3, /** simulated refraction depth */
  depth: scala.Double, /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: scala.Double, options: scala.Double, camera: babylonjsLib.BABYLONNs.Camera, samplingMode: scala.Double) = this()
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
  color: babylonjsLib.BABYLONNs.Color3, /** simulated refraction depth */
  depth: scala.Double, /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: scala.Double, options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Camera, samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine) = this()
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
  color: babylonjsLib.BABYLONNs.Color3, /** simulated refraction depth */
  depth: scala.Double, /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: scala.Double, options: scala.Double, camera: babylonjsLib.BABYLONNs.Camera, samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine) = this()
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
  color: babylonjsLib.BABYLONNs.Color3, /** simulated refraction depth */
  depth: scala.Double, /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: scala.Double, options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Camera, samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean) = this()
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
  color: babylonjsLib.BABYLONNs.Color3, /** simulated refraction depth */
  depth: scala.Double, /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: scala.Double, options: scala.Double, camera: babylonjsLib.BABYLONNs.Camera, samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean) = this()
}

