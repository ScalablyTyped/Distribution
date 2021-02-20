package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionConfiguration extends StObject {
  
  /**
    * The name of the host for the database. Can be either a string (host.subdomain.domain.tld) or an IPv4 or IPv6 address.
    */
  var DatabaseHost: typings.awsSdk.kendraMod.DatabaseHost = js.native
  
  /**
    * The name of the database containing the document data.
    */
  var DatabaseName: typings.awsSdk.kendraMod.DatabaseName = js.native
  
  /**
    * The port that the database uses for connections.
    */
  var DatabasePort: typings.awsSdk.kendraMod.DatabasePort = js.native
  
  /**
    * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets Manager. The credentials should be a user/password pair. For more information, see Using a Database Data Source. For more information about AWS Secrets Manager, see  What Is AWS Secrets Manager  in the AWS Secrets Manager user guide.
    */
  var SecretArn: typings.awsSdk.kendraMod.SecretArn = js.native
  
  /**
    * The name of the table that contains the document data.
    */
  var TableName: typings.awsSdk.kendraMod.TableName = js.native
}
object ConnectionConfiguration {
  
  @scala.inline
  def apply(
    DatabaseHost: DatabaseHost,
    DatabaseName: DatabaseName,
    DatabasePort: DatabasePort,
    SecretArn: SecretArn,
    TableName: TableName
  ): ConnectionConfiguration = {
    val __obj = js.Dynamic.literal(DatabaseHost = DatabaseHost.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any], DatabasePort = DatabasePort.asInstanceOf[js.Any], SecretArn = SecretArn.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionConfiguration]
  }
  
  @scala.inline
  implicit class ConnectionConfigurationMutableBuilder[Self <: ConnectionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseHost(value: DatabaseHost): Self = StObject.set(x, "DatabaseHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseName(value: DatabaseName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabasePort(value: DatabasePort): Self = StObject.set(x, "DatabasePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
