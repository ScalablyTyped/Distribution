package typings
package cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CipherOption
  extends /* option */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var iv: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
  var padding: js.UndefOr[Padding] = js.undefined
}

object CipherOption {
  @scala.inline
  def apply(
    StringDictionary: /* option */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    iv: java.lang.String = null,
    mode: Mode = null,
    padding: Padding = null
  ): CipherOption = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (iv != null) __obj.updateDynamic("iv")(iv)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    __obj.asInstanceOf[CipherOption]
  }
}

