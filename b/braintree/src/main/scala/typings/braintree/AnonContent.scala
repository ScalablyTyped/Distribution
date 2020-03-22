package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var category: js.UndefOr[String] = js.undefined
  var content: String
}

object AnonContent {
  @scala.inline
  def apply(content: String, category: String = null): AnonContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
}

