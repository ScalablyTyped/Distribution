package typings.azureDashArmDashResource.libResourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpMessage extends js.Object {
  /**
    * HTTP message content.
    */
  var content: js.UndefOr[js.Any] = js.undefined
}

object HttpMessage {
  @scala.inline
  def apply(content: js.Any = null): HttpMessage = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[HttpMessage]
  }
}

