package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The ChromaticAberrationPostProcess separates the rgb channels in an image to produce chromatic distortion around the edges of the screen
     */
@JSGlobal("BABYLON.ChromaticAberrationPostProcess")
@js.native
class ChromaticAberrationPostProcess protected () extends PostProcess {
  /**
           * Creates a new instance ChromaticAberrationPostProcess
           * @param name The name of the effect.
           * @param screenWidth The width of the screen to apply the effect on.
           * @param screenHeight The height of the screen to apply the effect on.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: PostProcessOptions, camera: Nullable[Camera]) = this()
  /**
           * Creates a new instance ChromaticAberrationPostProcess
           * @param name The name of the effect.
           * @param screenWidth The width of the screen to apply the effect on.
           * @param screenHeight The height of the screen to apply the effect on.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: scala.Double, camera: Nullable[Camera]) = this()
  /**
           * Creates a new instance ChromaticAberrationPostProcess
           * @param name The name of the effect.
           * @param screenWidth The width of the screen to apply the effect on.
           * @param screenHeight The height of the screen to apply the effect on.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: PostProcessOptions, camera: Nullable[Camera], samplingMode: scala.Double) = this()
  /**
           * Creates a new instance ChromaticAberrationPostProcess
           * @param name The name of the effect.
           * @param screenWidth The width of the screen to apply the effect on.
           * @param screenHeight The height of the screen to apply the effect on.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: scala.Double, camera: Nullable[Camera], samplingMode: scala.Double) = this()
  /**
           * Creates a new instance ChromaticAberrationPostProcess
           * @param name The name of the effect.
           * @param screenWidth The width of the screen to apply the effect on.
           * @param screenHeight The height of the screen to apply the effect on.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: PostProcessOptions, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine) = this()
  /**
           * Creates a new instance ChromaticAberrationPostProcess
           * @param name The name of the effect.
           * @param screenWidth The width of the screen to apply the effect on.
           * @param screenHeight The height of the screen to apply the effect on.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: scala.Double, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine) = this()
  /**
           * Creates a new instance ChromaticAberrationPostProcess
           * @param name The name of the effect.
           * @param screenWidth The width of the screen to apply the effect on.
           * @param screenHeight The height of the screen to apply the effect on.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: PostProcessOptions, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean) = this()
  /**
           * Creates a new instance ChromaticAberrationPostProcess
           * @param name The name of the effect.
           * @param screenWidth The width of the screen to apply the effect on.
           * @param screenHeight The height of the screen to apply the effect on.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: scala.Double, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean) = this()
  /**
           * Creates a new instance ChromaticAberrationPostProcess
           * @param name The name of the effect.
           * @param screenWidth The width of the screen to apply the effect on.
           * @param screenHeight The height of the screen to apply the effect on.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: PostProcessOptions, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean, textureType: scala.Double) = this()
  /**
           * Creates a new instance ChromaticAberrationPostProcess
           * @param name The name of the effect.
           * @param screenWidth The width of the screen to apply the effect on.
           * @param screenHeight The height of the screen to apply the effect on.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: scala.Double, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean, textureType: scala.Double) = this()
  /**
           * Creates a new instance ChromaticAberrationPostProcess
           * @param name The name of the effect.
           * @param screenWidth The width of the screen to apply the effect on.
           * @param screenHeight The height of the screen to apply the effect on.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: PostProcessOptions, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean, textureType: scala.Double, blockCompilation: scala.Boolean) = this()
  /**
           * Creates a new instance ChromaticAberrationPostProcess
           * @param name The name of the effect.
           * @param screenWidth The width of the screen to apply the effect on.
           * @param screenHeight The height of the screen to apply the effect on.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: scala.Double, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean, textureType: scala.Double, blockCompilation: scala.Boolean) = this()
  /**
           * The amount of seperation of rgb channels (default: 30)
           */
  var aberrationAmount: scala.Double = js.native
  /**
           * The center position where the radialIntensity should be around. [0.5,0.5 is center of screen, 1,1 is top right corder] (default: Vector2(0.5 ,0.5))
           */
  var centerPosition: Vector2 = js.native
  /**
           * The normilized direction in which the rgb channels should be seperated. If set to 0,0 radial direction will be used. (default: Vector2(0.707,0.707))
           */
  var direction: Vector2 = js.native
  /**
           * The amount the effect will increase for pixels closer to the edge of the screen. (default: 0)
           */
  var radialIntensity: scala.Double = js.native
}

