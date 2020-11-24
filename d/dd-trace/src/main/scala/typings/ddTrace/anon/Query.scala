package typings.ddTrace.anon

import typings.ddTrace.mod.TransportRequestParams
import typings.opentracing.mod.Span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends js.Object {
  
  /**
    * Hook to execute just before the query span finishes.
    */
  var query: js.UndefOr[
    js.Function2[/* span */ js.UndefOr[Span], /* params */ js.UndefOr[TransportRequestParams], _]
  ] = js.native
}
object Query {
  
  @scala.inline
  def apply(): Query = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Query]
  }
  
  @scala.inline
  implicit class QueryOps[Self <: Query] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQuery(value: (/* span */ js.UndefOr[Span], /* params */ js.UndefOr[TransportRequestParams]) => _): Self = this.set("query", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
}
