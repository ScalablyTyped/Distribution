package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListHITsForQualificationTypeResponse extends StObject {
  
  /**
    *  The list of HIT elements returned by the query.
    */
  var HITs: js.UndefOr[HITList] = js.native
  
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    *  The number of HITs on this page in the filtered results list, equivalent to the number of HITs being returned by this call. 
    */
  var NumResults: js.UndefOr[Integer] = js.native
}
object ListHITsForQualificationTypeResponse {
  
  @scala.inline
  def apply(): ListHITsForQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHITsForQualificationTypeResponse]
  }
  
  @scala.inline
  implicit class ListHITsForQualificationTypeResponseMutableBuilder[Self <: ListHITsForQualificationTypeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHITs(value: HITList): Self = StObject.set(x, "HITs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHITsUndefined: Self = StObject.set(x, "HITs", js.undefined)
    
    @scala.inline
    def setHITsVarargs(value: HIT*): Self = StObject.set(x, "HITs", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setNumResults(value: Integer): Self = StObject.set(x, "NumResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumResultsUndefined: Self = StObject.set(x, "NumResults", js.undefined)
  }
}
