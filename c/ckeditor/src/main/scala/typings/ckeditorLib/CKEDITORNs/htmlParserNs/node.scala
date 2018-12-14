package typings
package ckeditorLib.CKEDITORNs.htmlParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.htmlParser.node")
@js.native
class node () extends js.Object {
  def getAscendant(condition: java.lang.String): element = js.native
  def getAscendant(condition: js.Function1[/* node */ element, scala.Boolean]): element = js.native
  def getAscendant(condition: org.scalablytyped.runtime.StringDictionary[java.lang.String]): element = js.native
  def getIndex(): scala.Double = js.native
  def insertAfter(node: node): scala.Unit = js.native
  def insertBefore(node: node): scala.Unit = js.native
  def remove(): node = js.native
  def replaceWith(node: node): scala.Unit = js.native
  def wrapWith(wrapper: element): element = js.native
}

