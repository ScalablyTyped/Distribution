package typings.chui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArticleId extends js.Object {
  var articleId: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
}

object AnonArticleId {
  @scala.inline
  def apply(
    articleId: js.Any = null,
    id: String = null,
    placeholder: String = null,
    results: Int | Double = null
  ): AnonArticleId = {
    val __obj = js.Dynamic.literal()
    if (articleId != null) __obj.updateDynamic("articleId")(articleId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArticleId]
  }
}

