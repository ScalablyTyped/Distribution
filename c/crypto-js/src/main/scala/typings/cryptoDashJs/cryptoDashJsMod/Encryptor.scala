package typings.cryptoDashJs.cryptoDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encryptor extends js.Object {
  def process(messagePart: String): String
}

object Encryptor {
  @scala.inline
  def apply(process: String => String): Encryptor = {
    val __obj = js.Dynamic.literal(process = js.Any.fromFunction1(process))
  
    __obj.asInstanceOf[Encryptor]
  }
}

