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
  def apply(): DescribeEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndpointsResponse]
  }
  @scala.inline
  implicit class DescribeEndpointsResponseOps[Self <: DescribeEndpointsResponse] (val x: Self) extends AnyVal {
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
    def setEndpointsVarargs(value: Endpoint*): Self = this.set("Endpoints", js.Array(value :_*))
    @scala.inline
    def setEndpoints(value: EndpointList): Self = this.set("Endpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoints: Self = this.set("Endpoints", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

