package typings
package cryptojsLib.CryptoJSNs.modeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModeStatic extends js.Object {
  var CBC: CBC
  var CFB: CFB
  var CTR: CTR
  var CTRGladman: CTRGladman
  var ECB: ECB
  var OFB: OFB
}

object ModeStatic {
  @scala.inline
  def apply(CBC: CBC, CFB: CFB, CTR: CTR, CTRGladman: CTRGladman, ECB: ECB, OFB: OFB): ModeStatic = {
    val __obj = js.Dynamic.literal(CBC = CBC, CFB = CFB, CTR = CTR, CTRGladman = CTRGladman, ECB = ECB, OFB = OFB)
  
    __obj.asInstanceOf[ModeStatic]
  }
}

