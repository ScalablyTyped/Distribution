package typings
package ckeditorLib.CKEDITORNs.htmlParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.htmlParser.element")
@js.native
class element protected () extends node {
  def this(name: java.lang.String, attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String]) = this()
  var attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var children: js.Array[node] = js.native
  var name: java.lang.String = js.native
  var `type`: scala.Double = js.native
  def add(node: node): scala.Unit = js.native
  def add(node: node, index: scala.Double): scala.Unit = js.native
  def addClass(className: java.lang.String): scala.Unit = js.native
  def filter(filter: filter): scala.Boolean = js.native
  def filterChildren(filter: filter): scala.Unit = js.native
  def find(criteria: java.lang.String): js.Array[node] = js.native
  def find(criteria: java.lang.String, recursive: scala.Boolean): js.Array[node] = js.native
  def find(criteria: js.Function1[/* el */ node, scala.Boolean]): js.Array[node] = js.native
  def find(criteria: js.Function1[/* el */ node, scala.Boolean], recursive: scala.Boolean): js.Array[node] = js.native
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
  def getFirst(condition: java.lang.String): node = js.native
  def getFirst(condition: js.Function1[/* node */ node, scala.Boolean]): node = js.native
  def getFirst(condition: org.scalablytyped.runtime.StringDictionary[java.lang.String]): node = js.native
  def getHtml(): java.lang.String = js.native
  def getOuterHtml(): java.lang.String = js.native
  def hasClass(className: java.lang.String): scala.Boolean = js.native
  def removeClass(className: java.lang.String): scala.Unit = js.native
  def replaceWithChildren(): scala.Unit = js.native
  def setHtml(html: java.lang.String): scala.Unit = js.native
  def split(index: scala.Double): element = js.native
  def writeChildrenHtml(writer: basicWriter): scala.Unit = js.native
  def writeChildrenHtml(writer: basicWriter, filter: filter): scala.Unit = js.native
  def writeHtml(writer: basicWriter): scala.Unit = js.native
  def writeHtml(writer: basicWriter, filter: filter): scala.Unit = js.native
}

