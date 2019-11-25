package typings.azureDashSb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PushChannel extends js.Object {
  var pushChannel: String
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  var templates: js.UndefOr[js.Any] = js.undefined
}

object Anon_PushChannel {
  @scala.inline
  def apply(pushChannel: String, tags: js.Array[String] = null, templates: js.Any = null): Anon_PushChannel = {
    val __obj = js.Dynamic.literal(pushChannel = pushChannel.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (templates != null) __obj.updateDynamic("templates")(templates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PushChannel]
  }
}

