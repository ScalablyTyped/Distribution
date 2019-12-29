package typings.ckeditor.CKEDITOR.htmlParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.htmlParser.text")
@js.native
class text protected () extends node {
  def this(value: String) = this()
  var `type`: Double = js.native
  def filter(filter: typings.ckeditor.CKEDITOR.htmlParser.filter): Boolean = js.native
  def writeHtml(writer: basicWriter): Unit = js.native
  def writeHtml(writer: basicWriter, filter: filter): Unit = js.native
}

