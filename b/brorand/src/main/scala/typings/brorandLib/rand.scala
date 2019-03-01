package typings
package brorandLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait rand extends js.Object {
  def getByte(): scala.Double
}

object rand {
  @scala.inline
  def apply(getByte: js.Function0[scala.Double]): rand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getByte")(getByte)
    __obj.asInstanceOf[rand]
  }
}

