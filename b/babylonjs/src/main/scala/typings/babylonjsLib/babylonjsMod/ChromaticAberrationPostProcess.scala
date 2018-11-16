package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The ChromaticAberrationPostProcess separates the rgb channels in an image to produce chromatic distortion around the edges of the screen
     */
@JSImport("babylonjs", "ChromaticAberrationPostProcess")
@js.native
class ChromaticAberrationPostProcess protected ()
  extends babylonjsLib.BABYLONNs.ChromaticAberrationPostProcess {
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
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera]) = this()
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
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera]) = this()
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
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double) = this()
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
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double) = this()
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
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine) = this()
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
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine) = this()
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
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean) = this()
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
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean) = this()
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
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean, textureType: scala.Double) = this()
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
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean, textureType: scala.Double) = this()
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
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean, textureType: scala.Double, blockCompilation: scala.Boolean) = this()
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
  def this(name: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean, textureType: scala.Double, blockCompilation: scala.Boolean) = this()
}

