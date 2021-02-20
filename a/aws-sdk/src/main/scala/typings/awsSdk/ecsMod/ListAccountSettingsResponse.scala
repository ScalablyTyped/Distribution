package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAccountSettingsResponse extends StObject {
  
  /**
    * The nextToken value to include in a future ListAccountSettings request. When the results of a ListAccountSettings request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The account settings for the resource.
    */
  var settings: js.UndefOr[Settings] = js.native
}
object ListAccountSettingsResponse {
  
  @scala.inline
  def apply(): ListAccountSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountSettingsResponse]
  }
  
  @scala.inline
  implicit class ListAccountSettingsResponseMutableBuilder[Self <: ListAccountSettingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    @scala.inline
    def setSettingsVarargs(value: Setting*): Self = StObject.set(x, "settings", js.Array(value :_*))
  }
}
