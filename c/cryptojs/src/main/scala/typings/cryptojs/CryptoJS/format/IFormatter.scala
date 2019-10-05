package typings.cryptojs.CryptoJS.format

import typings.cryptojs.CryptoJS.lib.CipherParams
import typings.cryptojs.CryptoJS.lib.CipherParamsData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFormatter extends js.Object {
  def parse(s: String): CipherParams
  def stringify(cipherParams: CipherParamsData): String
}

object IFormatter {
  @scala.inline
  def apply(parse: String => CipherParams, stringify: CipherParamsData => String): IFormatter = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
  
    __obj.asInstanceOf[IFormatter]
  }
}

