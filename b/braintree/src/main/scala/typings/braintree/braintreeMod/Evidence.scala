package typings.braintree.braintreeMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Evidence extends js.Object {
  var comment: js.UndefOr[String] = js.undefined
  var createdAt: Date
  var id: String
  var sendToProcessorAt: Date
  var url: js.UndefOr[String] = js.undefined
}

object Evidence {
  @scala.inline
  def apply(createdAt: Date, id: String, sendToProcessorAt: Date, comment: String = null, url: String = null): Evidence = {
    val __obj = js.Dynamic.literal(createdAt = createdAt, id = id, sendToProcessorAt = sendToProcessorAt)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Evidence]
  }
}

