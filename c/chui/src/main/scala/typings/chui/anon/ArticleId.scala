package typings.chui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArticleId extends js.Object {
  var articleId: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
}

object ArticleId {
  @scala.inline
  def apply(
    articleId: js.Any = null,
    id: String = null,
    placeholder: String = null,
    results: js.UndefOr[Double] = js.undefined
  ): ArticleId = {
    val __obj = js.Dynamic.literal()
    if (articleId != null) __obj.updateDynamic("articleId")(articleId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(results)) __obj.updateDynamic("results")(results.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArticleId]
  }
}

