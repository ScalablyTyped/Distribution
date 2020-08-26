package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSizeConstraintSetsResponse extends js.Object {
  /**
    * If you have more SizeConstraintSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more SizeConstraintSet objects, submit another ListSizeConstraintSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.native
  /**
    * An array of SizeConstraintSetSummary objects.
    */
  var SizeConstraintSets: js.UndefOr[SizeConstraintSetSummaries] = js.native
}

object ListSizeConstraintSetsResponse {
  @scala.inline
  def apply(): ListSizeConstraintSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSizeConstraintSetsResponse]
  }
  @scala.inline
  implicit class ListSizeConstraintSetsResponseOps[Self <: ListSizeConstraintSetsResponse] (val x: Self) extends AnyVal {
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
    def setSizeConstraintSetsVarargs(value: SizeConstraintSetSummary*): Self = this.set("SizeConstraintSets", js.Array(value :_*))
    @scala.inline
    def setSizeConstraintSets(value: SizeConstraintSetSummaries): Self = this.set("SizeConstraintSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeConstraintSets: Self = this.set("SizeConstraintSets", js.undefined)
  }
  
}

