package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListActionTypesInput extends StObject {
  
  /**
    * Filters the list of action types to those created by a specified entity.
    */
  var actionOwnerFilter: js.UndefOr[ActionOwner] = js.undefined
  
  /**
    * An identifier that was returned from the previous list action types call, which can be used to return the next set of action types in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListActionTypesInput {
  
  @scala.inline
  def apply(): ListActionTypesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListActionTypesInput]
  }
  
  @scala.inline
  implicit class ListActionTypesInputMutableBuilder[Self <: ListActionTypesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionOwnerFilter(value: ActionOwner): Self = StObject.set(x, "actionOwnerFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionOwnerFilterUndefined: Self = StObject.set(x, "actionOwnerFilter", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
