package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Define options used to create a render target texture
     */
@JSGlobal("BABYLON.RenderTargetCreationOptions")
@js.native
class RenderTargetCreationOptions () extends js.Object {
  /** Defines format (RGBA by default) */
  var format: js.UndefOr[scala.Double] = js.native
  /** Specifies whether or not a depth should be allocated in the texture (true by default) */
  var generateDepthBuffer: js.UndefOr[scala.Boolean] = js.native
  /**
           * Specifies is mipmaps must be generated
           */
  var generateMipMaps: js.UndefOr[scala.Boolean] = js.native
  /** Specifies whether or not a stencil should be allocated in the texture (false by default)*/
  var generateStencilBuffer: js.UndefOr[scala.Boolean] = js.native
  /** Defines sampling mode (trilinear by default) */
  var samplingMode: js.UndefOr[scala.Double] = js.native
  /** Defines texture type (int by default) */
  var `type`: js.UndefOr[scala.Double] = js.native
}

