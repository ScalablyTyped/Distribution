package typings
package cryptojsLib.CryptoJSNs.modeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModeStatic extends js.Object {
  var CBC: cryptojsLib.CryptoJSNs.modeNs.CBC
  var CFB: cryptojsLib.CryptoJSNs.modeNs.CFB
  var CTR: cryptojsLib.CryptoJSNs.modeNs.CTR
  var CTRGladman: cryptojsLib.CryptoJSNs.modeNs.CTRGladman
  var ECB: cryptojsLib.CryptoJSNs.modeNs.ECB
  var OFB: cryptojsLib.CryptoJSNs.modeNs.OFB
}

object ModeStatic {
  @scala.inline
  def apply(CBC: CBC, CFB: CFB, CTR: CTR, CTRGladman: CTRGladman, ECB: ECB, OFB: OFB): ModeStatic = {
    val __obj = js.Dynamic.literal(CBC = CBC, CFB = CFB, CTR = CTR, CTRGladman = CTRGladman, ECB = ECB, OFB = OFB)
  
    __obj.asInstanceOf[ModeStatic]
  }
}

