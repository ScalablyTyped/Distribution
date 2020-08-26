package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDBEngineVersionsMessage extends js.Object {
  /**
    * The name of a specific DB parameter group family to return details for. Constraints:   If supplied, must match an existing DBParameterGroupFamily.  
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether only the default version of the specified engine or engine and major version combination is returned.
    */
  var DefaultOnly: js.UndefOr[Boolean] = js.native
  /**
    * The database engine to return.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * The database engine version to return. Example: 5.1.49 
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * This parameter isn't currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * A value that indicates whether to include engine versions that aren't available in the list. The default is to list only available engine versions.
    */
  var IncludeAll: js.UndefOr[BooleanOptional] = js.native
  /**
    * A value that indicates whether to list the supported character sets for each engine version. If this parameter is enabled and the requested engine supports the CharacterSetName parameter for CreateDBInstance, the response includes a list of supported character sets for each engine version. 
    */
  var ListSupportedCharacterSets: js.UndefOr[BooleanOptional] = js.native
  /**
    * A value that indicates whether to list the supported time zones for each engine version. If this parameter is enabled and the requested engine supports the TimeZone parameter for CreateDBInstance, the response includes a list of supported time zones for each engine version. 
    */
  var ListSupportedTimezones: js.UndefOr[BooleanOptional] = js.native
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    *  The maximum number of records to include in the response. If more than the MaxRecords value is available, a pagination token called a marker is included in the response so you can retrieve the remaining results.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
}

object DescribeDBEngineVersionsMessage {
  @scala.inline
  def apply(): DescribeDBEngineVersionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBEngineVersionsMessage]
  }
  @scala.inline
  implicit class DescribeDBEngineVersionsMessageOps[Self <: DescribeDBEngineVersionsMessage] (val x: Self) extends AnyVal {
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
    def setDBParameterGroupFamily(value: String): Self = this.set("DBParameterGroupFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBParameterGroupFamily: Self = this.set("DBParameterGroupFamily", js.undefined)
    @scala.inline
    def setDefaultOnly(value: Boolean): Self = this.set("DefaultOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOnly: Self = this.set("DefaultOnly", js.undefined)
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setIncludeAll(value: BooleanOptional): Self = this.set("IncludeAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeAll: Self = this.set("IncludeAll", js.undefined)
    @scala.inline
    def setListSupportedCharacterSets(value: BooleanOptional): Self = this.set("ListSupportedCharacterSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListSupportedCharacterSets: Self = this.set("ListSupportedCharacterSets", js.undefined)
    @scala.inline
    def setListSupportedTimezones(value: BooleanOptional): Self = this.set("ListSupportedTimezones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListSupportedTimezones: Self = this.set("ListSupportedTimezones", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
  }
  
}

