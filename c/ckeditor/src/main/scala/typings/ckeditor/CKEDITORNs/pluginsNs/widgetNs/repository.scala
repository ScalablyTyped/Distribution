package typings.ckeditor.CKEDITORNs.pluginsNs.widgetNs

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.Anon_FocusInited
import typings.ckeditor.CKEDITORNs.event
import typings.ckeditor.CKEDITORNs.htmlParserNs.element
import typings.ckeditor.CKEDITORNs.pluginsNs.widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.widget.repository")
@js.native
class repository () extends event {
  val editor: typings.ckeditor.CKEDITORNs.editor = js.native
  val focused: widget = js.native
  val instances: StringDictionary[widget] = js.native
  val registered: StringDictionary[definition] = js.native
  val selected: js.Array[widget] = js.native
  val widgetHoldingFocusedEditable: widget = js.native
  def add(name: String, widgetDef: definition): Unit = js.native
  def addUpcastCallback(callback: js.Function2[/* element */ element, /* data */ js.Any, Boolean]): Unit = js.native
  def checkSelection(): Unit = js.native
  def checkWidgets(): Unit = js.native
  def checkWidgets(options: Anon_FocusInited): Unit = js.native
  def del(widget: widget): Unit = js.native
  def destroy(widget: widget): Unit = js.native
  def destroy(widget: widget, offline: Boolean): Unit = js.native
  def destroyAll(): Unit = js.native
  def destroyAll(offline: Boolean): Unit = js.native
  def finalizeCreation(container: js.Any): Unit = js.native
  def getByElement(element: js.Any, checkWrapperOnly: Boolean): widget = js.native
  def initOn(element: typings.ckeditor.CKEDITORNs.domNs.element): widget = js.native
  def initOn(element: typings.ckeditor.CKEDITORNs.domNs.element, widgetDef: String): widget = js.native
  def initOn(
    element: typings.ckeditor.CKEDITORNs.domNs.element,
    widgetDef: String,
    startupData: StringDictionary[js.Any]
  ): widget = js.native
  def initOn(element: typings.ckeditor.CKEDITORNs.domNs.element, widgetDef: definition): widget = js.native
  def initOn(
    element: typings.ckeditor.CKEDITORNs.domNs.element,
    widgetDef: definition,
    startupData: StringDictionary[js.Any]
  ): widget = js.native
  def initOnAll(): js.Array[widget] = js.native
  def initOnAll(container: typings.ckeditor.CKEDITORNs.domNs.element): js.Array[widget] = js.native
  def parseElementClasses(classes: String): js.Any = js.native
  def wrapElement(element: js.Any): js.Any = js.native
  def wrapElement(element: js.Any, widgetName: String): js.Any = js.native
}

