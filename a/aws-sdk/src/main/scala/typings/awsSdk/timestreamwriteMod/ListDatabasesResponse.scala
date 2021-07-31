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
    def setDatabasesVarargs(value: Database*): Self = StObject.set(x, "Databases", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
