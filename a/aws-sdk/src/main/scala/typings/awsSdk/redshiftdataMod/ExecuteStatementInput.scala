package typings.awsSdk.redshiftdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteStatementInput extends StObject {
  
  /**
    * The cluster identifier. This parameter is required when authenticating using either AWS Secrets Manager or temporary credentials. 
    */
  var ClusterIdentifier: Location
  
  /**
    * The name of the database. This parameter is required when authenticating using temporary credentials.
    */
  var Database: js.UndefOr[String] = js.undefined
  
  /**
    * The database user name. This parameter is required when authenticating using temporary credentials. 
    */
  var DbUser: js.UndefOr[String] = js.undefined
  
  /**
    * The name or ARN of the secret that enables access to the database. This parameter is required when authenticating using AWS Secrets Manager. 
    */
  var SecretArn: js.UndefOr[typings.awsSdk.redshiftdataMod.SecretArn] = js.undefined
  
  /**
    * The SQL statement text to run. 
    */
  var Sql: StatementString
  
  /**
    * The name of the SQL statement. You can name the SQL statement when you create it to identify the query. 
    */
  var StatementName: js.UndefOr[StatementNameString] = js.undefined
  
  /**
    * A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL statement runs. 
    */
  var WithEvent: js.UndefOr[Boolean] = js.undefined
}
object ExecuteStatementInput {
  
  inline def apply(ClusterIdentifier: Location, Sql: StatementString): ExecuteStatementInput = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], Sql = Sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteStatementInput]
  }
  
  extension [Self <: ExecuteStatementInput](x: Self) {
    
    inline def setClusterIdentifier(value: Location): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDatabase(value: String): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "Database", js.undefined)
    
    inline def setDbUser(value: String): Self = StObject.set(x, "DbUser", value.asInstanceOf[js.Any])
    
    inline def setDbUserUndefined: Self = StObject.set(x, "DbUser", js.undefined)
    
    inline def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setSecretArnUndefined: Self = StObject.set(x, "SecretArn", js.undefined)
    
    inline def setSql(value: StatementString): Self = StObject.set(x, "Sql", value.asInstanceOf[js.Any])
    
    inline def setStatementName(value: StatementNameString): Self = StObject.set(x, "StatementName", value.asInstanceOf[js.Any])
    
    inline def setStatementNameUndefined: Self = StObject.set(x, "StatementName", js.undefined)
    
    inline def setWithEvent(value: Boolean): Self = StObject.set(x, "WithEvent", value.asInstanceOf[js.Any])
    
    inline def setWithEventUndefined: Self = StObject.set(x, "WithEvent", js.undefined)
  }
}
