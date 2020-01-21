package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCategory extends js.Object {
  var category: js.UndefOr[String] = js.undefined
  var documentId: String
}

object AnonCategory {
  @scala.inline
  def apply(documentId: String, category: String = null): AnonCategory = {
    val __obj = js.Dynamic.literal(documentId = documentId.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCategory]
  }
}

