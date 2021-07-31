package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMitigationActionsResponse extends StObject {
  
  /**
    * A set of actions that matched the specified filter criteria.
    */
  var actionIdentifiers: js.UndefOr[MitigationActionIdentifierList] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListMitigationActionsResponse {
  
  @scala.inline
  def apply(): ListMitigationActionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMitigationActionsResponse]
  }
  
  @scala.inline
  implicit class ListMitigationActionsResponseMutableBuilder[Self <: ListMitigationActionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionIdentifiers(value: MitigationActionIdentifierList): Self = StObject.set(x, "actionIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIdentifiersUndefined: Self = StObject.set(x, "actionIdentifiers", js.undefined)
    
    @scala.inline
    def setActionIdentifiersVarargs(value: MitigationActionIdentifier*): Self = StObject.set(x, "actionIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
