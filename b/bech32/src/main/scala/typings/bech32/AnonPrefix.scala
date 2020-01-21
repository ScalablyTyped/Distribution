package typings.bech32

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrefix extends js.Object {
  var prefix: String
  var words: Buffer
}

object AnonPrefix {
  @scala.inline
  def apply(prefix: String, words: Buffer): AnonPrefix = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPrefix]
  }
}

