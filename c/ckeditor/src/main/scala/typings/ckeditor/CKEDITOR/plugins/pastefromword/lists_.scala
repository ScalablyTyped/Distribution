package typings.ckeditor.CKEDITOR.plugins.pastefromword

import typings.ckeditor.CKEDITOR.plugins.pastefromword.lists.numbering
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait lists_ extends js.Object {
  var numbering: numbering
}

object lists_ {
  @scala.inline
  def apply(numbering: numbering): lists_ = {
    val __obj = js.Dynamic.literal(numbering = numbering.asInstanceOf[js.Any])
    __obj.asInstanceOf[lists_]
  }
}

