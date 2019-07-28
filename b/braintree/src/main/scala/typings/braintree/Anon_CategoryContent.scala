package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CategoryContent extends js.Object {
  var category: js.UndefOr[String] = js.undefined
  var content: String
}

object Anon_CategoryContent {
  @scala.inline
  def apply(content: String, category: String = null): Anon_CategoryContent = {
    val __obj = js.Dynamic.literal(content = content)
    if (category != null) __obj.updateDynamic("category")(category)
    __obj.asInstanceOf[Anon_CategoryContent]
  }
}

