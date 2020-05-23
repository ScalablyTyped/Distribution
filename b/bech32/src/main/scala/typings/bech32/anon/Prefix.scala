package typings.bech32.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prefix extends js.Object {
  var prefix: String
  var words: js.Array[Double]
}

object Prefix {
  @scala.inline
  def apply(prefix: String, words: js.Array[Double]): Prefix = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prefix]
  }
}

