package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/PostProcesses/refractionPostProcess", JSImport.Namespace)
@js.native
object refractionPostProcessMod extends js.Object {
  @js.native
  class RefractionPostProcess protected () extends PostProcess {
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
    def this(
      name: String,
      refractionTextureUrl: String,
      /** the base color of the refraction (used to taint the rendering) */
    color: Color3,
      /** simulated refraction depth */
    depth: Double,
      /** the coefficient of the base color (0 to remove base color tainting) */
    colorLevel: Double,
      options: Double,
      camera: Camera
    ) = this()
    def this(
      name: String,
      refractionTextureUrl: String,
      /** the base color of the refraction (used to taint the rendering) */
    color: Color3,
      /** simulated refraction depth */
    depth: Double,
      /** the coefficient of the base color (0 to remove base color tainting) */
    colorLevel: Double,
      options: PostProcessOptions,
      camera: Camera
    ) = this()
    def this(
      name: String,
      refractionTextureUrl: String,
      /** the base color of the refraction (used to taint the rendering) */
    color: Color3,
      /** simulated refraction depth */
    depth: Double,
      /** the coefficient of the base color (0 to remove base color tainting) */
    colorLevel: Double,
      options: Double,
      camera: Camera,
      samplingMode: Double
    ) = this()
    def this(
      name: String,
      refractionTextureUrl: String,
      /** the base color of the refraction (used to taint the rendering) */
    color: Color3,
      /** simulated refraction depth */
    depth: Double,
      /** the coefficient of the base color (0 to remove base color tainting) */
    colorLevel: Double,
      options: PostProcessOptions,
      camera: Camera,
      samplingMode: Double
    ) = this()
    def this(
      name: String,
      refractionTextureUrl: String,
      /** the base color of the refraction (used to taint the rendering) */
    color: Color3,
      /** simulated refraction depth */
    depth: Double,
      /** the coefficient of the base color (0 to remove base color tainting) */
    colorLevel: Double,
      options: Double,
      camera: Camera,
      samplingMode: Double,
      engine: Engine
    ) = this()
    def this(
      name: String,
      refractionTextureUrl: String,
      /** the base color of the refraction (used to taint the rendering) */
    color: Color3,
      /** simulated refraction depth */
    depth: Double,
      /** the coefficient of the base color (0 to remove base color tainting) */
    colorLevel: Double,
      options: PostProcessOptions,
      camera: Camera,
      samplingMode: Double,
      engine: Engine
    ) = this()
    def this(
      name: String,
      refractionTextureUrl: String,
      /** the base color of the refraction (used to taint the rendering) */
    color: Color3,
      /** simulated refraction depth */
    depth: Double,
      /** the coefficient of the base color (0 to remove base color tainting) */
    colorLevel: Double,
      options: Double,
      camera: Camera,
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      refractionTextureUrl: String,
      /** the base color of the refraction (used to taint the rendering) */
    color: Color3,
      /** simulated refraction depth */
    depth: Double,
      /** the coefficient of the base color (0 to remove base color tainting) */
    colorLevel: Double,
      options: PostProcessOptions,
      camera: Camera,
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean
    ) = this()
    var _ownRefractionTexture: js.Any = js.native
    var _refTexture: js.Any = js.native
    /** the base color of the refraction (used to taint the rendering) */
    var color: Color3 = js.native
    /** the coefficient of the base color (0 to remove base color tainting) */
    var colorLevel: Double = js.native
    /** simulated refraction depth */
    var depth: Double = js.native
    /**
      * Gets or sets the refraction texture
      * Please note that you are responsible for disposing the texture if you set it manually
      */
    def refractionTexture(): Texture = js.native
    def refractionTexture(value: Texture): js.Any = js.native
  }
  
}

