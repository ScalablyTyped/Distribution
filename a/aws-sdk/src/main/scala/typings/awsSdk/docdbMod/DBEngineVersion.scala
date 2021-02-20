package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBEngineVersion extends StObject {
  
  /**
    * The description of the database engine.
    */
  var DBEngineDescription: js.UndefOr[String] = js.native
  
  /**
    * The description of the database engine version.
    */
  var DBEngineVersionDescription: js.UndefOr[String] = js.native
  
  /**
    * The name of the parameter group family for the database engine.
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
    def setSupportsLogExportsToCloudwatchLogs(value: Boolean): Self = StObject.set(x, "SupportsLogExportsToCloudwatchLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsLogExportsToCloudwatchLogsUndefined: Self = StObject.set(x, "SupportsLogExportsToCloudwatchLogs", js.undefined)
    
    @scala.inline
    def setValidUpgradeTarget(value: ValidUpgradeTargetList): Self = StObject.set(x, "ValidUpgradeTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUpgradeTargetUndefined: Self = StObject.set(x, "ValidUpgradeTarget", js.undefined)
    
    @scala.inline
    def setValidUpgradeTargetVarargs(value: UpgradeTarget*): Self = StObject.set(x, "ValidUpgradeTarget", js.Array(value :_*))
  }
}
