package typings
package cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decryptor extends js.Object {
  def process(messagePart: java.lang.String): java.lang.String
}

object Decryptor {
  @scala.inline
  def apply(
    finalize: js.Function0[java.lang.String],
    process: js.Function1[java.lang.String, java.lang.String]
  ): Decryptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("finalize")(finalize)
    __obj.updateDynamic("process")(process)
    __obj.asInstanceOf[Decryptor]
  }
}

