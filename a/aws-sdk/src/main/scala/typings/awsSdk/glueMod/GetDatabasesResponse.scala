package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDatabasesResponse extends StObject {
  
  /**
    * A list of Database objects from the specified catalog.
    */
  var DatabaseList: typings.awsSdk.glueMod.DatabaseList
  
  /**
    * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is not the last.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object GetDatabasesResponse {
  
  @scala.inline
  def apply(DatabaseList: DatabaseList): GetDatabasesResponse = {
    val __obj = js.Dynamic.literal(DatabaseList = DatabaseList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDatabasesResponse]
  }
  
  @scala.inline
  implicit class GetDatabasesResponseMutableBuilder[Self <: GetDatabasesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseList(value: DatabaseList): Self = StObject.set(x, "DatabaseList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseListVarargs(value: Database*): Self = StObject.set(x, "DatabaseList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
