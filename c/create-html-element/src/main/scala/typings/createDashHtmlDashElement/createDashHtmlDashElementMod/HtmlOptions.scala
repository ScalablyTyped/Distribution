package typings.createDashHtmlDashElement.createDashHtmlDashElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlOptions extends js.Object {
  /**
  		HTML tag value in unescaped HTML.
  		*/
  var html: js.UndefOr[String] = js.undefined
}

object HtmlOptions {
  @scala.inline
  def apply(html: String = null): HtmlOptions = {
    val __obj = js.Dynamic.literal()
    if (html != null) __obj.updateDynamic("html")(html)
    __obj.asInstanceOf[HtmlOptions]
  }
}

