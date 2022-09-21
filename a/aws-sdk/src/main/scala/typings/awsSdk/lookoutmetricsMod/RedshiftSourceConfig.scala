package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedshiftSourceConfig extends StObject {
  
  /**
    * A string identifying the Redshift cluster.
    */
  var ClusterIdentifier: js.UndefOr[RedshiftClusterIdentifier] = js.undefined
  
  /**
    * The name of the database host.
    */
  var DatabaseHost: js.UndefOr[typings.awsSdk.lookoutmetricsMod.DatabaseHost] = js.undefined
  
  /**
    * The Redshift database name.
    */
  var DatabaseName: js.UndefOr[RedshiftDatabaseName] = js.undefined
  
  /**
    * The port number where the database can be accessed.
    */
  var DatabasePort: js.UndefOr[typings.awsSdk.lookoutmetricsMod.DatabasePort] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role providing access to the database.
    */
  var RoleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Secrets Manager role.
    */
  var SecretManagerArn: js.UndefOr[PoirotSecretManagerArn] = js.undefined
  
  /**
    * The table name of the Redshift database.
    */
  var TableName: js.UndefOr[typings.awsSdk.lookoutmetricsMod.TableName] = js.undefined
  
  /**
    * Contains information about the Amazon Virtual Private Cloud (VPC) configuration.
    */
  var VpcConfiguration: js.UndefOr[typings.awsSdk.lookoutmetricsMod.VpcConfiguration] = js.undefined
}
object RedshiftSourceConfig {
  
  inline def apply(): RedshiftSourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedshiftSourceConfig]
  }
  
  extension [Self <: RedshiftSourceConfig](x: Self) {
    
    inline def setClusterIdentifier(value: RedshiftClusterIdentifier): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    inline def setDatabaseHost(value: DatabaseHost): Self = StObject.set(x, "DatabaseHost", value.asInstanceOf[js.Any])
    
    inline def setDatabaseHostUndefined: Self = StObject.set(x, "DatabaseHost", js.undefined)
    
    inline def setDatabaseName(value: RedshiftDatabaseName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
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
