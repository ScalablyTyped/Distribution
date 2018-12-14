package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.htmlWriter")
@js.native
class htmlWriter ()
  extends ckeditorLib.CKEDITORNs.htmlParserNs.basicWriter {
  var indentationChars: java.lang.String = js.native
  var lineBreakChars: java.lang.String = js.native
  var selfClosingEnd: java.lang.String = js.native
  def indentation(): scala.Unit = js.native
  def lineBreak(): scala.Unit = js.native
  def setRules(tagName: java.lang.String, rules: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
}

