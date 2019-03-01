package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Touch extends js.Object {
  var clientX: scala.Double
  var clientY: scala.Double
  var identifier: scala.Double
  var pageX: scala.Double
  var pageY: scala.Double
}

object Touch {
  @scala.inline
  def apply(
    clientX: scala.Double,
    clientY: scala.Double,
    identifier: scala.Double,
    pageX: scala.Double,
    pageY: scala.Double
  ): Touch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientX")(clientX)
    __obj.updateDynamic("clientY")(clientY)
    __obj.updateDynamic("identifier")(identifier)
    __obj.updateDynamic("pageX")(pageX)
    __obj.updateDynamic("pageY")(pageY)
    __obj.asInstanceOf[Touch]
  }
}

