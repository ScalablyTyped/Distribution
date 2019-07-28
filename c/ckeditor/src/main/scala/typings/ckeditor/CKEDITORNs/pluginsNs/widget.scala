package typings.ckeditor.CKEDITORNs.pluginsNs

import typings.ckeditor.CKEDITORNs.event
import typings.ckeditor.CKEDITORNs.pluginsNs.widgetNs.nestedEditable
import typings.ckeditor.CKEDITORNs.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.widget")
@js.native
class widget protected ()
  extends event
     with typings.ckeditor.CKEDITORNs.pluginsNs.widgetNs.definition {
  def this(
    widgetsRepo: typings.ckeditor.CKEDITORNs.pluginsNs.widgetNs.repository,
    id: Double,
    element: typings.ckeditor.CKEDITORNs.domNs.element,
    widgetDef: typings.ckeditor.CKEDITORNs.pluginsNs.widgetNs.definition
  ) = this()
  def this(
    widgetsRepo: typings.ckeditor.CKEDITORNs.pluginsNs.widgetNs.repository,
    id: Double,
    element: typings.ckeditor.CKEDITORNs.domNs.element,
    widgetDef: typings.ckeditor.CKEDITORNs.pluginsNs.widgetNs.definition,
    starupData: js.Any
  ) = this()
  val dataReady: Boolean = js.native
  val definition: typings.ckeditor.CKEDITORNs.pluginsNs.widgetNs.definition = js.native
  val editor: typings.ckeditor.CKEDITORNs.editor = js.native
  val element: typings.ckeditor.CKEDITORNs.domNs.element = js.native
  val focusedEditable: nestedEditable = js.native
  val id: Double = js.native
  val inited: Boolean = js.native
  val ready: Boolean = js.native
  val repository: typings.ckeditor.CKEDITORNs.pluginsNs.widgetNs.repository = js.native
  val wrapper: typings.ckeditor.CKEDITORNs.domNs.element = js.native
  def addClass(className: String): Unit = js.native
  def applyStyle(style: style): Unit = js.native
  def checkStyleActive(style: style): Boolean = js.native
  def destroy(): Unit = js.native
  def destroy(offline: Boolean): Unit = js.native
  def destroyEditable(editableName: String): Unit = js.native
  def destroyEditable(editableName: String, offline: Boolean): Unit = js.native
  @JSName("edit")
  def edit_Mwidget(): Boolean = js.native
  def focus(): Unit = js.native
  def getClasses(): js.Any = js.native
  def hasClass(className: String, Whether: Boolean): Unit = js.native
  def initEditable(
    editableName: String,
    definition: typings.ckeditor.CKEDITORNs.pluginsNs.widgetNs.nestedEditableNs.definition
  ): Boolean = js.native
  def isInited(): Boolean = js.native
  def isReady(): Boolean = js.native
  def removeClass(className: String): Unit = js.native
  def removeStyle(style: style): Unit = js.native
  def setData(keyOrData: js.Any, value: js.Any): widget = js.native
  def setFocused(selected: Boolean): widget = js.native
  def setSelected(selected: Boolean): widget = js.native
  def updateDragHandlerPosition(): Unit = js.native
}

