package typings
package ckeditorLib.CKEDITORNs.uiNs.dialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.ui.dialog.uiElement")
@js.native
class uiElement protected () extends js.Object {
  // Not sure that the htmlList array type is right.
  def this(dialog: ckeditorLib.CKEDITORNs.dialog, elementDefinition: ckeditorLib.CKEDITORNs.uiNs.dialogNs.definitionsNs.uiElement, htmlList: js.Array[_]) = this()
  // Not sure that the htmlList array type is right.
  def this(dialog: ckeditorLib.CKEDITORNs.dialog, elementDefinition: ckeditorLib.CKEDITORNs.uiNs.dialogNs.definitionsNs.uiElement, htmlList: js.Array[_], nodeNameArg: js.Function0[java.lang.String]) = this()
  // Not sure that the htmlList array type is right.
  def this(dialog: ckeditorLib.CKEDITORNs.dialog, elementDefinition: ckeditorLib.CKEDITORNs.uiNs.dialogNs.definitionsNs.uiElement, htmlList: js.Array[_], nodeNameArg: js.Function0[java.lang.String], stylesArg: js.Function0[ScalablyTyped.runtime.StringDictionary[_]]) = this()
  // Not sure that the htmlList array type is right.
  def this(dialog: ckeditorLib.CKEDITORNs.dialog, elementDefinition: ckeditorLib.CKEDITORNs.uiNs.dialogNs.definitionsNs.uiElement, htmlList: js.Array[_], nodeNameArg: js.Function0[java.lang.String], stylesArg: js.Function0[ScalablyTyped.runtime.StringDictionary[_]], attributesArg: js.Function0[ScalablyTyped.runtime.StringDictionary[_]]) = this()
  // Not sure that the htmlList array type is right.
  def this(dialog: ckeditorLib.CKEDITORNs.dialog, elementDefinition: ckeditorLib.CKEDITORNs.uiNs.dialogNs.definitionsNs.uiElement, htmlList: js.Array[_], nodeNameArg: js.Function0[java.lang.String], stylesArg: js.Function0[ScalablyTyped.runtime.StringDictionary[_]], attributesArg: js.Function0[ScalablyTyped.runtime.StringDictionary[_]], contentsArg: js.Function0[ScalablyTyped.runtime.StringDictionary[_] | java.lang.String]) = this()
  var eventProcessors: js.Any = js.native
  def accessKeyDown(dialog: ckeditorLib.CKEDITORNs.dialog, key: java.lang.String): scala.Unit = js.native
  def accessKeyUp(dialog: ckeditorLib.CKEDITORNs.dialog, key: java.lang.String): scala.Unit = js.native
  def disable(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def focus(): js.UndefOr[uiElement] = js.native
  def getDialog(): ckeditorLib.CKEDITORNs.dialog = js.native
  def getElement(): ckeditorLib.CKEDITORNs.domNs.element = js.native
  def getInputElement(): ckeditorLib.CKEDITORNs.domNs.element = js.native
  def getValue(): js.Any = js.native
  def isChanged(): scala.Boolean = js.native
  def isEnabled(): scala.Boolean = js.native
  def isFocusable(): scala.Boolean = js.native
  def isVisible(): scala.Boolean = js.native
  def registerEvents(definition: ckeditorLib.CKEDITORNs.dialogNs.definitionNs.uiElement): uiElement = js.native
  def selectParentTab(): uiElement = js.native
  def setValue(value: js.Any, noChangeEvent: scala.Boolean): js.UndefOr[uiElement] = js.native
}

