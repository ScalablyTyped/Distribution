package typings.cryptojs.CryptoJS.enc

import typings.cryptojs.CryptoJS.lib.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICoder
  extends IEncoder
     with IDecoder
object ICoder {
  
  @scala.inline
  def apply(parse: String => WordArray, stringify: WordArray => String): ICoder = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[ICoder]
  }
}
