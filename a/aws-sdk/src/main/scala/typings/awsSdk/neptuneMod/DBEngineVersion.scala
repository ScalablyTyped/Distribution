package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    *  (Not supported by Neptune) 
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
    *  (Not supported by Neptune) 
    */
  var SupportedCharacterSets: js.UndefOr[SupportedCharacterSetsList] = js.native
  
  /**
    * A list of the time zones supported by this engine for the Timezone parameter of the CreateDBInstance action.
    */
  var SupportedTimezones: js.UndefOr[SupportedTimezonesList] = js.native
  
  /**
    * A value that indicates whether the engine version supports exporting the log types specified by ExportableLogTypes to CloudWatch Logs.
    */
  var SupportsLogExportsToCloudwatchLogs: js.UndefOr[Boolean] = js.native
  
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
    def setSupportedCharacterSetsVarargs(value: CharacterSet*): Self = this.set("SupportedCharacterSets", js.Array(value :_*))
    
    @scala.inline
    def setSupportedCharacterSets(value: SupportedCharacterSetsList): Self = this.set("SupportedCharacterSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedCharacterSets: Self = this.set("SupportedCharacterSets", js.undefined)
    
    @scala.inline
    def setSupportedTimezonesVarargs(value: Timezone*): Self = this.set("SupportedTimezones", js.Array(value :_*))
    
    @scala.inline
    def setSupportedTimezones(value: SupportedTimezonesList): Self = this.set("SupportedTimezones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedTimezones: Self = this.set("SupportedTimezones", js.undefined)
    
    @scala.inline
    def setSupportsLogExportsToCloudwatchLogs(value: Boolean): Self = this.set("SupportsLogExportsToCloudwatchLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsLogExportsToCloudwatchLogs: Self = this.set("SupportsLogExportsToCloudwatchLogs", js.undefined)
    
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
