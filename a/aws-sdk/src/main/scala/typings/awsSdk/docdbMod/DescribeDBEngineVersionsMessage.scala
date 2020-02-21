package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDBEngineVersionsMessage extends js.Object {
  /**
    * The name of a specific parameter group family to return details for. Constraints:   If provided, must match an existing DBParameterGroupFamily.  
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    * Indicates that only the default version of the specified engine or engine and major version combination is returned.
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
    * This parameter is not currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * If this parameter is specified and the requested engine supports the CharacterSetName parameter for CreateDBInstance, the response includes a list of supported character sets for each engine version. 
    */
  var ListSupportedCharacterSets: js.UndefOr[BooleanOptional] = js.native
  /**
    * If this parameter is specified and the requested engine supports the TimeZone parameter for CreateDBInstance, the response includes a list of supported time zones for each engine version. 
    */
  var ListSupportedTimezones: js.UndefOr[BooleanOptional] = js.native
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token (marker) is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
}

object DescribeDBEngineVersionsMessage {
  @scala.inline
  def apply(
    DBParameterGroupFamily: String = null,
    DefaultOnly: js.UndefOr[scala.Boolean] = js.undefined,
    Engine: String = null,
    EngineVersion: String = null,
    Filters: FilterList = null,
    ListSupportedCharacterSets: js.UndefOr[scala.Boolean] = js.undefined,
    ListSupportedTimezones: js.UndefOr[scala.Boolean] = js.undefined,
    Marker: String = null,
    MaxRecords: Int | Double = null
  ): DescribeDBEngineVersionsMessage = {
    val __obj = js.Dynamic.literal()
    if (DBParameterGroupFamily != null) __obj.updateDynamic("DBParameterGroupFamily")(DBParameterGroupFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(DefaultOnly)) __obj.updateDynamic("DefaultOnly")(DefaultOnly.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (!js.isUndefined(ListSupportedCharacterSets)) __obj.updateDynamic("ListSupportedCharacterSets")(ListSupportedCharacterSets.asInstanceOf[js.Any])
    if (!js.isUndefined(ListSupportedTimezones)) __obj.updateDynamic("ListSupportedTimezones")(ListSupportedTimezones.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBEngineVersionsMessage]
  }
}

