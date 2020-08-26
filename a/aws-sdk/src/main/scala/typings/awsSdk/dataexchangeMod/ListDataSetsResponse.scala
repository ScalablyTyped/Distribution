package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataSetsResponse extends js.Object {
  /**
    * The data set objects listed by the request.
    */
  var DataSets: js.UndefOr[ListOfDataSetEntry] = js.native
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.dataexchangeMod.NextToken] = js.native
}

object ListDataSetsResponse {
  @scala.inline
  def apply(): ListDataSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataSetsResponse]
  }
  @scala.inline
  implicit class ListDataSetsResponseOps[Self <: ListDataSetsResponse] (val x: Self) extends AnyVal {
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
    def setDataSetsVarargs(value: DataSetEntry*): Self = this.set("DataSets", js.Array(value :_*))
    @scala.inline
    def setDataSets(value: ListOfDataSetEntry): Self = this.set("DataSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSets: Self = this.set("DataSets", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

