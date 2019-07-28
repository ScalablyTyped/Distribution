package typings.ckeditor.CKEDITORNs.filterNs

import typings.ckeditor.CKEDITORNs.htmlParserNs.element
import typings.ckeditor.CKEDITORNs.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait transformationTools extends js.Object {
  def alignmentToAttribute(element: element): Unit = js.native
  def alignmentToStyle(element: element): Unit = js.native
  def lengthToAttribute(element: element, styleName: String): Unit = js.native
  def lengthToAttribute(element: element, styleName: String, attrName: String): Unit = js.native
  def lengthToStyle(element: element, styleName: String): Unit = js.native
  def lengthToStyle(element: element, styleName: String, attrName: String): Unit = js.native
  def matchesTyle(element: element, style: style): Unit = js.native
  def sizeToAttribute(element: element): Unit = js.native
  def sizeToStyle(element: element): Unit = js.native
  def splitBorderShorthand(element: element): Unit = js.native
  def splitMarginShorthand(element: element): Unit = js.native
  def transform(element: element, form: String): Unit = js.native
  def transform(element: element, form: style): Unit = js.native
}

