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
    val __obj = js.Dynamic.literal(msg = msg, probability = probability, stars = stars, words = words)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[imageAuditdata]
  }
}

