package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBMDb2Settings extends StObject {
  
  /**
    * For ongoing replication (CDC), use CurrentLSN to specify a log sequence number (LSN) where you want the replication to start.
    */
  var CurrentLsn: js.UndefOr[String] = js.undefined
  
  /**
    * Database name for the endpoint.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of bytes per read, as a NUMBER value. The default is 64 KB.
    */
  var MaxKBytesPerRead: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Endpoint connection password.
    */
  var Password: js.UndefOr[SecretString] = js.undefined
  
  /**
    * Endpoint TCP port. The default value is 50000.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The full Amazon Resource Name (ARN) of the IAM role that specifies DMS as the trusted entity and grants the required permissions to access the value in SecretsManagerSecret. The role must allow the iam:PassRole action. SecretsManagerSecret has the value of the Amazon Web Services Secrets Manager secret that allows access to the Db2 LUW endpoint.   You can specify one of two sets of values for these permissions. You can specify the values for this setting and SecretsManagerSecretId. Or you can specify clear-text values for UserName, Password, ServerName, and Port. You can't specify both. For more information on creating this SecretsManagerSecret and the SecretsManagerAccessRoleArn and SecretsManagerSecretId required to access it, see Using secrets to access Database Migration Service resources in the Database Migration Service User Guide. 
    */
  var SecretsManagerAccessRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The full ARN, partial ARN, or friendly name of the SecretsManagerSecret that contains the Db2 LUW endpoint connection details.
    */
  var SecretsManagerSecretId: js.UndefOr[String] = js.undefined
  
  /**
    * Fully qualified domain name of the endpoint.
    */
  var ServerName: js.UndefOr[String] = js.undefined
  
  /**
    * Enables ongoing replication (CDC) as a BOOLEAN value. The default is true.
    */
  var SetDataCaptureChanges: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Endpoint connection user name.
    */
  var Username: js.UndefOr[String] = js.undefined
}
object IBMDb2Settings {
  
  inline def apply(): IBMDb2Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBMDb2Settings]
  }
  
  extension [Self <: IBMDb2Settings](x: Self) {
    
    inline def setCurrentLsn(value: String): Self = StObject.set(x, "CurrentLsn", value.asInstanceOf[js.Any])
    
    inline def setCurrentLsnUndefined: Self = StObject.set(x, "CurrentLsn", js.undefined)
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setMaxKBytesPerRead(value: IntegerOptional): Self = StObject.set(x, "MaxKBytesPerRead", value.asInstanceOf[js.Any])
    
    inline def setMaxKBytesPerReadUndefined: Self = StObject.set(x, "MaxKBytesPerRead", js.undefined)
    
    inline def setPassword(value: SecretString): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    inline def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setSecretsManagerAccessRoleArn(value: String): Self = StObject.set(x, "SecretsManagerAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setSecretsManagerAccessRoleArnUndefined: Self = StObject.set(x, "SecretsManagerAccessRoleArn", js.undefined)
    
    inline def setSecretsManagerSecretId(value: String): Self = StObject.set(x, "SecretsManagerSecretId", value.asInstanceOf[js.Any])
    
    inline def setSecretsManagerSecretIdUndefined: Self = StObject.set(x, "SecretsManagerSecretId", js.undefined)
    
    inline def setServerName(value: String): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    inline def setServerNameUndefined: Self = StObject.set(x, "ServerName", js.undefined)
    
    inline def setSetDataCaptureChanges(value: BooleanOptional): Self = StObject.set(x, "SetDataCaptureChanges", value.asInstanceOf[js.Any])
    
    inline def setSetDataCaptureChangesUndefined: Self = StObject.set(x, "SetDataCaptureChanges", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
