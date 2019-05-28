package typings
package backboneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object backboneMod {
  /**
    * JavaScript events (used in the methods of the Events interface)
    */
  type EventHandler = js.Function1[/* repeated */ js.Any, scala.Unit]
  type EventMap = org.scalablytyped.runtime.StringDictionary[EventHandler]
  /**
    * DOM events (used in the events property of a View)
    */
  type EventsHash = org.scalablytyped.runtime.StringDictionary[java.lang.String | backboneLib.Fn_EventObject]
  type Events_Off[BaseT] = js.ThisFunction3[
    /* this */ BaseT, 
    /* eventName */ js.UndefOr[java.lang.String], 
    /* callback */ js.UndefOr[EventHandler], 
    /* context */ js.UndefOr[js.Any], 
    BaseT
  ]
  type Events_Stop[BaseT] = js.ThisFunction3[
    /* this */ BaseT, 
    /* object */ js.UndefOr[js.Any], 
    /* events */ js.UndefOr[java.lang.String], 
    /* callback */ js.UndefOr[EventHandler], 
    BaseT
  ]
  type Events_Trigger[BaseT] = js.ThisFunction2[/* this */ BaseT, /* eventName */ java.lang.String, /* repeated */ js.Any, BaseT]
  type ObjectHash = org.scalablytyped.runtime.StringDictionary[js.Any]
  type RoutesHash = org.scalablytyped.runtime.StringDictionary[java.lang.String | backboneLib.Fn_UrlParts]
}
