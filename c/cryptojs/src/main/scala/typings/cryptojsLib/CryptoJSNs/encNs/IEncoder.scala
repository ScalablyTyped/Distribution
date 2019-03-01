package typings
package cryptojsLib.CryptoJSNs.encNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEncoder extends js.Object {
  def stringify(wordArray: cryptojsLib.CryptoJSNs.libNs.WordArray): java.lang.String
}

object IEncoder {
  @scala.inline
  def apply(stringify: js.Function1[cryptojsLib.CryptoJSNs.libNs.WordArray, java.lang.String]): IEncoder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stringify")(stringify)
    __obj.asInstanceOf[IEncoder]
  }
}

