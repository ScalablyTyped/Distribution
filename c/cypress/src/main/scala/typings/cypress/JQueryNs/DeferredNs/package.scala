package typings.cypress.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DeferredNs {
  /**
    * @deprecated Use \`{@link JQuery.Deferred.Callback }\`.
    */
  type AlwaysCallback[TResolve, TReject] = Callback[TResolve | TReject]
  type Callback[T] = js.Function1[/* repeated */ T, Unit]
  type Callback3[T, U, V] = CallbackBase[T, U, V, scala.Nothing]
  type CallbackBase[T, U, V, R] = js.Function4[/* t */ T, /* u */ U, /* v */ V, /* repeated */ R, Unit]
  /**
    * @deprecated Use \`{@link JQuery.Deferred.Callback }\`.
    */
  type DoneCallback[TResolve] = Callback[TResolve]
  /**
    * @deprecated Use \`{@link JQuery.Deferred.Callback }\`.
    */
  type FailCallback[TReject] = Callback[TReject]
  /**
    * @deprecated Use \`{@link JQuery.Deferred.Callback }\`.
    */
  type ProgressCallback[TNotify] = Callback[TNotify]
}
