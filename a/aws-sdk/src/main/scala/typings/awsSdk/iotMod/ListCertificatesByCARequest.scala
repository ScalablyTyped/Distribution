package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCertificatesByCARequest extends js.Object {
  /**
    * Specifies the order for results. If True, the results are returned in ascending order, based on the creation date.
    */
  var ascendingOrder: js.UndefOr[AscendingOrder] = js.native
  /**
    * The ID of the CA certificate. This operation will list all registered device certificate that were signed by this CA certificate.
    */
  var caCertificateId: CertificateId = js.native
  /**
    * The marker for the next set of results.
    */
  var marker: js.UndefOr[Marker] = js.native
  /**
    * The result page size.
    */
  var pageSize: js.UndefOr[PageSize] = js.native
}

object ListCertificatesByCARequest {
  @scala.inline
  def apply(
    caCertificateId: CertificateId,
    ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
    marker: Marker = null,
    pageSize: js.UndefOr[PageSize] = js.undefined
  ): ListCertificatesByCARequest = {
    val __obj = js.Dynamic.literal(caCertificateId = caCertificateId.asInstanceOf[js.Any])
    if (!js.isUndefined(ascendingOrder)) __obj.updateDynamic("ascendingOrder")(ascendingOrder.get.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCertificatesByCARequest]
  }
}

