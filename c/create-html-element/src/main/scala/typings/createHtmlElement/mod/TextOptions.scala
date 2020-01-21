package typings.createHtmlElement.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextOptions extends js.Object {
  /**
  		HTML tag value in escaped HTML.
  		*/
  var text: js.UndefOr[String] = js.undefined
}

object TextOptions {
  @scala.inline
  def apply(text: String = null): TextOptions = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextOptions]
  }
}

