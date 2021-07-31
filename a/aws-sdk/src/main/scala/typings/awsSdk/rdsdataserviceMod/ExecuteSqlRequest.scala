package typings.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteSqlRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the secret that enables access to the DB cluster.
    */
  var awsSecretStoreArn: Arn
  
  /**
    * The name of the database.
    */
  var database: js.UndefOr[DbName] = js.undefined
  
  /**
    * The ARN of the Aurora Serverless DB cluster.
    */
  var dbClusterOrInstanceArn: Arn
  
  /**
    * The name of the database schema.
    */
  var schema: js.UndefOr[DbName] = js.undefined
  
  /**
    * One or more SQL statements to run on the DB cluster. You can separate SQL statements from each other with a semicolon (;). Any valid SQL statement is permitted, including data definition, data manipulation, and commit statements. 
    */
  var sqlStatements: SqlStatement
}
object ExecuteSqlRequest {
  
  @scala.inline
  def apply(awsSecretStoreArn: Arn, dbClusterOrInstanceArn: Arn, sqlStatements: SqlStatement): ExecuteSqlRequest = {
    val __obj = js.Dynamic.literal(awsSecretStoreArn = awsSecretStoreArn.asInstanceOf[js.Any], dbClusterOrInstanceArn = dbClusterOrInstanceArn.asInstanceOf[js.Any], sqlStatements = sqlStatements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteSqlRequest]
  }
  
  @scala.inline
  implicit class ExecuteSqlRequestMutableBuilder[Self <: ExecuteSqlRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsSecretStoreArn(value: Arn): Self = StObject.set(x, "awsSecretStoreArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabase(value: DbName): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    @scala.inline
    def setDbClusterOrInstanceArn(value: Arn): Self = StObject.set(x, "dbClusterOrInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: DbName): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setSqlStatements(value: SqlStatement): Self = StObject.set(x, "sqlStatements", value.asInstanceOf[js.Any])
  }
}
