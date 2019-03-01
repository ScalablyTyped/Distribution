package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait imageAuditdata extends js.Object {
  var msg: scala.Double
  var probability: scala.Double
  var stars: js.Array[imageAuditdata]
  var `type`: scala.Double
  var words: scala.Double
}

object imageAuditdata {
  @scala.inline
  def apply(
    msg: scala.Double,
    probability: scala.Double,
    stars: js.Array[imageAuditdata],
    `type`: scala.Double,
    words: scala.Double
  ): imageAuditdata = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("msg")(msg)
    __obj.updateDynamic("probability")(probability)
    __obj.updateDynamic("stars")(stars)
    __obj.updateDynamic("words")(words)
    __obj.asInstanceOf[imageAuditdata]
  }
}

