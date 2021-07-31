package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppsResponse extends StObject {
  
  /**
    * The application summaries.
    */
  var apps: js.UndefOr[Apps] = js.undefined
  
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAppsResponse {
  
  @scala.inline
  def apply(): ListAppsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppsResponse]
  }
  
  @scala.inline
  implicit class ListAppsResponseMutableBuilder[Self <: ListAppsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApps(value: Apps): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    @scala.inline
    def setAppsVarargs(value: AppSummary*): Self = StObject.set(x, "apps", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
