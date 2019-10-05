package typings.backlogDashJs.backlogDashJsMod.Option.Wiki

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
    val __obj = js.Dynamic.literal(content = content, name = name, projectId = projectId)
    if (!js.isUndefined(mailNotify)) __obj.updateDynamic("mailNotify")(mailNotify)
    __obj.asInstanceOf[PostWikiParams]
  }
}

