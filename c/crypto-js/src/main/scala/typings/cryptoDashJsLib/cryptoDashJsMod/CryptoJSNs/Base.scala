package typings
package cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  def create(): js.Any
}

object Base {
  @scala.inline
  def apply(create: js.Function0[js.Any]): Base = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.asInstanceOf[Base]
  }
}

