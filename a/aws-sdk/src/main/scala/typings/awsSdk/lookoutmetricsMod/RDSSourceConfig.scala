package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RDSSourceConfig extends StObject {
  
  /**
    * A string identifying the database instance.
    */
  var DBInstanceIdentifier: js.UndefOr[RDSDatabaseIdentifier] = js.undefined
  
  /**
    * The host name of the database.
    */
  var DatabaseHost: js.UndefOr[typings.awsSdk.lookoutmetricsMod.DatabaseHost] = js.undefined
  
  /**
    * The name of the RDS database.
    */
  var DatabaseName: js.UndefOr[RDSDatabaseName] = js.undefined
  
  /**
    * The port number where the database can be accessed.
    */
  var DatabasePort: js.UndefOr[typings.awsSdk.lookoutmetricsMod.DatabasePort] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role.
    */
  var RoleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Secrets Manager role.
    */
  var SecretManagerArn: js.UndefOr[PoirotSecretManagerArn] = js.undefined
  
  /**
    * The name of the table in the database.
    */
  var TableName: js.UndefOr[typings.awsSdk.lookoutmetricsMod.TableName] = js.undefined
  
  /**
    * An object containing information about the Amazon Virtual Private Cloud (VPC) configuration.
    */
  var VpcConfiguration: js.UndefOr[typings.awsSdk.lookoutmetricsMod.VpcConfiguration] = js.undefined
}
object RDSSourceConfig {
  
  inline def apply(): RDSSourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RDSSourceConfig]
  }
  
  extension [Self <: RDSSourceConfig](x: Self) {
    
    inline def setDBInstanceIdentifier(value: RDSDatabaseIdentifier): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceIdentifierUndefined: Self = StObject.set(x, "DBInstanceIdentifier", js.undefined)
    
    inline def setDatabaseHost(value: DatabaseHost): Self = StObject.set(x, "DatabaseHost", value.asInstanceOf[js.Any])
    
    inline def setDatabaseHostUndefined: Self = StObject.set(x, "DatabaseHost", js.undefined)
    
    inline def setDatabaseName(value: RDSDatabaseName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setDatabasePort(value: DatabasePort): Self = StObject.set(x, "DatabasePort", value.asInstanceOf[js.Any])
    
    inline def setDatabasePortUndefined: Self = StObject.set(x, "DatabasePort", js.undefined)
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSecretManagerArn(value: PoirotSecretManagerArn): Self = StObject.set(x, "SecretManagerArn", value.asInstanceOf[js.Any])
    
    inline def setSecretManagerArnUndefined: Self = StObject.set(x, "SecretManagerArn", js.undefined)
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    
    inline def setVpcConfiguration(value: VpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}
