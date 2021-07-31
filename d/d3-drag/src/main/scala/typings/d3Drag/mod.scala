package typings.d3Drag

import typings.d3Drag.d3DragStrings.drag
import typings.d3Drag.d3DragStrings.end
import typings.d3Drag.d3DragStrings.mouse
import typings.d3Drag.d3DragStrings.start
import typings.d3Selection.mod.Selection_
import typings.d3Selection.mod.ValueFn
import typings.std.Element
import typings.std.HTMLElement
import typings.std.SVGGElement
import typings.std.SVGSVGElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-drag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def drag[GElement /* <: DraggedElementBaseType */, Datum](): DragBehavior[GElement, Datum, Datum | SubjectPosition] = ^.asInstanceOf[js.Dynamic].applyDynamic("drag")().asInstanceOf[DragBehavior[GElement, Datum, Datum | SubjectPosition]]
  
  @scala.inline
  def dragDisable(window: Window): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dragDisable")(window.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def dragEnable(window: Window): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dragEnable")(window.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def dragEnable(window: Window, noClick: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dragEnable")(window.asInstanceOf[js.Any], noClick.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def drag_GElement_DraggedElementBaseTypeDatumSubject[GElement /* <: DraggedElementBaseType */, Datum, Subject](): DragBehavior[GElement, Datum, Subject] = ^.asInstanceOf[js.Dynamic].applyDynamic("drag")().asInstanceOf[DragBehavior[GElement, Datum, Subject]]
  
  @js.native
  trait D3DragEvent[GElement /* <: DraggedElementBaseType */, Datum, Subject] extends StObject {
    
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
    def target(selection: Selection_[GElement, Datum, js.Any, js.Any], args: js.Any*): Unit = js.native
    /**
      * The DragBehavior associated with the event
      */
    @JSName("target")
    var target_Original: DragBehavior[GElement, Datum, Subject] = js.native
    
    /**
      * The event type for the DragEvent
      */
    var `type`: start | drag | end | String = js.native
    
    /**
      * The new x-coordinate of the subject, relative to the container
      */
    var x: Double = js.native
    
    /**
      * The new y-coordinate of the subject, relative to the container
      */
    var y: Double = js.native
  }
  
  @js.native
  trait DragBehavior[GElement /* <: DraggedElementBaseType */, Datum, Subject]
    extends js.Function {
    
    /**
      * Applies the drag behavior to the selected elements.
      * This function is typically not invoked directly, and is instead invoked via selection.call.
      *
      * For details see: {@link https://github.com/d3/d3-drag#_drag}
      *
      * @param selection A D3 selection of elements.
      * @param args Optional arguments to be passed in.
      */
    def apply(selection: Selection_[GElement, Datum, js.Any, js.Any], args: js.Any*): Unit = js.native
    
    /**
      * Return the current click distance threshold, which defaults to zero.
      */
    def clickDistance(): Double = js.native
    /**
      * Set the maximum distance that the mouse can move between mousedown and mouseup that will trigger
      * a subsequent click event. If at any point between mousedown and mouseup the mouse is greater than or equal to
      * distance from its position on mousedown, the click event following mouseup will be suppressed.
      *
      * @param distance The distance threshold between mousedown and mouseup measured in client coordinates (event.clientX and event.clientY).
      * The default is zero.
      */
    def clickDistance(distance: Double): this.type = js.native
    
    /**
      * Returns the current container accessor function.
      */
    def container(): ValueFn[GElement, Datum, DragContainerElement] = js.native
    /**
      * Sets the container accessor to the specified function and returns the drag behavior.
      *
      * The container of a drag gesture determines the coordinate system of subsequent drag events, affecting event.x and event.y.
      * The element returned by the container accessor is subsequently passed to d3.pointer to determine the local coordinates of the pointer.
      *
      * The default container accessor returns the parent node of the element in the originating selection (see drag)
      * that received the initiating input event. This is often appropriate when dragging SVG or HTML elements,
      * since those elements are typically positioned relative to a parent. For dragging graphical elements with a Canvas,
      * however, you may want to redefine the container as the initiating element itself, using "this" in the accessor
      * function.
      *
      * @param accessor A container accessor function which is evaluated for each selected element,
      * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
      * with this as the current DOM element. The function returns the container element.
      */
    def container(accessor: ValueFn[GElement, Datum, DragContainerElement]): this.type = js.native
    /**
      * Sets the container accessor to the specified object and returns the drag behavior.
      *
      * The container of a drag gesture determines the coordinate system of subsequent drag events, affecting event.x and event.y.
      * The element returned by the container accessor is subsequently passed to d3.pointer to determine the local coordinates of the pointer.
      *
      * The default container accessor returns the parent node of the element in the originating selection (see drag)
      * that received the initiating input event. This is often appropriate when dragging SVG or HTML elements,
      * since those elements are typically positioned relative to a parent. For dragging graphical elements with a Canvas,
      * however, you may want to redefine the container as the initiating element itself, such as drag.container(canvas).
      *
      * @param container Container element for the drag gesture.
      */
    def container(container: DragContainerElement): this.type = js.native
    
    /**
      * Returns the current filter function.
      */
    def filter(): js.ThisFunction2[/* this */ GElement, /* event */ js.Any, /* d */ Datum, Boolean] = js.native
    /**
      * Sets the event filter to the specified filter function and returns the drag behavior.
      *
      * If the filter returns falsey, the initiating event is ignored and no drag gesture is started.
      * Thus, the filter determines which input events are ignored. The default filter ignores mousedown events on secondary buttons,
      * since those buttons are typically intended for other purposes, such as the context menu.
      *
      * @param filterFn A filter function which is evaluated for each selected element,
      * in order, being passed the current event (event) and datum d, with the this context as the current DOM element.
      * The function returns a boolean value.
      */
    def filter(filterFn: js.ThisFunction2[/* this */ GElement, /* event */ js.Any, /* d */ Datum, Boolean]): this.type = js.native
    
    /**
      * Return the first currently-assigned listener matching the specified typenames, if any.
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
      * Changes to registered listeners via drag.on during a drag gesture do not affect the current drag gesture.
      * Instead, you must use event.on, which also allows you to register temporary event listeners for the current drag gesture.
      * Separate events are dispatched for each active pointer during a drag gesture.
      * For example, if simultaneously dragging multiple subjects with multiple fingers, a start event is dispatched for each finger,
      * even if both fingers start touching simultaneously.
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
      * @param typenames The typenames is a string containing one or more typename separated by whitespace.
      * Each typename is a type, optionally followed by a period (.) and a name, such as "drag.foo"" and "drag.bar";
      * the name allows multiple listeners to be registered for the same type. The type must be one of the following:
      * start (after a new pointer becomes active [on mousedown or touchstart]), drag (after an active pointer moves [on mousemove or touchmove], or
      * end (after an active pointer becomes inactive [on mouseup, touchend or touchcancel].)
      * @param listener Use null to remove the listener.
      */
    def on(typenames: String, listener: Null): this.type = js.native
    
    /**
      *  Returns the current subject accessor functions.
      */
    def subject(): js.ThisFunction2[/* this */ GElement, /* event */ js.Any, /* d */ Datum, Subject] = js.native
    /**
      * Sets the subject accessor to the specified function and returns the drag behavior.
      *
      * The subject of a drag gesture represents the thing being dragged.
      * It is computed when an initiating input event is received,
      * such as a mousedown or touchstart, immediately before the drag gesture starts.
      * The subject is then exposed as event.subject on subsequent drag events for this gesture.
      *
      * The default subject is the datum of the element in the originating selection (see drag)
      * that received the initiating input event; if this datum is undefined,
      * an object representing the coordinates of the pointer is created.
      * When dragging circle elements in SVG, the default subject is thus the datum of the circle being dragged.
      * With Canvas, the default subject is the canvas element’s datum (regardless of where on the canvas you click).
      * In this case, a custom subject accessor would be more appropriate,
      * such as one that picks the closest circle to the mouse within a given search radius.
      *
      * The subject of a drag gesture may not be changed after the gesture starts.
      *
      * During the evaluation of the subject accessor, event is a beforestart drag event.
      * Use event.sourceEvent to access the initiating input event and event.identifier to access the touch identifier.
      * The event.x and event.y are relative to the container, and are computed using d3.pointer.
      *
      * @param accessor An extent accessor function which is evaluated for each selected element,
      * in order, being passed the current event (`event`) and datum `d`, with the `this` context as the current DOM element.
      * The returned subject should be an object that exposes x and y properties,
      * so that the relative position of the subject and the pointer can be preserved during the drag gesture.
      * If the subject is null or undefined, no drag gesture is started for this pointer;
      * however, other starting touches may yet start drag gestures.
      */
    def subject(accessor: js.ThisFunction2[/* this */ GElement, /* event */ js.Any, /* d */ Datum, Subject]): this.type = js.native
    
    /**
      * Returns the current touch support detector, which defaults to a function returning true,
      * if the "ontouchstart" event is supported on the current element.
      */
    def touchable(): ValueFn[GElement, Datum, Boolean] = js.native
    /**
      * Sets the touch support detector to the specified boolean value and returns the drag behavior.
      *
      * Touch event listeners are only registered if the detector returns truthy for the corresponding element when the drag behavior is applied.
      * The default detector works well for most browsers that are capable of touch input, but not all; Chrome’s mobile device emulator, for example,
      * fails detection.
      *
      * @param touchable A boolean value. true when touch event listeners should be applied to the corresponding element, otherwise false.
      */
    def touchable(touchable: Boolean): this.type = js.native
    /**
      * Sets the touch support detector to the specified function and returns the drag behavior.
      *
      * Touch event listeners are only registered if the detector returns truthy for the corresponding element when the drag behavior is applied.
      * The default detector works well for most browsers that are capable of touch input, but not all; Chrome’s mobile device emulator, for example,
      * fails detection.
      *
      * @param touchable A touch support detector function, which returns true when touch event listeners should be applied to the corresponding element.
      * The function is evaluated for each selected element to which the drag behavior was applied, in order, being passed the current datum (d),
      * the current index (i), and the current group (nodes), with this as the current DOM element. The function returns a boolean value.
      */
    def touchable(touchable: ValueFn[GElement, Datum, Boolean]): this.type = js.native
  }
  
  type DragContainerElement = HTMLElement | SVGSVGElement | SVGGElement
  
  type DraggedElementBaseType = Element
  
  trait SubjectPosition extends StObject {
    
    /**
      * x-coordinate
      */
    var x: Double
    
    /**
      * y-coordinate
      */
    var y: Double
  }
  object SubjectPosition {
    
    @scala.inline
    def apply(x: Double, y: Double): SubjectPosition = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubjectPosition]
    }
    
    @scala.inline
    implicit class SubjectPositionMutableBuilder[Self <: SubjectPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
