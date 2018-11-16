package typings
package d3DashDragLib.d3DashDragMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait D3DragEvent[GElement /* <: DraggedElementBaseType */, Datum, Subject] extends js.Object {
  /**
       * The number of currently active drag gestures (on start and end, not including this one).
       *
       * The event.active field is useful for detecting the first start event and the last end event
       * in a sequence of concurrent drag gestures: it is zero when the first drag gesture starts,
       * and zero when the last drag gesture ends.
       */
  var active: scala.Double = js.native
  /**
       * The change in x-coordinate since the previous drag event.
       */
  var dx: scala.Double = js.native
  /**
       * The change in y-coordinate since the previous drag event.
       */
  var dy: scala.Double = js.native
  /**
       * The string “mouse”, or a numeric touch identifier.
       */
  var identifier: d3DashDragLib.d3DashDragLibStrings.mouse | scala.Double = js.native
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
       * The DragBehavior associated with the event
       */
  @JSName("target")
  var target_Original: DragBehavior[GElement, Datum, Subject] = js.native
  /**
       * The event type for the DragEvent
       */
  var `type`: d3DashDragLib.d3DashDragLibStrings.start | d3DashDragLib.d3DashDragLibStrings.drag | d3DashDragLib.d3DashDragLibStrings.end | java.lang.String = js.native
  /**
       * The new x-coordinate of the subject, relative to the container
       */
  var x: scala.Double = js.native
  /**
       * The new y-coordinate of the subject, relative to the container
       */
  var y: scala.Double = js.native
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
  def on(typenames: java.lang.String): js.UndefOr[d3DashSelectionLib.d3DashSelectionMod.ValueFn[GElement, Datum, scala.Unit]] = js.native
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
       * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
       * with this as the current DOM element.
       */
  def on(
    typenames: java.lang.String,
    listener: d3DashSelectionLib.d3DashSelectionMod.ValueFn[GElement, Datum, scala.Unit]
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
  @JSName("on")
  def `on_<this>`(typenames: java.lang.String): this.type = js.native
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
  def target(selection: d3DashSelectionLib.d3DashSelectionMod.Selection[GElement, Datum, _, _], args: js.Any*): scala.Unit = js.native
}

