package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportJobsResponse extends StObject {
  
  /**
    * An array of responses, one for each import job that's associated with the application (Import Jobs resource) or segment (Segment Import Jobs resource).
    */
  var Item: ListOfImportJobResponse = js.native
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ImportJobsResponse {
  
  @scala.inline
  def apply(Item: ListOfImportJobResponse): ImportJobsResponse = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportJobsResponse]
  }
  
  @scala.inline
  implicit class ImportJobsResponseMutableBuilder[Self <: ImportJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: ListOfImportJobResponse): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemVarargs(value: ImportJobResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
