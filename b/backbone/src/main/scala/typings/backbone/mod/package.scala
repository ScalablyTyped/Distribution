package typings.backbone.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def _empty: typings.jquery.JQueryStatic = typings.backbone.mod.^.asInstanceOf[js.Dynamic].selectDynamic("$").asInstanceOf[typings.jquery.JQueryStatic]
@scala.inline
def _empty_=(x: typings.jquery.JQueryStatic): scala.Unit = typings.backbone.mod.^.asInstanceOf[js.Dynamic].updateDynamic("$")(x.asInstanceOf[js.Any])

@scala.inline
def ajax(): typings.jquery.JQueryXHR = typings.backbone.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ajax")().asInstanceOf[typings.jquery.JQueryXHR]
@scala.inline
def ajax(options: typings.jquery.JQueryAjaxSettings): typings.jquery.JQueryXHR = typings.backbone.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ajax")(options.asInstanceOf[js.Any]).asInstanceOf[typings.jquery.JQueryXHR]

@scala.inline
def emulateHTTP: scala.Boolean = typings.backbone.mod.^.asInstanceOf[js.Dynamic].selectDynamic("emulateHTTP").asInstanceOf[scala.Boolean]
@scala.inline
def emulateHTTP_=(x: scala.Boolean): scala.Unit = typings.backbone.mod.^.asInstanceOf[js.Dynamic].updateDynamic("emulateHTTP")(x.asInstanceOf[js.Any])

@scala.inline
def emulateJSON: scala.Boolean = typings.backbone.mod.^.asInstanceOf[js.Dynamic].selectDynamic("emulateJSON").asInstanceOf[scala.Boolean]
@scala.inline
def emulateJSON_=(x: scala.Boolean): scala.Unit = typings.backbone.mod.^.asInstanceOf[js.Dynamic].updateDynamic("emulateJSON")(x.asInstanceOf[js.Any])

@scala.inline
def history: typings.backbone.mod.History_ = typings.backbone.mod.^.asInstanceOf[js.Dynamic].selectDynamic("history").asInstanceOf[typings.backbone.mod.History_]
@scala.inline
def history_=(x: typings.backbone.mod.History_): scala.Unit = typings.backbone.mod.^.asInstanceOf[js.Dynamic].updateDynamic("history")(x.asInstanceOf[js.Any])

// Utility
@scala.inline
def noConflict(): typings.backbone.anon.Typeofbackbone = typings.backbone.mod.^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[typings.backbone.anon.Typeofbackbone]

@scala.inline
def sync(
  method: java.lang.String,
  model: typings.backbone.mod.Collection[
  typings.backbone.mod.Model[js.Any, typings.backbone.mod.ModelSetOptions, js.Object]
]
): js.Any = (typings.backbone.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sync")(method.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[js.Any]
@scala.inline
def sync(
  method: java.lang.String,
  model: typings.backbone.mod.Collection[
  typings.backbone.mod.Model[js.Any, typings.backbone.mod.ModelSetOptions, js.Object]
],
  options: typings.jquery.JQueryAjaxSettings
): js.Any = (typings.backbone.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sync")(method.asInstanceOf[js.Any], model.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
// SYNC
@scala.inline
def sync(
  method: java.lang.String,
  model: typings.backbone.mod.Model[js.Any, typings.backbone.mod.ModelSetOptions, js.Object]
): js.Any = (typings.backbone.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sync")(method.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[js.Any]
@scala.inline
def sync(
  method: java.lang.String,
  model: typings.backbone.mod.Model[js.Any, typings.backbone.mod.ModelSetOptions, js.Object],
  options: typings.jquery.JQueryAjaxSettings
): js.Any = (typings.backbone.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sync")(method.asInstanceOf[js.Any], model.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]

type CombinedModelConstructorOptions[E, M /* <: typings.backbone.mod.Model[js.Any, js.Any, E] */] = typings.backbone.mod.ModelConstructorOptions[M] & E

/**
  * JavaScript events (used in the methods of the Events interface)
  */
type EventHandler = js.Function1[/* repeated */ js.Any, scala.Unit]

type EventMap = org.scalablytyped.runtime.StringDictionary[typings.backbone.mod.EventHandler]

/**
  * DOM events (used in the events property of a View)
  */
type EventsHash = org.scalablytyped.runtime.StringDictionary[
java.lang.String | (js.Function1[
  /* eventObject */ typings.jquery.JQuery.TriggeredEvent[js.Any, js.Any, js.Any, js.Any], 
  scala.Unit
])]

type EventsOff[BaseT] = js.ThisFunction3[
/* this */ BaseT, 
/* eventName */ js.UndefOr[java.lang.String], 
/* callback */ js.UndefOr[typings.backbone.mod.EventHandler], 
/* context */ js.UndefOr[js.Any], 
BaseT]

type EventsStop[BaseT] = js.ThisFunction3[
/* this */ BaseT, 
/* object */ js.UndefOr[js.Any], 
/* events */ js.UndefOr[java.lang.String], 
/* callback */ js.UndefOr[typings.backbone.mod.EventHandler], 
BaseT]

type EventsTrigger[BaseT] = js.ThisFunction2[/* this */ BaseT, /* eventName */ java.lang.String, /* repeated */ js.Any, BaseT]

type ObjectHash = org.scalablytyped.runtime.StringDictionary[js.Any]

type RoutesHash = org.scalablytyped.runtime.StringDictionary[java.lang.String | (js.Function1[/* repeated */ java.lang.String, scala.Unit])]
