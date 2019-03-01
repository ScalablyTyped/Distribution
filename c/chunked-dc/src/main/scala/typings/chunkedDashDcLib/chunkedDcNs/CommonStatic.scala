package typings
package chunkedDashDcLib.chunkedDcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** common.ts **/
trait CommonStatic extends js.Object {
  var HEADER_LENGTH: scala.Double
}

object CommonStatic {
  @scala.inline
  def apply(HEADER_LENGTH: scala.Double): CommonStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("HEADER_LENGTH")(HEADER_LENGTH)
    __obj.asInstanceOf[CommonStatic]
  }
}

