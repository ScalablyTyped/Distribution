package typings.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListApplicationStatesResult extends StObject {
  
  /**
    * A list of Applications that exist in Application Discovery Service.
    */
  var ApplicationStateList: js.UndefOr[typings.awsSdk.migrationhubMod.ApplicationStateList] = js.native
  
  /**
    * If a NextToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object ListApplicationStatesResult {
  
  @scala.inline
  def apply(): ListApplicationStatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationStatesResult]
  }
  
  @scala.inline
  implicit class ListApplicationStatesResultMutableBuilder[Self <: ListApplicationStatesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationStateList(value: ApplicationStateList): Self = StObject.set(x, "ApplicationStateList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationStateListUndefined: Self = StObject.set(x, "ApplicationStateList", js.undefined)
    
    @scala.inline
    def setApplicationStateListVarargs(value: ApplicationState*): Self = StObject.set(x, "ApplicationStateList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
