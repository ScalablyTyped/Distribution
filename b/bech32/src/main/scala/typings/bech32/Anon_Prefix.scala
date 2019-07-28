package typings.bech32

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Prefix extends js.Object {
  var prefix: String
  var words: Buffer
}

object Anon_Prefix {
  @scala.inline
  def apply(prefix: String, words: Buffer): Anon_Prefix = {
    val __obj = js.Dynamic.literal(prefix = prefix, words = words)
  
    __obj.asInstanceOf[Anon_Prefix]
  }
}

