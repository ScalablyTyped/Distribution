package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FallbackUrl extends js.Object {
  /**
    * The url to the fallback JavaScript module.
    */
  var fallbackUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The url to the WebAssembly binary.
    */
  var wasmBinaryUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The url to the WebAssembly module.
    */
  var wasmUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_FallbackUrl {
  @scala.inline
  def apply(
    fallbackUrl: java.lang.String = null,
    wasmBinaryUrl: java.lang.String = null,
    wasmUrl: java.lang.String = null
  ): Anon_FallbackUrl = {
    val __obj = js.Dynamic.literal()
    if (fallbackUrl != null) __obj.updateDynamic("fallbackUrl")(fallbackUrl)
    if (wasmBinaryUrl != null) __obj.updateDynamic("wasmBinaryUrl")(wasmBinaryUrl)
    if (wasmUrl != null) __obj.updateDynamic("wasmUrl")(wasmUrl)
    __obj.asInstanceOf[Anon_FallbackUrl]
  }
}

