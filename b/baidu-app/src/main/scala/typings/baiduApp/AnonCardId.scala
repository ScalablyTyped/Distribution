package typings.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCardId extends js.Object {
  var cardId: String
  var code: String
}

object AnonCardId {
  @scala.inline
  def apply(cardId: String, code: String): AnonCardId = {
    val __obj = js.Dynamic.literal(cardId = cardId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCardId]
  }
}

