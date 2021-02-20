package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAppsResponse extends StObject {
  
  /**
    * The list of apps.
    */
  var Apps: js.UndefOr[AppList] = js.native
  
  /**
    * If the previous response was truncated, you will receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
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
    def setApps(value: AppList): Self = StObject.set(x, "Apps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsUndefined: Self = StObject.set(x, "Apps", js.undefined)
    
    @scala.inline
    def setAppsVarargs(value: AppDetails*): Self = StObject.set(x, "Apps", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
