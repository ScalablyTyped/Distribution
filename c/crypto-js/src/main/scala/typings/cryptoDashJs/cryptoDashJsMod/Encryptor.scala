package typings.cryptoDashJs.cryptoDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encryptor extends js.Object {
  def process(messagePart: String): String
}

object Encryptor {
  @scala.inline
  def apply(finalize: () => String, process: String => String): Encryptor = {
    val __obj = js.Dynamic.literal(finalize = js.Any.fromFunction0(finalize), process = js.Any.fromFunction1(process))
  
    __obj.asInstanceOf[Encryptor]
  }
}

