package typings
package cypressLib.JQueryNs

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
  extends org.scalablytyped.runtime.Instantiable2[
      /* event */ java.lang.String, 
      /* properties */ js.Object, 
      (Event[stdLib.EventTarget, scala.Null]) with js.Object
    ]
     with // tslint:disable-next-line:no-unnecessary-generics
org.scalablytyped.runtime.Instantiable1[
      (/* properties */ EventLike) | (/* event */ java.lang.String), 
      ((Event[stdLib.EventTarget, scala.Null]) with js.Object) | ((Event[stdLib.EventTarget, scala.Null]) with EventLike)
    ] {
  // tslint:disable-next-line:no-unnecessary-generics
  def apply[T /* <: js.Object */, TTarget /* <: stdLib.EventTarget */](event: java.lang.String): (Event[TTarget, scala.Null]) with T = js.native
  def apply[T /* <: js.Object */, TTarget /* <: stdLib.EventTarget */](event: java.lang.String, properties: T): (Event[TTarget, scala.Null]) with T = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def apply[T /* <: EventLike */, TTarget /* <: stdLib.EventTarget */](properties: T): (Event[TTarget, scala.Null]) with T = js.native
}

