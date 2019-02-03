package typings
package ckeditorLib.CKEDITORNs.htmlParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.htmlParser.fragment")
@js.native
class fragment () extends js.Object {
  var children: js.Array[node] = js.native
  var parent: fragment = js.native
  val `type`: scala.Double = js.native
  def add(node: node): scala.Unit = js.native
  def add(node: node, index: scala.Double): scala.Unit = js.native
  def filter(filter: filter): scala.Unit = js.native
  def filterChildren(filter: filter): scala.Unit = js.native
  def filterChildren(filter: filter, filterRoot: scala.Boolean): scala.Unit = js.native
  def forEach(callback: js.Function1[/* node */ node, scala.Unit | ckeditorLib.ckeditorLibNumbers.`false`]): scala.Unit = js.native
  def forEach(
    callback: js.Function1[/* node */ node, scala.Unit | ckeditorLib.ckeditorLibNumbers.`false`],
    `type`: scala.Double
  ): scala.Unit = js.native
  def forEach(
    callback: js.Function1[/* node */ node, scala.Unit | ckeditorLib.ckeditorLibNumbers.`false`],
    `type`: scala.Double,
    skipRoot: scala.Boolean
  ): scala.Unit = js.native
  def writeChildrenHtml(writer: basicWriter): scala.Unit = js.native
  def writeChildrenHtml(writer: basicWriter, filter: filter): scala.Unit = js.native
  def writeChildrenHtml(writer: basicWriter, filter: filter, filterRoot: scala.Boolean): scala.Unit = js.native
  def writeHtml(writer: basicWriter): scala.Unit = js.native
  def writeHtml(writer: basicWriter, filter: filter): scala.Unit = js.native
}

/* static members */
@JSGlobal("CKEDITOR.htmlParser.fragment")
@js.native
object fragment extends js.Object {
  def fromBBCode(source: java.lang.String): ckeditorLib.CKEDITORNs.htmlParserNs.fragment = js.native
  def fromHtml(fragmentHtml: java.lang.String): ckeditorLib.CKEDITORNs.htmlParserNs.fragment | ckeditorLib.CKEDITORNs.htmlParserNs.element = js.native
  def fromHtml(fragmentHtml: java.lang.String, parent: ckeditorLib.CKEDITORNs.htmlParserNs.element): ckeditorLib.CKEDITORNs.htmlParserNs.fragment | ckeditorLib.CKEDITORNs.htmlParserNs.element = js.native
  def fromHtml(
    fragmentHtml: java.lang.String,
    parent: ckeditorLib.CKEDITORNs.htmlParserNs.element,
    fixingBlock: java.lang.String
  ): ckeditorLib.CKEDITORNs.htmlParserNs.fragment | ckeditorLib.CKEDITORNs.htmlParserNs.element = js.native
  def fromHtml(
    fragmentHtml: java.lang.String,
    parent: ckeditorLib.CKEDITORNs.htmlParserNs.element,
    fixingBlock: scala.Boolean
  ): ckeditorLib.CKEDITORNs.htmlParserNs.fragment | ckeditorLib.CKEDITORNs.htmlParserNs.element = js.native
  def fromHtml(fragmentHtml: java.lang.String, parent: java.lang.String): ckeditorLib.CKEDITORNs.htmlParserNs.fragment | ckeditorLib.CKEDITORNs.htmlParserNs.element = js.native
  def fromHtml(fragmentHtml: java.lang.String, parent: java.lang.String, fixingBlock: java.lang.String): ckeditorLib.CKEDITORNs.htmlParserNs.fragment | ckeditorLib.CKEDITORNs.htmlParserNs.element = js.native
  def fromHtml(fragmentHtml: java.lang.String, parent: java.lang.String, fixingBlock: scala.Boolean): ckeditorLib.CKEDITORNs.htmlParserNs.fragment | ckeditorLib.CKEDITORNs.htmlParserNs.element = js.native
}

