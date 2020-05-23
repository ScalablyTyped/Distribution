package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends js.Object {
  var category: js.UndefOr[String] = js.undefined
  var documentId: String
}

object Category {
  @scala.inline
  def apply(documentId: String, category: String = null): Category = {
    val __obj = js.Dynamic.literal(documentId = documentId.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
}

