package typings.awsSdk.rdsMod

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
    *  The default character set for new instances of this engine version, if the CharacterSetName parameter of the CreateDBInstance API isn't specified. 
    */
  var DefaultCharacterSet: js.UndefOr[CharacterSet] = js.native
  /**
    * The name of the database engine.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * The version number of the database engine.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The types of logs that the database engine has available for export to CloudWatch Logs.
    */
  var ExportableLogTypes: js.UndefOr[LogTypeList] = js.native
  /**
    * The status of the DB engine version, either available or deprecated.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    *  A list of the character sets supported by this engine for the CharacterSetName parameter of the CreateDBInstance action. 
    */
  var SupportedCharacterSets: js.UndefOr[SupportedCharacterSetsList] = js.native
  /**
    * A list of the supported DB engine modes.   global engine mode only applies for global database clusters created with Aurora MySQL version 5.6.10a. For higher Aurora MySQL versions, the clusters in a global database use provisioned engine mode.  
    */
  var SupportedEngineModes: js.UndefOr[EngineModeList] = js.native
  /**
    *  A list of features supported by the DB engine. Supported feature names include the following.    s3Import  
    */
  var SupportedFeatureNames: js.UndefOr[FeatureNameList] = js.native
  /**
    * A list of the time zones supported by this engine for the Timezone parameter of the CreateDBInstance action. 
    */
  var SupportedTimezones: js.UndefOr[SupportedTimezonesList] = js.native
  /**
    * A value that indicates whether you can use Aurora global databases with a specific DB engine version.
    */
  var SupportsGlobalDatabases: js.UndefOr[Boolean] = js.native
  /**
    * A value that indicates whether the engine version supports exporting the log types specified by ExportableLogTypes to CloudWatch Logs.
    */
  var SupportsLogExportsToCloudwatchLogs: js.UndefOr[Boolean] = js.native
  /**
    * A value that indicates whether you can use Aurora parallel query with a specific DB engine version.
    */
  var SupportsParallelQuery: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the database engine version supports read replicas.
    */
  var SupportsReadReplica: js.UndefOr[Boolean] = js.native
  /**
    * A list of engine versions that this database engine version can be upgraded to.
    */
  var ValidUpgradeTarget: js.UndefOr[ValidUpgradeTargetList] = js.native
}

object DBEngineVersion {
  @scala.inline
  def apply(): DBEngineVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBEngineVersion]
  }
  @scala.inline
  implicit class DBEngineVersionOps[Self <: DBEngineVersion] (val x: Self) extends AnyVal {
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
    def setDBEngineDescription(value: String): Self = this.set("DBEngineDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBEngineDescription: Self = this.set("DBEngineDescription", js.undefined)
    @scala.inline
    def setDBEngineVersionDescription(value: String): Self = this.set("DBEngineVersionDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBEngineVersionDescription: Self = this.set("DBEngineVersionDescription", js.undefined)
    @scala.inline
    def setDBParameterGroupFamily(value: String): Self = this.set("DBParameterGroupFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBParameterGroupFamily: Self = this.set("DBParameterGroupFamily", js.undefined)
    @scala.inline
    def setDefaultCharacterSet(value: CharacterSet): Self = this.set("DefaultCharacterSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultCharacterSet: Self = this.set("DefaultCharacterSet", js.undefined)
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    @scala.inline
    def setExportableLogTypesVarargs(value: String*): Self = this.set("ExportableLogTypes", js.Array(value :_*))
    @scala.inline
    def setExportableLogTypes(value: LogTypeList): Self = this.set("ExportableLogTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportableLogTypes: Self = this.set("ExportableLogTypes", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setSupportedCharacterSetsVarargs(value: CharacterSet*): Self = this.set("SupportedCharacterSets", js.Array(value :_*))
    @scala.inline
    def setSupportedCharacterSets(value: SupportedCharacterSetsList): Self = this.set("SupportedCharacterSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedCharacterSets: Self = this.set("SupportedCharacterSets", js.undefined)
    @scala.inline
    def setSupportedEngineModesVarargs(value: String*): Self = this.set("SupportedEngineModes", js.Array(value :_*))
    @scala.inline
    def setSupportedEngineModes(value: EngineModeList): Self = this.set("SupportedEngineModes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedEngineModes: Self = this.set("SupportedEngineModes", js.undefined)
    @scala.inline
    def setSupportedFeatureNamesVarargs(value: String*): Self = this.set("SupportedFeatureNames", js.Array(value :_*))
    @scala.inline
    def setSupportedFeatureNames(value: FeatureNameList): Self = this.set("SupportedFeatureNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedFeatureNames: Self = this.set("SupportedFeatureNames", js.undefined)
    @scala.inline
    def setSupportedTimezonesVarargs(value: Timezone*): Self = this.set("SupportedTimezones", js.Array(value :_*))
    @scala.inline
    def setSupportedTimezones(value: SupportedTimezonesList): Self = this.set("SupportedTimezones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedTimezones: Self = this.set("SupportedTimezones", js.undefined)
    @scala.inline
    def setSupportsGlobalDatabases(value: Boolean): Self = this.set("SupportsGlobalDatabases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsGlobalDatabases: Self = this.set("SupportsGlobalDatabases", js.undefined)
    @scala.inline
    def setSupportsLogExportsToCloudwatchLogs(value: Boolean): Self = this.set("SupportsLogExportsToCloudwatchLogs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsLogExportsToCloudwatchLogs: Self = this.set("SupportsLogExportsToCloudwatchLogs", js.undefined)
    @scala.inline
    def setSupportsParallelQuery(value: Boolean): Self = this.set("SupportsParallelQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsParallelQuery: Self = this.set("SupportsParallelQuery", js.undefined)
    @scala.inline
    def setSupportsReadReplica(value: Boolean): Self = this.set("SupportsReadReplica", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsReadReplica: Self = this.set("SupportsReadReplica", js.undefined)
    @scala.inline
    def setValidUpgradeTargetVarargs(value: UpgradeTarget*): Self = this.set("ValidUpgradeTarget", js.Array(value :_*))
    @scala.inline
    def setValidUpgradeTarget(value: ValidUpgradeTargetList): Self = this.set("ValidUpgradeTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidUpgradeTarget: Self = this.set("ValidUpgradeTarget", js.undefined)
  }
  
}

