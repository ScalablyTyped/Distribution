package typings.ckeditor.CKEDITOR.plugins

import typings.ckeditor.CKEDITOR.event
import typings.ckeditor.CKEDITOR.plugins.widget.nestedEditable
import typings.ckeditor.CKEDITOR.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait widget_
  extends typings.ckeditor.CKEDITOR.plugins.widget.definition
     with event {
  val dataReady: Boolean = js.native
  val definition: typings.ckeditor.CKEDITOR.plugins.widget.definition = js.native
  val editor: typings.ckeditor.CKEDITOR.editor = js.native
  val element: typings.ckeditor.CKEDITOR.dom.element = js.native
  val focusedEditable: nestedEditable = js.native
  val id: Double = js.native
  val inited: Boolean = js.native
  val ready: Boolean = js.native
  val repository: typings.ckeditor.CKEDITOR.plugins.widget.repository = js.native
  val wrapper: typings.ckeditor.CKEDITOR.dom.element = js.native
  def addClass(className: String): Unit = js.native
  def applyStyle(style: style): Unit = js.native
  def checkStyleActive(style: style): Boolean = js.native
  def destroy(): Unit = js.native
  def destroy(offline: Boolean): Unit = js.native
  def destroyEditable(editableName: String): Unit = js.native
  def destroyEditable(editableName: String, offline: Boolean): Unit = js.native
  @JSName("edit")
  def edit_Mwidget_(): Boolean = js.native
  def focus(): Unit = js.native
  def getClasses(): js.Any = js.native
  def hasClass(className: String, Whether: Boolean): Unit = js.native
  def initEditable(
    editableName: String,
    definition: typings.ckeditor.CKEDITOR.plugins.widget.nestedEditable.definition
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

