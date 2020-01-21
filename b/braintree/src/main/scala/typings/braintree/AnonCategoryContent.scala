package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCategoryContent extends js.Object {
  var category: js.UndefOr[String] = js.undefined
  var content: String
}

object AnonCategoryContent {
  @scala.inline
  def apply(content: String, category: String = null): AnonCategoryContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCategoryContent]
  }
}

