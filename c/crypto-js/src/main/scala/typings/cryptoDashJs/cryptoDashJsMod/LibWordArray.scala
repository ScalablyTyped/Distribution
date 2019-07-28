package typings.cryptoDashJs.cryptoDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibWordArray extends js.Object {
  var sigBytes: Double
  var words: js.Array[Double]
}

object LibWordArray {
  @scala.inline
  def apply(sigBytes: Double, words: js.Array[Double]): LibWordArray = {
    val __obj = js.Dynamic.literal(sigBytes = sigBytes, words = words)
  
    __obj.asInstanceOf[LibWordArray]
  }
}

