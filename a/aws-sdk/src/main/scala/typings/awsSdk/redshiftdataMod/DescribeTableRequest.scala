package typings.awsSdk.redshiftdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTableRequest extends StObject {
  
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
    * The maximum number of tables to return in the response. If more tables exist than fit in one response, then NextToken is returned to page through the results. 
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned NextToken value in the next NextToken parameter and retrying the command. If the NextToken field is empty, all response records have been retrieved for the request. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The schema that contains the table. If no schema is specified, then matching tables for all schemas are returned. 
    */
  var Schema: js.UndefOr[String] = js.undefined
  
  /**
    * The name or ARN of the secret that enables access to the database. This parameter is required when authenticating using AWS Secrets Manager. 
    */
  var SecretArn: js.UndefOr[typings.awsSdk.redshiftdataMod.SecretArn] = js.undefined
  
  /**
    * The table name. If no table is specified, then all tables for all matching schemas are returned. If no table and no schema is specified, then all tables for all schemas in the database are returned
    */
  var Table: js.UndefOr[String] = js.undefined
}
object DescribeTableRequest {
  
  inline def apply(ClusterIdentifier: Location): DescribeTableRequest = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableRequest]
  }
  
  extension [Self <: DescribeTableRequest](x: Self) {
    
    inline def setClusterIdentifier(value: Location): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDatabase(value: String): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "Database", js.undefined)
    
    inline def setDbUser(value: String): Self = StObject.set(x, "DbUser", value.asInstanceOf[js.Any])
    
    inline def setDbUserUndefined: Self = StObject.set(x, "DbUser", js.undefined)
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSchema(value: String): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "Schema", js.undefined)
    
    inline def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setSecretArnUndefined: Self = StObject.set(x, "SecretArn", js.undefined)
    
    inline def setTable(value: String): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
  }
}
