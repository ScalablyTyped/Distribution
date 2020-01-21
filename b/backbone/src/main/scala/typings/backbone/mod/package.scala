package typings.backbone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
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
      /* eventObject */ typings.jquery.JQuery_.TriggeredEvent[js.Any, js.Any, js.Any, js.Any], 
      scala.Unit
    ])
  ]
  type EventsOff[BaseT] = js.ThisFunction3[
    /* this */ BaseT, 
    /* eventName */ js.UndefOr[java.lang.String], 
    /* callback */ js.UndefOr[typings.backbone.mod.EventHandler], 
    /* context */ js.UndefOr[js.Any], 
    BaseT
  ]
  type EventsStop[BaseT] = js.ThisFunction3[
    /* this */ BaseT, 
    /* object */ js.UndefOr[js.Any], 
    /* events */ js.UndefOr[java.lang.String], 
    /* callback */ js.UndefOr[typings.backbone.mod.EventHandler], 
    BaseT
  ]
  type EventsTrigger[BaseT] = js.ThisFunction2[/* this */ BaseT, /* eventName */ java.lang.String, /* repeated */ js.Any, BaseT]
  type ObjectHash = org.scalablytyped.runtime.StringDictionary[js.Any]
  type RoutesHash = org.scalablytyped.runtime.StringDictionary[java.lang.String | (js.Function1[/* repeated */ java.lang.String, scala.Unit])]
}
