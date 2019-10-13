package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cypress {
  import typings.cypress.JQuery.AjaxSettings
  import typings.cypress.JQuery.Callbacks
  import typings.cypress.JQuery.Coordinates
  import typings.cypress.JQuery.Deferred
  import typings.cypress.JQuery.EffectsOptions
  import typings.cypress.JQuery.EventStatic
  import typings.cypress.JQuery.NameValuePair
  import typings.cypress.JQuery.PlainObject
  import typings.cypress.JQuery.PromiseBase
  import typings.cypress.JQuery.TypeOrArray
  import typings.cypress.JQuery.jqXHR
  import typings.cypress.Mocha.Done
  import typings.cypress.Mocha.MochaGlobals
  import typings.std.Element
  import typings.std.Event

  type JQuery[TElement] = JQuery_[TElement]
  // tslint:disable-next-line:no-empty-interface
  type JQueryAjaxSettings = AjaxSettings[js.Any]
  type JQueryAnimationOptions = EffectsOptions[Element]
  // region Legacy types
  // tslint:disable-next-line:no-empty-interface
  type JQueryCallback = Callbacks[js.Function]
  // tslint:disable-next-line:no-empty-interface
  type JQueryCoordinates = Coordinates
  type JQueryDeferred[T] = Deferred[T, js.Any, js.Any]
  /**
    * @deprecated Internal. See \`{@link https://github.com/jquery/api.jquery.com/issues/912 }\`.
    */
  type JQueryEasingFunction = js.Function1[/* percent */ Double, Double]
  // tslint:disable-next-line:no-empty-interface
  type JQueryEventConstructor = EventStatic
  type JQueryGenericPromise[T] = js.Thenable[T]
  /**
    * @deprecated Use \`{@link JQueryStatic.param JQueryStatic&#91;'param'&#93;}\`.
    */
  type JQueryParam = js.Function2[/* obj */ js.Any, /* traditional */ js.UndefOr[Boolean], String]
  type JQueryPromise[T] = PromiseBase[T, js.Any, js.Any, T, js.Any, js.Any, T, js.Any, js.Any, T, js.Any, js.Any]
  // Legacy types that are not represented in the current type definitions are marked deprecated.
  /**
    * @deprecated Use \`{@link JQuery.Deferred.Callback }\` or \`{@link JQuery.Deferred.CallbackBase }\`.
    */
  type JQueryPromiseCallback[T] = js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, Unit]
  /**
    * @deprecated
    */
  type JQueryPromiseOperator[T, U] = js.Function2[
    /* callback1 */ TypeOrArray[JQueryPromiseCallback[T]], 
    /* repeated */ TypeOrArray[JQueryPromiseCallback[js.Any]], 
    JQueryPromise[U]
  ]
  // tslint:disable-next-line:no-empty-interface
  type JQuerySerializeArrayElement = NameValuePair
  /**
    * @deprecated Deprecated since 1.9. See \`{@link https://api.jquery.com/jQuery.support/ }\`.
    */
  // tslint:disable-next-line:no-empty-interface
  type JQuerySupport = PlainObject[js.Any]
  // tslint:disable-next-line:no-empty-interface
  type JQueryXHR = jqXHR[js.Any]
  type Mocha = Mocha_
  // #endregion Browser augmentations
  // #region Deprecations
  /** @deprecated use `Mocha.Done` instead. */
  type MochaDone = Done
  /** @deprecated use `Mocha.ReporterConstructor` instead. */
  type ReporterConstructor = typings.cypress.Mocha.ReporterConstructor
  // Augments the DOM `Window` object when lib.dom.d.ts is loaded.
  // tslint:disable-next-line no-empty-interface
  type Window = MochaGlobals
  // Used by JQuery.Event
  type _Event = Event
}
