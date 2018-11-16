package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Creation options of the multi render target texture.
     */

trait IMultiRenderTargetOptions extends js.Object {
  /**
           * Define the default type of the buffers we are creating
           */
  var defaultType: js.UndefOr[scala.Double] = js.undefined
  /**
           * Define if aspect ratio should be adapted to the texture or stay the scene one
           */
  var doNotChangeAspectRatio: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Define if a depth buffer is required
           */
  var generateDepthBuffer: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Define if a depth texture is required instead of a depth buffer
           */
  var generateDepthTexture: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Define if the texture needs to create mip maps after render.
           */
  var generateMipMaps: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Define if a stencil buffer is required
           */
  var generateStencilBuffer: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Define the sampling modes of all the draw buffers we want to create
           */
  var samplingModes: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
           * Define the number of desired draw buffers
           */
  var textureCount: js.UndefOr[scala.Double] = js.undefined
  /**
           * Define the types of all the draw buffers we want to create
           */
  var types: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

