package typings.baiduApp.swan.ai

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
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any], stars = stars.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[imageAuditdata]
  }
}

