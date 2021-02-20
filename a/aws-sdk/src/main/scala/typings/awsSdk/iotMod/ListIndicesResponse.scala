package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIndicesResponse extends StObject {
  
  /**
    * The index names.
    */
  var indexNames: js.UndefOr[IndexNamesList] = js.native
  
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListIndicesResponse {
  
  @scala.inline
  def apply(): ListIndicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIndicesResponse]
  }
  
  @scala.inline
  implicit class ListIndicesResponseMutableBuilder[Self <: ListIndicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexNames(value: IndexNamesList): Self = StObject.set(x, "indexNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexNamesUndefined: Self = StObject.set(x, "indexNames", js.undefined)
    
    @scala.inline
    def setIndexNamesVarargs(value: IndexName*): Self = StObject.set(x, "indexNames", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
