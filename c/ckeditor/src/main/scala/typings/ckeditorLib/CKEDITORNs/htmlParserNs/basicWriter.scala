package typings
package ckeditorLib.CKEDITORNs.htmlParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.htmlParser.basicWriter")
@js.native
class basicWriter () extends js.Object {
  def attribute(attName: java.lang.String, attValue: java.lang.String): scala.Unit = js.native
  def closeTag(tagName: java.lang.String): scala.Unit = js.native
  def comment(comment: java.lang.String): scala.Unit = js.native
  def getHtml(reset: scala.Boolean): java.lang.String = js.native
  def openTag(tagName: java.lang.String, attributes: ScalablyTyped.runtime.StringDictionary[java.lang.String]): scala.Unit = js.native
  def openTagClose(tagName: java.lang.String, isSelfClose: scala.Boolean): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def text(text: java.lang.String): scala.Unit = js.native
  def write(data: java.lang.String): scala.Unit = js.native
}

