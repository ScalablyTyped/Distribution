package typings.awsSdk.redshiftdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteStatementInput extends js.Object {
  
  /**
    * The cluster identifier. This parameter is required when authenticating using either AWS Secrets Manager or temporary credentials. 
    */
  var ClusterIdentifier: Location = js.native
  
  /**
    * The name of the database. This parameter is required when authenticating using temporary credentials.
    */
  var Database: js.UndefOr[String] = js.native
  
  /**
    * The database user name. This parameter is required when authenticating using temporary credentials. 
    */
  var DbUser: js.UndefOr[String] = js.native
  
  /**
    * The name or ARN of the secret that enables access to the database. This parameter is required when authenticating using AWS Secrets Manager. 
    */
  var SecretArn: js.UndefOr[typings.awsSdk.redshiftdataMod.SecretArn] = js.native
  
  /**
    * The SQL statement text to run. 
    */
  var Sql: StatementString = js.native
  
  /**
    * The name of the SQL statement. You can name the SQL statement when you create it to identify the query. 
    */
  var StatementName: js.UndefOr[StatementNameString] = js.native
  
  /**
    * A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL statement runs. 
    */
  var WithEvent: js.UndefOr[Boolean] = js.native
}
object ExecuteStatementInput {
  
  @scala.inline
  def apply(ClusterIdentifier: Location, Sql: StatementString): ExecuteStatementInput = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], Sql = Sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteStatementInput]
  }
  
  @scala.inline
  implicit class ExecuteStatementInputOps[Self <: ExecuteStatementInput] (val x: Self) extends AnyVal {
    
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
    def setClusterIdentifier(value: Location): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSql(value: StatementString): Self = this.set("Sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabase(value: String): Self = this.set("Database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("Database", js.undefined)
    
    @scala.inline
    def setDbUser(value: String): Self = this.set("DbUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbUser: Self = this.set("DbUser", js.undefined)
    
    @scala.inline
    def setSecretArn(value: SecretArn): Self = this.set("SecretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretArn: Self = this.set("SecretArn", js.undefined)
    
    @scala.inline
    def setStatementName(value: StatementNameString): Self = this.set("StatementName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatementName: Self = this.set("StatementName", js.undefined)
    
    @scala.inline
    def setWithEvent(value: Boolean): Self = this.set("WithEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithEvent: Self = this.set("WithEvent", js.undefined)
  }
}
