package typings
package cryptoDashJsLib.cryptoDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encryptor extends js.Object {
  def process(messagePart: java.lang.String): java.lang.String
}

object Encryptor {
  @scala.inline
  def apply(finalize: () => java.lang.String, process: java.lang.String => java.lang.String): Encryptor = {
    val __obj = js.Dynamic.literal(finalize = js.Any.fromFunction0(finalize), process = js.Any.fromFunction1(process))
  
    __obj.asInstanceOf[Encryptor]
  }
}

