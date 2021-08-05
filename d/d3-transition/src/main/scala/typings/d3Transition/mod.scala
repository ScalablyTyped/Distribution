package typings.d3Transition

import typings.d3Selection.mod.ArrayLike
import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.EnterElement
import typings.d3Selection.mod.Selection_
import typings.d3Selection.mod.ValueFn
import typings.d3Transition.d3TransitionStrings.important
import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-transition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def active[Datum, PElement /* <: BaseType */, PDatum](): (Transition_[Null, Datum, PElement, PDatum]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("active")().asInstanceOf[(Transition_[Null, Datum, PElement, PDatum]) | Null]
  inline def active[Datum, PElement /* <: BaseType */, PDatum](node: Null, name: String): (Transition_[Null, Datum, PElement, PDatum]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("active")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[(Transition_[Null, Datum, PElement, PDatum]) | Null]
  inline def active[Datum, PElement /* <: BaseType */, PDatum](node: EnterElement): (Transition_[EnterElement, Datum, PElement, PDatum]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("active")(node.asInstanceOf[js.Any]).asInstanceOf[(Transition_[EnterElement, Datum, PElement, PDatum]) | Null]
  inline def active[Datum, PElement /* <: BaseType */, PDatum](node: EnterElement, name: String): (Transition_[EnterElement, Datum, PElement, PDatum]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("active")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[(Transition_[EnterElement, Datum, PElement, PDatum]) | Null]
  inline def active[Datum, PElement /* <: BaseType */, PDatum](node: Document): (Transition_[Document, Datum, PElement, PDatum]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("active")(node.asInstanceOf[js.Any]).asInstanceOf[(Transition_[Document, Datum, PElement, PDatum]) | Null]
  inline def active[Datum, PElement /* <: BaseType */, PDatum](node: Document, name: String): (Transition_[Document, Datum, PElement, PDatum]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("active")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[(Transition_[Document, Datum, PElement, PDatum]) | Null]
  inline def active[Datum, PElement /* <: BaseType */, PDatum](node: Element): (Transition_[Element, Datum, PElement, PDatum]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("active")(node.asInstanceOf[js.Any]).asInstanceOf[(Transition_[Element, Datum, PElement, PDatum]) | Null]
  inline def active[Datum, PElement /* <: BaseType */, PDatum](node: Element, name: String): (Transition_[Element, Datum, PElement, PDatum]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("active")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[(Transition_[Element, Datum, PElement, PDatum]) | Null]
  inline def active[Datum, PElement /* <: BaseType */, PDatum](node: Window): (Transition_[Window, Datum, PElement, PDatum]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("active")(node.asInstanceOf[js.Any]).asInstanceOf[(Transition_[Window, Datum, PElement, PDatum]) | Null]
  inline def active[Datum, PElement /* <: BaseType */, PDatum](node: Window, name: String): (Transition_[Window, Datum, PElement, PDatum]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("active")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[(Transition_[Window, Datum, PElement, PDatum]) | Null]
  
  inline def interrupt(node: BaseType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("interrupt")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def interrupt(node: BaseType, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("interrupt")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def transition[OldDatum](): Transition_[HTMLElement, OldDatum, Null, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("transition")().asInstanceOf[Transition_[HTMLElement, OldDatum, Null, Unit]]
  inline def transition[OldDatum](name: String): Transition_[HTMLElement, OldDatum, Null, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("transition")(name.asInstanceOf[js.Any]).asInstanceOf[Transition_[HTMLElement, OldDatum, Null, Unit]]
  inline def transition[OldDatum](transition: Transition_[BaseType, js.Any, BaseType, js.Any]): Transition_[HTMLElement, OldDatum, Null, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("transition")(transition.asInstanceOf[js.Any]).asInstanceOf[Transition_[HTMLElement, OldDatum, Null, Unit]]
  
  type SelectionOrTransition[GElement /* <: BaseType */, Datum, PElement /* <: BaseType */, PDatum] = (Selection_[GElement, Datum, PElement, PDatum]) | (Transition_[GElement, Datum, PElement, PDatum])
  
  @js.native
  trait Transition_[GElement /* <: BaseType */, Datum, PElement /* <: BaseType */, PDatum] extends StObject {
    
    /**
      * For each selected element, assigns the attribute tween for the attribute with the specified name to the specified target value.
      * The starting value of the tween is the attribute’s value when the transition starts.
      * The target value is the specified constant value for all elements.
      *
      * An interpolator is chosen based on the type of the target value, using the following algorithm:
      * 1.) If value is a number, use interpolateNumber.
      * 2.) If value is a color or a string coercible to a color, use interpolateRgb.
      * 3.) Use interpolateString.
      *
      * To apply a different interpolator, use transition.attrTween.
      *
      * @param name Name of the attribute.
      * @param value Target value for the attribute.
      */
    def attr(name: String, value: String): this.type = js.native
    def attr(name: String, value: Boolean): this.type = js.native
    def attr(name: String, value: Double): this.type = js.native
    // Modifying -------------------------------
    /**
      * For each selected element, the attribute with the specified name will be cleared at the start of the transition.
      *
      * @param name Name of the attribute.
      * @param value Use null to clear the attribute.
      */
    def attr(name: String, value: Null): this.type = js.native
    /**
      * For each selected element, assigns the attribute tween for the attribute with the specified name to the specified target value.
      * The starting value of the tween is the attribute’s value when the transition starts.
      * The target value is return value of the value function evaluated for the selected element.
      *
      * An interpolator is chosen based on the type of the target value, using the following algorithm:
      * 1.) If value is a number, use interpolateNumber.
      * 2.) If value is a color or a string coercible to a color, use interpolateRgb.
      * 3.) Use interpolateString.
      *
      * To apply a different interpolator, use transition.attrTween.
      *
      * @param name Name of the attribute.
      * @param value A value function which is evaluated for each selected element, in order, being passed the current datum (d),
      * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]).
      * A null value will clear the attribute at the start of the transition.
      */
    def attr(name: String, value: ValueFn[GElement, Datum, String | Double | Boolean | Null]): this.type = js.native
    
    /**
      * Return the current interpolator factory for attribute with the specified name, or undefined if no such tween exists.
      *
      * @param name Name of attribute.
      */
    def attrTween(name: String): js.UndefOr[
        ValueFn[GElement, Datum, js.ThisFunction1[/* this */ GElement, /* t */ Double, String]]
      ] = js.native
    /**
      * Remove the previously-assigned attribute tween of the specified name, if any.
      *
      * @param name Name of attribute.
      * @param factory Use null to remove previously-assigned attribute tween.
      */
    def attrTween(name: String, factory: Null): this.type = js.native
    /**
      * Assign the attribute tween for the attribute with the specified name to the specified interpolator factory.
      * An interpolator factory is a function that returns an interpolator; when the transition starts, the factory is evaluated for each selected element.
      * The returned interpolator will then be invoked for each frame of the transition, in order,
      * being passed the eased time t, typically in the range [0, 1]. Lastly, the return value of the interpolator will be used to set the attribute value.
      * The interpolator must return a string.
      *
      * @param name Name of attribute.
      * @param factory An interpolator factory which is evaluated for each selected element, in order, being passed the current datum (d),
      * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]). The interpolator factory returns a string interpolator,
      * which takes as its argument eased time t, typically in the range [0, 1] and returns the interpolated string.
      */
    def attrTween(
      name: String,
      factory: ValueFn[GElement, Datum, js.ThisFunction1[/* this */ GElement, /* t */ Double, String]]
    ): this.type = js.native
    
    /**
      * Invoke the specified function exactly once, passing in this transition along with any optional arguments.
      * Returns this transition.
      *
      * @param func A function which is passed this transition as the first argument along with any optional arguments.
      * @param args List of optional arguments to be passed to the callback function.
      */
    def call(
      func: js.Function2[
          /* transition */ Transition_[GElement, Datum, PElement, PDatum], 
          /* repeated */ js.Any, 
          js.Any
        ],
      args: js.Any*
    ): this.type = js.native
    
    // Transition Configuration ----------------------
    /**
      * Returns the current value of the delay for the first (non-null) element in the transition.
      * This is generally useful only if you know that the transition contains exactly one element.
      */
    def delay(): Double = js.native
    /**
      * For each selected element, sets the transition delay to the specified value in milliseconds.
      * If a delay is not specified, it defaults to zero.
      *
      * @param milliseconds Number of milliseconds for the delay.
      */
    def delay(milliseconds: Double): this.type = js.native
    /**
      * For each selected element, sets the transition delay to the value in milliseconds returned by the
      * value function.
      *
      * @param milliseconds A value function which is evaluated for each selected element, being passed the current datum (d),
      * the current index (i), and the current group (nodes), with this of the current DOM element (nodes[i]). The return value is a number
      * specifying the delay in milliseconds.
      */
    def delay(milliseconds: ValueFn[GElement, Datum, Double]): this.type = js.native
    
    /**
      * Returns the current value of the duration for the first (non-null) element in the transition.
      * This is generally useful only if you know that the transition contains exactly one element.
      */
    def duration(): Double = js.native
    /**
      * For each selected element, sets the transition duration to the specified value in milliseconds.
      * If a duration is not specified, it defaults to 250ms.
      *
      * @param duration Number of milliseconds for the duration.
      */
    def duration(milliseconds: Double): this.type = js.native
    /**
      * For each selected element, sets the transition duration to the value in milliseconds returned by the
      * value function.
      *
      * @param milliseconds A value function which is evaluated for each selected element, being passed the current datum (d),
      * the current index (i), and the current group (nodes), with this of the current DOM element (nodes[i]). The return value is a number
      * specifying the duration in milliseconds.
      */
    def duration(milliseconds: ValueFn[GElement, Datum, Double]): this.type = js.native
    
    // Control Flow ----------------------
    /**
      * Invoke the specified function for each selected element, passing the current datum (d),
      * the current index (i), and the current group (nodes), with this of the current DOM element (nodes[i]).
      * This method can be used to invoke arbitrary code for each selected element, and is useful for creating a context to access parent and child data simultaneously.
      *
      * @param func A function which is invoked for each selected element,
      *             being passed the current datum (d), the current index (i), and the current group (nodes), with this of the current DOM element (nodes[i]).
      */
    def each(func: ValueFn[GElement, Datum, Unit]): this.type = js.native
    
    /**
      * Returns the current easing function for the first (non-null) element in the transition.
      * This is generally useful only if you know that the transition contains exactly one element.
      */
    def ease(): js.Function1[/* normalizedTime */ Double, Double] = js.native
    /**
      * Specifies the transition easing function for all selected elements. The value must be specified as a function.
      * The easing function is invoked for each frame of the animation, being passed the normalized time t in the range [0, 1];
      * it must then return the eased time tʹ which is typically also in the range [0, 1].
      * A good easing function should return 0 if t = 0 and 1 if t = 1. If an easing function is not specified,
      * it defaults to d3.easeCubic.
      *
      * @param easingFn An easing function which is passed the normalized time t in the range [0, 1];
      * it must then return the eased time tʹ which is typically also in the range [0, 1].
      * A good easing function should return 0 if t = 0 and 1 if t = 1.
      */
    def ease(easingFn: js.Function1[/* normalizedTime */ Double, Double]): this.type = js.native
    
    /**
      * Specifies a factory for the transition easing function.
      *
      * @param factory The factory must be a function.
      * It is invoked for each node of the selection, being passed the current datum (d), the current index (i), and the current group (nodes), with this as the current DOM element.
      * It must return an easing function.
      */
    def easeVarying(factory: ValueFn[GElement, Datum, js.Function1[/* normalizedTime */ Double, Double]]): this.type = js.native
    
    /**
      * Return true if this transition contains no (non-null) elements.
      */
    def empty(): Boolean = js.native
    
    /**
      * Returns a promise that resolves when every selected element finishes transitioning. If any element’s transition is cancelled or interrupted, the promise rejects.
      */
    def end(): js.Promise[Unit] = js.native
    
    /**
      * For each selected element, selects only the elements that match the specified filter, and returns a transition on the resulting selection.
      *
      * The new transition has the same id, name and timing as this transition; however, if a transition with the same id already exists on a selected element,
      * the existing transition is returned for that element.
      *
      * @param filter A CSS selector string.
      */
    def filter(filter: String): Transition_[GElement, Datum, PElement, PDatum] = js.native
    /**
      * For each selected element, selects only the elements that match the specified filter, and returns a transition on the resulting selection.
      *
      * The new transition has the same id, name and timing as this transition; however, if a transition with the same id already exists on a selected element,
      * the existing transition is returned for that element.
      *
      * @param filter A filter function which is evaluated for each selected element, in order, being passed the current datum (d),
      * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]). The filter function returns a boolean indicating,
      * whether the selected element matches.
      */
    def filter(filter: ValueFn[GElement, Datum, Boolean]): Transition_[GElement, Datum, PElement, PDatum] = js.native
    /**
      * For each selected element, selects only the elements that match the specified filter, and returns a transition on the resulting selection.
      *
      * The new transition has the same id, name and timing as this transition; however, if a transition with the same id already exists on a selected element,
      * the existing transition is returned for that element.
      *
      * The generic refers to the type of element which will be selected after applying the filter, i.e. if the element types
      * contained in a pre-filter selection are narrowed to a subset as part of the filtering.
      *
      * @param filter A CSS selector string.
      */
    @JSName("filter")
    def filter_FilteredElement_BaseType[FilteredElement /* <: BaseType */](filter: String): Transition_[FilteredElement, Datum, PElement, PDatum] = js.native
    /**
      * For each selected element, selects only the elements that match the specified filter, and returns a transition on the resulting selection.
      *
      * The new transition has the same id, name and timing as this transition; however, if a transition with the same id already exists on a selected element,
      * the existing transition is returned for that element.
      *
      * The generic refers to the type of element which will be selected after applying the filter, i.e. if the element types
      * contained in a pre-filter selection are narrowed to a subset as part of the filtering.
      *
      * @param filter A filter function which is evaluated for each selected element, in order, being passed the current datum (d),
      * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]). The filter function returns a boolean indicating,
      * whether the selected element matches.
      */
    @JSName("filter")
    def filter_FilteredElement_BaseType[FilteredElement /* <: BaseType */](filter: ValueFn[GElement, Datum, Boolean]): Transition_[FilteredElement, Datum, PElement, PDatum] = js.native
    
    /**
      * Returns a new transition merging this transition with the specified other transition,
      * which must have the same id as this transition. The returned transition has the same number of groups,
      * the same parents, the same name and the same id as this transition.
      * Any missing (null) elements in this transition are filled with the corresponding element, if present (not null), from the other transition.
      *
      * @param other The transition to be merged.
      */
    def merge(other: Transition_[GElement, Datum, PElement, PDatum]): Transition_[GElement, Datum, PElement, PDatum] = js.native
    
    /**
      * Return the first (non-null) element in this transition. If the transition is empty, returns null.
      */
    def node(): GElement | Null = js.native
    
    /**
      * Return an array of all (non-null) elements in this transition.
      */
    def nodes(): js.Array[GElement] = js.native
    
    // Event Handling -------------------
    /**
      * Return the currently-assigned listener for the specified event typename on the first (non-null) selected element, if any.
      * If multiple typenames are specified, the first matching listener is returned.
      *
      * @param typenames The typenames is one of the following string event types: start (when the transition starts), end (when the transition ends),
      * interrupt (when the transition is interrupted), cancel(when the transition is cancelled).
      * Note that these are not native DOM events. The type may be optionally followed by a period (.) and a name;
      * the optional name allows multiple callbacks to be registered to receive events of the same type, such as "start.foo"" and "start.bar".
      * To specify multiple typenames, separate typenames with spaces, such as "interrupt end"" or "start.foo start.bar".
      */
    def on(typenames: String): js.UndefOr[ValueFn[GElement, Datum, Unit]] = js.native
    /**
      * Remove all listeners for a given name.
      *
      * @param typenames Name of the event type for which the listener should be removed. To remove all listeners for a given name use ".foo"
      * as the typename, where foo is the name; to remove all listeners with no name, specify "." as the typename.
      * @param listener Use null to remove listeners.
      */
    def on(typenames: String, listener: Null): this.type = js.native
    /**
      * Add a listener to each selected element for the specified event typenames.
      *
      * When a specified transition event is dispatched on a selected node, the specified listener will be invoked for each transitioning element.
      * Listeners always see the latest datum for their element, but the index is a property of the selection and is fixed when the listener is assigned;
      * to update the index, re-assign the listener.
      *
      * @param typenames The typenames is one of the following string event types: start (when the transition starts), end (when the transition ends),
      * interrupt (when the transition is interrupted), cancel(when the transition is cancelled).
      * Note that these are not native DOM events. The type may be optionally followed by a period (.) and a name;
      * the optional name allows multiple callbacks to be registered to receive events of the same type, such as "start.foo"" and "start.bar".
      * To specify multiple typenames, separate typenames with spaces, such as "interrupt end"" or "start.foo start.bar".
      * @param listener A listener function which will be evaluated for each selected element, being passed the current datum (d), the current index (i),
      * and the current group (nodes), with this as the current DOM element (nodes[i]). Listeners always see the latest datum for their element,
      * but the index is a property of the selection and is fixed when the listener is assigned; to update the index, re-assign the listener.
      */
    def on(typenames: String, listener: ValueFn[GElement, Datum, Unit]): this.type = js.native
    
    /**
      * For each selected element, removes the element when the transition ends, as long as the element has no other active or pending transitions.
      * If the element has other active or pending transitions, does nothing.
      */
    def remove(): this.type = js.native
    
    // Sub-selection -------------------------
    /**
      * For each selected element, select the first descendant element that matches the specified selector string, if any,
      * and returns a transition on the resulting selection. The new transition has the same id, name and timing as this transition;
      * however, if a transition with the same id already exists on a selected element,
      * the existing transition is returned for that element.
      *
      * The generic represents the type of the descendant element to be selected.
      *
      * @param selector CSS selector string
      */
    def select[DescElement /* <: BaseType */](selector: String): Transition_[DescElement, Datum, PElement, PDatum] = js.native
    /**
      * For each selected element, select the descendant element returned by the selector function, if any,
      * and returns a transition on the resulting selection. The new transition has the same id, name and timing as this transition;
      * however, if a transition with the same id already exists on a selected element,
      * the existing transition is returned for that element.
      *
      * The generic represents the type of the descendant element to be selected.
      *
      * @param selector A selector function, which is evaluated for each selected element, in order, being passed the current datum (d),
      * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]).
      * It must return an element, or null if there is no matching element.
      */
    def select[DescElement /* <: BaseType */](selector: ValueFn[GElement, Datum, DescElement]): Transition_[DescElement, Datum, PElement, PDatum] = js.native
    
    /**
      * For each selected element, select all descendant elements that match the specified selector string, if any,
      * and returns a transition on the resulting selection. The new transition has the same id, name and timing as this transition;
      * however, if a transition with the same id already exists on a selected element, the existing transition is returned for that element.
      *
      * The first generic "DescElement" refers to the type of descendant element to be selected. The second generic "OldDatum" refers to the type of the
      * datum, of a selected element. This is useful when re-selecting elements with a previously set, know datum type.
      *
      * @param selector CSS selector string
      */
    def selectAll[DescElement /* <: BaseType */, OldDatum](selector: String): Transition_[DescElement, OldDatum, GElement, Datum] = js.native
    /**
      * For each selected element, select all descendant elements returned by the selector function, if any,
      * and returns a transition on the resulting selection. The new transition has the same id, name and timing as this transition;
      * however, if a transition with the same id already exists on a selected element, the existing transition is returned for that element.
      *
      * The first generic "DescElement" refers to the type of descendant element to be selected. The second generic "OldDatum" refers to the type of the
      * datum, of a selected element. This is useful when re-selecting elements with a previously set, know datum type.
      *
      * @param selector A selector function which is evaluated for each selected element, in order, being passed the current datum (d),
      * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]). It must return an array of elements
      * (or a pseudo-array, such as a NodeList), or the empty array if there are no matching elements.
      */
    def selectAll[DescElement /* <: BaseType */, OldDatum](selector: ValueFn[GElement, Datum, js.Array[DescElement] | ArrayLike[DescElement]]): Transition_[DescElement, OldDatum, GElement, Datum] = js.native
    
    /**
      * Return the selection corresponding to this transition.
      */
    def selection(): Selection_[GElement, Datum, PElement, PDatum] = js.native
    
    /**
      * Returns the total number of elements in this transition.
      */
    def size(): Double = js.native
    
    /**
      * For each selected element, assigns the style tween for the style with the specified name to the specified target value with the
      * specified priority.
      * The starting value of the tween is the style’s inline value if present, and otherwise its computed value.
      * The target value is the specified constant value for all elements.
      *
      * An interpolator is chosen based on the type of the target value, using the following algorithm:
      * 1.) If value is a number, use interpolateNumber.
      * 2.) If value is a color or a string coercible to a color, use interpolateRgb.
      * 3.) Use interpolateString.
      *
      * To apply a different interpolator, use transition.attrTween.
      *
      * @param name Name of the style.
      * @param value Target value for the style.
      * @param priority An optional priority flag, either null or the string important (without the exclamation point)
      */
    def style(name: String, value: String): this.type = js.native
    def style(name: String, value: Boolean): this.type = js.native
    def style(name: String, value: Double): this.type = js.native
    /**
      * For each selected element, the style with the specified name will be cleared at the start of the transition.
      *
      * @param name Name of the style.
      * @param value Use null to clear the style.
      */
    def style(name: String, value: Null): this.type = js.native
    /**
      * For each selected element, assigns the style tween for the style with the specified name to the specified target value with the
      * specified priority.
      * The starting value of the tween is the style's inline value if present, and otherwise its computed value.
      * The target value is return value of the value function evaluated for the selected element.
      *
      * An interpolator is chosen based on the type of the target value, using the following algorithm:
      * 1.) If value is a number, use interpolateNumber.
      * 2.) If value is a color or a string coercible to a color, use interpolateRgb.
      * 3.) Use interpolateString.
      *
      * To apply a different interpolator, use transition.attrTween.
      *
      * @param name Name of the style.
      * @param value A value function which is evaluated for each selected element, in order, being passed the current datum (d),
      * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]).
      * A null value will clear the style at the start of the transition.
      * @param priority An optional priority flag, either null or the string important (without the exclamation point)
      */
    def style(name: String, value: ValueFn[GElement, Datum, String | Double | Boolean | Null]): this.type = js.native
    
    /**
      * Return the current interpolator factory for style with the specified name, or undefined if no such tween exists.
      *
      * @param name Name of style.
      */
    def styleTween(name: String): js.UndefOr[
        ValueFn[GElement, Datum, js.ThisFunction1[/* this */ GElement, /* t */ Double, String]]
      ] = js.native
    /**
      * Remove the previously-assigned style tween of the specified name, if any.
      *
      * @param name Name of style.
      * @param factory Use null to remove previously-assigned style tween.
      */
    def styleTween(name: String, factory: Null): this.type = js.native
    /**
      * Assign the style tween for the style with the specified name to the specified interpolator factory.
      * An interpolator factory is a function that returns an interpolator; when the transition starts, the factory is evaluated for each selected element.
      * The returned interpolator will then be invoked for each frame of the transition, in order,
      * being passed the eased time t, typically in the range [0, 1]. Lastly, the return value of the interpolator will be used to set the style value.
      * The interpolator must return a string.
      *
      * @param name Name of style.
      * @param factory An interpolator factory which is evaluated for each selected element, in order, being passed the current datum (d),
      * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]). The interpolator factory returns a string interpolator,
      * which takes as its argument eased time t, typically in the range [0, 1] and returns the interpolated string.
      * @param priority An optional priority flag, either null or the string important (without the exclamation point)
      */
    def styleTween(
      name: String,
      factory: ValueFn[GElement, Datum, js.ThisFunction1[/* this */ GElement, /* t */ Double, String]]
    ): this.type = js.native
    @JSName("styleTween")
    def styleTween_important(
      name: String,
      factory: ValueFn[GElement, Datum, js.ThisFunction1[/* this */ GElement, /* t */ Double, String]],
      priority: important
    ): this.type = js.native
    
    @JSName("style")
    def style_important(name: String, value: String, priority: important): this.type = js.native
    @JSName("style")
    def style_important(name: String, value: Boolean, priority: important): this.type = js.native
    @JSName("style")
    def style_important(name: String, value: Double, priority: important): this.type = js.native
    @JSName("style")
    def style_important(
      name: String,
      value: ValueFn[GElement, Datum, String | Double | Boolean | Null],
      priority: important
    ): this.type = js.native
    
    /**
      * For each selected element, sets the text content to the specified target value when the transition starts.
      *
      * To interpolate text rather than to set it on start, use transition.textTween (for example) or append a replacement element and cross-fade opacity (for example).
      * Text is not interpolated by default because it is usually undesirable.
      *
      * @param value Value used for text content
      */
    def text(value: String): this.type = js.native
    def text(value: Boolean): this.type = js.native
    def text(value: Double): this.type = js.native
    /**
      * For each selected element, the text content will be cleared, replacing any existing child elements.
      *
      * @param value Use null to clear the text content.
      */
    def text(value: Null): this.type = js.native
    /**
      * For each selected element, sets the text content returned by the value function for each selected element when the transition starts.
      *
      * To interpolate text rather than to set it on start, use transition.textTween (for example) or append a replacement element and cross-fade opacity (for example).
      * Text is not interpolated by default because it is usually undesirable.
      *
      * @param value A value function which is evaluated for each selected element, in order, being passed the current datum (d),
      * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]).
      * A null value will clear the text content at the start of the transition.
      */
    def text(value: ValueFn[GElement, Datum, String | Double | Boolean]): this.type = js.native
    
    /**
      * Returns the current interpolator factory for text, or undefined if no such tween exists.
      */
    def textTween(): js.UndefOr[
        ValueFn[GElement, Datum, js.ThisFunction1[/* this */ GElement, /* t */ Double, String]]
      ] = js.native
    /**
      * Removes the previously-assigned text tween, if any
      *
      * @param factory Use null to remove previously-assigned text tween.
      */
    def textTween(factory: Null): this.type = js.native
    /**
      * Assigns the text tween to the specified interpolator factory.
      * An interpolator factory is a function that returns an interpolator; when the transition starts, the factory is evaluated for each selected element,
      * in order, being passed the current datum d and index i, with the this context as the current DOM element.
      * The returned interpolator will then be invoked for each frame of the transition, in order, being passed the eased time t, typically in the range [0, 1].
      * Lastly, the return value of the interpolator will be used to set the text.
      * The interpolator must return a string.
      *
      * @param factory An interpolator factory is a function that returns an interpolator; when the transition starts, the factory is evaluated for each selected element,
      * in order, being passed the current datum d and index i, with the this context as the current DOM element.
      * The returned interpolator will then be invoked for each frame of the transition, in order, being passed the eased time t, typically in the range [0, 1].
      * Lastly, the return value of the interpolator will be used to set the text.
      * The interpolator must return a string.
      */
    def textTween(factory: ValueFn[GElement, Datum, js.ThisFunction1[/* this */ GElement, /* t */ Double, String]]): this.type = js.native
    
    /**
      * Returns a new transition on the same selected elements as this transition, scheduled to start when this transition ends.
      * The new transition inherits a reference time equal to this transition’s time plus its delay and duration.
      * The new transition also inherits this transition’s name, duration, and easing.
      * This method can be used to schedule a sequence of chained transitions.
      *
      * A delay configured for the new transition will be relative to the previous transition.
      */
    def transition(): Transition_[GElement, Datum, PElement, PDatum] = js.native
    
    /**
      * Returns the tween with the specified name, or undefined, if no tween was previously assigned to
      * that name.
      *
      * @param name Name of tween.
      */
    def tween(name: String): js.UndefOr[
        ValueFn[GElement, Datum, js.ThisFunction1[/* this */ GElement, /* t */ Double, Unit]]
      ] = js.native
    /**
      * Removes the tween with the specified name, if a tween was previously assigned to
      * that name.
      *
      * @param name Name of tween.
      * @param tweenFn Use null to remove a previously-assigned tween.
      */
    def tween(name: String, tweenFn: Null): this.type = js.native
    /**
      * For each selected element, assigns the tween with the specified name with the specified value function.
      * The value must be specified as a function that returns a function.
      * When the transition starts, the value function is evaluated for each selected element.
      * The returned function is then invoked for each frame of the transition, in order,
      * being passed the eased time t, typically in the range [0, 1].
      *
      * @param name Name of tween.
      * @param tweenFn A tween function which is evaluated for each selected element, in order, being passed the current datum (d),
      * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]). The tween function returns a function
      * which takes as its argument eased time t, typically in the range [0, 1] and performs the tweening activities for each transition frame.
      */
    def tween(
      name: String,
      tweenFn: ValueFn[GElement, Datum, js.ThisFunction1[/* this */ GElement, /* t */ Double, Unit]]
    ): this.type = js.native
  }
  
  /**
    * Extend interface 'Selection' by declaration merging with 'd3-selection'
    */
  /* augmented module */
  object d3SelectionAugmentingMod {
    
    /**
      * A D3 Selection of elements.
      *
      * The first generic "GElement" refers to the type of the selected element(s).
      * The second generic "Datum" refers to the type of the datum of a selected element(s).
      * The third generic "PElement" refers to the type of the parent element(s) in the D3 selection.
      * The fourth generic "PDatum" refers to the type of the datum of the parent element(s).
      */
    @js.native
    trait Selection[GElement /* <: BaseType */, Datum, PElement /* <: BaseType */, PDatum] extends StObject {
      
      /**
        * Interrupts the active transition of the specified name on the selected elements, and cancels any pending transitions with the specified name, if any.
        * If a name is not specified, null is used.
        *
        * IMPORTANT: Interrupting a transition on an element has no effect on any transitions on any descendant elements.
        * For example, an axis transition consists of multiple independent, synchronized transitions on the descendants of the axis G element
        * (the tick lines, the tick labels, the domain path, etc.). To interrupt the axis transition, you must therefore interrupt the descendants.
        *
        * @param name Name of the transition.
        */
      def interrupt(): this.type = js.native
      def interrupt(name: String): this.type = js.native
      
      /**
        * Returns a new transition on the given selection with the specified name. If a name is not specified, null is used.
        * The new transition is only exclusive with other transitions of the same name.
        *
        * @param name Name of the transition.
        */
      def transition(): Transition_[GElement, Datum, PElement, PDatum] = js.native
      def transition(name: String): Transition_[GElement, Datum, PElement, PDatum] = js.native
      /**
        * Returns a new transition on the given selection.
        *
        * When using a transition instance, the returned transition has the same id and name as the specified transition.
        * If a transition with the same id already exists on a selected element, the existing transition is returned for that element.
        * Otherwise, the timing of the returned transition is inherited from the existing transition of the same id on the nearest ancestor of each selected element.
        * Thus, this method can be used to synchronize a transition across multiple selections,
        * or to re-select a transition for specific elements and modify its configuration.
        *
        * If the specified transition is not found on a selected node or its ancestors (such as if the transition already ended),
        * the default timing parameters are used; however, in a future release, this will likely be changed to throw an error.
        *
        * @param transition A transition instance.
        */
      def transition(transition: Transition_[BaseType, js.Any, js.Any, js.Any]): Transition_[GElement, Datum, PElement, PDatum] = js.native
    }
  }
}
