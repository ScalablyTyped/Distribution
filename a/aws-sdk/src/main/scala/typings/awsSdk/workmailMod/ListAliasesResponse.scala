package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAliasesResponse extends StObject {
  
  /**
    * The entity's paginated aliases.
    */
  var Aliases: js.UndefOr[typings.awsSdk.workmailMod.Aliases] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. The value is "null" when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.workmailMod.NextToken] = js.undefined
}
object ListAliasesResponse {
  
  @scala.inline
  def apply(): ListAliasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAliasesResponse]
  }
  
  @scala.inline
  implicit class ListAliasesResponseMutableBuilder[Self <: ListAliasesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: Aliases): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: EmailAddress*): Self = StObject.set(x, "Aliases", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
