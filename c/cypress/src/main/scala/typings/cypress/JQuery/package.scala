package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQuery {
  /**
    * @deprecated ​ Deprecated since 1.8. Use \`{@link Tween.propHooks jQuery.Tween.propHooks}\`.
    *
    * `jQuery.fx.step` functions are being replaced by `jQuery.Tween.propHooks` and may eventually be removed, but are still supported via the default tween propHook.
    */
  type AnimationHook[TElement] = js.Function1[/* fx */ typings.cypress.JQuery.Tween[TElement], scala.Unit]
  // #endregion
  // region CSS hooks
  // #region CSS hooks
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  type CSSHook[TElement] = typings.std.Partial[typings.cypress.JQuery._CSSHook[TElement]] with (typings.std.Pick[
    typings.cypress.JQuery._CSSHook[TElement], 
    typings.cypress.cypressStrings.get_ | typings.cypress.cypressStrings.set
  ])
  type CSSHooks = // Set to HTMLElement to minimize breaks but should probably be Element.
  org.scalablytyped.runtime.StringDictionary[typings.cypress.JQuery.CSSHook[typings.std.HTMLElement]]
  // #endregion
  // region Callbacks
  // #region Callbacks
  type CallbacksStatic = js.Function1[
    /* flags */ js.UndefOr[java.lang.String], 
    typings.cypress.JQuery.Callbacks[js.Function]
  ]
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  /* Rewritten from type alias, can be one of: 
    - typings.cypress.anon.PickCoordinatesleft
    - typings.cypress.anon.PickCoordinatestop
    - org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  */
  type CoordinatesPartial = typings.cypress.JQuery._CoordinatesPartial | org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  // #endregion
  // region Effects
  // #region Effects
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.cypress.cypressStrings.fast
    - typings.cypress.cypressStrings.slow
  */
  type Duration = typings.cypress.JQuery._Duration | scala.Double
  // #endregion
  // region Easing
  // #region Easing
  type EasingMethod = js.Function1[/* percent */ scala.Double, scala.Double]
  type Easings = org.scalablytyped.runtime.StringDictionary[typings.cypress.JQuery.EasingMethod]
  type EventHandler[TCurrentTarget, TData] = typings.cypress.JQuery.EventHandlerBase[
    TCurrentTarget, 
    typings.cypress.JQuery.TriggeredEvent[TCurrentTarget, TData, js.Any, js.Any]
  ]
  // Extra parameters can be passed from trigger()
  type EventHandlerBase[TContext, T] = js.ThisFunction2[/* this */ TContext, /* t */ T, /* repeated */ js.Any, js.Any]
  // #endregion
  /* Rewritten from type alias, can be one of: 
    - typings.cypress.cypressBooleans.`false`
    - scala.Null
    - js.UndefOr[scala.Nothing]
    - typings.cypress.cypressNumbers.`0`
    - typings.cypress.cypressStrings._empty
    - typings.std.HTMLAllCollection
  */
  type Falsy = js.UndefOr[typings.cypress.JQuery._Falsy | scala.Null | typings.std.HTMLAllCollection]
  type Node = typings.std.Element | typings.std.Text | typings.std.Comment | typings.std.DocumentFragment
  /**
    * The PlainObject type is a JavaScript object containing zero or more key-value pairs. The plain object is, in other words, an Object object. It is designated "plain" in jQuery documentation to distinguish it from other kinds of JavaScript objects: for example, null, user-defined arrays, and host objects such as document, all of which have a typeof value of "object."
    *
    * **Note**: The type declaration of PlainObject is imprecise. It includes host objects and user-defined arrays which do not match jQuery's definition.
    */
  type PlainObject[T] = org.scalablytyped.runtime.StringDictionary[T]
  /**
    * This object provides a subset of the methods of the Deferred object (then, done, fail, always, pipe, progress, state and promise) to prevent users from changing the state of the Deferred.
    * @see \`{@link https://api.jquery.com/Types/#Promise }\`
    */
  type Promise[TR, TJ, TN] = typings.cypress.JQuery.PromiseBase[TR, TJ, TN, TR, TJ, TN, TR, TJ, TN, TR, TJ, TN]
  /**
    * This object provides a subset of the methods of the Deferred object (then, done, fail, always, pipe, progress, state and promise) to prevent users from changing the state of the Deferred.
    * @see \`{@link https://api.jquery.com/Types/#Promise }\`
    */
  type Promise2[TR, TJ, TN, UR, UJ, UN] = typings.cypress.JQuery.PromiseBase[
    TR, 
    TJ, 
    TN, 
    UR, 
    UJ, 
    UN, 
    scala.Nothing, 
    scala.Nothing, 
    scala.Nothing, 
    scala.Nothing, 
    scala.Nothing, 
    scala.Nothing
  ]
  /**
    * This object provides a subset of the methods of the Deferred object (then, done, fail, always, pipe, progress, state and promise) to prevent users from changing the state of the Deferred.
    * @see \`{@link https://api.jquery.com/Types/#Promise }\`
    */
  type Promise3[TR, TJ, TN, UR, UJ, UN, VR, VJ, VN] = typings.cypress.JQuery.PromiseBase[TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, scala.Nothing, scala.Nothing, scala.Nothing]
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  /* Rewritten from type alias, can be one of: 
    - typings.cypress.anon.Get[TElement]
    - typings.cypress.anon.Set[TElement]
    - org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  */
  type PropHook[TElement] = typings.cypress.JQuery._PropHook[TElement] | org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  type PropHooks = org.scalablytyped.runtime.StringDictionary[typings.cypress.JQuery.PropHook[typings.cypress.JQuery.Node]]
  type QueueFunction[TElement] = js.ThisFunction1[/* this */ TElement, /* next */ js.Function0[scala.Unit], scala.Unit]
  /**
    * A selector is used in jQuery to select DOM elements from a DOM document. That document is, in most cases, the DOM document present in all browsers, but can also be an XML document received via Ajax.
    */
  type Selector = java.lang.String
  // region Special event hooks
  // #region Special event hooks
  /**
    * The jQuery special event hooks are a set of per-event-name functions and properties that allow code to control the behavior of event processing within jQuery. The mechanism is similar to `fixHooks` in that the special event information is stored in `jQuery.event.special.NAME`, where `NAME` is the name of the special event. Event names are case sensitive.
    *
    * As with `fixHooks`, the special event hooks design assumes it will be very rare that two unrelated pieces of code want to process the same event name. Special event authors who need to modify events with existing hooks will need to take precautions to avoid introducing unwanted side-effects by clobbering those hooks.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#special-event-hooks }\`
    */
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  /* Rewritten from type alias, can be one of: 
    - typings.cypress.anon.NoBubble
    - typings.cypress.anon.BindType
    - typings.cypress.anon.DelegateType
    - typings.cypress.anon.Setup[TTarget, TData]
    - typings.cypress.anon.Teardown[TTarget]
    - typings.cypress.anon.Add[TTarget, TData]
    - typings.cypress.anon.Remove[TTarget, TData]
    - typings.cypress.anon.Trigger[TTarget, TData]
    - typings.cypress.anon.Default[TTarget, TData]
    - typings.cypress.anon.Handle[TTarget, TData]
    - typings.cypress.anon.PreDispatch[TTarget]
    - typings.cypress.anon.PostDispatch[TTarget]
    - org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  */
  type SpecialEventHook[TTarget, TData] = (typings.cypress.JQuery._SpecialEventHook[TTarget, TData]) | org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  type SpecialEventHooks = org.scalablytyped.runtime.StringDictionary[typings.cypress.JQuery.SpecialEventHook[typings.std.EventTarget, js.Any]]
  // #endregion
  // region Speed
  // #region Speed
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  /* Rewritten from type alias, can be one of: 
    - typings.cypress.anon.Duration
    - typings.cypress.anon.Easing
    - typings.cypress.anon.Complete[TElement]
    - org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  */
  type SpeedSettings[TElement] = typings.cypress.JQuery._SpeedSettings[TElement] | org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  // #endregion
  // region Deferred
  // #region Deferred
  /**
    * Any object that has a then method.
    */
  type Thenable[T] = js.Thenable[T]
  /**
    * A "Tweener" is a function responsible for creating a tween object, and you might want to override these if you want to implement complex values ( like a clip/transform array matrix ) in a single property.
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweeners }\`
    * @since 1.8
    */
  type Tweener[TElement] = js.ThisFunction2[
    /* this */ typings.cypress.JQuery.Animation[TElement], 
    /* propName */ java.lang.String, 
    /* finalValue */ scala.Double, 
    typings.cypress.JQuery.Tween[TElement]
  ]
  type TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, TType /* <: /* keyof cypress.JQuery.TypeToTriggeredEventMap<TDelegateTarget, TData, TCurrentTarget, TTarget> */ typings.cypress.cypressStrings.change | typings.cypress.cypressStrings.resize | typings.cypress.cypressStrings.scroll | typings.cypress.cypressStrings.select | typings.cypress.cypressStrings.submit | typings.cypress.cypressStrings.click | typings.cypress.cypressStrings.contextmenu | typings.cypress.cypressStrings.dblclick | typings.cypress.cypressStrings.mousedown | typings.cypress.cypressStrings.mouseenter | typings.cypress.cypressStrings.mouseleave | typings.cypress.cypressStrings.mousemove | typings.cypress.cypressStrings.mouseout | typings.cypress.cypressStrings.mouseover | typings.cypress.cypressStrings.mouseup | typings.cypress.cypressStrings.drag | typings.cypress.cypressStrings.dragend | typings.cypress.cypressStrings.dragenter | typings.cypress.cypressStrings.dragexit | typings.cypress.cypressStrings.dragleave | typings.cypress.cypressStrings.dragover | typings.cypress.cypressStrings.dragstart | typings.cypress.cypressStrings.drop | typings.cypress.cypressStrings.keydown | typings.cypress.cypressStrings.keypress | typings.cypress.cypressStrings.keyup | typings.cypress.cypressStrings.touchcancel | typings.cypress.cypressStrings.touchend | typings.cypress.cypressStrings.touchmove | typings.cypress.cypressStrings.touchstart | typings.cypress.cypressStrings.blur | typings.cypress.cypressStrings.focus | typings.cypress.cypressStrings.focusin | typings.cypress.cypressStrings.focusout */] = typings.cypress.JQuery.EventHandlerBase[
    TCurrentTarget, 
    /* import warning: importer.ImportType#apply Failed type conversion: cypress.JQuery.TypeToTriggeredEventMap<TDelegateTarget, TData, TCurrentTarget, TTarget>[TType] */ js.Any
  ]
  type TypeOrArray[T] = T | js.Array[T]
  // #endregion
  // region Val hooks
  // #region Val hooks
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  /* Rewritten from type alias, can be one of: 
    - typings.cypress.anon.`1`[TElement]
    - typings.cypress.anon.`2`[TElement]
    - org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  */
  type ValHook[TElement] = typings.cypress.JQuery._ValHook[TElement] | org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  type ValHooks = // Set to HTMLElement to minimize breaks but should probably be Element.
  org.scalablytyped.runtime.StringDictionary[typings.cypress.JQuery.ValHook[typings.std.HTMLElement]]
  /**
    * A string is designated htmlString in jQuery documentation when it is used to represent one or more DOM elements, typically to be created and inserted in the document. When passed as an argument of the jQuery() function, the string is identified as HTML if it starts with <tag ... >) and is parsed as such until the final > character. Prior to jQuery 1.9, a string was considered to be HTML if it contained <tag ... > anywhere within the string.
    */
  type htmlString = java.lang.String
}
