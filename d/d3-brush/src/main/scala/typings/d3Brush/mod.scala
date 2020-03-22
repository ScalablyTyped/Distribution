package typings.d3Brush

import typings.d3Brush.d3BrushStrings.brush
import typings.d3Brush.d3BrushStrings.end
import typings.d3Brush.d3BrushStrings.start
import typings.d3Selection.mod.Selection_
import typings.d3Selection.mod.TransitionLike
import typings.d3Selection.mod.ValueFn
import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-brush", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait BrushBehavior[Datum] extends js.Object {
    /**
      * Applies the brush to the specified group, which must be a selection of SVG G elements.
      * This function is typically not invoked directly, and is instead invoked via selection.call.
      *
      * For details see: {@link https://github.com/d3/d3-brush#_brush}
      *
      * @param group A D3 selection of SVG G elements.
      * @param args Optional arguments to be passed in.
      */
    def apply(group: Selection_[SVGGElement, Datum, _, _], args: js.Any*): Unit = js.native
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
    def filter(): ValueFn[SVGGElement, Datum, Boolean] = js.native
    /**
      * Sets the filter to the specified filter function and returns the brush.
      *
      * If the filter returns falsey, the initiating event is ignored and no brush gesture is started.
      * Thus, the filter determines which input events are ignored. The default filter ignores mousedown events on secondary buttons,
      * since those buttons are typically intended for other purposes, such as the context menu.
      *
      * @param filterFn A filter function which is evaluated for each selected element,
      * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
      * with this as the current DOM element. The function returns a boolean value.
      */
    def filter(filterFn: ValueFn[SVGGElement, Datum, Boolean]): this.type = js.native
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
      * @param keyModifiers New value for key modifiers flag.
      */
    def keyModifiers(modifiers: Boolean): this.type = js.native
    /**
      * Clear the active selection of the brush on the specified SVG G element(s) selection.
      *
      * @param group A D3 selection of SVG G elements.
      * @param selection Use null to clear the active brush selection.
      */
    def move(group: Selection_[SVGGElement, Datum, _, _]): Unit = js.native
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
    def move(group: Selection_[SVGGElement, Datum, _, _], selection: BrushSelection_): Unit = js.native
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
      group: Selection_[SVGGElement, Datum, _, _],
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
      * Removes the current event listeners for the specified typenames, if any.
      *
      * @param typenames The typenames is a string containing one or more typename separated by whitespace.
      * Each typename is a type, optionally followed by a period (.) and a name, such as "brush.foo"" and "brush.bar";
      * the name allows multiple listeners to be registered for the same type. The type must be one of the following:
      * start (at the start of a brush gesture, such as on mousedown), brush (when the brush moves, such as on mousemove), or
      * end (at the end of a brush gesture, such as on mouseup.)
      * @param listener Use null to remove the listener.
      */
    def on(typenames: String): this.type = js.native
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
      * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
      * with this as the current DOM element.
      */
    def on(typenames: String, listener: ValueFn[SVGGElement, Datum, Unit]): this.type = js.native
    /**
      * Returns the first currently-assigned listener matching the specified typenames, if any.
      *
      * @param typenames The typenames is a string containing one or more typename separated by whitespace.
      * Each typename is a type, optionally followed by a period (.) and a name, such as "brush.foo"" and "brush.bar";
      * the name allows multiple listeners to be registered for the same type. The type must be one of the following:
      * start (at the start of a brush gesture, such as on mousedown), brush (when the brush moves, such as on mousemove), or
      * end (at the end of a brush gesture, such as on mouseup.)
      */
    @JSName("on")
    def on_Union(typenames: String): js.UndefOr[ValueFn[SVGGElement, Datum, Unit]] = js.native
  }
  
  @js.native
  trait D3BrushEvent[Datum] extends js.Object {
     // Leave failsafe string type for cases like 'brush.foo'
    /**
      * The current brush selection associated with the event.
      */
    var selection: BrushSelection_ = js.native
    /**
      * The underlying input event, such as mousemove or touchmove.
      */
    var sourceEvent: js.Any = js.native
    /**
      * The BrushBehavior associated with the event
      */
    @JSName("target")
    var target_Original: BrushBehavior[Datum] = js.native
    /**
      * The event type for the BrushEvent
      */
    var `type`: start | brush | end | String = js.native
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
    def target(group: Selection_[SVGGElement, Datum, _, _], args: js.Any*): Unit = js.native
  }
  
  def brush[Datum](): BrushBehavior[Datum] = js.native
  def brushSelection(node: SVGGElement): BrushSelection_ | Null = js.native
  def brushX[Datum](): BrushBehavior[Datum] = js.native
  def brushY[Datum](): BrushBehavior[Datum] = js.native
  type BrushSelection_ = js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])]
}

