package typings
package cryptoDashJsLib.cryptoDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decryptor extends js.Object {
  def process(messagePart: java.lang.String): java.lang.String
}

object Decryptor {
  @scala.inline
  def apply(finalize: () => java.lang.String, process: java.lang.String => java.lang.String): Decryptor = {
    val __obj = js.Dynamic.literal(finalize = js.Any.fromFunction0(finalize), process = js.Any.fromFunction1(process))
  
    __obj.asInstanceOf[Decryptor]
  }
}

