package typings
package bytebufferLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Length extends js.Object {
  var length: scala.Double
  var string: java.lang.String
}

object Anon_Length {
  @scala.inline
  def apply(length: scala.Double, string: java.lang.String): Anon_Length = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("string")(string)
    __obj.asInstanceOf[Anon_Length]
  }
}

