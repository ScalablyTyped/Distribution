package typings.babylonjs.glowLayerMod

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGlowLayerOptions extends js.Object {
  /**
    * How big is the kernel of the blur texture.
    */
  var blurKernelSize: Double
  /**
    * The camera attached to the layer.
    */
  var camera: Nullable[Camera]
  /**
    * Enforces a fixed size texture to ensure resize independant blur.
    */
  var mainTextureFixedSize: js.UndefOr[Double] = js.undefined
  /**
    * Multiplication factor apply to the canvas size to compute the render target size
    * used to generated the glowing objects (the smaller the faster).
    */
  var mainTextureRatio: Double
  /**
    * Enable MSAA by chosing the number of samples.
    */
  var mainTextureSamples: js.UndefOr[Double] = js.undefined
  /**
    * The rendering group to draw the layer in.
    */
  var renderingGroupId: Double
}

object IGlowLayerOptions {
  @scala.inline
  def apply(
    blurKernelSize: Double,
    mainTextureRatio: Double,
    renderingGroupId: Double,
    camera: Nullable[Camera] = null,
    mainTextureFixedSize: Int | Double = null,
    mainTextureSamples: Int | Double = null
  ): IGlowLayerOptions = {
    val __obj = js.Dynamic.literal(blurKernelSize = blurKernelSize.asInstanceOf[js.Any], mainTextureRatio = mainTextureRatio.asInstanceOf[js.Any], renderingGroupId = renderingGroupId.asInstanceOf[js.Any])
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (mainTextureFixedSize != null) __obj.updateDynamic("mainTextureFixedSize")(mainTextureFixedSize.asInstanceOf[js.Any])
    if (mainTextureSamples != null) __obj.updateDynamic("mainTextureSamples")(mainTextureSamples.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGlowLayerOptions]
  }
}

