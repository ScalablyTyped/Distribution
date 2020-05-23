package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cypress {
  type DragEvent = typings.std.DragEvent
  type Event = typings.std.Event
  type EventEmitter2 = typings.eventemitter2.mod.EventEmitter2
  type FocusEvent = typings.std.FocusEvent
  // tslint:disable-next-line:strict-export-declare-modifiers
  type GlobalPartial[T] = typings.std.Partial[T]
  type JQuery[TElement] = typings.cypress.JQuery_[TElement]
  // tslint:disable-next-line:no-empty-interface
  type JQueryAjaxSettings = typings.cypress.JQuery.AjaxSettings[js.Any]
  type JQueryAnimationOptions = typings.cypress.JQuery.EffectsOptions[typings.std.Element]
  type JQueryCallback = typings.cypress.JQuery.Callbacks[js.Function]
  // tslint:disable-next-line:no-empty-interface
  type JQueryCoordinates = typings.cypress.JQuery.Coordinates
  type JQueryDeferred[T] = typings.cypress.JQuery.Deferred[T, js.Any, js.Any]
  /**
    * @deprecated ​ Deprecated. Internal. See \`{@link https://github.com/jquery/api.jquery.com/issues/912 }\`.
    */
  type JQueryEasingFunction = js.Function1[/* percent */ scala.Double, scala.Double]
  // tslint:disable-next-line:no-empty-interface
  type JQueryEventConstructor = typings.cypress.JQuery.EventStatic
  type JQueryGenericPromise[T] = typings.cypress.JQuery.Thenable[T]
  /**
    * @deprecated ​ Deprecated. Use \`{@link JQueryStatic.param JQueryStatic&#91;'param'&#93;}\`.
    */
  type JQueryParam = js.Function2[/* obj */ js.Any, /* traditional */ js.UndefOr[scala.Boolean], java.lang.String]
  type JQueryPromise[T] = typings.cypress.JQuery.Promise[T, js.Any, js.Any]
  // Legacy types that are not represented in the current type definitions are marked deprecated.
  /**
    * @deprecated ​ Deprecated. Use \`{@link JQuery.Deferred.Callback }\` or \`{@link JQuery.Deferred.CallbackBase }\`.
    */
  type JQueryPromiseCallback[T] = js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, scala.Unit]
  /**
    * @deprecated ​ Deprecated.
    */
  type JQueryPromiseOperator[T, U] = js.Function2[
    /* callback1 */ typings.cypress.JQuery.TypeOrArray[typings.cypress.JQueryPromiseCallback[T]], 
    /* repeated */ typings.cypress.JQuery.TypeOrArray[typings.cypress.JQueryPromiseCallback[js.Any]], 
    typings.cypress.JQueryPromise[U]
  ]
  // tslint:disable-next-line:no-empty-interface
  type JQuerySerializeArrayElement = typings.cypress.JQuery.NameValuePair
  /**
    * @deprecated ​ Deprecated since 1.9. See \`{@link https://api.jquery.com/jQuery.support/ }\`.
    */
  // tslint:disable-next-line:no-empty-interface
  type JQuerySupport = typings.cypress.JQuery.PlainObject[js.Any]
  type KeyboardEvent = typings.std.KeyboardEvent
  type Mocha = typings.cypress.Mocha_
  // #endregion Browser augmentations
  // #region Deprecations
  /** @deprecated use `Mocha.Done` instead. */
  type MochaDone = typings.cypress.Mocha.Done
  type MouseEvent = typings.std.MouseEvent
  type Nullable[T] = T | scala.Null
  /** @deprecated use `Mocha.ReporterConstructor` instead. */
  type ReporterConstructor = typings.cypress.Mocha.ReporterConstructor
  type TouchEvent = typings.std.TouchEvent
  type UIEvent = typings.std.UIEvent
}
