package typings
package ckeditorLib.CKEDITORNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.widget")
@js.native
class widget protected ()
  extends ckeditorLib.CKEDITORNs.event
     with ckeditorLib.CKEDITORNs.pluginsNs.widgetNs.definition {
  def this(widgetsRepo: ckeditorLib.CKEDITORNs.pluginsNs.widgetNs.repository, id: scala.Double, element: ckeditorLib.CKEDITORNs.domNs.element, widgetDef: ckeditorLib.CKEDITORNs.pluginsNs.widgetNs.definition) = this()
  def this(widgetsRepo: ckeditorLib.CKEDITORNs.pluginsNs.widgetNs.repository, id: scala.Double, element: ckeditorLib.CKEDITORNs.domNs.element, widgetDef: ckeditorLib.CKEDITORNs.pluginsNs.widgetNs.definition, starupData: js.Any) = this()
  val dataReady: scala.Boolean = js.native
  val definition: ckeditorLib.CKEDITORNs.pluginsNs.widgetNs.definition = js.native
  val editor: ckeditorLib.CKEDITORNs.editor = js.native
  val element: ckeditorLib.CKEDITORNs.domNs.element = js.native
  val focusedEditable: ckeditorLib.CKEDITORNs.pluginsNs.widgetNs.nestedEditable = js.native
  val id: scala.Double = js.native
  val inited: scala.Boolean = js.native
  val ready: scala.Boolean = js.native
  val repository: ckeditorLib.CKEDITORNs.pluginsNs.widgetNs.repository = js.native
  val wrapper: ckeditorLib.CKEDITORNs.domNs.element = js.native
  def addClass(className: java.lang.String): scala.Unit = js.native
  def applyStyle(style: ckeditorLib.CKEDITORNs.style): scala.Unit = js.native
  def checkStyleActive(style: ckeditorLib.CKEDITORNs.style): scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def destroy(offline: scala.Boolean): scala.Unit = js.native
  def destroyEditable(editableName: java.lang.String): scala.Unit = js.native
  def destroyEditable(editableName: java.lang.String, offline: scala.Boolean): scala.Unit = js.native
  @JSName("edit")
  def edit_Mwidget(): scala.Boolean = js.native
  def focus(): scala.Unit = js.native
  def getClasses(): js.Any = js.native
  def hasClass(className: java.lang.String, Whether: scala.Boolean): scala.Unit = js.native
  def initEditable(
    editableName: java.lang.String,
    definition: ckeditorLib.CKEDITORNs.pluginsNs.widgetNs.nestedEditableNs.definition
  ): scala.Boolean = js.native
  def isInited(): scala.Boolean = js.native
  def isReady(): scala.Boolean = js.native
  def removeClass(className: java.lang.String): scala.Unit = js.native
  def removeStyle(style: ckeditorLib.CKEDITORNs.style): scala.Unit = js.native
  def setData(keyOrData: js.Any, value: js.Any): widget = js.native
  def setFocused(selected: scala.Boolean): widget = js.native
  def setSelected(selected: scala.Boolean): widget = js.native
  def updateDragHandlerPosition(): scala.Unit = js.native
}

