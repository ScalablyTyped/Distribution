package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFallbackUrl extends js.Object {
  /**
    * The url to the fallback JavaScript module.
    */
  var fallbackUrl: js.UndefOr[String] = js.undefined
  /**
    * The url to the WebAssembly binary.
    */
  var wasmBinaryUrl: js.UndefOr[String] = js.undefined
  /**
    * The url to the WebAssembly module.
    */
  var wasmUrl: js.UndefOr[String] = js.undefined
}

object AnonFallbackUrl {
  @scala.inline
  def apply(fallbackUrl: String = null, wasmBinaryUrl: String = null, wasmUrl: String = null): AnonFallbackUrl = {
    val __obj = js.Dynamic.literal()
    if (fallbackUrl != null) __obj.updateDynamic("fallbackUrl")(fallbackUrl.asInstanceOf[js.Any])
    if (wasmBinaryUrl != null) __obj.updateDynamic("wasmBinaryUrl")(wasmBinaryUrl.asInstanceOf[js.Any])
    if (wasmUrl != null) __obj.updateDynamic("wasmUrl")(wasmUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFallbackUrl]
  }
}

