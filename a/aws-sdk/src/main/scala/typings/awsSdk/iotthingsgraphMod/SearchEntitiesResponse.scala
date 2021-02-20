package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchEntitiesResponse extends StObject {
  
  /**
    * An array of descriptions for each entity returned in the search result.
    */
  var descriptions: js.UndefOr[EntityDescriptions] = js.native
  
  /**
    * The string to specify as nextToken when you request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object SearchEntitiesResponse {
  
  @scala.inline
  def apply(): SearchEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchEntitiesResponse]
  }
  
  @scala.inline
  implicit class SearchEntitiesResponseMutableBuilder[Self <: SearchEntitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescriptions(value: EntityDescriptions): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionsUndefined: Self = StObject.set(x, "descriptions", js.undefined)
    
    @scala.inline
    def setDescriptionsVarargs(value: EntityDescription*): Self = StObject.set(x, "descriptions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
