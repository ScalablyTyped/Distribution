package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.htmlDataProcessor")
@js.native
class htmlDataProcessor protected () extends dataProcessor {
  def this(editor: editor) = this()
  var dataFilter: ckeditorLib.CKEDITORNs.htmlParserNs.filter = js.native
  var htmlFilter: ckeditorLib.CKEDITORNs.htmlParserNs.filter = js.native
  var writer: ckeditorLib.CKEDITORNs.htmlParserNs.basicWriter = js.native
  def toDataFormat(html: java.lang.String): java.lang.String = js.native
  def toDataFormat(html: java.lang.String, options: ckeditorLib.Anon_Filter): java.lang.String = js.native
  def toHtml(data: java.lang.String, options: htmlDataProcessorOptions): java.lang.String = js.native
}

