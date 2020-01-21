package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAggregationAuthorizationResponse extends js.Object {
  /**
    * Returns an AggregationAuthorization object. 
    */
  var AggregationAuthorization: js.UndefOr[typings.awsSdk.configserviceMod.AggregationAuthorization] = js.native
}

object PutAggregationAuthorizationResponse {
  @scala.inline
  def apply(AggregationAuthorization: AggregationAuthorization = null): PutAggregationAuthorizationResponse = {
    val __obj = js.Dynamic.literal()
    if (AggregationAuthorization != null) __obj.updateDynamic("AggregationAuthorization")(AggregationAuthorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAggregationAuthorizationResponse]
  }
}

