package typings.ckeditor.CKEDITORNs.htmlParserNs

import typings.ckeditor.ckeditorNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.htmlParser.fragment")
@js.native
class fragment () extends js.Object {
  var children: js.Array[node] = js.native
  var parent: fragment = js.native
  val `type`: Double = js.native
  def add(node: node): Unit = js.native
  def add(node: node, index: Double): Unit = js.native
  def filter(filter: typings.ckeditor.CKEDITORNs.htmlParserNs.filter): Unit = js.native
  def filterChildren(filter: typings.ckeditor.CKEDITORNs.htmlParserNs.filter): Unit = js.native
  def filterChildren(filter: typings.ckeditor.CKEDITORNs.htmlParserNs.filter, filterRoot: Boolean): Unit = js.native
  @JSName("forEach")
  def forEach_false(callback: js.Function1[/* node */ node, Unit | `false`]): Unit = js.native
  @JSName("forEach")
  def forEach_false(callback: js.Function1[/* node */ node, Unit | `false`], `type`: Double): Unit = js.native
  @JSName("forEach")
  def forEach_false(callback: js.Function1[/* node */ node, Unit | `false`], `type`: Double, skipRoot: Boolean): Unit = js.native
  def writeChildrenHtml(writer: basicWriter): Unit = js.native
  def writeChildrenHtml(writer: basicWriter, filter: typings.ckeditor.CKEDITORNs.htmlParserNs.filter): Unit = js.native
  def writeChildrenHtml(writer: basicWriter, filter: typings.ckeditor.CKEDITORNs.htmlParserNs.filter, filterRoot: Boolean): Unit = js.native
  def writeHtml(writer: basicWriter): Unit = js.native
  def writeHtml(writer: basicWriter, filter: typings.ckeditor.CKEDITORNs.htmlParserNs.filter): Unit = js.native
}

/* static members */
@JSGlobal("CKEDITOR.htmlParser.fragment")
@js.native
object fragment extends js.Object {
  def fromBBCode(source: String): fragment = js.native
  def fromHtml(fragmentHtml: String): fragment | element = js.native
  def fromHtml(fragmentHtml: String, parent: String): fragment | element = js.native
  def fromHtml(fragmentHtml: String, parent: String, fixingBlock: String): fragment | element = js.native
  def fromHtml(fragmentHtml: String, parent: String, fixingBlock: Boolean): fragment | element = js.native
  def fromHtml(fragmentHtml: String, parent: element): fragment | element = js.native
  def fromHtml(fragmentHtml: String, parent: element, fixingBlock: String): fragment | element = js.native
  def fromHtml(fragmentHtml: String, parent: element, fixingBlock: Boolean): fragment | element = js.native
}

