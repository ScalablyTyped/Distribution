package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTestGridSessionActionsResult extends StObject {
  
  /**
    * The action taken by the session.
    */
  var actions: js.UndefOr[TestGridSessionActions] = js.native
  
  /**
    * Pagination token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object ListTestGridSessionActionsResult {
  
  @scala.inline
  def apply(): ListTestGridSessionActionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTestGridSessionActionsResult]
  }
  
  @scala.inline
  implicit class ListTestGridSessionActionsResultMutableBuilder[Self <: ListTestGridSessionActionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: TestGridSessionActions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: TestGridSessionAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
