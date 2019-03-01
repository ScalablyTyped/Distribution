package typings
package cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoder extends js.Object {
  def parse(encodedMessage: java.lang.String): js.Any
  def stringify(words: js.Any): java.lang.String
}

object Encoder {
  @scala.inline
  def apply(parse: js.Function1[java.lang.String, js.Any], stringify: js.Function1[js.Any, java.lang.String]): Encoder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(parse)
    __obj.updateDynamic("stringify")(stringify)
    __obj.asInstanceOf[Encoder]
  }
}

