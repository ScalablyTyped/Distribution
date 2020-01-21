package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cypress {
  type DragEvent = typings.std.DragEvent
  type Event = typings.std.Event_
  type FocusEvent = typings.std.FocusEvent
  // tslint:disable-next-line:strict-export-declare-modifiers
  type GlobalPartial[T] = typings.std.Partial[T]
  // tslint:disable-next-line:no-empty-interface
  type JQueryAjaxSettings = typings.cypress.JQuery_.AjaxSettings[js.Any]
  type JQueryAnimationOptions = typings.cypress.JQuery_.EffectsOptions[typings.std.Element]
  type JQueryCallback = typings.cypress.JQuery_.Callbacks[js.Function]
  // tslint:disable-next-line:no-empty-interface
  type JQueryCoordinates = typings.cypress.JQuery_.Coordinates
  type JQueryDeferred[T] = typings.cypress.JQuery_.Deferred[T, js.Any, js.Any]
  /**
    * @deprecated ​ Deprecated. Internal. See \`{@link https://github.com/jquery/api.jquery.com/issues/912 }\`.
    */
  type JQueryEasingFunction = js.Function1[/* percent */ scala.Double, scala.Double]
  // tslint:disable-next-line:no-empty-interface
  type JQueryEventConstructor = typings.cypress.JQuery_.EventStatic
  type JQueryGenericPromise[T] = typings.cypress.JQuery_.Thenable[T]
  /**
    * @deprecated ​ Deprecated. Use \`{@link JQueryStatic.param JQueryStatic&#91;'param'&#93;}\`.
    */
  type JQueryParam = js.Function2[/* obj */ js.Any, /* traditional */ js.UndefOr[scala.Boolean], java.lang.String]
  type JQueryPromise[T] = typings.cypress.JQuery_.Promise[T, js.Any, js.Any]
  // Legacy types that are not represented in the current type definitions are marked deprecated.
  /**
    * @deprecated ​ Deprecated. Use \`{@link JQuery.Deferred.Callback }\` or \`{@link JQuery.Deferred.CallbackBase }\`.
    */
  type JQueryPromiseCallback[T] = js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, scala.Unit]
  /**
    * @deprecated ​ Deprecated.
    */
  type JQueryPromiseOperator[T, U] = js.Function2[
    /* callback1 */ typings.cypress.JQuery_.TypeOrArray[typings.cypress.JQueryPromiseCallback[T]], 
    /* repeated */ typings.cypress.JQuery_.TypeOrArray[typings.cypress.JQueryPromiseCallback[js.Any]], 
    typings.cypress.JQueryPromise[U]
  ]
  // tslint:disable-next-line:no-empty-interface
  type JQuerySerializeArrayElement = typings.cypress.JQuery_.NameValuePair
  /**
    * @deprecated ​ Deprecated since 1.9. See \`{@link https://api.jquery.com/jQuery.support/ }\`.
    */
  // tslint:disable-next-line:no-empty-interface
  type JQuerySupport = typings.cypress.JQuery_.PlainObject[js.Any]
  // tslint:disable-next-line:no-empty-interface
  type JQueryXHR = typings.cypress.JQuery_.jqXHR[js.Any]
  type JQuery_[TElement] = typings.cypress.JQuery__[TElement]
  type KeyboardEvent = typings.std.KeyboardEvent
  // #endregion Browser augmentations
  // #region Deprecations
  /** @deprecated use `Mocha.Done` instead. */
  type MochaDone = typings.cypress.Mocha_.Done
  type Mocha_ = typings.cypress.Mocha__
  type MouseEvent = typings.std.MouseEvent
  /** @deprecated use `Mocha.ReporterConstructor` instead. */
  type ReporterConstructor = typings.cypress.Mocha_.ReporterConstructor
  type TouchEvent = typings.std.TouchEvent
  type UIEvent = typings.std.UIEvent
}
