package typings.backbone.mod

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.anon.Typeofbackbone
import typings.backbone.mod.^
import typings.jquery.JQuery.Event
import typings.jquery.JQuery.TriggeredEvent
import typings.jquery.JQueryAjaxSettings
import typings.jquery.JQueryStatic
import typings.jquery.JQueryXHR
import typings.std.Exclude
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Events: typings.backbone.mod.Events = ^.asInstanceOf[js.Dynamic].selectDynamic("Events").asInstanceOf[typings.backbone.mod.Events]
type Events = EventsMixin

inline def _empty: JQueryStatic = ^.asInstanceOf[js.Dynamic].selectDynamic("$").asInstanceOf[JQueryStatic]
inline def _empty_=(x: JQueryStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$")(x.asInstanceOf[js.Any])

inline def ajax(): JQueryXHR = ^.asInstanceOf[js.Dynamic].applyDynamic("ajax")().asInstanceOf[JQueryXHR]
inline def ajax(options: JQueryAjaxSettings): JQueryXHR = ^.asInstanceOf[js.Dynamic].applyDynamic("ajax")(options.asInstanceOf[js.Any]).asInstanceOf[JQueryXHR]

inline def emulateHTTP: Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("emulateHTTP").asInstanceOf[Boolean]
inline def emulateHTTP_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emulateHTTP")(x.asInstanceOf[js.Any])

inline def emulateJSON: Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("emulateJSON").asInstanceOf[Boolean]
inline def emulateJSON_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emulateJSON")(x.asInstanceOf[js.Any])

inline def history: History_ = ^.asInstanceOf[js.Dynamic].selectDynamic("history").asInstanceOf[History_]

// Utility
inline def noConflict(): Typeofbackbone = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[Typeofbackbone]

inline def sync(method: String, model: Collection[Model[Any, ModelSetOptions, Any]]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(method.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def sync(method: String, model: Collection[Model[Any, ModelSetOptions, Any]], options: JQueryAjaxSettings): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(method.asInstanceOf[js.Any], model.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
// SYNC
inline def sync(method: String, model: Model[Any, ModelSetOptions, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(method.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def sync(method: String, model: Model[Any, ModelSetOptions, Any], options: JQueryAjaxSettings): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(method.asInstanceOf[js.Any], model.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]

type CombinedModelConstructorOptions[E, M /* <: Model[Any, Any, E] */] = ModelConstructorOptions[M] & E

/**
  * JavaScript events (used in the methods of the Events interface)
  */
type EventHandler = js.Function1[/* repeated */ Any, Unit]

type EventMap = StringDictionary[EventHandler]

/**
  * DOM events (used in the events property of a View)
  */
type EventsHash = StringDictionary[
String | (js.Function1[/* eventObject */ TriggeredEvent[Any, Any, Any, Any], Unit])]

type EventsOff[BaseT] = js.ThisFunction3[
/* this */ BaseT, 
/* eventName */ js.UndefOr[String | Null], 
/* callback */ js.UndefOr[EventHandler | Null], 
/* context */ js.UndefOr[Any], 
BaseT]

type EventsStop[BaseT] = js.ThisFunction3[
/* this */ BaseT, 
/* object */ js.UndefOr[Any], 
/* events */ js.UndefOr[String], 
/* callback */ js.UndefOr[EventHandler], 
BaseT]

type EventsTrigger[BaseT] = js.ThisFunction2[/* this */ BaseT, /* eventName */ String, /* repeated */ Any, BaseT]

type ObjectHash = Record[String, Any]

type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]

type Result[T] = T | js.Function0[T]

type RoutesHash = StringDictionary[String | (js.Function1[/* repeated */ String, Unit])]

type StringKey[T] = /* keyof T */ String

type ViewEventListener = js.Function1[/* event */ Event, Unit]
