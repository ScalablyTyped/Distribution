package typings.ckeditor.CKEDITORNs

import typings.ckeditor.CKEDITORNs.domNs.element
import typings.ckeditor.CKEDITORNs.domNs.range
import typings.ckeditor.CKEDITORNs.domNs.text
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.editable")
@js.native
class editable protected () extends element {
  def this(editor: editor, element: element) = this()
  def this(editor: editor, element: HTMLElement) = this()
  var hasFocus: Boolean = js.native
  val status: String = js.native
  def attachClass(className: String): Unit = js.native
  def attachListener(obj: editable, eventName: String, listenerFunction: js.Function1[/* ei */ eventInfo, Unit]): listenerRegistration = js.native
  def attachListener(
    obj: editable,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: js.Object
  ): listenerRegistration = js.native
  def attachListener(
    obj: editable,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: js.Object,
    listenerData: js.Any
  ): listenerRegistration = js.native
  def attachListener(
    obj: editable,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: js.Object,
    listenerData: js.Any,
    priority: Double
  ): listenerRegistration = js.native
  def attachListener(obj: event, eventName: String, listenerFunction: js.Function1[/* ei */ eventInfo, Unit]): listenerRegistration = js.native
  def attachListener(
    obj: event,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: js.Object
  ): listenerRegistration = js.native
  def attachListener(
    obj: event,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: js.Object,
    listenerData: js.Any
  ): listenerRegistration = js.native
  def attachListener(
    obj: event,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: js.Object,
    listenerData: js.Any,
    priority: Double
  ): listenerRegistration = js.native
  def changeAttr(attr: String, `val`: String): Unit = js.native
  def detach(): Unit = js.native
  def insertElement(element: element): Unit = js.native
  def insertElement(element: element, range: range): Unit = js.native
  def insertHtml(data: String): Unit = js.native
  def insertHtml(data: String, mode: String): Unit = js.native
  def insertHtml(data: String, mode: String, range: range): Unit = js.native
  def insertText(text: text): Unit = js.native
  def isInline(): Boolean = js.native
  def setReadOnly(isReadOnly: Boolean): Unit = js.native
}

