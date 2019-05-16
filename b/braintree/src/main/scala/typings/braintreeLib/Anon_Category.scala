package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Category extends js.Object {
  var category: js.UndefOr[java.lang.String] = js.undefined
  var documentId: java.lang.String
}

object Anon_Category {
  @scala.inline
  def apply(documentId: java.lang.String, category: java.lang.String = null): Anon_Category = {
    val __obj = js.Dynamic.literal(documentId = documentId)
    if (category != null) __obj.updateDynamic("category")(category)
    __obj.asInstanceOf[Anon_Category]
  }
}

