package typings.ddTrace

import typings.ddTrace.mod.TransportRequestParams
import typings.opentracing.mod.Span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQuery extends js.Object {
  /**
    * Hook to execute just before the query span finishes.
    */
  var query: js.UndefOr[
    js.Function2[/* span */ js.UndefOr[Span], /* params */ js.UndefOr[TransportRequestParams], _]
  ] = js.undefined
}

object AnonQuery {
  @scala.inline
  def apply(query: (/* span */ js.UndefOr[Span], /* params */ js.UndefOr[TransportRequestParams]) => _ = null): AnonQuery = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction2(query))
    __obj.asInstanceOf[AnonQuery]
  }
}

