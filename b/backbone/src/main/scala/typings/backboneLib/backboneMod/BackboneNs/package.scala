package typings
package backboneLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BackboneNs {
  /**
    * JavaScript events (used in the methods of the Events interface)
    */
  type EventHandler = js.Function1[/* repeated */ js.Any, scala.Unit]
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
}
