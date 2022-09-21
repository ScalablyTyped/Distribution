package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetAdvisorDatabasesResponse extends StObject {
  
  /**
    * Provides descriptions of the Fleet Advisor collector databases, including the database's collector, ID, and name.
    */
  var Databases: js.UndefOr[DatabaseList] = js.undefined
  
  /**
    * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeFleetAdvisorDatabasesResponse {
  
  inline def apply(): DescribeFleetAdvisorDatabasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetAdvisorDatabasesResponse]
  }
  
  extension [Self <: DescribeFleetAdvisorDatabasesResponse](x: Self) {
    
    inline def setDatabases(value: DatabaseList): Self = StObject.set(x, "Databases", value.asInstanceOf[js.Any])
    
    inline def setDatabasesUndefined: Self = StObject.set(x, "Databases", js.undefined)
    
    inline def setDatabasesVarargs(value: DatabaseResponse*): Self = StObject.set(x, "Databases", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
