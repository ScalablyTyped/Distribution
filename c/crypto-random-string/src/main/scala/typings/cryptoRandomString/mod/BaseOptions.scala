package typings.cryptoRandomString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  /**
  	Length of the returned string.
  	*/
  var length: Double
}

object BaseOptions {
  @scala.inline
  def apply(length: Double): BaseOptions = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
}

