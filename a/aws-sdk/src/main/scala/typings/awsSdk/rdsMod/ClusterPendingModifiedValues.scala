package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterPendingModifiedValues extends StObject {
  
  /**
    * The DBClusterIdentifier value for the DB cluster.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether mapping of Amazon Web Services Identity and Access Management (IAM) accounts to database accounts is enabled.
    */
  var IAMDatabaseAuthenticationEnabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The master credentials for the DB cluster.
    */
  var MasterUserPassword: js.UndefOr[String] = js.undefined
  
  var PendingCloudwatchLogsExports: js.UndefOr[typings.awsSdk.rdsMod.PendingCloudwatchLogsExports] = js.undefined
}
object ClusterPendingModifiedValues {
  
  inline def apply(): ClusterPendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterPendingModifiedValues]
  }
  
  extension [Self <: ClusterPendingModifiedValues](x: Self) {
    
    inline def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBClusterIdentifierUndefined: Self = StObject.set(x, "DBClusterIdentifier", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setIAMDatabaseAuthenticationEnabled(value: BooleanOptional): Self = StObject.set(x, "IAMDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    
    inline def setIAMDatabaseAuthenticationEnabledUndefined: Self = StObject.set(x, "IAMDatabaseAuthenticationEnabled", js.undefined)
    
    inline def setMasterUserPassword(value: String): Self = StObject.set(x, "MasterUserPassword", value.asInstanceOf[js.Any])
    
    inline def setMasterUserPasswordUndefined: Self = StObject.set(x, "MasterUserPassword", js.undefined)
    
    inline def setPendingCloudwatchLogsExports(value: PendingCloudwatchLogsExports): Self = StObject.set(x, "PendingCloudwatchLogsExports", value.asInstanceOf[js.Any])
    
    inline def setPendingCloudwatchLogsExportsUndefined: Self = StObject.set(x, "PendingCloudwatchLogsExports", js.undefined)
  }
}
