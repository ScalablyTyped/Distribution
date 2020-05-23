package typings.ddTrace.anon

import typings.ddTrace.mod.TransportRequestParams
import typings.opentracing.mod.Span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  /**
    * Hook to execute just before the query span finishes.
    */
  var query: js.UndefOr[
    js.Function2[/* span */ js.UndefOr[Span], /* params */ js.UndefOr[TransportRequestParams], _]
  ] = js.undefined
}

object Query {
  @scala.inline
  def apply(query: (/* span */ js.UndefOr[Span], /* params */ js.UndefOr[TransportRequestParams]) => _ = null): Query = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction2(query))
    __obj.asInstanceOf[Query]
  }
}

