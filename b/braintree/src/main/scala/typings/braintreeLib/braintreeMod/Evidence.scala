package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Evidence extends js.Object {
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var createdAt: stdLib.Date
  var id: java.lang.String
  var sendToProcessorAt: stdLib.Date
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Evidence {
  @scala.inline
  def apply(
    createdAt: stdLib.Date,
    id: java.lang.String,
    sendToProcessorAt: stdLib.Date,
    comment: java.lang.String = null,
    url: java.lang.String = null
  ): Evidence = {
    val __obj = js.Dynamic.literal(createdAt = createdAt, id = id, sendToProcessorAt = sendToProcessorAt)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Evidence]
  }
}

