package typings.chunkedDc.chunkedDc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** common.ts **/
trait CommonStatic extends js.Object {
  var HEADER_LENGTH: Double
}

object CommonStatic {
  @scala.inline
  def apply(HEADER_LENGTH: Double): CommonStatic = {
    val __obj = js.Dynamic.literal(HEADER_LENGTH = HEADER_LENGTH.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonStatic]
  }
}

