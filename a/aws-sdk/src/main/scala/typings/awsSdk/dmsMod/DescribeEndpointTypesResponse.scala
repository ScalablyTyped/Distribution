package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointTypesResponse extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The types of endpoints that are supported.
    */
  var SupportedEndpointTypes: js.UndefOr[SupportedEndpointTypeList] = js.native
}

object DescribeEndpointTypesResponse {
  @scala.inline
  def apply(Marker: String = null, SupportedEndpointTypes: SupportedEndpointTypeList = null): DescribeEndpointTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (SupportedEndpointTypes != null) __obj.updateDynamic("SupportedEndpointTypes")(SupportedEndpointTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointTypesResponse]
  }
}

