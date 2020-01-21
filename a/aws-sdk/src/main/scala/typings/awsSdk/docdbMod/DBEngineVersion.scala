package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBEngineVersion extends js.Object {
  /**
    * The description of the database engine.
    */
  var DBEngineDescription: js.UndefOr[String] = js.native
  /**
    * The description of the database engine version.
    */
  var DBEngineVersionDescription: js.UndefOr[String] = js.native
  /**
    * The name of the DB parameter group family for the database engine.
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    * The name of the database engine.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * The version number of the database engine.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The types of logs that the database engine has available for export to Amazon CloudWatch Logs.
    */
  var ExportableLogTypes: js.UndefOr[LogTypeList] = js.native
  /**
    * A value that indicates whether the engine version supports exporting the log types specified by ExportableLogTypes to CloudWatch Logs.
    */
  var SupportsLogExportsToCloudwatchLogs: js.UndefOr[Boolean] = js.native
  /**
    * A list of engine versions that this database engine version can be upgraded to.
    */
  var ValidUpgradeTarget: js.UndefOr[ValidUpgradeTargetList] = js.native
}

object DBEngineVersion {
  @scala.inline
  def apply(
    DBEngineDescription: String = null,
    DBEngineVersionDescription: String = null,
    DBParameterGroupFamily: String = null,
    Engine: String = null,
    EngineVersion: String = null,
    ExportableLogTypes: LogTypeList = null,
    SupportsLogExportsToCloudwatchLogs: js.UndefOr[scala.Boolean] = js.undefined,
    ValidUpgradeTarget: ValidUpgradeTargetList = null
  ): DBEngineVersion = {
    val __obj = js.Dynamic.literal()
    if (DBEngineDescription != null) __obj.updateDynamic("DBEngineDescription")(DBEngineDescription.asInstanceOf[js.Any])
    if (DBEngineVersionDescription != null) __obj.updateDynamic("DBEngineVersionDescription")(DBEngineVersionDescription.asInstanceOf[js.Any])
    if (DBParameterGroupFamily != null) __obj.updateDynamic("DBParameterGroupFamily")(DBParameterGroupFamily.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (ExportableLogTypes != null) __obj.updateDynamic("ExportableLogTypes")(ExportableLogTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(SupportsLogExportsToCloudwatchLogs)) __obj.updateDynamic("SupportsLogExportsToCloudwatchLogs")(SupportsLogExportsToCloudwatchLogs.asInstanceOf[js.Any])
    if (ValidUpgradeTarget != null) __obj.updateDynamic("ValidUpgradeTarget")(ValidUpgradeTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBEngineVersion]
  }
}

