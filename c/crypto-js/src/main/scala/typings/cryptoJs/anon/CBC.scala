package typings.cryptoJs.anon

import typings.cryptoJs.mod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CBC extends js.Object {
  var CBC: Mode
  var CFB: Mode
  var CTR: Mode
  var CTRGladman: Mode
  var ECB: Mode
  var OFB: Mode
}

object CBC {
  @scala.inline
  def apply(CBC: Mode, CFB: Mode, CTR: Mode, CTRGladman: Mode, ECB: Mode, OFB: Mode): CBC = {
    val __obj = js.Dynamic.literal(CBC = CBC.asInstanceOf[js.Any], CFB = CFB.asInstanceOf[js.Any], CTR = CTR.asInstanceOf[js.Any], CTRGladman = CTRGladman.asInstanceOf[js.Any], ECB = ECB.asInstanceOf[js.Any], OFB = OFB.asInstanceOf[js.Any])
    __obj.asInstanceOf[CBC]
  }
}

