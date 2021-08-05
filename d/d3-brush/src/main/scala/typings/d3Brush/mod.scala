package typings.d3Brush

import typings.d3Brush.d3BrushStrings.brush
import typings.d3Brush.d3BrushStrings.center
import typings.d3Brush.d3BrushStrings.drag
import typings.d3Brush.d3BrushStrings.end
import typings.d3Brush.d3BrushStrings.handle
import typings.d3Brush.d3BrushStrings.space
import typings.d3Brush.d3BrushStrings.start
import typings.d3Selection.mod.Selection_
import typings.d3Selection.mod.TransitionLike
import typings.d3Selection.mod.ValueFn
import typings.std.SVGGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-brush", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def brush[Datum](): BrushBehavior[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("brush")().asInstanceOf[BrushBehavior[Datum]]
  
  inline def brushSelection(node: SVGGElement): BrushSelection_ | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("brushSelection")(node.asInstanceOf[js.Any]).asInstanceOf[BrushSelection_ | Null]
  
  inline def brushX[Datum](): BrushBehavior[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("brushX")().asInstanceOf[BrushBehavior[Datum]]
  
  inline def brushY[Datum](): BrushBehavior[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("brushY")().asInstanceOf[BrushBehavior[Datum]]
  
  @js.native
  trait BrushBehavior[Datum] extends StObject {
    
    /**
      * Applies the brush to the specified group, which must be a selection of SVG G elements.
      * This function is typically not invoked directly, and is instead invoked via selection.call.
      *
      * For details see: {@link https://github.com/d3/d3-brush#_brush}
      *
      * @param group A D3 selection of SVG G elements.
      * @param args Optional arguments to be passed in.
      */
    def apply(group: Selection_[SVGGElement, Datum, js.Any, js.Any], args: js.Any*): Unit = js.native
    
    /**
      * Clear the active selection of the brush on the specified SVG G element(s) selection.
      *
      * @param group A D3 selection of SVG G elements.
      */
    def clear(group: Selection_[SVGGElement, Datum, js.Any, js.Any]): Unit = js.native
    
    /**
      * Returns the current extent accessor.
      */
    def extent(): ValueFn[SVGGElement, Datum, js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]] = js.native
    /**
      * Set the brushable extent to the specified array of points and returns this brush.
      *
      * The brush extent determines the size of the invisible overlay and also constrains the brush selection;
      * the brush selection cannot go outside the brush extent.
      *
      * @param extent array of points [[x0, y0], [x1, y1]], where [x0, y0] is the top-left corner
      * and [x1, y1] is the bottom-right corner.
      */
    def extent(extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): this.type = js.native
    /**
      * Set the brushable extent to the specified array of points returned by the accessor function
      * evaluated for each element in the selection/transition and returns this brush.
      *
      * The brush extent determines the size of the invisible overlay and also constrains the brush selection;
      * the brush selection cannot go outside the brush extent.
      *
      * @param extent An extent accessor function which is evaluated for each selected element,
      * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
      * with this as the current DOM element. The function returns an array of points [[x0, y0], [x1, y1]],
      * where [x0, y0] is the top-left corner and [x1, y1] is the bottom-right corner.
      */
    def extent(
      extent: ValueFn[SVGGElement, Datum, js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]]
    ): this.type = js.native
    
    /**
      * Returns the current filter function.
      */
    def filter(): js.ThisFunction2[/* this */ SVGGElement, /* event */ js.Any, /* d */ Datum, Boolean] = js.native
    /**
      * Sets the filter to the specified filter function and returns the brush.
      *
      * If the filter returns falsey, the initiating event is ignored and no brush gesture is started.
      * Thus, the filter determines which input events are ignored. The default filter ignores mousedown events on secondary buttons,
      * since those buttons are typically intended for other purposes, such as the context menu.
      *
      * @param filterFn A filter function which is evaluated for each selected element,
      * in order, being passed the current event `event` and datum `d`, with the `this` context as the current DOM element.
      * The function returns a boolean value.
      */
    def filter(filterFn: js.ThisFunction2[/* this */ SVGGElement, /* event */ js.Any, /* d */ Datum, Boolean]): this.type = js.native
    
    /**
      * Returns the current handle size, which defaults to six.
      */
    def handleSize(): Double = js.native
    /**
      * Sets the size of the brush handles to the specified number and returns the brush.
      *
      * This method must be called before applying the brush to a selection;
      * changing the handle size does not affect brushes that were previously rendered.
      * The default size is 6.
      *
      * @param size Size of the handle.
      */
    def handleSize(size: Double): this.type = js.native
    
    /**
      * Returns the current key modifiers flag.
      */
    def keyModifiers(): Boolean = js.native
    /**
      * Sets the key modifiers flag and returns the brush.
      *
      * The key modifiers flag determines whether the brush listens to key events during brushing.
      * The default value is true.
      *
      * @param modifiers New value for key modifiers flag.
      */
    def keyModifiers(modifiers: Boolean): this.type = js.native
    
    /**
      * Clear the active selection of the brush on the specified SVG G element(s) selection.
      *
      * @param group A D3 selection of SVG G elements.
      * @param selection Use null to clear the active brush selection.
      */
    def move(group: Selection_[SVGGElement, Datum, js.Any, js.Any], selection: Null): Unit = js.native
    /**
      * Sets the active selection of the brush on the specified SVG G element(s) selection
      * to the provided array.
      *
      * @param group A D3 selection of SVG G elements.
      * @param selection An array specifying the new active brush selection. For a two-dimensional brush,
      * it must be defined as [[x0, y0], [x1, y1]], where x0 is the minimum x-value, y0 is the minimum y-value,
      * x1 is the maximum x-value, and y1 is the maximum y-value. For an x-brush, it must be defined as [x0, x1];
      * for a y-brush, it must be defined as [y0, y1].
      */
    def move(group: Selection_[SVGGElement, Datum, js.Any, js.Any], selection: BrushSelection_): Unit = js.native
    /**
      * Sets the active selection of the brush on the specified SVG G element(s) selection
      * based on the array returned by a value function invoked for each selection element.
      *
      * @param group A D3 selection of SVG G elements.
      * @param selection A selection value function which is evaluated for each selected element,
      * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
      * with this as the current DOM element. The function returns an array specifying the new active brush selection.
      * For a two-dimensional brush, it must be defined as [[x0, y0], [x1, y1]], where x0 is the minimum x-value, y0 is the minimum y-value,
      * x1 is the maximum x-value, and y1 is the maximum y-value. For an x-brush, it must be defined as [x0, x1];
      * for a y-brush, it must be defined as [y0, y1].
      */
    def move(
      group: Selection_[SVGGElement, Datum, js.Any, js.Any],
      selection: ValueFn[SVGGElement, Datum, BrushSelection_]
    ): Unit = js.native
    /**
      * Sets the active selection of the brush on the specified SVG G element(s) transition
      * to the provided array.
      *
      * @param group A D3 transition on SVG G elements.
      * @param selection An array specifying the new active brush selection. For a two-dimensional brush,
      * it must be defined as [[x0, y0], [x1, y1]], where x0 is the minimum x-value, y0 is the minimum y-value,
      * x1 is the maximum x-value, and y1 is the maximum y-value. For an x-brush, it must be defined as [x0, x1];
      * for a y-brush, it must be defined as [y0, y1].
      */
    def move(group: TransitionLike[SVGGElement, Datum], selection: BrushSelection_): Unit = js.native
    /**
      * Sets the active selection of the brush on the specified SVG G element(s) transition
      * based on the array returned by a value function invoked for each transitioning element.
      *
      * @param group A D3 transition on SVG G elements.
      * @param selection A selection value function which is evaluated for each selected element,
      * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
      * with this as the current DOM element. The function returns an array specifying the new active brush selection.
      * For a two-dimensional brush, it must be defined as [[x0, y0], [x1, y1]], where x0 is the minimum x-value, y0 is the minimum y-value,
      * x1 is the maximum x-value, and y1 is the maximum y-value. For an x-brush, it must be defined as [x0, x1];
      * for a y-brush, it must be defined as [y0, y1].
      */
    def move(group: TransitionLike[SVGGElement, Datum], selection: ValueFn[SVGGElement, Datum, BrushSelection_]): Unit = js.native
    
    /**
      * Returns the first currently-assigned listener matching the specified typenames, if any.
      *
      * @param typenames The typenames is a string containing one or more typename separated by whitespace.
      * Each typename is a type, optionally followed by a period (.) and a name, such as "brush.foo"" and "brush.bar";
      * the name allows multiple listeners to be registered for the same type. The type must be one of the following:
      * start (at the start of a brush gesture, such as on mousedown), brush (when the brush moves, such as on mousemove), or
      * end (at the end of a brush gesture, such as on mouseup.)
      */
    def on(typenames: String): js.UndefOr[
        js.ThisFunction2[/* this */ SVGGElement, /* event */ js.Any, /* d */ Datum, Unit]
      ] = js.native
    /**
      * Sets the event listener for the specified typenames and returns the brush.
      * If an event listener was already registered for the same type and name,
      * the existing listener is removed before the new listener is added.
      * When a specified event is dispatched, each listener will be invoked with the same context and arguments as selection.on listeners.
      *
      * @param typenames The typenames is a string containing one or more typename separated by whitespace.
      * Each typename is a type, optionally followed by a period (.) and a name, such as "brush.foo"" and "brush.bar";
      * the name allows multiple listeners to be registered for the same type. The type must be one of the following:
      * start (at the start of a brush gesture, such as on mousedown), brush (when the brush moves, such as on mousemove), or
      * end (at the end of a brush gesture, such as on mouseup.)
      * @param listener An event listener function which is evaluated for each selected element,
      * in order, being passed the current event `event` and datum `d`, with the `this` context as the current DOM element.
      */
    def on(
      typenames: String,
      listener: js.ThisFunction2[/* this */ SVGGElement, /* event */ js.Any, /* d */ Datum, Unit]
    ): this.type = js.native
    /**
      * Removes the current event listeners for the specified typenames, if any.
      *
      * @param typenames The typenames is a string containing one or more typename separated by whitespace.
      * Each typename is a type, optionally followed by a period (.) and a name, such as "brush.foo"" and "brush.bar";
      * the name allows multiple listeners to be registered for the same type. The type must be one of the following:
      * start (at the start of a brush gesture, such as on mousedown), brush (when the brush moves, such as on mousemove), or
      * end (at the end of a brush gesture, such as on mouseup.)
      * @param listener Use null to remove the listener.
      */
    def on(typenames: String, listener: Null): this.type = js.native
    
    /**
      * Returns the current touch support detector, which defaults to a function returning true,
      * if the "ontouchstart" event is supported on the current element.
      */
    def touchable(): ValueFn[SVGGElement, Datum, Boolean] = js.native
    /**
      * Sets the touch support detector to the specified boolean value and returns the brush.
      *
      * Touch event listeners are only registered if the detector returns truthy for the corresponding element when the brush is applied.
      * The default detector works well for most browsers that are capable of touch input, but not all; Chrome’s mobile device emulator, for example,
      * fails detection.
      *
      * @param touchable A boolean value. true when touch event listeners should be applied to the corresponding element, otherwise false.
      */
    def touchable(touchable: Boolean): this.type = js.native
    /**
      * Sets the touch support detector to the specified function and returns the drag behavior.
      *
      * Touch event listeners are only registered if the detector returns truthy for the corresponding element when the brush is applied.
      * The default detector works well for most browsers that are capable of touch input, but not all; Chrome’s mobile device emulator, for example,
      * fails detection.
      *
      * @param touchable A touch support detector function, which returns true when touch event listeners should be applied to the corresponding element.
      * The function is evaluated for each selected element to which the brush was applied, in order, being passed the current datum (d),
      * the current index (i), and the current group (nodes), with this as the current DOM element. The function returns a boolean value.
      */
    def touchable(touchable: ValueFn[SVGGElement, Datum, Boolean]): this.type = js.native
  }
  
  type BrushSelection_ = js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])]
  
  trait D3BrushEvent[Datum] extends StObject {
    
    /**
      * The mode of the brush.
      */
    var mode: drag | space | handle | center
    
    // Leave failsafe string type for cases like 'brush.foo'
    /**
      * The current brush selection associated with the event.
      * This is null when the selection is empty.
      */
    var selection: BrushSelection_ | Null
    
    /**
      * The underlying input event, such as mousemove or touchmove.
      */
    var sourceEvent: js.Any
    
    /**
      * Applies the brush to the specified group, which must be a selection of SVG G elements.
      * This function is typically not invoked directly, and is instead invoked via selection.call.
      *
      * For details see: {@link https://github.com/d3/d3-brush#_brush}
      *
      * @param group A D3 selection of SVG G elements.
      * @param args Optional arguments to be passed in.
      */
    /**
      * The BrushBehavior associated with the event
      */
    def target(group: Selection_[SVGGElement, Datum, js.Any, js.Any], args: js.Any*): Unit
    /**
      * The BrushBehavior associated with the event
      */
    @JSName("target")
    var target_Original: BrushBehavior[Datum]
    
    /**
      * The event type for the BrushEvent
      */
    var `type`: start | brush | end | String
  }
  object D3BrushEvent {
    
    inline def apply[Datum](
      mode: drag | space | handle | center,
      sourceEvent: js.Any,
      target: BrushBehavior[Datum],
      `type`: start | brush | end | String
    ): D3BrushEvent[Datum] = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], sourceEvent = sourceEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], selection = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[D3BrushEvent[Datum]]
    }
    
    extension [Self <: D3BrushEvent[?], Datum](x: Self & D3BrushEvent[Datum]) {
      
      inline def setMode(value: drag | space | handle | center): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setSelection(value: BrushSelection_): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionNull: Self = StObject.set(x, "selection", null)
      
      inline def setSourceEvent(value: js.Any): Self = StObject.set(x, "sourceEvent", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: BrushBehavior[Datum]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: start | brush | end | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
