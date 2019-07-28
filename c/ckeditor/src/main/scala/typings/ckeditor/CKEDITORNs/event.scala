package typings.ckeditor.CKEDITORNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.event")
@js.native
class event () extends js.Object {
  def capture(): Unit = js.native
  def define(name: String, meta: StringDictionary[js.Any]): Unit = js.native
  def fire(eventName: String): js.Any = js.native
  def fire(eventName: String, data: StringDictionary[js.Any]): js.Any = js.native
  def fire(eventName: String, data: StringDictionary[js.Any], editor: editor): js.Any = js.native
  def fireOnce(eventName: String): js.Any = js.native
  def fireOnce(eventName: String, data: StringDictionary[js.Any]): js.Any = js.native
  def fireOnce(eventName: String, data: StringDictionary[js.Any], editor: editor): js.Any = js.native
  def hasListeners(eventName: String): Boolean = js.native
  def on(eventName: String, listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit]): listenerRegistration = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: StringDictionary[js.Any]
  ): listenerRegistration = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: StringDictionary[js.Any],
    listenerData: js.Any
  ): listenerRegistration = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: StringDictionary[js.Any],
    listenerData: js.Any,
    priority: Double
  ): listenerRegistration = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: Null,
    listenerData: js.Any
  ): listenerRegistration = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: Null,
    listenerData: js.Any,
    priority: Double
  ): listenerRegistration = js.native
  def once(eventName: String, listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit]): listenerRegistration = js.native
  def once(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: StringDictionary[js.Any]
  ): listenerRegistration = js.native
  def once(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: StringDictionary[js.Any],
    listenerData: js.Any
  ): listenerRegistration = js.native
  def once(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: StringDictionary[js.Any],
    listenerData: js.Any,
    priority: Double
  ): listenerRegistration = js.native
  def once(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: Null,
    listenerData: js.Any
  ): listenerRegistration = js.native
  def once(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: Null,
    listenerData: js.Any,
    priority: Double
  ): listenerRegistration = js.native
  def removeAllListeners(): Unit = js.native
  def removeListener(eventName: String, listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit]): Unit = js.native
}

/* static members */
@JSGlobal("CKEDITOR.event")
@js.native
object event extends js.Object {
  var useCapture: Boolean = js.native
  def implementOn(targetObject: StringDictionary[js.Any]): Unit = js.native
}

