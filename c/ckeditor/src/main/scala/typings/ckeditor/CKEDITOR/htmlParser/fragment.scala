package typings.ckeditor.CKEDITOR.htmlParser

import typings.ckeditor.ckeditorBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait fragment extends js.Object {
  var children: js.Array[node] = js.native
  var parent: fragment = js.native
  val `type`: Double = js.native
  def add(node: node): Unit = js.native
  def add(node: node, index: Double): Unit = js.native
  def filter(filter: typings.ckeditor.CKEDITOR.htmlParser.filter): Unit = js.native
  def filterChildren(filter: filter): Unit = js.native
  def filterChildren(filter: filter, filterRoot: Boolean): Unit = js.native
  @JSName("forEach")
  def forEach_false(callback: js.Function1[/* node */ node, Unit | `false`]): Unit = js.native
  @JSName("forEach")
  def forEach_false(callback: js.Function1[/* node */ node, Unit | `false`], `type`: Double): Unit = js.native
  @JSName("forEach")
  def forEach_false(callback: js.Function1[/* node */ node, Unit | `false`], `type`: Double, skipRoot: Boolean): Unit = js.native
  def writeChildrenHtml(writer: basicWriter): Unit = js.native
  def writeChildrenHtml(writer: basicWriter, filter: filter): Unit = js.native
  def writeChildrenHtml(writer: basicWriter, filter: filter, filterRoot: Boolean): Unit = js.native
  def writeHtml(writer: basicWriter): Unit = js.native
  def writeHtml(writer: basicWriter, filter: filter): Unit = js.native
}

