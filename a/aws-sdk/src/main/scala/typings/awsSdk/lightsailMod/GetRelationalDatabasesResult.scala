package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRelationalDatabasesResult extends StObject {
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetRelationalDatabases request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * An object describing the result of your get relational databases request.
    */
  var relationalDatabases: js.UndefOr[RelationalDatabaseList] = js.native
}
object GetRelationalDatabasesResult {
  
  @scala.inline
  def apply(): GetRelationalDatabasesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabasesResult]
  }
  
  @scala.inline
  implicit class GetRelationalDatabasesResultMutableBuilder[Self <: GetRelationalDatabasesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setRelationalDatabases(value: RelationalDatabaseList): Self = StObject.set(x, "relationalDatabases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationalDatabasesUndefined: Self = StObject.set(x, "relationalDatabases", js.undefined)
    
    @scala.inline
    def setRelationalDatabasesVarargs(value: RelationalDatabase*): Self = StObject.set(x, "relationalDatabases", js.Array(value :_*))
  }
}
