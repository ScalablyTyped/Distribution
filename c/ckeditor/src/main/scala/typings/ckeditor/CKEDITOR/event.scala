package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait event extends StObject {
  
  def capture(): Unit = js.native
  
  def define(name: String, meta: StringDictionary[js.Any]): Unit = js.native
  
  def fire(eventName: String): js.Any = js.native
  def fire(eventName: String, data: StringDictionary[js.Any]): js.Any = js.native
  def fire(eventName: String, data: StringDictionary[js.Any], editor: editor): js.Any = js.native
  def fire(eventName: String, data: Unit, editor: editor): js.Any = js.native
  
  def fireOnce(eventName: String): js.Any = js.native
  def fireOnce(eventName: String, data: StringDictionary[js.Any]): js.Any = js.native
  def fireOnce(eventName: String, data: StringDictionary[js.Any], editor: editor): js.Any = js.native
  def fireOnce(eventName: String, data: Unit, editor: editor): js.Any = js.native
  
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
    scopeObj: StringDictionary[js.Any],
    listenerData: Unit,
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
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: Null,
    listenerData: Unit,
    priority: Double
  ): listenerRegistration = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: Unit,
    listenerData: js.Any
  ): listenerRegistration = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: Unit,
    listenerData: js.Any,
    priority: Double
  ): listenerRegistration = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: Unit,
    listenerData: Unit,
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
    scopeObj: StringDictionary[js.Any],
    listenerData: Unit,
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
  def once(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: Null,
    listenerData: Unit,
    priority: Double
  ): listenerRegistration = js.native
  def once(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: Unit,
    listenerData: js.Any
  ): listenerRegistration = js.native
  def once(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: Unit,
    listenerData: js.Any,
    priority: Double
  ): listenerRegistration = js.native
  def once(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: Unit,
    listenerData: Unit,
    priority: Double
  ): listenerRegistration = js.native
  
  def removeAllListeners(): Unit = js.native
  
  def removeListener(eventName: String, listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit]): Unit = js.native
}
