package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.style")
@js.native
class style protected () extends js.Object {
  def this(styleDefinition: ckeditorLib.CKEDITORNs.styleNs.definition, variableValues: js.Any) = this()
  var alwaysRemoveElement: scala.Boolean = js.native
  var includeReadonly: scala.Boolean = js.native
  @JSName("apply")
  def apply(editor: editor): scala.Unit = js.native
  def applyToObject(element: ckeditorLib.CKEDITORNs.domNs.element, editor: editor): scala.Unit = js.native
  def applyToRange(range: ckeditorLib.CKEDITORNs.domNs.range, editor: editor): scala.Unit = js.native
  def buildPreview(): java.lang.String = js.native
  def buildPreview(label: java.lang.String): java.lang.String = js.native
  def checkActive(elementPath: ckeditorLib.CKEDITORNs.domNs.elementPath, editor: editor): scala.Boolean = js.native
  def checkApplicable(elementPath: ckeditorLib.CKEDITORNs.domNs.elementPath, editor: editor): scala.Boolean = js.native
  def checkApplicable(elementPath: ckeditorLib.CKEDITORNs.domNs.elementPath, editor: editor, filter: filter): scala.Boolean = js.native
  def checkElementMatch(element: ckeditorLib.CKEDITORNs.domNs.element, fullMatch: scala.Boolean, editor: editor): scala.Boolean = js.native
  def checkElementRemovable(element: ckeditorLib.CKEDITORNs.domNs.element, fullMatch: scala.Boolean, editor: editor): scala.Boolean = js.native
  def getDefintion(): ckeditorLib.CKEDITORNs.styleNs.definition = js.native
  def remove(editor: editor): scala.Unit = js.native
  def removeFromRange(range: ckeditorLib.CKEDITORNs.domNs.range, editor: editor): scala.Unit = js.native
  def toAllowedContentRules(): ckeditorLib.CKEDITORNs.filterNs.allowedContentRules = js.native
  def toAllowedContentRules(editor: editor): ckeditorLib.CKEDITORNs.filterNs.allowedContentRules = js.native
}

