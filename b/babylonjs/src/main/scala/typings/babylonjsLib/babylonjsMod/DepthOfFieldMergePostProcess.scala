package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The DepthOfFieldMergePostProcess merges blurred images with the original based on the values of the circle of confusion.
     */
@JSImport("babylonjs", "DepthOfFieldMergePostProcess")
@js.native
class DepthOfFieldMergePostProcess protected ()
  extends babylonjsLib.BABYLONNs.DepthOfFieldMergePostProcess {
  /**
           * Creates a new instance of DepthOfFieldMergePostProcess
           * @param name The name of the effect.
           * @param originalFromInput Post process which's input will be used for the merge.
           * @param circleOfConfusion Circle of confusion post process which's output will be used to blur each pixel.
           * @param blurSteps Blur post processes from low to high which will be mixed with the original image.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, originalFromInput: babylonjsLib.BABYLONNs.PostProcess, circleOfConfusion: babylonjsLib.BABYLONNs.PostProcess, blurSteps: js.Array[babylonjsLib.BABYLONNs.PostProcess], options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera]) = this()
  /**
           * Creates a new instance of DepthOfFieldMergePostProcess
           * @param name The name of the effect.
           * @param originalFromInput Post process which's input will be used for the merge.
           * @param circleOfConfusion Circle of confusion post process which's output will be used to blur each pixel.
           * @param blurSteps Blur post processes from low to high which will be mixed with the original image.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, originalFromInput: babylonjsLib.BABYLONNs.PostProcess, circleOfConfusion: babylonjsLib.BABYLONNs.PostProcess, blurSteps: js.Array[babylonjsLib.BABYLONNs.PostProcess], options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera]) = this()
  /**
           * Creates a new instance of DepthOfFieldMergePostProcess
           * @param name The name of the effect.
           * @param originalFromInput Post process which's input will be used for the merge.
           * @param circleOfConfusion Circle of confusion post process which's output will be used to blur each pixel.
           * @param blurSteps Blur post processes from low to high which will be mixed with the original image.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, originalFromInput: babylonjsLib.BABYLONNs.PostProcess, circleOfConfusion: babylonjsLib.BABYLONNs.PostProcess, blurSteps: js.Array[babylonjsLib.BABYLONNs.PostProcess], options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double) = this()
  /**
           * Creates a new instance of DepthOfFieldMergePostProcess
           * @param name The name of the effect.
           * @param originalFromInput Post process which's input will be used for the merge.
           * @param circleOfConfusion Circle of confusion post process which's output will be used to blur each pixel.
           * @param blurSteps Blur post processes from low to high which will be mixed with the original image.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, originalFromInput: babylonjsLib.BABYLONNs.PostProcess, circleOfConfusion: babylonjsLib.BABYLONNs.PostProcess, blurSteps: js.Array[babylonjsLib.BABYLONNs.PostProcess], options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double) = this()
  /**
           * Creates a new instance of DepthOfFieldMergePostProcess
           * @param name The name of the effect.
           * @param originalFromInput Post process which's input will be used for the merge.
           * @param circleOfConfusion Circle of confusion post process which's output will be used to blur each pixel.
           * @param blurSteps Blur post processes from low to high which will be mixed with the original image.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, originalFromInput: babylonjsLib.BABYLONNs.PostProcess, circleOfConfusion: babylonjsLib.BABYLONNs.PostProcess, blurSteps: js.Array[babylonjsLib.BABYLONNs.PostProcess], options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine) = this()
  /**
           * Creates a new instance of DepthOfFieldMergePostProcess
           * @param name The name of the effect.
           * @param originalFromInput Post process which's input will be used for the merge.
           * @param circleOfConfusion Circle of confusion post process which's output will be used to blur each pixel.
           * @param blurSteps Blur post processes from low to high which will be mixed with the original image.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, originalFromInput: babylonjsLib.BABYLONNs.PostProcess, circleOfConfusion: babylonjsLib.BABYLONNs.PostProcess, blurSteps: js.Array[babylonjsLib.BABYLONNs.PostProcess], options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine) = this()
  /**
           * Creates a new instance of DepthOfFieldMergePostProcess
           * @param name The name of the effect.
           * @param originalFromInput Post process which's input will be used for the merge.
           * @param circleOfConfusion Circle of confusion post process which's output will be used to blur each pixel.
           * @param blurSteps Blur post processes from low to high which will be mixed with the original image.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, originalFromInput: babylonjsLib.BABYLONNs.PostProcess, circleOfConfusion: babylonjsLib.BABYLONNs.PostProcess, blurSteps: js.Array[babylonjsLib.BABYLONNs.PostProcess], options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean) = this()
  /**
           * Creates a new instance of DepthOfFieldMergePostProcess
           * @param name The name of the effect.
           * @param originalFromInput Post process which's input will be used for the merge.
           * @param circleOfConfusion Circle of confusion post process which's output will be used to blur each pixel.
           * @param blurSteps Blur post processes from low to high which will be mixed with the original image.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, originalFromInput: babylonjsLib.BABYLONNs.PostProcess, circleOfConfusion: babylonjsLib.BABYLONNs.PostProcess, blurSteps: js.Array[babylonjsLib.BABYLONNs.PostProcess], options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean) = this()
  /**
           * Creates a new instance of DepthOfFieldMergePostProcess
           * @param name The name of the effect.
           * @param originalFromInput Post process which's input will be used for the merge.
           * @param circleOfConfusion Circle of confusion post process which's output will be used to blur each pixel.
           * @param blurSteps Blur post processes from low to high which will be mixed with the original image.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, originalFromInput: babylonjsLib.BABYLONNs.PostProcess, circleOfConfusion: babylonjsLib.BABYLONNs.PostProcess, blurSteps: js.Array[babylonjsLib.BABYLONNs.PostProcess], options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean, textureType: scala.Double) = this()
  /**
           * Creates a new instance of DepthOfFieldMergePostProcess
           * @param name The name of the effect.
           * @param originalFromInput Post process which's input will be used for the merge.
           * @param circleOfConfusion Circle of confusion post process which's output will be used to blur each pixel.
           * @param blurSteps Blur post processes from low to high which will be mixed with the original image.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, originalFromInput: babylonjsLib.BABYLONNs.PostProcess, circleOfConfusion: babylonjsLib.BABYLONNs.PostProcess, blurSteps: js.Array[babylonjsLib.BABYLONNs.PostProcess], options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean, textureType: scala.Double) = this()
  /**
           * Creates a new instance of DepthOfFieldMergePostProcess
           * @param name The name of the effect.
           * @param originalFromInput Post process which's input will be used for the merge.
           * @param circleOfConfusion Circle of confusion post process which's output will be used to blur each pixel.
           * @param blurSteps Blur post processes from low to high which will be mixed with the original image.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, originalFromInput: babylonjsLib.BABYLONNs.PostProcess, circleOfConfusion: babylonjsLib.BABYLONNs.PostProcess, blurSteps: js.Array[babylonjsLib.BABYLONNs.PostProcess], options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean, textureType: scala.Double, blockCompilation: scala.Boolean) = this()
  /**
           * Creates a new instance of DepthOfFieldMergePostProcess
           * @param name The name of the effect.
           * @param originalFromInput Post process which's input will be used for the merge.
           * @param circleOfConfusion Circle of confusion post process which's output will be used to blur each pixel.
           * @param blurSteps Blur post processes from low to high which will be mixed with the original image.
           * @param options The required width/height ratio to downsize to before computing the render pass.
           * @param camera The camera to apply the render pass to.
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           * @param textureType Type of textures used when performing the post process. (default: 0)
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(name: java.lang.String, originalFromInput: babylonjsLib.BABYLONNs.PostProcess, circleOfConfusion: babylonjsLib.BABYLONNs.PostProcess, blurSteps: js.Array[babylonjsLib.BABYLONNs.PostProcess], options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean, textureType: scala.Double, blockCompilation: scala.Boolean) = this()
}

