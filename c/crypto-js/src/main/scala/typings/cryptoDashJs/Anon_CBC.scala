package typings.cryptoDashJs

import typings.cryptoDashJs.cryptoDashJsMod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CBC extends js.Object {
  var CBC: Mode
  var CFB: Mode
  var CTR: Mode
  var CTRGladman: Mode
  var ECB: Mode
  var OFB: Mode
}

object Anon_CBC {
  @scala.inline
  def apply(CBC: Mode, CFB: Mode, CTR: Mode, CTRGladman: Mode, ECB: Mode, OFB: Mode): Anon_CBC = {
    val __obj = js.Dynamic.literal(CBC = CBC, CFB = CFB, CTR = CTR, CTRGladman = CTRGladman, ECB = ECB, OFB = OFB)
  
    __obj.asInstanceOf[Anon_CBC]
  }
}

