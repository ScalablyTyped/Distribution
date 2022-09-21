package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedshiftDataParameters extends StObject {
  
  /**
    * The name of the database. Required when authenticating using temporary credentials.
    */
  var Database: typings.awsSdk.cloudwatcheventsMod.Database
  
  /**
    * The database user name. Required when authenticating using temporary credentials.
    */
  var DbUser: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.DbUser] = js.undefined
  
  /**
    * The name or ARN of the secret that enables access to the database. Required when authenticating using Amazon Web Services Secrets Manager.
    */
  var SecretManagerArn: js.UndefOr[RedshiftSecretManagerArn] = js.undefined
  
  /**
    * The SQL statement text to run.
    */
  var Sql: typings.awsSdk.cloudwatcheventsMod.Sql
  
  /**
    * The name of the SQL statement. You can name the SQL statement when you create it to identify the query.
    */
  var StatementName: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.StatementName] = js.undefined
  
  /**
    * Indicates whether to send an event back to EventBridge after the SQL statement runs.
    */
  var WithEvent: js.UndefOr[Boolean] = js.undefined
}
object RedshiftDataParameters {
  
  inline def apply(Database: Database, Sql: Sql): RedshiftDataParameters = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Sql = Sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDataParameters]
  }
  
  extension [Self <: RedshiftDataParameters](x: Self) {
    
    inline def setDatabase(value: Database): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setDbUser(value: DbUser): Self = StObject.set(x, "DbUser", value.asInstanceOf[js.Any])
    
    inline def setDbUserUndefined: Self = StObject.set(x, "DbUser", js.undefined)
    
    inline def setSecretManagerArn(value: RedshiftSecretManagerArn): Self = StObject.set(x, "SecretManagerArn", value.asInstanceOf[js.Any])
    
    inline def setSecretManagerArnUndefined: Self = StObject.set(x, "SecretManagerArn", js.undefined)
    
    inline def setSql(value: Sql): Self = StObject.set(x, "Sql", value.asInstanceOf[js.Any])
    
    inline def setStatementName(value: StatementName): Self = StObject.set(x, "StatementName", value.asInstanceOf[js.Any])
    
    inline def setStatementNameUndefined: Self = StObject.set(x, "StatementName", js.undefined)
    
    inline def setWithEvent(value: Boolean): Self = StObject.set(x, "WithEvent", value.asInstanceOf[js.Any])
    
    inline def setWithEventUndefined: Self = StObject.set(x, "WithEvent", js.undefined)
  }
}
