package typings.ckeditorCkeditor5Engine.mod.dataprocessor

import typings.ckeditorCkeditor5Engine.mod.model.DocumentFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/dataprocessor/htmlwriter
trait HtmlWriter extends js.Object {
  def getHtml(fragment: DocumentFragment): String
}

object HtmlWriter {
  @scala.inline
  def apply(getHtml: DocumentFragment => String): HtmlWriter = {
    val __obj = js.Dynamic.literal(getHtml = js.Any.fromFunction1(getHtml))
    __obj.asInstanceOf[HtmlWriter]
  }
}

