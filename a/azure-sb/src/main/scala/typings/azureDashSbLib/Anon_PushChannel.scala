package typings
package azureDashSbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PushChannel extends js.Object {
  var pushChannel: java.lang.String
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var templates: js.UndefOr[js.Any] = js.undefined
}

object Anon_PushChannel {
  @scala.inline
  def apply(pushChannel: java.lang.String, tags: js.Array[java.lang.String] = null, templates: js.Any = null): Anon_PushChannel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pushChannel")(pushChannel)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (templates != null) __obj.updateDynamic("templates")(templates)
    __obj.asInstanceOf[Anon_PushChannel]
  }
}

