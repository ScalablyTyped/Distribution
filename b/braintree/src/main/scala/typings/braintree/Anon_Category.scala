package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Category extends js.Object {
  var category: js.UndefOr[String] = js.undefined
  var documentId: String
}

object Anon_Category {
  @scala.inline
  def apply(documentId: String, category: String = null): Anon_Category = {
    val __obj = js.Dynamic.literal(documentId = documentId.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Category]
  }
}

