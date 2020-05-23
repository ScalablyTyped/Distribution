package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var category: js.UndefOr[String] = js.undefined
  var content: String
}

object Content {
  @scala.inline
  def apply(content: String, category: String = null): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

