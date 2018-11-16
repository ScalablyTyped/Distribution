package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.editable")
@js.native
class editable protected ()
  extends ckeditorLib.CKEDITORNs.domNs.element {
  def this(editor: editor, element: ckeditorLib.CKEDITORNs.domNs.element) = this()
  def this(editor: editor, element: stdLib.HTMLElement) = this()
  var hasFocus: scala.Boolean = js.native
  val status: java.lang.String = js.native
  def attachClass(className: java.lang.String): scala.Unit = js.native
  def attachListener(
    obj: editable,
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* ei */ eventInfo, scala.Unit]
  ): listenerRegistration = js.native
  def attachListener(
    obj: editable,
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* ei */ eventInfo, scala.Unit],
    scopeobj: js.Object
  ): listenerRegistration = js.native
  def attachListener(
    obj: editable,
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* ei */ eventInfo, scala.Unit],
    scopeobj: js.Object,
    listenerData: js.Any
  ): listenerRegistration = js.native
  def attachListener(
    obj: editable,
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* ei */ eventInfo, scala.Unit],
    scopeobj: js.Object,
    listenerData: js.Any,
    priority: scala.Double
  ): listenerRegistration = js.native
  def attachListener(
    obj: event,
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* ei */ eventInfo, scala.Unit]
  ): listenerRegistration = js.native
  def attachListener(
    obj: event,
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* ei */ eventInfo, scala.Unit],
    scopeobj: js.Object
  ): listenerRegistration = js.native
  def attachListener(
    obj: event,
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* ei */ eventInfo, scala.Unit],
    scopeobj: js.Object,
    listenerData: js.Any
  ): listenerRegistration = js.native
  def attachListener(
    obj: event,
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* ei */ eventInfo, scala.Unit],
    scopeobj: js.Object,
    listenerData: js.Any,
    priority: scala.Double
  ): listenerRegistration = js.native
  def changeAttr(attr: java.lang.String, `val`: java.lang.String): scala.Unit = js.native
  def detach(): scala.Unit = js.native
  def insertElement(element: ckeditorLib.CKEDITORNs.domNs.element): scala.Unit = js.native
  def insertElement(element: ckeditorLib.CKEDITORNs.domNs.element, range: ckeditorLib.CKEDITORNs.domNs.range): scala.Unit = js.native
  def insertHtml(data: java.lang.String): scala.Unit = js.native
  def insertHtml(data: java.lang.String, mode: java.lang.String): scala.Unit = js.native
  def insertHtml(data: java.lang.String, mode: java.lang.String, range: ckeditorLib.CKEDITORNs.domNs.range): scala.Unit = js.native
  def insertText(text: ckeditorLib.CKEDITORNs.domNs.text): scala.Unit = js.native
  def isInline(): scala.Boolean = js.native
  def setReadOnly(isReadOnly: scala.Boolean): scala.Unit = js.native
}

