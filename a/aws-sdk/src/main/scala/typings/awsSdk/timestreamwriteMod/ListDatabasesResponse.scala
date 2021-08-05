package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatabasesResponse extends StObject {
  
  /**
    * A list of database names.
    */
  var Databases: js.UndefOr[DatabaseList] = js.undefined
  
  /**
    * The pagination token. This parameter is returned when the response is truncated.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListDatabasesResponse {
  
  inline def apply(): ListDatabasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatabasesResponse]
  }
  
  extension [Self <: ListDatabasesResponse](x: Self) {
    
    inline def setDatabases(value: DatabaseList): Self = StObject.set(x, "Databases", value.asInstanceOf[js.Any])
    
    inline def setDatabasesUndefined: Self = StObject.set(x, "Databases", js.undefined)
    
    inline def setDatabasesVarargs(value: Database*): Self = StObject.set(x, "Databases", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
