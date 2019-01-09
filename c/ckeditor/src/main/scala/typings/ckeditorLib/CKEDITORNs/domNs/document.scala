package typings
package ckeditorLib.CKEDITORNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dom.document")
@js.native
class document protected () extends domObject {
  def this(domDocument: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  @JSName("$")
  val $_document: stdLib.Document = js.native
  val `type`: scala.Double = js.native
  def appendStyleSheet(cssFileUrl: java.lang.String): scala.Unit = js.native
  def appendStyleText(cssStyleText: java.lang.String): stdLib.CSSStyleSheet = js.native
  def createElement(name: java.lang.String): element = js.native
  def createElement(name: java.lang.String, attribsAndStyles: ckeditorLib.Anon_Attributes): element = js.native
  def createText(text: java.lang.String): element = js.native
  def find(selector: java.lang.String): nodeList = js.native
  def findOne(selector: java.lang.String): element = js.native
  def focus(): scala.Unit = js.native
  def getActive(): element = js.native
  def getBody(): element = js.native
  def getByAddress(address: js.Array[_]): node = js.native
  def getByAddress(address: js.Array[_], normalized: scala.Boolean): node = js.native
  def getById(elementId: java.lang.String): element = js.native
  def getDocumentElement(): element = js.native
  def getElementsByTag(tagName: java.lang.String): nodeList = js.native
  def getHead(): element = js.native
  def getSelection(): selection = js.native
  def getWindow(): window = js.native
  def write(html: java.lang.String): scala.Unit = js.native
}

