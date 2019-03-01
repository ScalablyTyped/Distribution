package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Glow layer options. This helps customizing the behaviour
  * of the glow layer.
  */
trait IGlowLayerOptions extends js.Object {
  /**
    * How big is the kernel of the blur texture.
    */
  var blurKernelSize: scala.Double
  /**
    * The camera attached to the layer.
    */
  var camera: Nullable[Camera]
  /**
    * Enforces a fixed size texture to ensure resize independant blur.
    */
  var mainTextureFixedSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Multiplication factor apply to the canvas size to compute the render target size
    * used to generated the glowing objects (the smaller the faster).
    */
  var mainTextureRatio: scala.Double
  /**
    * Enable MSAA by chosing the number of samples.
    */
  var mainTextureSamples: js.UndefOr[scala.Double] = js.undefined
  /**
    * The rendering group to draw the layer in.
    */
  var renderingGroupId: scala.Double
}

object IGlowLayerOptions {
  @scala.inline
  def apply(
    blurKernelSize: scala.Double,
    camera: Nullable[Camera],
    mainTextureRatio: scala.Double,
    renderingGroupId: scala.Double,
    mainTextureFixedSize: scala.Int | scala.Double = null,
    mainTextureSamples: scala.Int | scala.Double = null
  ): IGlowLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blurKernelSize")(blurKernelSize)
    __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    __obj.updateDynamic("mainTextureRatio")(mainTextureRatio)
    __obj.updateDynamic("renderingGroupId")(renderingGroupId)
    if (mainTextureFixedSize != null) __obj.updateDynamic("mainTextureFixedSize")(mainTextureFixedSize.asInstanceOf[js.Any])
    if (mainTextureSamples != null) __obj.updateDynamic("mainTextureSamples")(mainTextureSamples.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGlowLayerOptions]
  }
}

