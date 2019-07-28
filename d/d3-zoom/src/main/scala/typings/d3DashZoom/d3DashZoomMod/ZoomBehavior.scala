package typings.d3DashZoom.d3DashZoomMod

import typings.d3DashInterpolate.d3DashInterpolateMod.ZoomView
import typings.d3DashSelection.d3DashSelectionMod.Selection
import typings.d3DashSelection.d3DashSelectionMod.TransitionLike
import typings.d3DashSelection.d3DashSelectionMod.ValueFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomBehavior[ZoomRefElement /* <: ZoomedElementBaseType */, Datum]
  extends js.Function {
  /**
    * Applies this zoom behavior to the specified selection, binding the necessary event listeners to
    * allow panning and zooming, and initializing the zoom transform on each selected element to the identity transform if not already defined. This function is typically not invoked directly,
    * and is instead invoked via selection.call.
    *
    * For details see: {@link https://github.com/d3/d3-zoom#_zoom}
    *
    * @param selection A D3 selection of elements.
    * @param args Optional arguments to be passed in.
    */
  def apply(selection: Selection[ZoomRefElement, Datum, _, _], args: js.Any*): Unit = js.native
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
    * Returns the current constraint function.
    * The default implementation attempts to ensure that the viewport extent does not go outside the translate extent.
    */
  def constrain(): js.Function3[
    /* transform */ ZoomTransform, 
    /* extent */ js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]], 
    /* translateExtent */ js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]], 
    ZoomTransform
  ] = js.native
  /**
    * Sets the transform constraint function to the specified function and returns the zoom behavior.
    *
    * @param constraint A constraint function which returns a transform given the current transform, viewport extent and translate extent.
    * The default implementation attempts to ensure that the viewport extent does not go outside the translate extent.
    */
  def constrain(
    constraint: js.Function3[
      /* transform */ ZoomTransform, 
      /* extent */ js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]], 
      /* translateExtent */ js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]], 
      ZoomTransform
    ]
  ): this.type = js.native
  /**
    * Get the duration for zoom transitions on double-click and double-tap in milliseconds.
    */
  def duration(): Double = js.native
  /**
    * Set the duration for zoom transitions on double-click and double-tap to the specified number of milliseconds and returns the zoom behavior.
    *
    * To disable double-click and double-tap transitions, you can remove the zoom behavior’s dblclick event listener after applying the zoom behavior to the selection.
    *
    * @param Duration in milliseconds.
    */
  def duration(duration: Double): this.type = js.native
  /**
    * Return the current extent accessor, which defaults to [[0, 0], [width, height]] where width is the client width of the element and height is its client height;
    * for SVG elements, the nearest ancestor SVG element’s width and height is used. In this case,
    * the owner SVG element must have defined width and height attributes rather than (for example) relying on CSS properties or the viewBox attribute;
    * SVG provides no programmatic method for retrieving the initial viewport size. Alternatively, consider using element.getBoundingClientRect.
    * (In Firefox, element.clientWidth and element.clientHeight is zero for SVG elements!)
    */
  def extent(): ValueFn[
    ZoomRefElement, 
    Datum, 
    js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]
  ] = js.native
  /**
    * Set the viewport extent to the specified array of points [[x0, y0], [x1, y1]],
    * where [x0, y0] is the top-left corner of the viewport and [x1, y1] is the bottom-right corner of the viewport,
    * and return this zoom behavior.
    *
    * The viewport extent affects several functions: the center of the viewport remains fixed during changes by zoom.scaleBy and zoom.scaleTo;
    * the viewport center and dimensions affect the path chosen by d3.interpolateZoom; and the viewport extent is needed to enforce the optional translate extent.
    *
    * @param extent An extent specified as an array of two coordinates.
    */
  def extent(extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): this.type = js.native
  /**
    * Set the viewport extent to the array of points [[x0, y0], [x1, y1]] returned by the
    * extent accessor function, and return this zoom behavior.
    * The extent accessor function is evaluated for each element.
    *
    * [x0, y0] is the top-left corner of the viewport and [x1, y1] is the bottom-right corner of the viewport.
    *
    * The viewport extent affects several functions: the center of the viewport remains fixed during changes by zoom.scaleBy and zoom.scaleTo;
    * the viewport center and dimensions affect the path chosen by d3.interpolateZoom; and the viewport extent is needed to enforce the optional translate extent.
    *
    * The default is [[0, 0], [width, height]] where width is the client width of the element and height is its client height;
    * for SVG elements, the nearest ancestor SVG element’s width and height is used.
    * In this case, the owner SVG element must have defined width and height attributes rather than (for example) relying on CSS properties or the viewBox attribute;
    * SVG provides no programmatic method for retrieving the initial viewport size. Alternatively, consider using element.getBoundingClientRect.
    * (In Firefox, element.clientWidth and element.clientHeight is zero for SVG elements!)
    *
    * @extent An extent accessor function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element.The function returns the extent array.
    */
  def extent(
    extent: ValueFn[
      ZoomRefElement, 
      Datum, 
      js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]
    ]
  ): this.type = js.native
  /**
    * Returns the current filter function.
    */
  def filter(): ValueFn[ZoomRefElement, Datum, Boolean] = js.native
  /**
    * Sets the filter to the specified filter function and returns the zoom behavior.
    * The filter function is invoked in the zoom initiating event handlers of each element to which the zoom behavior was applied.
    *
    * If the filter returns falsey, the initiating event is ignored and no zoom gesture is started.
    * Thus, the filter determines which input events are ignored. The default filter ignores mousedown events on secondary buttons,
    * since those buttons are typically intended for other purposes, such as the context menu.
    *
    * @param filterFn A filter function which is invoked in the zoom initiating event handlers of each element to which the zoom behavior was applied,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element. The function returns a boolean value.
    */
  def filter(filterFn: ValueFn[ZoomRefElement, Datum, Boolean]): this.type = js.native
  /**
    * Sets the interpolation factory for zoom transitions to the specified function.
    * Use the default d3.interpolateZoom to implement smooth zooming.
    * To apply direct interpolation between two views, try d3.interpolate instead.
    *
    * Each view is defined as an array of three numbers: cx, cy and width. The first two coordinates cx, cy represent the center of the viewport;
    * the last coordinate width represents the size of the viewport.
    *
    * @param interpolatorFactory An interpolator factory to be used to generate interpolators between zooms for transitions.
    */
  def interpolate(
    interpolatorFactory: js.Function2[/* a */ ZoomView, /* b */ ZoomView, js.Function1[/* t */ Double, ZoomView]]
  ): this.type = js.native
  /**
    * Returns the current interpolation factory, which defaults to d3.interpolateZoom to implement smooth zooming.
    */
  def interpolate[InterpolationFactory /* <: js.Function2[/* a */ ZoomView, /* b */ ZoomView, js.Function1[/* t */ Double, ZoomView]] */](): InterpolationFactory = js.native
  /**
    * Return the first currently-assigned listener matching the specified typenames, if any.
    *
    * @param typenames The typenames is a string containing one or more typename separated by whitespace.
    * Each typename is a type, optionally followed by a period (.) and a name, such as "drag.foo"" and "drag.bar";
    * the name allows multiple listeners to be registered for the same type. The type must be one of the following:
    * start (after zooming begins [such as mousedown]), zoom (after a change to the zoom  transform [such as mousemove], or
    * end (after an active pointer becomes inactive [such as on mouseup].)
    */
  def on(typenames: String): js.UndefOr[ValueFn[ZoomRefElement, Datum, Unit]] = js.native
  /**
    * Set the event listener for the specified typenames and return the zoom behavior.
    * If an event listener was already registered for the same type and name,
    * the existing listener is removed before the new listener is added.
    * When a specified event is dispatched, each listener will be invoked with the same context and arguments as selection.on listeners.
    *
    *
    * @param typenames The typenames is a string containing one or more typename separated by whitespace.
    * Each typename is a type, optionally followed by a period (.) and a name, such as "drag.foo"" and "drag.bar";
    * the name allows multiple listeners to be registered for the same type. The type must be one of the following:
    * start (after zooming begins [such as mousedown]), zoom (after a change to the zoom  transform [such as mousemove], or
    * end (after an active pointer becomes inactive [such as on mouseup].)
    * @param listener An event listener function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element.
    */
  def on(typenames: String, listener: ValueFn[ZoomRefElement, Datum, Unit]): this.type = js.native
  /**
    * Remove the current event listeners for the specified typenames, if any, return the drag behavior.
    *
    * @param typenames The typenames is a string containing one or more typename separated by whitespace.
    * Each typename is a type, optionally followed by a period (.) and a name, such as "drag.foo"" and "drag.bar";
    * the name allows multiple listeners to be registered for the same type. The type must be one of the following:
    * start (after zooming begins [such as mousedown]), zoom (after a change to the zoom  transform [such as mousemove], or
    * end (after an active pointer becomes inactive [such as on mouseup].)
    * @param listener Use null to remove the listener.
    */
  @JSName("on")
  def on_This(typenames: String): this.type = js.native
  /**
    * Scales the current zoom transform of the selected elements by k, such that the new k(1) = k(0)k.
    *
    * k is provided as a constant for all elements.
    *
    * This method is a convenience method for zoom.transform.
    * In contrast to zoom.transform, however, it is subject to the constraints imposed by zoom.extent, zoom.scaleExtent, and zoom.translateExtent.
    *
    * @param selection A D3 selection of elements.
    * @param k Scale factor.
    */
  def scaleBy(selection: Selection[ZoomRefElement, Datum, _, _], k: Double): Unit = js.native
  /**
    * Scales the current zoom transform of the selected elements by k, such that the new k(1) = k(0)k.
    *
    * k is provided by a value function evaluated for each element in the selection.
    *
    * This method is a convenience method for zoom.transform.
    * In contrast to zoom.transform, however, it is subject to the constraints imposed by zoom.extent, zoom.scaleExtent, and zoom.translateExtent.
    *
    * @param selection A D3 selection of elements.
    * @param k A value function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element.The function returns the scale factor.
    */
  def scaleBy(selection: Selection[ZoomRefElement, Datum, _, _], k: ValueFn[ZoomRefElement, Datum, Double]): Unit = js.native
  /**
    * Defines a “zoom” tween translating scaling the current transform of the selected elements by k, such that the new k(1) = k(0)k.
    *
    * k is provided as a constant for all elements.
    *
    * This method is a convenience method for zoom.transform.
    * In contrast to zoom.transform, however, it is subject to the constraints imposed by zoom.extent, zoom.scaleExtent, and zoom.translateExtent.
    *
    * @param transition A D3 transition on elements.
    * @param k Scale factor.
    */
  def scaleBy(transition: TransitionLike[ZoomRefElement, Datum], k: Double): Unit = js.native
  /**
    * Defines a “zoom” tween translating scaling the current transform of the selected elements by k, such that the new k(1) = k(0)k.
    *
    * k is provided by a value function evaluated for each element in the selection.
    *
    * This method is a convenience method for zoom.transform.
    * In contrast to zoom.transform, however, it is subject to the constraints imposed by zoom.extent, zoom.scaleExtent, and zoom.translateExtent.
    *
    * @param transition A D3 transition on elements.
    * @param k A value function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element.The function returns the scale factor.
    */
  def scaleBy(transition: TransitionLike[ZoomRefElement, Datum], k: ValueFn[ZoomRefElement, Datum, Double]): Unit = js.native
  /**
    * Return the current scale extent.
    */
  def scaleExtent(): js.Tuple2[Double, Double] = js.native
  /**
    * Set the scale extent to the specified array of numbers [k0, k1] where k0 is the minimum allowed scale factor and k1 is the maximum allowed scale factor,
    * and return this zoom behavior.
    *
    * The scale extent restricts zooming in and out. It is enforced on interaction and when using zoom.scaleBy, zoom.scaleTo and zoom.translateBy;
    * however, it is not enforced when using zoom.transform to set the transform explicitly.
    *
    * The default scale extent is [0, infinity].
    *
    * If the user tries to zoom by wheeling when already at the corresponding limit of the scale extent, the wheel events will be ignored and not initiate a zoom gesture.
    * This allows the user to scroll down past a zoomable area after zooming in, or to scroll up after zooming out.
    * If you would prefer to always prevent scrolling on wheel input regardless of the scale extent, register a wheel event listener to prevent the browser default behavior
    *
    * @param extent A scale extent array of two numbers representing the scale boundaries.
    */
  def scaleExtent(extent: js.Tuple2[Double, Double]): this.type = js.native
  /**
    * Scales the current zoom transform of the selected elements to k, such that the new k(1) = k.
    *
    * k is provided as a constant for all elements.
    *
    * This method is a convenience method for zoom.transform.
    * In contrast to zoom.transform, however, it is subject to the constraints imposed by zoom.extent, zoom.scaleExtent, and zoom.translateExtent.
    *
    * @param selection A D3 selection of elements.
    * @param k New scale.
    */
  def scaleTo(selection: Selection[ZoomRefElement, Datum, _, _], k: Double): Unit = js.native
  /**
    * Scales the current zoom transform of the selected elements to k, such that the new k(1) = k.
    *
    * k is provided by a value function evaluated for each element in the selection.
    *
    * This method is a convenience method for zoom.transform.
    * In contrast to zoom.transform, however, it is subject to the constraints imposed by zoom.extent, zoom.scaleExtent, and zoom.translateExtent.
    *
    * @param selection A D3 selection of elements.
    * @param k A value function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element.The function returns the new scale.
    */
  def scaleTo(selection: Selection[ZoomRefElement, Datum, _, _], k: ValueFn[ZoomRefElement, Datum, Double]): Unit = js.native
  /**
    * Defines a “zoom” tween translating scaling the current transform of the selected elements to k, such that the new k(1) = k.
    *
    * k is provided as a constant for all elements.
    *
    * This method is a convenience method for zoom.transform.
    * In contrast to zoom.transform, however, it is subject to the constraints imposed by zoom.extent, zoom.scaleExtent, and zoom.translateExtent.
    *
    * @param transition A D3 transition on elements.
    * @param k New scale.
    */
  def scaleTo(transition: TransitionLike[ZoomRefElement, Datum], k: Double): Unit = js.native
  /**
    * Defines a “zoom” tween translating scaling the current transform of the selected elements to k, such that the new k(1) = k.
    *
    * k is provided by a value function evaluated for each element in the selection.
    *
    * This method is a convenience method for zoom.transform.
    * In contrast to zoom.transform, however, it is subject to the constraints imposed by zoom.extent, zoom.scaleExtent, and zoom.translateExtent.
    *
    * @param transition A D3 transition on elements.
    * @param k A value function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element.The function returns the new scale.
    */
  def scaleTo(transition: TransitionLike[ZoomRefElement, Datum], k: ValueFn[ZoomRefElement, Datum, Double]): Unit = js.native
  /**
    * Returns the current touch support detector, which defaults to a function returning true,
    * if the "ontouchstart" event is supported on the current element.
    */
  def touchable(): ValueFn[ZoomRefElement, Datum, Boolean] = js.native
  /**
    * Sets the touch support detector to the specified boolean value and returns the zoom behavior.
    *
    * Touch event listeners are only registered if the detector returns truthy for the corresponding element when the zoom behavior is applied.
    * The default detector works well for most browsers that are capable of touch input, but not all; Chrome’s mobile device emulator, for example,
    * fails detection.
    *
    * @param touchable A boolean value. true when touch event listeners should be applied to the corresponding element, otherwise false.
    */
  def touchable(touchable: Boolean): this.type = js.native
  /**
    * Sets the touch support detector to the specified function and returns the zoom behavior.
    *
    * Touch event listeners are only registered if the detector returns truthy for the corresponding element when the zoom behavior is applied.
    * The default detector works well for most browsers that are capable of touch input, but not all; Chrome’s mobile device emulator, for example,
    * fails detection.
    *
    * @param touchable A touch support detector function, which returns true when touch event listeners should be applied to the corresponding element.
    * The function is evaluated for each selected element to which the zoom behavior was applied, in order, being passed the current datum (d),
    * the current index (i), and the current group (nodes), with this as the current DOM element. The function returns a boolean value.
    */
  def touchable(touchable: ValueFn[ZoomRefElement, Datum, Boolean]): this.type = js.native
  /**
    * Sets the current zoom transform of the selected elements to the transform returned by the specified
    * zoom transform factory function evaluated for each element, instantaneously emitting start, zoom and end events.
    *
    * This method requires that you specify the new zoom transform completely,
    * and does not enforce the defined scale extent and translate extent, if any.
    * To derive a new transform from the existing transform, and to enforce the scale and translate extents,
    * see the convenience methods zoom.translateBy, zoom.scaleBy and zoom.scaleTo.
    *
    * This function is typically not invoked directly, and is instead invoked via selection.call.
    *
    * @param selection A D3 selection of elements.
    * @param transform A zoom transform factory function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element. The function returns a zoom transform object.
    */
  def transform(
    selection: Selection[ZoomRefElement, Datum, _, _],
    transform: ValueFn[ZoomRefElement, Datum, ZoomTransform]
  ): Unit = js.native
  /**
    * Sets the current zoom transform of the selected elements to the specified transform,
    * instantaneously emitting start, zoom and end events.
    *
    * This method requires that you specify the new zoom transform completely,
    * and does not enforce the defined scale extent and translate extent, if any.
    * To derive a new transform from the existing transform, and to enforce the scale and translate extents,
    * see the convenience methods zoom.translateBy, zoom.scaleBy and zoom.scaleTo.
    *
    * This function is typically not invoked directly, and is instead invoked via selection.call.
    *
    * @param selection A D3 selection of elements.
    * @param transform A zoom transform object.
    */
  def transform(selection: Selection[ZoomRefElement, Datum, _, _], transform: ZoomTransform): Unit = js.native
  /**
    * Sets the current zoom transform of the transitioning elements to the transform returned by the specified
    * zoom transform factory function evaluated for each element.
    * It defines a “zoom” tween to the specified transform using d3.interpolateZoom,
    * emitting a start event when the transition starts, zoom events for each tick of the transition,
    * and then an end event when the transition ends (or is interrupted).
    *
    * This method requires that you specify the new zoom transform completely,
    * and does not enforce the defined scale extent and translate extent, if any.
    * To derive a new transform from the existing transform, and to enforce the scale and translate extents,
    * see the convenience methods zoom.translateBy, zoom.scaleBy and zoom.scaleTo.
    *
    * This function is typically not invoked directly, and is instead invoked via selection.call.
    *
    * @param transition A D3 transition on elements.
    * @param transform A zoom transform factory function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element. The function returns a zoom transform object.
    */
  def transform(
    transition: TransitionLike[ZoomRefElement, Datum],
    transform: ValueFn[ZoomRefElement, Datum, ZoomTransform]
  ): Unit = js.native
  /**
    * Sets the current zoom transform of the transitioning elements to the specified transform.
    * It defines a “zoom” tween to the specified transform using d3.interpolateZoom,
    * emitting a start event when the transition starts, zoom events for each tick of the transition,
    * and then an end event when the transition ends (or is interrupted).
    *
    * This method requires that you specify the new zoom transform completely,
    * and does not enforce the defined scale extent and translate extent, if any.
    * To derive a new transform from the existing transform, and to enforce the scale and translate extents,
    * see the convenience methods zoom.translateBy, zoom.scaleBy and zoom.scaleTo.
    *
    * This function is typically not invoked directly, and is instead invoked via selection.call.
    *
    * @param transition A D3 transition on elements.
    * @param transform A zoom transform object.
    */
  def transform(transition: TransitionLike[ZoomRefElement, Datum], transform: ZoomTransform): Unit = js.native
  /**
    * Translates the current zoom transform of the selected elements by x and y,
    * such that the new t(x1) = t(x0) + kx and t(y1) = t(y0) + ky.
    *
    * x is provided as a constant for all elements.
    * y is provided as a constant for all elements.
    *
    * @param selection A D3 selection of elements.
    * @param x Amount of translation in x-direction.
    * @param y Amount of translation in y-direction.
    */
  def translateBy(selection: Selection[ZoomRefElement, Datum, _, _], x: Double, y: Double): Unit = js.native
  /**
    * Translates the current zoom transform of the selected elements by x and y,
    * such that the new t(x1) = t(x0) + kx and t(y1) = t(y0) + ky.
    *
    * x is provided as a constant for all elements.
    * y is provided by a value function evaluated for each element in the selection.
    *
    * This method is a convenience method for zoom.transform.
    * In contrast to zoom.transform, however, it is subject to the constraints imposed by zoom.extent, zoom.scaleExtent, and zoom.translateExtent.
    *
    * @param selection A D3 selection of elements.
    * @param x Amount of translation in x-direction.
    * @param y A value function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element.The function returns the amount of translation in y-direction.
    */
  def translateBy(
    selection: Selection[ZoomRefElement, Datum, _, _],
    x: Double,
    y: ValueFn[ZoomRefElement, Datum, Double]
  ): Unit = js.native
  /**
    * Translates the current zoom transform of the selected elements by x and y,
    * such that the new t(x1) = t(x0) + kx and t(y1) = t(y0) + ky.
    *
    * x is provided by a value function evaluated for each element in the selection.
    * y is provided as a constant for all elements.
    *
    * This method is a convenience method for zoom.transform.
    * In contrast to zoom.transform, however, it is subject to the constraints imposed by zoom.extent, zoom.scaleExtent, and zoom.translateExtent.
    *
    * @param selection A D3 selection of elements.
    * @param x A value function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element.The function returns the amount of translation in x-direction.
    * @param y Amount of translation in y-direction.
    */
  def translateBy(
    selection: Selection[ZoomRefElement, Datum, _, _],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: Double
  ): Unit = js.native
  /**
    * Translates the current zoom transform of the selected elements by x and y,
    * such that the new t(x1) = t(x0) + kx and t(y1) = t(y0) + ky.
    *
    * x is provided by a value function evaluated for each element in the selection.
    * y is provided by a value function evaluated for each element in the selection.
    *
    * This method is a convenience method for zoom.transform.
    * In contrast to zoom.transform, however, it is subject to the constraints imposed by zoom.extent, zoom.scaleExtent, and zoom.translateExtent.
    *
    * @param selection A D3 selection of elements.
    * @param x A value function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element.The function returns the amount of translation in x-direction.
    * @param y A value function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element.The function returns the amount of translation in y-direction.
    */
  def translateBy(
    selection: Selection[ZoomRefElement, Datum, _, _],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: ValueFn[ZoomRefElement, Datum, Double]
  ): Unit = js.native
  /**
    * Defines a “zoom” tween translating the current transform for the transitioning elements by x and y,
    * such that the new t(x1) = t(x0) + kx and t(y1) = t(y0) + ky.
    *
    * x is provided as a constant for all elements.
    * y is provided as a constant for all elements.
    *
    * This method is a convenience method for zoom.transform.
    * In contrast to zoom.transform, however, it is subject to the constraints imposed by zoom.extent, zoom.scaleExtent, and zoom.translateExtent.
    *
    * @param transition A D3 transition on elements.
    * @param x Amount of translation in x-direction.
    * @param y Amount of translation in y-direction.
    */
  def translateBy(transition: TransitionLike[ZoomRefElement, Datum], x: Double, y: Double): Unit = js.native
  /**
    * Defines a “zoom” tween translating the current transform for the transitioning elements by x and y,
    * such that the new t(x1) = t(x0) + kx and t(y1) = t(y0) + ky.
    *
    * x is provided as a constant for all elements.
    * y is provided by a value function evaluated for each element in the selection.
    *
    * This method is a convenience method for zoom.transform.
    * In contrast to zoom.transform, however, it is subject to the constraints imposed by zoom.extent, zoom.scaleExtent, and zoom.translateExtent.
    *
    * @param transition A D3 transition on elements.
    * @param x Amount of translation in x-direction.
    * @param y A value function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element.The function returns the amount of translation in y-direction.
    */
  def translateBy(
    transition: TransitionLike[ZoomRefElement, Datum],
    x: Double,
    y: ValueFn[ZoomRefElement, Datum, Double]
  ): Unit = js.native
  /**
    * Defines a “zoom” tween translating the current transform for the transitioning elements by x and y,
    * such that the new t(x1) = t(x0) + kx and t(y1) = t(y0) + ky.
    *
    * x is provided by a value function evaluated for each element in the selection.
    * y is provided as a constant for all elements.
    *
    * This method is a convenience method for zoom.transform.
    * In contrast to zoom.transform, however, it is subject to the constraints imposed by zoom.extent, zoom.scaleExtent, and zoom.translateExtent.
    *
    * @param transition A D3 transition on elements.
    * @param x A value function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element.The function returns the amount of translation in x-direction.
    * @param y Amount of translation in y-direction.
    */
  def translateBy(
    transition: TransitionLike[ZoomRefElement, Datum],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: Double
  ): Unit = js.native
  /**
    * Defines a “zoom” tween translating the current transform for the transitioning elements by x and y,
    * such that the new t(x1) = t(x0) + kx and t(y1) = t(y0) + ky.
    *
    * x is provided by a value function evaluated for each element in the selection.
    * y is provided by a value function evaluated for each element in the selection.
    *
    * This method is a convenience method for zoom.transform.
    * In contrast to zoom.transform, however, it is subject to the constraints imposed by zoom.extent, zoom.scaleExtent, and zoom.translateExtent.
    *
    * @param transition A D3 transition on elements.
    * @param x A value function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element.The function returns the amount of translation in x-direction.
    * @param y A value function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element.The function returns the amount of translation in y-direction.
    */
  def translateBy(
    transition: TransitionLike[ZoomRefElement, Datum],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: ValueFn[ZoomRefElement, Datum, Double]
  ): Unit = js.native
  /**
    * Return the current translate extent.
    */
  def translateExtent(): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
  /**
    * Set the translate extent to the specified array of points [[x0, y0], [x1, y1]], where [x0, y0] is the top-left corner of the world and [x1, y1]
    * is the bottom-right corner of the world, and return this zoom behavior.
    *
    * The translate extent restricts panning, and may cause translation on zoom out. It is enforced on interaction and when using zoom.scaleBy, zoom.scaleTo and zoom.translateBy;
    * however, it is not enforced when using zoom.transform to set the transform explicitly.
    *
    * The default scale extent is [[-infinity, infinity], [-infinity, infinity]].
    *
    * @param extent A translate extent array, i.e. an array of two arrays, each representing a point.
    */
  def translateExtent(extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): this.type = js.native
  /**
    * Translates the current zoom transform of the selected elements such that the specified position ⟨x,y⟩ appears at the center of the viewport extent.
    * The new tx = cx - kx and ty = cy - ky, where ⟨cx,cy⟩ is the center.
    *
    * x is provided as a constant for all elements.
    * y is provided as a constant for all elements.
    *
    * @param selection A D3 selection of elements.
    * @param x Target x-position of translation.
    * @param y Target y-position of translation.
    */
  def translateTo(selection: Selection[ZoomRefElement, Datum, _, _], x: Double, y: Double): Unit = js.native
  /**
    * Translates the current zoom transform of the selected elements such that the specified position ⟨x,y⟩ appears at the center of the viewport extent.
    * The new tx = cx - kx and ty = cy - ky, where ⟨cx,cy⟩ is the center.
    *
    * x is provided as a constant for all elements.
    * y is provided by a value function evaluated for each element in the selection.
    *
    * This method is a convenience method for zoom.transform.
    * In contrast to zoom.transform, however, it is subject to the constraints imposed by zoom.extent, zoom.scaleExtent, and zoom.translateExtent.
    *
    * @param selection A D3 selection of elements.
    * @param x Target x-position of translation.
    * @param y A value function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element.The function returns the target y-position of translation.
    */
  def translateTo(
    selection: Selection[ZoomRefElement, Datum, _, _],
    x: Double,
    y: ValueFn[ZoomRefElement, Datum, Double]
  ): Unit = js.native
  /**
    * Translates the current zoom transform of the selected elements such that the specified position ⟨x,y⟩ appears at the center of the viewport extent.
    * The new tx = cx - kx and ty = cy - ky, where ⟨cx,cy⟩ is the center.
    *
    * x is provided by a value function evaluated for each element in the selection.
    * y is provided as a constant for all elements.
    *
    * This method is a convenience method for zoom.transform.
    * In contrast to zoom.transform, however, it is subject to the constraints imposed by zoom.extent, zoom.scaleExtent, and zoom.translateExtent.
    *
    * @param selection A D3 selection of elements.
    * @param x A value function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element.The function returns the target x-position of translation.
    * @param y Target y-position of translation.
    */
  def translateTo(
    selection: Selection[ZoomRefElement, Datum, _, _],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: Double
  ): Unit = js.native
  /**
    * Translates the current zoom transform of the selected elements such that the specified position ⟨x,y⟩ appears at the center of the viewport extent.
    * The new tx = cx - kx and ty = cy - ky, where ⟨cx,cy⟩ is the center.
    *
    * x is provided by a value function evaluated for each element in the selection.
    * y is provided by a value function evaluated for each element in the selection.
    *
    * This method is a convenience method for zoom.transform.
    * In contrast to zoom.transform, however, it is subject to the constraints imposed by zoom.extent, zoom.scaleExtent, and zoom.translateExtent.
    *
    * @param selection A D3 selection of elements.
    * @param x A value function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element.The function returns the target x-position of translation.
    * @param y A value function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element.The function returns the target y-position of translation.
    */
  def translateTo(
    selection: Selection[ZoomRefElement, Datum, _, _],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: ValueFn[ZoomRefElement, Datum, Double]
  ): Unit = js.native
  /**
    * Defines a “zoom” tween translating the current transform for the transitioning elements such that the specified position ⟨x,y⟩ appears at the center of the viewport extent.
    * The new tx = cx - kx and ty = cy - ky, where ⟨cx,cy⟩ is the center.
    *
    * x is provided as a constant for all elements.
    * y is provided as a constant for all elements.
    *
    * This method is a convenience method for zoom.transform.
    * In contrast to zoom.transform, however, it is subject to the constraints imposed by zoom.extent, zoom.scaleExtent, and zoom.translateExtent.
    *
    * @param transition A D3 transition on elements.
    * @param x Target x-position of translation.
    * @param y Target y-position of translation.
    */
  def translateTo(transition: TransitionLike[ZoomRefElement, Datum], x: Double, y: Double): Unit = js.native
  /**
    * Defines a “zoom” tween translating the current transform for the transitioning elements such that the specified position ⟨x,y⟩ appears at the center of the viewport extent.
    * The new tx = cx - kx and ty = cy - ky, where ⟨cx,cy⟩ is the center.
    *
    * x is provided as a constant for all elements.
    * y is provided by a value function evaluated for each element in the selection.
    *
    * This method is a convenience method for zoom.transform.
    * In contrast to zoom.transform, however, it is subject to the constraints imposed by zoom.extent, zoom.scaleExtent, and zoom.translateExtent.
    *
    * @param transition A D3 transition on elements.
    * @param x Target x-position of translation.
    * @param y A value function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element.The function returns the target y-position of translation.
    */
  def translateTo(
    transition: TransitionLike[ZoomRefElement, Datum],
    x: Double,
    y: ValueFn[ZoomRefElement, Datum, Double]
  ): Unit = js.native
  /**
    * Defines a “zoom” tween translating the current transform for the transitioning elements such that the specified position ⟨x,y⟩ appears at the center of the viewport extent.
    * The new tx = cx - kx and ty = cy - ky, where ⟨cx,cy⟩ is the center.
    *
    * x is provided by a value function evaluated for each element in the selection.
    * y is provided as a constant for all elements.
    *
    * This method is a convenience method for zoom.transform.
    * In contrast to zoom.transform, however, it is subject to the constraints imposed by zoom.extent, zoom.scaleExtent, and zoom.translateExtent.
    *
    * @param transition A D3 transition on elements.
    * @param x A value function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element.The function returns the target x-position of translation.
    * @param y Target y-position of translation.
    */
  def translateTo(
    transition: TransitionLike[ZoomRefElement, Datum],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: Double
  ): Unit = js.native
  /**
    * Defines a “zoom” tween translating the current transform for the transitioning elements such that the specified position ⟨x,y⟩ appears at the center of the viewport extent.
    * The new tx = cx - kx and ty = cy - ky, where ⟨cx,cy⟩ is the center.
    *
    * x is provided by a value function evaluated for each element in the selection.
    * y is provided by a value function evaluated for each element in the selection.
    *
    * This method is a convenience method for zoom.transform.
    * In contrast to zoom.transform, however, it is subject to the constraints imposed by zoom.extent, zoom.scaleExtent, and zoom.translateExtent.
    *
    * @param transition A D3 transition on elements.
    * @param x A value function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element.The function returns the target x-position of translation.
    * @param y A value function which is evaluated for each selected element,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element.The function returns the target y-position of translation.
    */
  def translateTo(
    transition: TransitionLike[ZoomRefElement, Datum],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: ValueFn[ZoomRefElement, Datum, Double]
  ): Unit = js.native
  /**
    * Returns the current wheelDelta function.
    */
  def wheelDelta(): ValueFn[ZoomRefElement, Datum, Double] = js.native
  /**
    * Sets the wheel delta function to the specified function and returns the zoom behavior. The wheel delta function which is invoked in the wheel event handler
    * of each element to which the zoom behavior was applied.
    * The value Δ returned by the wheel delta function determines the amount of scaling applied in response to a WheelEvent.
    * The scale factor transform.k is multiplied by 2Δ; for example, a Δ of +1 doubles the scale factor, Δ of -1 halves the scale factor.
    *
    * @param delta Wheel delta function which is invoked in the wheel event handler of each element to which the zoom behavior was applied,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element. The function returns a numeric value.
    */
  def wheelDelta(delta: ValueFn[ZoomRefElement, Datum, Double]): this.type = js.native
}

