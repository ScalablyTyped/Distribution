package typings.cryptoDashJs.cryptoDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decryptor extends js.Object {
  def process(messagePart: String): String
}

object Decryptor {
  @scala.inline
  def apply(process: String => String): Decryptor = {
    val __obj = js.Dynamic.literal(process = js.Any.fromFunction1(process))
  
    __obj.asInstanceOf[Decryptor]
  }
}

