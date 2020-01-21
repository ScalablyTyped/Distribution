package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPrincipalPoliciesRequest extends js.Object {
  /**
    * Specifies the order for results. If true, results are returned in ascending creation order.
    */
  var ascendingOrder: js.UndefOr[AscendingOrder] = js.native
  /**
    * The marker for the next set of results.
    */
  var marker: js.UndefOr[Marker] = js.native
  /**
    * The result page size.
    */
  var pageSize: js.UndefOr[PageSize] = js.native
  /**
    * The principal.
    */
  var principal: Principal = js.native
}

object ListPrincipalPoliciesRequest {
  @scala.inline
  def apply(
    principal: Principal,
    ascendingOrder: js.UndefOr[scala.Boolean] = js.undefined,
    marker: Marker = null,
    pageSize: Int | Double = null
  ): ListPrincipalPoliciesRequest = {
    val __obj = js.Dynamic.literal(principal = principal.asInstanceOf[js.Any])
    if (!js.isUndefined(ascendingOrder)) __obj.updateDynamic("ascendingOrder")(ascendingOrder.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPrincipalPoliciesRequest]
  }
}

