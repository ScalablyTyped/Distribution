package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Effect layer options. This helps customizing the behaviour
     * of the effect layer.
     */

trait IEffectLayerOptions extends js.Object {
  /**
           * Alpha blending mode used to apply the blur. Default depends of the implementation.
           */
  var alphaBlendingMode: scala.Double
  /**
           * The camera attached to the layer.
           */
  var camera: Nullable[Camera]
  /**
           * Enforces a fixed size texture to ensure effect stability across devices.
           */
  var mainTextureFixedSize: js.UndefOr[scala.Double] = js.undefined
  /**
           * Multiplication factor apply to the canvas size to compute the render target size
           * used to generated the objects (the smaller the faster).
           */
  var mainTextureRatio: scala.Double
  /**
           * The rendering group to draw the layer in.
           */
  var renderingGroupId: scala.Double
}

