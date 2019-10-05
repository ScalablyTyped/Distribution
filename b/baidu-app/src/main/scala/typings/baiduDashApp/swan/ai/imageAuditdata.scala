package typings.baiduDashApp.swan.ai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait imageAuditdata extends js.Object {
  var msg: Double
  var probability: Double
  var stars: js.Array[imageAuditdata]
  var `type`: Double
  var words: Double
}

object imageAuditdata {
  @scala.inline
  def apply(msg: Double, probability: Double, stars: js.Array[imageAuditdata], `type`: Double, words: Double): imageAuditdata = {
    val __obj = js.Dynamic.literal(msg = msg, probability = probability, stars = stars, words = words)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[imageAuditdata]
  }
}

