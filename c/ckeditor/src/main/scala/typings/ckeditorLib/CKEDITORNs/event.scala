package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.event")
@js.native
class event () extends js.Object {
  def capture(): scala.Unit = js.native
  def define(name: java.lang.String, meta: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def fire(eventName: java.lang.String): js.Any = js.native
  def fire(eventName: java.lang.String, data: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Any = js.native
  def fire(
    eventName: java.lang.String,
    data: org.scalablytyped.runtime.StringDictionary[js.Any],
    editor: editor
  ): js.Any = js.native
  def fireOnce(eventName: java.lang.String): js.Any = js.native
  def fireOnce(eventName: java.lang.String, data: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Any = js.native
  def fireOnce(
    eventName: java.lang.String,
    data: org.scalablytyped.runtime.StringDictionary[js.Any],
    editor: editor
  ): js.Any = js.native
  def hasListeners(eventName: java.lang.String): scala.Boolean = js.native
  def on(eventName: java.lang.String, listenerFunction: js.Function1[/* eventInfo */ eventInfo, scala.Unit]): listenerRegistration = js.native
  def on(
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, scala.Unit],
    scopeObj: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): listenerRegistration = js.native
  def on(
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, scala.Unit],
    scopeObj: org.scalablytyped.runtime.StringDictionary[js.Any],
    listenerData: js.Any
  ): listenerRegistration = js.native
  def on(
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, scala.Unit],
    scopeObj: org.scalablytyped.runtime.StringDictionary[js.Any],
    listenerData: js.Any,
    priority: scala.Double
  ): listenerRegistration = js.native
  def on(
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, scala.Unit],
    scopeObj: scala.Null,
    listenerData: js.Any
  ): listenerRegistration = js.native
  def on(
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, scala.Unit],
    scopeObj: scala.Null,
    listenerData: js.Any,
    priority: scala.Double
  ): listenerRegistration = js.native
  def once(eventName: java.lang.String, listenerFunction: js.Function1[/* eventInfo */ eventInfo, scala.Unit]): listenerRegistration = js.native
  def once(
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, scala.Unit],
    scopeObj: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): listenerRegistration = js.native
  def once(
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, scala.Unit],
    scopeObj: org.scalablytyped.runtime.StringDictionary[js.Any],
    listenerData: js.Any
  ): listenerRegistration = js.native
  def once(
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, scala.Unit],
    scopeObj: org.scalablytyped.runtime.StringDictionary[js.Any],
    listenerData: js.Any,
    priority: scala.Double
  ): listenerRegistration = js.native
  def once(
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, scala.Unit],
    scopeObj: scala.Null,
    listenerData: js.Any
  ): listenerRegistration = js.native
  def once(
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, scala.Unit],
    scopeObj: scala.Null,
    listenerData: js.Any,
    priority: scala.Double
  ): listenerRegistration = js.native
  def removeAllListeners(): scala.Unit = js.native
  def removeListener(eventName: java.lang.String, listenerFunction: js.Function1[/* eventInfo */ eventInfo, scala.Unit]): scala.Unit = js.native
}

@JSGlobal("CKEDITOR.event")
@js.native
object event extends js.Object {
  var useCapture: scala.Boolean = js.native
  def implementOn(targetObject: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
}

