package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointsResponse extends js.Object {
  /**
    * Endpoint description.
    */
  var Endpoints: js.UndefOr[EndpointList] = js.native
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
}

object DescribeEndpointsResponse {
  @scala.inline
  def apply(Endpoints: EndpointList = null, Marker: String = null): DescribeEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    if (Endpoints != null) __obj.updateDynamic("Endpoints")(Endpoints.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointsResponse]
  }
}

