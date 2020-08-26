package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSqlInjectionMatchSetsResponse extends js.Object {
  /**
    * If you have more SqlInjectionMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more SqlInjectionMatchSet objects, submit another ListSqlInjectionMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.native
  /**
    * An array of SqlInjectionMatchSetSummary objects.
    */
  var SqlInjectionMatchSets: js.UndefOr[SqlInjectionMatchSetSummaries] = js.native
}

object ListSqlInjectionMatchSetsResponse {
  @scala.inline
  def apply(): ListSqlInjectionMatchSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSqlInjectionMatchSetsResponse]
  }
  @scala.inline
  implicit class ListSqlInjectionMatchSetsResponseOps[Self <: ListSqlInjectionMatchSetsResponse] (val x: Self) extends AnyVal {
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
    def setNextMarker(value: NextMarker): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
    @scala.inline
    def setSqlInjectionMatchSetsVarargs(value: SqlInjectionMatchSetSummary*): Self = this.set("SqlInjectionMatchSets", js.Array(value :_*))
    @scala.inline
    def setSqlInjectionMatchSets(value: SqlInjectionMatchSetSummaries): Self = this.set("SqlInjectionMatchSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqlInjectionMatchSets: Self = this.set("SqlInjectionMatchSets", js.undefined)
  }
  
}

