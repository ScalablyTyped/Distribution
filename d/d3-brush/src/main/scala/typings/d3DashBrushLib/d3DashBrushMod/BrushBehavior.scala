package typings
package d3DashBrushLib.d3DashBrushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    group: d3DashSelectionLib.d3DashSelectionMod.Selection[stdLib.SVGGElement, Datum, _, _],
    args: js.Any*
  ): scala.Unit = js.native
  /**
       * Returns the current extent accessor.
       */
  def extent(): d3DashSelectionLib.d3DashSelectionMod.ValueFn[
    stdLib.SVGGElement, 
    Datum, 
    js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]]
  ] = js.native
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
    extent: d3DashSelectionLib.d3DashSelectionMod.ValueFn[
      stdLib.SVGGElement, 
      Datum, 
      js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]]
    ]
  ): this.type = js.native
  /**
       * Set the brushable extent to the specified array of points and returns this brush.
       *
       * The brush extent determines the size of the invisible overlay and also constrains the brush selection;
       * the brush selection cannot go outside the brush extent.
       *
       * @param extent array of points [[x0, y0], [x1, y1]], where [x0, y0] is the top-left corner
       * and [x1, y1] is the bottom-right corner.
       */
  def extent(extent: js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]]): this.type = js.native
  /**
       * Returns the current filter function.
       */
  def filter(): d3DashSelectionLib.d3DashSelectionMod.ValueFn[stdLib.SVGGElement, Datum, scala.Boolean] = js.native
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
  def filter(filterFn: d3DashSelectionLib.d3DashSelectionMod.ValueFn[stdLib.SVGGElement, Datum, scala.Boolean]): this.type = js.native
  /**
       * Returns the current handle size, which defaults to six.
       */
  def handleSize(): scala.Double = js.native
  /**
       * Sets the size of the brush handles to the specified number and returns the brush.
       *
       * This method must be called before applying the brush to a selection;
       * changing the handle size does not affect brushes that were previously rendered.
       * The default size is 6.
       *
       * @param size Size of the handle.
       */
  def handleSize(size: scala.Double): this.type = js.native
  /**
       * Clear the active selection of the brush on the specified SVG G element(s) selection.
       *
       * @param group A D3 selection of SVG G elements.
       * @param selection Use null to clear the active brush selection.
       */
  def move(group: d3DashSelectionLib.d3DashSelectionMod.Selection[stdLib.SVGGElement, Datum, _, _]): scala.Unit = js.native
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
  def move(
    group: d3DashSelectionLib.d3DashSelectionMod.Selection[stdLib.SVGGElement, Datum, _, _],
    selection: BrushSelection
  ): scala.Unit = js.native
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
    group: d3DashSelectionLib.d3DashSelectionMod.Selection[stdLib.SVGGElement, Datum, _, _],
    selection: d3DashSelectionLib.d3DashSelectionMod.ValueFn[stdLib.SVGGElement, Datum, BrushSelection]
  ): scala.Unit = js.native
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
  def move(
    group: d3DashSelectionLib.d3DashSelectionMod.TransitionLike[stdLib.SVGGElement, Datum],
    selection: BrushSelection
  ): scala.Unit = js.native
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
  def move(
    group: d3DashSelectionLib.d3DashSelectionMod.TransitionLike[stdLib.SVGGElement, Datum],
    selection: d3DashSelectionLib.d3DashSelectionMod.ValueFn[stdLib.SVGGElement, Datum, BrushSelection]
  ): scala.Unit = js.native
  /**
       * Returns the first currently-assigned listener matching the specified typenames, if any.
       *
       * @param typenames The typenames is a string containing one or more typename separated by whitespace.
       * Each typename is a type, optionally followed by a period (.) and a name, such as "brush.foo"" and "brush.bar";
       * the name allows multiple listeners to be registered for the same type. The type must be one of the following:
       * start (at the start of a brush gesture, such as on mousedown), brush (when the brush moves, such as on mousemove), or
       * end (at the end of a brush gesture, such as on mouseup.)
       */
  def on(typenames: java.lang.String): js.UndefOr[
    d3DashSelectionLib.d3DashSelectionMod.ValueFn[stdLib.SVGGElement, Datum, scala.Unit]
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
       * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
       * with this as the current DOM element.
       */
  def on(
    typenames: java.lang.String,
    listener: d3DashSelectionLib.d3DashSelectionMod.ValueFn[stdLib.SVGGElement, Datum, scala.Unit]
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
  @JSName("on")
  def `on_<this>`(typenames: java.lang.String): this.type = js.native
}

