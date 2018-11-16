package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The GrainPostProcess adds noise to the image at mid luminance levels
     */
@JSGlobal("BABYLON.GrainPostProcess")
@js.native
class GrainPostProcess protected () extends PostProcess {
  /**
           * Creates a new instance of @see GrainPostProcess
           * @param name The name of the effect.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, options: PostProcessOptions, camera: Nullable[Camera]) = this()
  /**
           * Creates a new instance of @see GrainPostProcess
           * @param name The name of the effect.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, options: scala.Double, camera: Nullable[Camera]) = this()
  /**
           * Creates a new instance of @see GrainPostProcess
           * @param name The name of the effect.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, options: PostProcessOptions, camera: Nullable[Camera], samplingMode: scala.Double) = this()
  /**
           * Creates a new instance of @see GrainPostProcess
           * @param name The name of the effect.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, options: scala.Double, camera: Nullable[Camera], samplingMode: scala.Double) = this()
  /**
           * Creates a new instance of @see GrainPostProcess
           * @param name The name of the effect.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, options: PostProcessOptions, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine) = this()
  /**
           * Creates a new instance of @see GrainPostProcess
           * @param name The name of the effect.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, options: scala.Double, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine) = this()
  /**
           * Creates a new instance of @see GrainPostProcess
           * @param name The name of the effect.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, options: PostProcessOptions, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean) = this()
  /**
           * Creates a new instance of @see GrainPostProcess
           * @param name The name of the effect.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, options: scala.Double, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean) = this()
  /**
           * Creates a new instance of @see GrainPostProcess
           * @param name The name of the effect.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, options: PostProcessOptions, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean, textureType: scala.Double) = this()
  /**
           * Creates a new instance of @see GrainPostProcess
           * @param name The name of the effect.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, options: scala.Double, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean, textureType: scala.Double) = this()
  /**
           * Creates a new instance of @see GrainPostProcess
           * @param name The name of the effect.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, options: PostProcessOptions, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean, textureType: scala.Double, blockCompilation: scala.Boolean) = this()
  /**
           * Creates a new instance of @see GrainPostProcess
           * @param name The name of the effect.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, options: scala.Double, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean, textureType: scala.Double, blockCompilation: scala.Boolean) = this()
  /**
           * If the grain should be randomized on every frame
           */
  var animated: scala.Boolean = js.native
  /**
           * The intensity of the grain added (default: 30)
           */
  var intensity: scala.Double = js.native
}

