package typings
package bech32Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Prefix extends js.Object {
  var prefix: java.lang.String
  var words: nodeLib.Buffer
}

object Anon_Prefix {
  @scala.inline
  def apply(prefix: java.lang.String, words: nodeLib.Buffer): Anon_Prefix = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("prefix")(prefix)
    __obj.updateDynamic("words")(words)
    __obj.asInstanceOf[Anon_Prefix]
  }
}

