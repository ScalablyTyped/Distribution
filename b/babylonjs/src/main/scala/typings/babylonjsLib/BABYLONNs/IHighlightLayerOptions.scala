package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Highlight layer options. This helps customizing the behaviour
  * of the highlight layer.
  */
trait IHighlightLayerOptions extends js.Object {
  /**
    * Alpha blending mode used to apply the blur. Default is combine.
    */
  var alphaBlendingMode: scala.Double
  /**
    * How big in texel of the blur texture is the horizontal blur.
    */
  var blurHorizontalSize: scala.Double
  /**
    * Multiplication factor apply to the main texture size in the first step of the blur to reduce the size
    * of the picture to blur (the smaller the faster).
    */
  var blurTextureSizeRatio: scala.Double
  /**
    * How big in texel of the blur texture is the vertical blur.
    */
  var blurVerticalSize: scala.Double
  /**
    * The camera attached to the layer.
    */
  var camera: Nullable[Camera]
  /**
    * Should we display highlight as a solid stroke?
    */
  var isStroke: js.UndefOr[scala.Boolean] = js.undefined
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
    * The rendering group to draw the layer in.
    */
  var renderingGroupId: scala.Double
}

