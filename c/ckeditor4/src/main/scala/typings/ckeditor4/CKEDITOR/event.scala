package typings.ckeditor4.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait event extends StObject {
  
  def capture(): Unit = js.native
  
  def define(name: String, meta: StringDictionary[Any]): Unit = js.native
  
  def fire(eventName: String): Any = js.native
  def fire(eventName: String, data: StringDictionary[Any]): Any = js.native
  def fire(eventName: String, data: StringDictionary[Any], editor: editor): Any = js.native
  def fire(eventName: String, data: Unit, editor: editor): Any = js.native
  
  def fireOnce(eventName: String): Any = js.native
  def fireOnce(eventName: String, data: StringDictionary[Any]): Any = js.native
  def fireOnce(eventName: String, data: StringDictionary[Any], editor: editor): Any = js.native
  def fireOnce(eventName: String, data: Unit, editor: editor): Any = js.native
  
  def hasListeners(eventName: String): Boolean = js.native
  
  def on(eventName: String, listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit]): listenerRegistration = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: StringDictionary[Any]
  ): listenerRegistration = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: StringDictionary[Any],
    listenerData: Any
  ): listenerRegistration = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: StringDictionary[Any],
    listenerData: Any,
    priority: Double
  ): listenerRegistration = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: StringDictionary[Any],
    listenerData: Unit,
    priority: Double
  ): listenerRegistration = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: Null,
    listenerData: Any
  ): listenerRegistration = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: Null,
    listenerData: Any,
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
    listenerData: Any
  ): listenerRegistration = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: Unit,
    listenerData: Any,
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
    scopeObj: StringDictionary[Any]
  ): listenerRegistration = js.native
  def once(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: StringDictionary[Any],
    listenerData: Any
  ): listenerRegistration = js.native
  def once(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: StringDictionary[Any],
    listenerData: Any,
    priority: Double
  ): listenerRegistration = js.native
  def once(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: StringDictionary[Any],
    listenerData: Unit,
    priority: Double
  ): listenerRegistration = js.native
  def once(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: Null,
    listenerData: Any
  ): listenerRegistration = js.native
  def once(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: Null,
    listenerData: Any,
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
    listenerData: Any
  ): listenerRegistration = js.native
  def once(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: Unit,
    listenerData: Any,
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
