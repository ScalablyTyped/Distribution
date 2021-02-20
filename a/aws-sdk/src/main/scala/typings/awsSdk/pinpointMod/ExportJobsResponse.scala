package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportJobsResponse extends StObject {
  
  /**
    * An array of responses, one for each export job that's associated with the application (Export Jobs resource) or segment (Segment Export Jobs resource).
    */
  var Item: ListOfExportJobResponse = js.native
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ExportJobsResponse {
  
  @scala.inline
  def apply(Item: ListOfExportJobResponse): ExportJobsResponse = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportJobsResponse]
  }
  
  @scala.inline
  implicit class ExportJobsResponseMutableBuilder[Self <: ExportJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: ListOfExportJobResponse): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemVarargs(value: ExportJobResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
