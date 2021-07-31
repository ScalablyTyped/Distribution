package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBEngineVersion extends StObject {
  
  /**
    * The description of the database engine.
    */
  var DBEngineDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the database engine version.
    */
  var DBEngineVersionDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the DB parameter group family for the database engine.
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.undefined
  
  /**
    *  The default character set for new instances of this engine version, if the CharacterSetName parameter of the CreateDBInstance API isn't specified. 
    */
  var DefaultCharacterSet: js.UndefOr[CharacterSet] = js.undefined
  
  /**
    * The name of the database engine.
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * The version number of the database engine.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The types of logs that the database engine has available for export to CloudWatch Logs.
    */
  var ExportableLogTypes: js.UndefOr[LogTypeList] = js.undefined
  
  /**
    * The status of the DB engine version, either available or deprecated.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * A list of the character sets supported by this engine for the CharacterSetName parameter of the CreateDBInstance operation. 
    */
  var SupportedCharacterSets: js.UndefOr[SupportedCharacterSetsList] = js.undefined
  
  /**
    * A list of the supported DB engine modes.
    */
  var SupportedEngineModes: js.UndefOr[EngineModeList] = js.undefined
  
  /**
    *  A list of features supported by the DB engine. Supported feature names include the following.    s3Import  
    */
  var SupportedFeatureNames: js.UndefOr[FeatureNameList] = js.undefined
  
  /**
    * A list of the character sets supported by the Oracle DB engine for the NcharCharacterSetName parameter of the CreateDBInstance operation. 
    */
  var SupportedNcharCharacterSets: js.UndefOr[SupportedCharacterSetsList] = js.undefined
  
  /**
    * A list of the time zones supported by this engine for the Timezone parameter of the CreateDBInstance action. 
    */
  var SupportedTimezones: js.UndefOr[SupportedTimezonesList] = js.undefined
  
  /**
    * A value that indicates whether you can use Aurora global databases with a specific DB engine version.
    */
  var SupportsGlobalDatabases: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that indicates whether the engine version supports exporting the log types specified by ExportableLogTypes to CloudWatch Logs.
    */
  var SupportsLogExportsToCloudwatchLogs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that indicates whether you can use Aurora parallel query with a specific DB engine version.
    */
  var SupportsParallelQuery: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the database engine version supports read replicas.
    */
  var SupportsReadReplica: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of engine versions that this database engine version can be upgraded to.
    */
  var ValidUpgradeTarget: js.UndefOr[ValidUpgradeTargetList] = js.undefined
}
object DBEngineVersion {
  
  @scala.inline
  def apply(): DBEngineVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBEngineVersion]
  }
  
  @scala.inline
  implicit class DBEngineVersionMutableBuilder[Self <: DBEngineVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBEngineDescription(value: String): Self = StObject.set(x, "DBEngineDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBEngineDescriptionUndefined: Self = StObject.set(x, "DBEngineDescription", js.undefined)
    
    @scala.inline
    def setDBEngineVersionDescription(value: String): Self = StObject.set(x, "DBEngineVersionDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBEngineVersionDescriptionUndefined: Self = StObject.set(x, "DBEngineVersionDescription", js.undefined)
    
    @scala.inline
    def setDBParameterGroupFamily(value: String): Self = StObject.set(x, "DBParameterGroupFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBParameterGroupFamilyUndefined: Self = StObject.set(x, "DBParameterGroupFamily", js.undefined)
    
    @scala.inline
    def setDefaultCharacterSet(value: CharacterSet): Self = StObject.set(x, "DefaultCharacterSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCharacterSetUndefined: Self = StObject.set(x, "DefaultCharacterSet", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setExportableLogTypes(value: LogTypeList): Self = StObject.set(x, "ExportableLogTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportableLogTypesUndefined: Self = StObject.set(x, "ExportableLogTypes", js.undefined)
    
    @scala.inline
    def setExportableLogTypesVarargs(value: String*): Self = StObject.set(x, "ExportableLogTypes", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setSupportedCharacterSets(value: SupportedCharacterSetsList): Self = StObject.set(x, "SupportedCharacterSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedCharacterSetsUndefined: Self = StObject.set(x, "SupportedCharacterSets", js.undefined)
    
    @scala.inline
    def setSupportedCharacterSetsVarargs(value: CharacterSet*): Self = StObject.set(x, "SupportedCharacterSets", js.Array(value :_*))
    
    @scala.inline
    def setSupportedEngineModes(value: EngineModeList): Self = StObject.set(x, "SupportedEngineModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedEngineModesUndefined: Self = StObject.set(x, "SupportedEngineModes", js.undefined)
    
    @scala.inline
    def setSupportedEngineModesVarargs(value: String*): Self = StObject.set(x, "SupportedEngineModes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedFeatureNames(value: FeatureNameList): Self = StObject.set(x, "SupportedFeatureNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedFeatureNamesUndefined: Self = StObject.set(x, "SupportedFeatureNames", js.undefined)
    
    @scala.inline
    def setSupportedFeatureNamesVarargs(value: String*): Self = StObject.set(x, "SupportedFeatureNames", js.Array(value :_*))
    
    @scala.inline
    def setSupportedNcharCharacterSets(value: SupportedCharacterSetsList): Self = StObject.set(x, "SupportedNcharCharacterSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedNcharCharacterSetsUndefined: Self = StObject.set(x, "SupportedNcharCharacterSets", js.undefined)
    
    @scala.inline
    def setSupportedNcharCharacterSetsVarargs(value: CharacterSet*): Self = StObject.set(x, "SupportedNcharCharacterSets", js.Array(value :_*))
    
    @scala.inline
    def setSupportedTimezones(value: SupportedTimezonesList): Self = StObject.set(x, "SupportedTimezones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedTimezonesUndefined: Self = StObject.set(x, "SupportedTimezones", js.undefined)
    
    @scala.inline
    def setSupportedTimezonesVarargs(value: Timezone*): Self = StObject.set(x, "SupportedTimezones", js.Array(value :_*))
    
    @scala.inline
    def setSupportsGlobalDatabases(value: Boolean): Self = StObject.set(x, "SupportsGlobalDatabases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsGlobalDatabasesUndefined: Self = StObject.set(x, "SupportsGlobalDatabases", js.undefined)
    
    @scala.inline
    def setSupportsLogExportsToCloudwatchLogs(value: Boolean): Self = StObject.set(x, "SupportsLogExportsToCloudwatchLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsLogExportsToCloudwatchLogsUndefined: Self = StObject.set(x, "SupportsLogExportsToCloudwatchLogs", js.undefined)
    
    @scala.inline
    def setSupportsParallelQuery(value: Boolean): Self = StObject.set(x, "SupportsParallelQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsParallelQueryUndefined: Self = StObject.set(x, "SupportsParallelQuery", js.undefined)
    
    @scala.inline
    def setSupportsReadReplica(value: Boolean): Self = StObject.set(x, "SupportsReadReplica", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsReadReplicaUndefined: Self = StObject.set(x, "SupportsReadReplica", js.undefined)
    
    @scala.inline
    def setValidUpgradeTarget(value: ValidUpgradeTargetList): Self = StObject.set(x, "ValidUpgradeTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUpgradeTargetUndefined: Self = StObject.set(x, "ValidUpgradeTarget", js.undefined)
    
    @scala.inline
    def setValidUpgradeTargetVarargs(value: UpgradeTarget*): Self = StObject.set(x, "ValidUpgradeTarget", js.Array(value :_*))
  }
}
