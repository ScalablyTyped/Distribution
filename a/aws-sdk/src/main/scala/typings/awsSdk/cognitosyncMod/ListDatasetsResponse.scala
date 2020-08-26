package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDatasetsResponse extends js.Object {
  /**
    * Number of datasets returned.
    */
  var Count: js.UndefOr[Integer] = js.native
  /**
    * A set of datasets.
    */
  var Datasets: js.UndefOr[DatasetList] = js.native
  /**
    * A pagination token for obtaining the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListDatasetsResponse {
  @scala.inline
  def apply(): ListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetsResponse]
  }
  @scala.inline
  implicit class ListDatasetsResponseOps[Self <: ListDatasetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCount(value: Integer): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("Count", js.undefined)
    @scala.inline
    def setDatasetsVarargs(value: Dataset*): Self = this.set("Datasets", js.Array(value :_*))
    @scala.inline
    def setDatasets(value: DatasetList): Self = this.set("Datasets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasets: Self = this.set("Datasets", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

