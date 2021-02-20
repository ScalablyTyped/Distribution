package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTestGridProjectsRequest extends StObject {
  
  /**
    * Return no more than this number of results.
    */
  var maxResult: js.UndefOr[MaxPageSize] = js.native
  
  /**
    * From a response, used to continue a paginated listing. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object ListTestGridProjectsRequest {
  
  @scala.inline
  def apply(): ListTestGridProjectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTestGridProjectsRequest]
  }
  
  @scala.inline
  implicit class ListTestGridProjectsRequestMutableBuilder[Self <: ListTestGridProjectsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResult(value: MaxPageSize): Self = StObject.set(x, "maxResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultUndefined: Self = StObject.set(x, "maxResult", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
