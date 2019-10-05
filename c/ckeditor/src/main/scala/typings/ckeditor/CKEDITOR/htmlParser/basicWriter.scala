package typings.ckeditor.CKEDITOR.htmlParser

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.htmlParser.basicWriter")
@js.native
class basicWriter () extends js.Object {
  def attribute(attName: String, attValue: String): Unit = js.native
  def closeTag(tagName: String): Unit = js.native
  def comment(comment: String): Unit = js.native
  def getHtml(reset: Boolean): String = js.native
  def openTag(tagName: String, attributes: StringDictionary[String]): Unit = js.native
  def openTagClose(tagName: String, isSelfClose: Boolean): Unit = js.native
  def reset(): Unit = js.native
  def text(text: String): Unit = js.native
  def write(data: String): Unit = js.native
}

