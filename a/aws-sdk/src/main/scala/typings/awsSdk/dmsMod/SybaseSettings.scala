package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SybaseSettings extends StObject {
  
  /**
    * Database name for the endpoint.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * Endpoint connection password.
    */
  var Password: js.UndefOr[SecretString] = js.undefined
  
  /**
    * Endpoint TCP port. The default is 5000.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The full Amazon Resource Name (ARN) of the IAM role that specifies DMS as the trusted entity and grants the required permissions to access the value in SecretsManagerSecret. The role must allow the iam:PassRole action. SecretsManagerSecret has the value of the Amazon Web Services Secrets Manager secret that allows access to the SAP ASE endpoint.  You can specify one of two sets of values for these permissions. You can specify the values for this setting and SecretsManagerSecretId. Or you can specify clear-text values for UserName, Password, ServerName, and Port. You can't specify both. For more information on creating this SecretsManagerSecret and the SecretsManagerAccessRoleArn and SecretsManagerSecretId required to access it, see Using secrets to access Database Migration Service resources in the Database Migration Service User Guide. 
    */
  var SecretsManagerAccessRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The full ARN, partial ARN, or friendly name of the SecretsManagerSecret that contains the SAP SAE endpoint connection details.
    */
  var SecretsManagerSecretId: js.UndefOr[String] = js.undefined
  
  /**
    * Fully qualified domain name of the endpoint.
    */
  var ServerName: js.UndefOr[String] = js.undefined
  
  /**
    * Endpoint connection user name.
    */
  var Username: js.UndefOr[String] = js.undefined
}
object SybaseSettings {
  
  inline def apply(): SybaseSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SybaseSettings]
  }
  
  extension [Self <: SybaseSettings](x: Self) {
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
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
    
    inline def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
