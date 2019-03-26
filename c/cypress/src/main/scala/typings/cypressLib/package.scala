package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cypressLib {
  // tslint:disable-next-line:no-empty-interface
  type JQueryAjaxSettings = cypressLib.JQueryNs.AjaxSettings[js.Any]
  type JQueryAnimationOptions = cypressLib.JQueryNs.EffectsOptions[stdLib.Element]
  // region Legacy types
  // tslint:disable-next-line:no-empty-interface
  type JQueryCallback = cypressLib.JQueryNs.Callbacks[js.Function]
  // tslint:disable-next-line:no-empty-interface
  type JQueryCoordinates = cypressLib.JQueryNs.Coordinates
  type JQueryDeferred[T] = cypressLib.JQueryNs.Deferred[T, js.Any, js.Any]
  /**
    * @deprecated Internal. See \`{@link https://github.com/jquery/api.jquery.com/issues/912 }\`.
    */
  type JQueryEasingFunction = js.Function1[/* percent */ scala.Double, scala.Double]
  // tslint:disable-next-line:no-empty-interface
  type JQueryEventConstructor = cypressLib.JQueryNs.EventStatic
  type JQueryGenericPromise[T] = cypressLib.JQueryNs.Thenable[T]
  /**
    * @deprecated Use \`{@link JQueryStatic.param JQueryStatic&#91;'param'&#93;}\`.
    */
  type JQueryParam = js.Function2[/* obj */ js.Any, /* traditional */ js.UndefOr[scala.Boolean], java.lang.String]
  type JQueryPromise[T] = cypressLib.JQueryNs.Promise[T, js.Any, js.Any]
  // Legacy types that are not represented in the current type definitions are marked deprecated.
  /**
    * @deprecated Use \`{@link JQuery.Deferred.Callback }\` or \`{@link JQuery.Deferred.CallbackBase }\`.
    */
  type JQueryPromiseCallback[T] = js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, scala.Unit]
  /**
    * @deprecated
    */
  type JQueryPromiseOperator[T, U] = js.Function2[
    /* callback1 */ cypressLib.JQueryNs.TypeOrArray[JQueryPromiseCallback[T]], 
    /* repeated */ cypressLib.JQueryNs.TypeOrArray[JQueryPromiseCallback[js.Any]], 
    JQueryPromise[U]
  ]
  // tslint:disable-next-line:no-empty-interface
  type JQuerySerializeArrayElement = cypressLib.JQueryNs.NameValuePair
  /**
    * @deprecated Deprecated since 1.9. See \`{@link https://api.jquery.com/jQuery.support/ }\`.
    */
  // tslint:disable-next-line:no-empty-interface
  type JQuerySupport = cypressLib.JQueryNs.PlainObject[js.Any]
  // tslint:disable-next-line:no-empty-interface
  type JQueryXHR = cypressLib.JQueryNs.jqXHR[js.Any]
  type MochaDone = js.Function1[/* error */ js.UndefOr[js.Any], js.Any]
  // Used by JQuery.Event
  type _Event = stdLib.Event
}
