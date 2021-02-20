package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedshiftDataParameters extends StObject {
  
  /**
    * The name of the database. Required when authenticating using temporary credentials.
    */
  var Database: typings.awsSdk.eventbridgeMod.Database = js.native
  
  /**
    * The database user name. Required when authenticating using temporary credentials.
    */
  var DbUser: js.UndefOr[typings.awsSdk.eventbridgeMod.DbUser] = js.native
  
  /**
    * The name or ARN of the secret that enables access to the database. Required when authenticating using AWS Secrets Manager.
    */
  var SecretManagerArn: js.UndefOr[RedshiftSecretManagerArn] = js.native
  
  /**
    * The SQL statement text to run.
    */
  var Sql: typings.awsSdk.eventbridgeMod.Sql = js.native
  
  /**
    * The name of the SQL statement. You can name the SQL statement when you create it to identify the query.
    */
  var StatementName: js.UndefOr[typings.awsSdk.eventbridgeMod.StatementName] = js.native
  
  /**
    * Indicates whether to send an event back to EventBridge after the SQL statement runs.
    */
  var WithEvent: js.UndefOr[Boolean] = js.native
}
object RedshiftDataParameters {
  
  @scala.inline
  def apply(Database: Database, Sql: Sql): RedshiftDataParameters = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Sql = Sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDataParameters]
  }
  
  @scala.inline
  implicit class RedshiftDataParametersMutableBuilder[Self <: RedshiftDataParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabase(value: Database): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbUser(value: DbUser): Self = StObject.set(x, "DbUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbUserUndefined: Self = StObject.set(x, "DbUser", js.undefined)
    
    @scala.inline
    def setSecretManagerArn(value: RedshiftSecretManagerArn): Self = StObject.set(x, "SecretManagerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretManagerArnUndefined: Self = StObject.set(x, "SecretManagerArn", js.undefined)
    
    @scala.inline
    def setSql(value: Sql): Self = StObject.set(x, "Sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementName(value: StatementName): Self = StObject.set(x, "StatementName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementNameUndefined: Self = StObject.set(x, "StatementName", js.undefined)
    
    @scala.inline
    def setWithEvent(value: Boolean): Self = StObject.set(x, "WithEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithEventUndefined: Self = StObject.set(x, "WithEvent", js.undefined)
  }
}
