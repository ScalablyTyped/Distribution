package typings.ckeditor.CKEDITORNs.htmlParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.htmlParser.comment")
@js.native
class comment protected () extends node {
  def this(value: String) = this()
  var `type`: Double = js.native
  var value: String = js.native
  def filter(filter: typings.ckeditor.CKEDITORNs.htmlParserNs.filter): Boolean = js.native
  def writeHtml(writer: basicWriter): Unit = js.native
  def writeHtml(writer: basicWriter, filter: typings.ckeditor.CKEDITORNs.htmlParserNs.filter): Unit = js.native
}

