package typings.d3Drag.mod

import typings.d3Drag.d3DragStrings.end
import typings.d3Drag.d3DragStrings.mouse
import typings.d3Drag.d3DragStrings.start
import typings.d3Selection.mod.Selection_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait D3DragEvent[GElement /* <: DraggedElementBaseType */, Datum, Subject] extends js.Object {
  
  /**
    * The number of currently active drag gestures (on start and end, not including this one).
    *
    * The event.active field is useful for detecting the first start event and the last end event
    * in a sequence of concurrent drag gestures: it is zero when the first drag gesture starts,
    * and zero when the last drag gesture ends.
    */
  var active: Double = js.native
  
  /**
    * The change in x-coordinate since the previous drag event.
    */
  var dx: Double = js.native
  
  /**
    * The change in y-coordinate since the previous drag event.
    */
  var dy: Double = js.native
  
  /**
    * The string “mouse”, or a numeric touch identifier.
    */
  var identifier: mouse | Double = js.native
  
  /**
    * Return the first currently-assigned listener matching the specified typenames, if any.
    *
    * Equivalent to drag.on, but only applies to the current drag gesture. Before the drag gesture starts,
    * a copy of the current drag event listeners is made. This copy is bound to the current drag gesture
    * and modified by event.on. This is useful for temporary listeners that only receive events for the current drag gesture.
    *
    * @param typenames The typenames is a string containing one or more typename separated by whitespace.
    * Each typename is a type, optionally followed by a period (.) and a name, such as "drag.foo"" and "drag.bar";
    * the name allows multiple listeners to be registered for the same type. The type must be one of the following:
    * start (after a new pointer becomes active [on mousedown or touchstart]), drag (after an active pointer moves [on mousemove or touchmove], or
    * end (after an active pointer becomes inactive [on mouseup, touchend or touchcancel].)
    */
  def on(typenames: String): js.UndefOr[js.ThisFunction2[/* this */ GElement, /* event */ js.Any, /* d */ Datum, Unit]] = js.native
  /**
    * Set the event listener for the specified typenames and return the drag behavior.
    * If an event listener was already registered for the same type and name,
    * the existing listener is removed before the new listener is added.
    * When a specified event is dispatched, each listener will be invoked with the same context and arguments as selection.on listeners.
    *
    * Equivalent to drag.on, but only applies to the current drag gesture. Before the drag gesture starts,
    * a copy of the current drag event listeners is made. This copy is bound to the current drag gesture
    * and modified by event.on. This is useful for temporary listeners that only receive events for the current drag gesture.
    *
    * @param typenames The typenames is a string containing one or more typename separated by whitespace.
    * Each typename is a type, optionally followed by a period (.) and a name, such as "drag.foo"" and "drag.bar";
    * the name allows multiple listeners to be registered for the same type. The type must be one of the following:
    * start (after a new pointer becomes active [on mousedown or touchstart]), drag (after an active pointer moves [on mousemove or touchmove], or
    * end (after an active pointer becomes inactive [on mouseup, touchend or touchcancel].)
    * @param listener An event listener function which is evaluated for each selected element,
    * in order, being passed the current event (event) and datum d, with the this context as the current DOM element.
    */
  def on(
    typenames: String,
    listener: js.ThisFunction2[/* this */ GElement, /* event */ js.Any, /* d */ Datum, Unit]
  ): this.type = js.native
  /**
    * Remove the current event listeners for the specified typenames, if any, return the drag behavior.
    *
    * Equivalent to drag.on, but only applies to the current drag gesture. Before the drag gesture starts,
    * a copy of the current drag event listeners is made. This copy is bound to the current drag gesture
    * and modified by event.on. This is useful for temporary listeners that only receive events for the current drag gesture.
    *
    * @param typenames The typenames is a string containing one or more typename separated by whitespace.
    * Each typename is a type, optionally followed by a period (.) and a name, such as "drag.foo"" and "drag.bar";
    * the name allows multiple listeners to be registered for the same type. The type must be one of the following:
    * start (after a new pointer becomes active [on mousedown or touchstart]), drag (after an active pointer moves [on mousemove or touchmove], or
    * end (after an active pointer becomes inactive [on mouseup, touchend or touchcancel].)
    * @param listener Use null to remove the listener.
    */
  def on(typenames: String, listener: Null): this.type = js.native
  
  /**
    * The underlying input event, such as mousemove or touchmove.
    */
  var sourceEvent: js.Any = js.native
  
    // Leave failsafe string type for cases like 'drag.foo'
  /**
    * The drag subject, defined by drag.subject.
    */
  var subject: Subject = js.native
  
  /**
    * Applies the drag behavior to the selected elements.
    * This function is typically not invoked directly, and is instead invoked via selection.call.
    *
    * For details see: {@link https://github.com/d3/d3-drag#_drag}
    *
    * @param selection A D3 selection of elements.
    * @param args Optional arguments to be passed in.
    */
  /**
    * The DragBehavior associated with the event
    */
  def target(selection: Selection_[GElement, Datum, _, _], args: js.Any*): Unit = js.native
  /**
    * The DragBehavior associated with the event
    */
  @JSName("target")
  var target_Original: DragBehavior[GElement, Datum, Subject] = js.native
  
  /**
    * The event type for the DragEvent
    */
  var `type`: start | typings.d3Drag.d3DragStrings.drag | end | String = js.native
  
  /**
    * The new x-coordinate of the subject, relative to the container
    */
  var x: Double = js.native
  
  /**
    * The new y-coordinate of the subject, relative to the container
    */
  var y: Double = js.native
}
