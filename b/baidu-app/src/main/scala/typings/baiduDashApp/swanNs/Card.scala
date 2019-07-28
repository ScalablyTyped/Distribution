package typings.baiduDashApp.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 开放接口-----卡券
trait Card extends js.Object {
  var cardExt: String
  var cardId: String
  var code: js.UndefOr[String] = js.undefined
}

object Card {
  @scala.inline
  def apply(cardExt: String, cardId: String, code: String = null): Card = {
    val __obj = js.Dynamic.literal(cardExt = cardExt, cardId = cardId)
    if (code != null) __obj.updateDynamic("code")(code)
    __obj.asInstanceOf[Card]
  }
}

