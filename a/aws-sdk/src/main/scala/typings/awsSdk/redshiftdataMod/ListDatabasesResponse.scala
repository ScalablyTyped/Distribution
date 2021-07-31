package typings.awsSdk.redshiftdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatabasesResponse extends StObject {
  
  /**
    * The names of databases. 
    */
  var Databases: js.UndefOr[DatabaseList] = js.undefined
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned NextToken value in the next NextToken parameter and retrying the command. If the NextToken field is empty, all response records have been retrieved for the request. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListDatabasesResponse {
  
  @scala.inline
  def apply(): ListDatabasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatabasesResponse]
  }
  
  @scala.inline
  implicit class ListDatabasesResponseMutableBuilder[Self <: ListDatabasesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabases(value: DatabaseList): Self = StObject.set(x, "Databases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabasesUndefined: Self = StObject.set(x, "Databases", js.undefined)
    
    @scala.inline
    def setDatabasesVarargs(value: String*): Self = StObject.set(x, "Databases", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
