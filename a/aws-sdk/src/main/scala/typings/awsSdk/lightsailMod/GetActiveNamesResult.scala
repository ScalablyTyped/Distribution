package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetActiveNamesResult extends StObject {
  
  /**
    * The list of active names returned by the get active names request.
    */
  var activeNames: js.UndefOr[StringList] = js.native
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetActiveNames request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GetActiveNamesResult {
  
  @scala.inline
  def apply(): GetActiveNamesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetActiveNamesResult]
  }
  
  @scala.inline
  implicit class GetActiveNamesResultMutableBuilder[Self <: GetActiveNamesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveNames(value: StringList): Self = StObject.set(x, "activeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveNamesUndefined: Self = StObject.set(x, "activeNames", js.undefined)
    
    @scala.inline
    def setActiveNamesVarargs(value: String*): Self = StObject.set(x, "activeNames", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
