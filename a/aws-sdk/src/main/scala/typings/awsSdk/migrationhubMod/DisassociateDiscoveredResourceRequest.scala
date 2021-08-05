package typings.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateDiscoveredResourceRequest extends StObject {
  
  /**
    * ConfigurationId of the Application Discovery Service resource to be disassociated.
    */
  var ConfigurationId: typings.awsSdk.migrationhubMod.ConfigurationId
  
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typings.awsSdk.migrationhubMod.DryRun] = js.undefined
  
  /**
    * The identifier given to the MigrationTask. Do not store personal data in this field. 
    */
  var MigrationTaskName: typings.awsSdk.migrationhubMod.MigrationTaskName
  
  /**
    * The name of the ProgressUpdateStream.
    */
  var ProgressUpdateStream: typings.awsSdk.migrationhubMod.ProgressUpdateStream
}
object DisassociateDiscoveredResourceRequest {
  
  inline def apply(
    ConfigurationId: ConfigurationId,
    MigrationTaskName: MigrationTaskName,
    ProgressUpdateStream: ProgressUpdateStream
  ): DisassociateDiscoveredResourceRequest = {
    val __obj = js.Dynamic.literal(ConfigurationId = ConfigurationId.asInstanceOf[js.Any], MigrationTaskName = MigrationTaskName.asInstanceOf[js.Any], ProgressUpdateStream = ProgressUpdateStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateDiscoveredResourceRequest]
  }
  
  extension [Self <: DisassociateDiscoveredResourceRequest](x: Self) {
    
    inline def setConfigurationId(value: ConfigurationId): Self = StObject.set(x, "ConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: DryRun): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setMigrationTaskName(value: MigrationTaskName): Self = StObject.set(x, "MigrationTaskName", value.asInstanceOf[js.Any])
    
    inline def setProgressUpdateStream(value: ProgressUpdateStream): Self = StObject.set(x, "ProgressUpdateStream", value.asInstanceOf[js.Any])
  }
}
