package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCardinalityResponse extends js.Object {
  /**
    * The approximate count of unique values that match the query.
    */
  var cardinality: js.UndefOr[Count] = js.native
}

object GetCardinalityResponse {
  @scala.inline
  def apply(cardinality: js.UndefOr[Count] = js.undefined): GetCardinalityResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cardinality)) __obj.updateDynamic("cardinality")(cardinality.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCardinalityResponse]
  }
}

