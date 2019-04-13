package typings
package cryptoDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CBC extends js.Object {
  var CBC: cryptoDashJsLib.cryptoDashJsMod.Mode
  var CFB: cryptoDashJsLib.cryptoDashJsMod.Mode
  var CTR: cryptoDashJsLib.cryptoDashJsMod.Mode
  var CTRGladman: cryptoDashJsLib.cryptoDashJsMod.Mode
  var ECB: cryptoDashJsLib.cryptoDashJsMod.Mode
  var OFB: cryptoDashJsLib.cryptoDashJsMod.Mode
}

object Anon_CBC {
  @scala.inline
  def apply(
    CBC: cryptoDashJsLib.cryptoDashJsMod.Mode,
    CFB: cryptoDashJsLib.cryptoDashJsMod.Mode,
    CTR: cryptoDashJsLib.cryptoDashJsMod.Mode,
    CTRGladman: cryptoDashJsLib.cryptoDashJsMod.Mode,
    ECB: cryptoDashJsLib.cryptoDashJsMod.Mode,
    OFB: cryptoDashJsLib.cryptoDashJsMod.Mode
  ): Anon_CBC = {
    val __obj = js.Dynamic.literal(CBC = CBC, CFB = CFB, CTR = CTR, CTRGladman = CTRGladman, ECB = ECB, OFB = OFB)
  
    __obj.asInstanceOf[Anon_CBC]
  }
}

