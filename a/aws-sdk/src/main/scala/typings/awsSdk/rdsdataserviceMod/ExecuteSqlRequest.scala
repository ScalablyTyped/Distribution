package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteSqlRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the secret that enables access to the DB cluster.
    */
  var awsSecretStoreArn: Arn = js.native
  
  /**
    * The name of the database.
    */
  var database: js.UndefOr[DbName] = js.native
  
  /**
    * The ARN of the Aurora Serverless DB cluster.
    */
  var dbClusterOrInstanceArn: Arn = js.native
  
  /**
    * The name of the database schema.
    */
  var schema: js.UndefOr[DbName] = js.native
  
  /**
    * One or more SQL statements to run on the DB cluster. You can separate SQL statements from each other with a semicolon (;). Any valid SQL statement is permitted, including data definition, data manipulation, and commit statements. 
    */
  var sqlStatements: SqlStatement = js.native
}
object ExecuteSqlRequest {
  
  @scala.inline
  def apply(awsSecretStoreArn: Arn, dbClusterOrInstanceArn: Arn, sqlStatements: SqlStatement): ExecuteSqlRequest = {
    val __obj = js.Dynamic.literal(awsSecretStoreArn = awsSecretStoreArn.asInstanceOf[js.Any], dbClusterOrInstanceArn = dbClusterOrInstanceArn.asInstanceOf[js.Any], sqlStatements = sqlStatements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteSqlRequest]
  }
  
  @scala.inline
  implicit class ExecuteSqlRequestOps[Self <: ExecuteSqlRequest] (val x: Self) extends AnyVal {
    
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
    def setAwsSecretStoreArn(value: Arn): Self = this.set("awsSecretStoreArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbClusterOrInstanceArn(value: Arn): Self = this.set("dbClusterOrInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlStatements(value: SqlStatement): Self = this.set("sqlStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabase(value: DbName): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    
    @scala.inline
    def setSchema(value: DbName): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
}
