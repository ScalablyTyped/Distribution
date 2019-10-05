package typings.backlogDashJs.backlogDashJsMod.Option.Wiki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchWikiParams extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var mailNotify: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object PatchWikiParams {
  @scala.inline
  def apply(content: String = null, mailNotify: js.UndefOr[Boolean] = js.undefined, name: String = null): PatchWikiParams = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (!js.isUndefined(mailNotify)) __obj.updateDynamic("mailNotify")(mailNotify)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[PatchWikiParams]
  }
}

