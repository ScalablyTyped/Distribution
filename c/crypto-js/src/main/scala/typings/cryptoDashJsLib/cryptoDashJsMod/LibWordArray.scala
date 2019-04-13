package typings
package cryptoDashJsLib.cryptoDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibWordArray extends js.Object {
  var sigBytes: scala.Double
  var words: js.Array[scala.Double]
}

object LibWordArray {
  @scala.inline
  def apply(sigBytes: scala.Double, words: js.Array[scala.Double]): LibWordArray = {
    val __obj = js.Dynamic.literal(sigBytes = sigBytes, words = words)
  
    __obj.asInstanceOf[LibWordArray]
  }
}

