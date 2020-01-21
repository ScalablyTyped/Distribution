package typings.backlogJs.mod.Option.Wiki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostWikiParams extends js.Object {
  var content: String
  var mailNotify: js.UndefOr[Boolean] = js.undefined
  var name: String
  var projectId: Double
}

object PostWikiParams {
  @scala.inline
  def apply(content: String, name: String, projectId: Double, mailNotify: js.UndefOr[Boolean] = js.undefined): PostWikiParams = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    if (!js.isUndefined(mailNotify)) __obj.updateDynamic("mailNotify")(mailNotify.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostWikiParams]
  }
}

