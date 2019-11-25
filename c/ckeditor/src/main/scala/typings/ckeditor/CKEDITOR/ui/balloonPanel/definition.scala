package typings.ckeditor.CKEDITOR.ui.balloonPanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait definition extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object definition {
  @scala.inline
  def apply(content: String = null, title: String = null): definition = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[definition]
  }
}

