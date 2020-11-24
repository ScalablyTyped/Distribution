package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedshiftDataParameters extends js.Object {
  
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
  implicit class RedshiftDataParametersOps[Self <: RedshiftDataParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDatabase(value: Database): Self = this.set("Database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSql(value: Sql): Self = this.set("Sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbUser(value: DbUser): Self = this.set("DbUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbUser: Self = this.set("DbUser", js.undefined)
    
    @scala.inline
    def setSecretManagerArn(value: RedshiftSecretManagerArn): Self = this.set("SecretManagerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretManagerArn: Self = this.set("SecretManagerArn", js.undefined)
    
    @scala.inline
    def setStatementName(value: StatementName): Self = this.set("StatementName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatementName: Self = this.set("StatementName", js.undefined)
    
    @scala.inline
    def setWithEvent(value: Boolean): Self = this.set("WithEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithEvent: Self = this.set("WithEvent", js.undefined)
  }
}
