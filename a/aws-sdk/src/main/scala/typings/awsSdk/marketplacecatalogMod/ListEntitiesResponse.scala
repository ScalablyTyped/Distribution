package typings.awsSdk.marketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEntitiesResponse extends StObject {
  
  /**
    *  Array of EntitySummary object.
    */
  var EntitySummaryList: js.UndefOr[typings.awsSdk.marketplacecatalogMod.EntitySummaryList] = js.native
  
  /**
    * The value of the next token if it exists. Null if there is no more result.
    */
  var NextToken: js.UndefOr[typings.awsSdk.marketplacecatalogMod.NextToken] = js.native
}
object ListEntitiesResponse {
  
  @scala.inline
  def apply(): ListEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntitiesResponse]
  }
  
  @scala.inline
  implicit class ListEntitiesResponseMutableBuilder[Self <: ListEntitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntitySummaryList(value: EntitySummaryList): Self = StObject.set(x, "EntitySummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitySummaryListUndefined: Self = StObject.set(x, "EntitySummaryList", js.undefined)
    
    @scala.inline
    def setEntitySummaryListVarargs(value: EntitySummary*): Self = StObject.set(x, "EntitySummaryList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
