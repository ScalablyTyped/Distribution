package typings.ckeditor.CKEDITORNs

import typings.ckeditor.CKEDITORNs.domNs.element
import typings.ckeditor.CKEDITORNs.domNs.elementPath
import typings.ckeditor.CKEDITORNs.domNs.range
import typings.ckeditor.CKEDITORNs.filterNs.allowedContentRules
import typings.ckeditor.CKEDITORNs.styleNs.definition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.style")
@js.native
class style protected () extends js.Object {
  def this(styleDefinition: definition, variableValues: js.Any) = this()
  var alwaysRemoveElement: Boolean = js.native
  var includeReadonly: Boolean = js.native
  @JSName("apply")
  def apply(editor: editor): Unit = js.native
  def applyToObject(element: element, editor: editor): Unit = js.native
  def applyToRange(range: range, editor: editor): Unit = js.native
  def buildPreview(): String = js.native
  def buildPreview(label: String): String = js.native
  def checkActive(elementPath: elementPath, editor: editor): Boolean = js.native
  def checkApplicable(elementPath: elementPath, editor: editor): Boolean = js.native
  def checkApplicable(elementPath: elementPath, editor: editor, filter: filter): Boolean = js.native
  def checkElementMatch(element: element, fullMatch: Boolean, editor: editor): Boolean = js.native
  def checkElementRemovable(element: element, fullMatch: Boolean, editor: editor): Boolean = js.native
  def getDefintion(): definition = js.native
  def remove(editor: editor): Unit = js.native
  def removeFromRange(range: range, editor: editor): Unit = js.native
  def toAllowedContentRules(): allowedContentRules = js.native
  def toAllowedContentRules(editor: editor): allowedContentRules = js.native
}

