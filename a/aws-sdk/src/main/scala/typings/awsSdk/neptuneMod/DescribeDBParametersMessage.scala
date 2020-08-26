package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDBParametersMessage extends js.Object {
  /**
    * The name of a specific DB parameter group to return details for. Constraints:   If supplied, must match the name of an existing DBParameterGroup.  
    */
  var DBParameterGroupName: String = js.native
  /**
    * This parameter is not currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * An optional pagination token provided by a previous DescribeDBParameters request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * The parameter types to return. Default: All parameter types returned Valid Values: user | system | engine-default 
    */
  var Source: js.UndefOr[String] = js.native
}

object DescribeDBParametersMessage {
  @scala.inline
  def apply(DBParameterGroupName: String): DescribeDBParametersMessage = {
    val __obj = js.Dynamic.literal(DBParameterGroupName = DBParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBParametersMessage]
  }
  @scala.inline
  implicit class DescribeDBParametersMessageOps[Self <: DescribeDBParametersMessage] (val x: Self) extends AnyVal {
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
    def setDBParameterGroupName(value: String): Self = this.set("DBParameterGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("Source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
  }
  
}

