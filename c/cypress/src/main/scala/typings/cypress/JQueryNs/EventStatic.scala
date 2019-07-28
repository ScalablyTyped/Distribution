package typings.cypress.JQueryNs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
// region Events
// region Event
// This should be a class but doesn't work correctly under the JQuery namespace. Event should be an inner class of jQuery.
// Static members
@js.native
trait EventStatic
  extends Instantiable2[
      /* event */ String, 
      /* properties */ js.Object, 
      (Event[EventTarget, Null]) with js.Object
    ]
     with // tslint:disable-next-line:no-unnecessary-generics
Instantiable1[
      (/* properties */ EventLike) | (/* event */ String), 
      ((Event[EventTarget, Null]) with js.Object) | ((Event[EventTarget, Null]) with EventLike)
    ] {
  // tslint:disable-next-line:no-unnecessary-generics
  def apply[T /* <: js.Object */, TTarget /* <: EventTarget */](event: String): (Event[TTarget, Null]) with T = js.native
  def apply[T /* <: js.Object */, TTarget /* <: EventTarget */](event: String, properties: T): (Event[TTarget, Null]) with T = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def apply[T /* <: EventLike */, TTarget /* <: EventTarget */](properties: T): (Event[TTarget, Null]) with T = js.native
}

