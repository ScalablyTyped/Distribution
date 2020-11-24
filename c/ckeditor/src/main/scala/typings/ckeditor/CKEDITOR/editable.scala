package typings.ckeditor.CKEDITOR

import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.dom.range
import typings.ckeditor.CKEDITOR.dom.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait editable extends element {
  
  def attachClass(className: String): Unit = js.native
  
  def attachListener(obj: editable, eventName: String, listenerFunction: js.Function1[/* ei */ eventInfo, Unit]): listenerRegistration = js.native
  def attachListener(
    obj: editable,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: js.UndefOr[scala.Nothing],
    listenerData: js.UndefOr[scala.Nothing],
    priority: Double
  ): listenerRegistration = js.native
  def attachListener(
    obj: editable,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: js.UndefOr[scala.Nothing],
    listenerData: js.Any
  ): listenerRegistration = js.native
  def attachListener(
    obj: editable,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: js.UndefOr[scala.Nothing],
    listenerData: js.Any,
    priority: Double
  ): listenerRegistration = js.native
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
    listenerData: js.UndefOr[scala.Nothing],
    priority: Double
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
    scopeobj: js.UndefOr[scala.Nothing],
    listenerData: js.UndefOr[scala.Nothing],
    priority: Double
  ): listenerRegistration = js.native
  def attachListener(
    obj: event,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: js.UndefOr[scala.Nothing],
    listenerData: js.Any
  ): listenerRegistration = js.native
  def attachListener(
    obj: event,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: js.UndefOr[scala.Nothing],
    listenerData: js.Any,
    priority: Double
  ): listenerRegistration = js.native
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
    listenerData: js.UndefOr[scala.Nothing],
    priority: Double
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
  
  var hasFocus: Boolean = js.native
  
  def insertElement(element: element): Unit = js.native
  def insertElement(element: element, range: range): Unit = js.native
  
  def insertHtml(data: String): Unit = js.native
  def insertHtml(data: String, mode: js.UndefOr[scala.Nothing], range: range): Unit = js.native
  def insertHtml(data: String, mode: String): Unit = js.native
  def insertHtml(data: String, mode: String, range: range): Unit = js.native
  
  def insertText(text: text): Unit = js.native
  
  def isInline(): Boolean = js.native
  
  def setReadOnly(isReadOnly: Boolean): Unit = js.native
  
  val status: String = js.native
}
