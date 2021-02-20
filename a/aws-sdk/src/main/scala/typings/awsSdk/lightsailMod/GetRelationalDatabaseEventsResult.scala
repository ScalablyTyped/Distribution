package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRelationalDatabaseEventsResult extends StObject {
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetRelationalDatabaseEvents request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * An object describing the result of your get relational database events request.
    */
  var relationalDatabaseEvents: js.UndefOr[RelationalDatabaseEventList] = js.native
}
object GetRelationalDatabaseEventsResult {
  
  @scala.inline
  def apply(): GetRelationalDatabaseEventsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseEventsResult]
  }
  
  @scala.inline
  implicit class GetRelationalDatabaseEventsResultMutableBuilder[Self <: GetRelationalDatabaseEventsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setRelationalDatabaseEvents(value: RelationalDatabaseEventList): Self = StObject.set(x, "relationalDatabaseEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationalDatabaseEventsUndefined: Self = StObject.set(x, "relationalDatabaseEvents", js.undefined)
    
    @scala.inline
    def setRelationalDatabaseEventsVarargs(value: RelationalDatabaseEvent*): Self = StObject.set(x, "relationalDatabaseEvents", js.Array(value :_*))
  }
}
