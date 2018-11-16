package typings
package ckeditorLib.CKEDITORNs.htmlParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.htmlParser.comment")
@js.native
class comment protected () extends node {
  def this(value: java.lang.String) = this()
  var `type`: scala.Double = js.native
  var value: java.lang.String = js.native
  def filter(filter: filter): scala.Boolean = js.native
  def writeHtml(writer: basicWriter): scala.Unit = js.native
  def writeHtml(writer: basicWriter, filter: filter): scala.Unit = js.native
}

