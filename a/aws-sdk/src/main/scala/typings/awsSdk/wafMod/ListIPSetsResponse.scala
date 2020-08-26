package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIPSetsResponse extends js.Object {
  /**
    * An array of IPSetSummary objects.
    */
  var IPSets: js.UndefOr[IPSetSummaries] = js.native
  /**
    * To list more IPSet objects, submit another ListIPSets request, and in the next request use the NextMarker response value as the NextMarker value.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.native
}

object ListIPSetsResponse {
  @scala.inline
  def apply(): ListIPSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIPSetsResponse]
  }
  @scala.inline
  implicit class ListIPSetsResponseOps[Self <: ListIPSetsResponse] (val x: Self) extends AnyVal {
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
    def setIPSetsVarargs(value: IPSetSummary*): Self = this.set("IPSets", js.Array(value :_*))
    @scala.inline
    def setIPSets(value: IPSetSummaries): Self = this.set("IPSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIPSets: Self = this.set("IPSets", js.undefined)
    @scala.inline
    def setNextMarker(value: NextMarker): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
  
}

