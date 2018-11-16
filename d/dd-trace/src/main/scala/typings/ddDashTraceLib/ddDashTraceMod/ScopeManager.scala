package typings
package ddDashTraceLib.ddDashTraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScopeManager extends js.Object {
  /**
       * Activate a new scope wrapping the provided span.
       *
       * @param span The span for which to activate the new scope.
       * @param finishSpanOnClose Whether to automatically finish the span when the scope is closed.
       */
  def activate(span: opentracingLib.opentracingMod.Span): Scope = js.native
  /**
       * Activate a new scope wrapping the provided span.
       *
       * @param span The span for which to activate the new scope.
       * @param finishSpanOnClose Whether to automatically finish the span when the scope is closed.
       */
  def activate(span: opentracingLib.opentracingMod.Span, finishSpanOnClose: scala.Boolean): Scope = js.native
  /**
       * Get the current active scope or null if there is none.
       *
       * @todo The dd-trace source returns null, but opentracing's childOf span
       *       option is typed as taking undefined or a scope, so using undefined
       *       here instead.
       */
  def active(): js.UndefOr[Scope] = js.native
}

