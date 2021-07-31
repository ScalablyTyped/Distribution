package typings.awsSdk.redshiftdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTablesRequest extends StObject {
  
  /**
    * The cluster identifier. This parameter is required when authenticating using either AWS Secrets Manager or temporary credentials. 
    */
  var ClusterIdentifier: Location
  
  /**
    * The name of the database. This parameter is required when authenticating using temporary credentials.
    */
  var Database: String
  
  /**
    * The database user name. This parameter is required when authenticating using temporary credentials. 
    */
  var DbUser: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of tables to return in the response. If more tables exist than fit in one response, then NextToken is returned to page through the results. 
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned NextToken value in the next NextToken parameter and retrying the command. If the NextToken field is empty, all response records have been retrieved for the request. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A pattern to filter results by schema name. Within a schema pattern, "%" means match any substring of 0 or more characters and "_" means match any one character. Only schema name entries matching the search pattern are returned. If SchemaPattern is not specified, then all tables that match TablePattern are returned. If neither SchemaPattern or TablePattern are specified, then all tables are returned. 
    */
  var SchemaPattern: js.UndefOr[String] = js.undefined
  
  /**
    * The name or ARN of the secret that enables access to the database. This parameter is required when authenticating using AWS Secrets Manager. 
    */
  var SecretArn: js.UndefOr[typings.awsSdk.redshiftdataMod.SecretArn] = js.undefined
  
  /**
    * A pattern to filter results by table name. Within a table pattern, "%" means match any substring of 0 or more characters and "_" means match any one character. Only table name entries matching the search pattern are returned. If TablePattern is not specified, then all tables that match SchemaPatternare returned. If neither SchemaPattern or TablePattern are specified, then all tables are returned. 
    */
  var TablePattern: js.UndefOr[String] = js.undefined
}
object ListTablesRequest {
  
  @scala.inline
  def apply(ClusterIdentifier: Location, Database: String): ListTablesRequest = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], Database = Database.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTablesRequest]
  }
  
  @scala.inline
  implicit class ListTablesRequestMutableBuilder[Self <: ListTablesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterIdentifier(value: Location): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabase(value: String): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbUser(value: String): Self = StObject.set(x, "DbUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbUserUndefined: Self = StObject.set(x, "DbUser", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSchemaPattern(value: String): Self = StObject.set(x, "SchemaPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaPatternUndefined: Self = StObject.set(x, "SchemaPattern", js.undefined)
    
    @scala.inline
    def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretArnUndefined: Self = StObject.set(x, "SecretArn", js.undefined)
    
    @scala.inline
    def setTablePattern(value: String): Self = StObject.set(x, "TablePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablePatternUndefined: Self = StObject.set(x, "TablePattern", js.undefined)
  }
}
