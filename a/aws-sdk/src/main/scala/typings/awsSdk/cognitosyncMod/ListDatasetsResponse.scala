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
  def apply(Count: Int | Double = null, Datasets: DatasetList = null, NextToken: String = null): ListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    if (Datasets != null) __obj.updateDynamic("Datasets")(Datasets.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatasetsResponse]
  }
}

