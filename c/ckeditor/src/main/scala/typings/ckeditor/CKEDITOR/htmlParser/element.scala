package typings.ckeditor.CKEDITOR.htmlParser

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.ckeditorBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait element extends node {
  var attributes: StringDictionary[String] = js.native
  var children: js.Array[node] = js.native
  var name: String = js.native
  var `type`: Double = js.native
  def add(node: node): Unit = js.native
  def add(node: node, index: Double): Unit = js.native
  def addClass(className: String): Unit = js.native
  def filter(filter: typings.ckeditor.CKEDITOR.htmlParser.filter): Boolean = js.native
  def filterChildren(filter: filter): Unit = js.native
  def find(criteria: String): js.Array[node] = js.native
  def find(criteria: String, recursive: Boolean): js.Array[node] = js.native
  def find(criteria: js.Function1[/* el */ node, Boolean]): js.Array[node] = js.native
  def find(criteria: js.Function1[/* el */ node, Boolean], recursive: Boolean): js.Array[node] = js.native
  @JSName("forEach")
  def forEach_false(callback: js.Function1[/* node */ node, Unit | `false`]): Unit = js.native
  @JSName("forEach")
  def forEach_false(callback: js.Function1[/* node */ node, Unit | `false`], `type`: Double): Unit = js.native
  @JSName("forEach")
  def forEach_false(callback: js.Function1[/* node */ node, Unit | `false`], `type`: Double, skipRoot: Boolean): Unit = js.native
  def getFirst(condition: String): node = js.native
  def getFirst(condition: js.Function1[/* node */ node, Boolean]): node = js.native
  def getFirst(condition: StringDictionary[String]): node = js.native
  def getHtml(): String = js.native
  def getOuterHtml(): String = js.native
  def hasClass(className: String): Boolean = js.native
  def removeClass(className: String): Unit = js.native
  def replaceWithChildren(): Unit = js.native
  def setHtml(html: String): Unit = js.native
  def split(index: Double): element = js.native
  def writeChildrenHtml(writer: basicWriter): Unit = js.native
  def writeChildrenHtml(writer: basicWriter, filter: filter): Unit = js.native
  def writeHtml(writer: basicWriter): Unit = js.native
  def writeHtml(writer: basicWriter, filter: filter): Unit = js.native
}

