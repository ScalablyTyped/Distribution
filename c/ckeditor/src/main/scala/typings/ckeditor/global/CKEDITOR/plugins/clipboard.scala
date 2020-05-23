package typings.ckeditor.global.CKEDITOR.plugins

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dom.domObject
import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.dom.event
import typings.ckeditor.CKEDITOR.dom.range
import typings.ckeditor.CKEDITOR.editor
import typings.std.DataTransfer
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.clipboard")
@js.native
object clipboard extends js.Object {
  @js.native
  class dataTransfer ()
    extends typings.ckeditor.CKEDITOR.plugins.clipboard.dataTransfer {
    def this(nativeDataTransfer: DataTransfer) = this()
    def this(nativeDataTransfer: DataTransfer, editor: typings.ckeditor.CKEDITOR.editor) = this()
  }
  
  @js.native
  class fallbackDataTransfer protected ()
    extends typings.ckeditor.CKEDITOR.plugins.clipboard.fallbackDataTransfer {
    def this(dataTransfer: typings.ckeditor.CKEDITOR.plugins.clipboard.dataTransfer) = this()
  }
  
  val isCustomCopyCutSupported: Boolean = js.native
  val isCustomDataTypesSupported: Boolean = js.native
  val isFileApiSupported: Boolean = js.native
  val mainPasteEvent: String = js.native
  def addPasteButton(editor: editor, name: String, definition: StringDictionary[js.Any]): Unit = js.native
  def canClipboardApiBeTrusted(dataTransfer: typings.ckeditor.CKEDITOR.plugins.clipboard.dataTransfer, editor: editor): Boolean = js.native
  def getDropTarget(editor: editor): domObject = js.native
  def getRangeAtDropPosition(domEvent: Event, editor: editor): range = js.native
  def initDragDataTransfer(): Unit = js.native
  def initDragDataTransfer(evt: event): Unit = js.native
  def initDragDataTransfer(evt: event, editor: editor): Unit = js.native
  def initPasteDataTransfer(): Unit = js.native
  def initPasteDataTransfer(evt: event): Unit = js.native
  def initPasteDataTransfer(evt: event, sourceEditor: editor): Unit = js.native
  def preventDefaultDropOnElement(element: element): Unit = js.native
  def resetDragDataTransfer(): Unit = js.native
}

