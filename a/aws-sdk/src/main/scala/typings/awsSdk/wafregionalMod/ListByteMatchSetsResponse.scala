package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListByteMatchSetsResponse extends js.Object {
  /**
    * An array of ByteMatchSetSummary objects.
    */
  var ByteMatchSets: js.UndefOr[ByteMatchSetSummaries] = js.native
  /**
    * If you have more ByteMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more ByteMatchSet objects, submit another ListByteMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafregionalMod.NextMarker] = js.native
}

object ListByteMatchSetsResponse {
  @scala.inline
  def apply(): ListByteMatchSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListByteMatchSetsResponse]
  }
  @scala.inline
  implicit class ListByteMatchSetsResponseOps[Self <: ListByteMatchSetsResponse] (val x: Self) extends AnyVal {
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
    def setByteMatchSetsVarargs(value: ByteMatchSetSummary*): Self = this.set("ByteMatchSets", js.Array(value :_*))
    @scala.inline
    def setByteMatchSets(value: ByteMatchSetSummaries): Self = this.set("ByteMatchSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteByteMatchSets: Self = this.set("ByteMatchSets", js.undefined)
    @scala.inline
    def setNextMarker(value: NextMarker): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
  
}

