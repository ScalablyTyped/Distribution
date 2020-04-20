package typings.cryptojs.CryptoJS.format

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatStatic extends js.Object {
  var Hex: IFormatter
  var OpenSSL: IFormatter
}

object FormatStatic {
  @scala.inline
  def apply(Hex: IFormatter, OpenSSL: IFormatter): FormatStatic = {
    val __obj = js.Dynamic.literal(Hex = Hex.asInstanceOf[js.Any], OpenSSL = OpenSSL.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatStatic]
  }
}

