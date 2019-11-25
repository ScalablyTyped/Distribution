package typings.backbone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object backboneMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.jquery.JQuery.TriggeredEvent

  /**
    * JavaScript events (used in the methods of the Events interface)
    */
  type EventHandler = js.Function1[/* repeated */ js.Any, Unit]
  type EventMap = StringDictionary[EventHandler]
  /**
    * DOM events (used in the events property of a View)
    */
  type EventsHash = StringDictionary[
    String | (js.Function1[/* eventObject */ TriggeredEvent[js.Any, js.Any, js.Any, js.Any], Unit])
  ]
  type Events_Off[BaseT] = js.ThisFunction3[
    /* this */ BaseT, 
    /* eventName */ js.UndefOr[String], 
    /* callback */ js.UndefOr[EventHandler], 
    /* context */ js.UndefOr[js.Any], 
    BaseT
  ]
  type Events_Stop[BaseT] = js.ThisFunction3[
    /* this */ BaseT, 
    /* object */ js.UndefOr[js.Any], 
    /* events */ js.UndefOr[String], 
    /* callback */ js.UndefOr[EventHandler], 
    BaseT
  ]
  type Events_Trigger[BaseT] = js.ThisFunction2[/* this */ BaseT, /* eventName */ String, /* repeated */ js.Any, BaseT]
  type ObjectHash = StringDictionary[js.Any]
  type RoutesHash = StringDictionary[String | (js.Function1[/* repeated */ String, Unit])]
}
