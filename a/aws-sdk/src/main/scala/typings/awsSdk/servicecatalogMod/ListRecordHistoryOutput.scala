package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecordHistoryOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * The records, in reverse chronological order.
    */
  var RecordDetails: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordDetails] = js.undefined
}
object ListRecordHistoryOutput {
  
  @scala.inline
  def apply(): ListRecordHistoryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecordHistoryOutput]
  }
  
  @scala.inline
  implicit class ListRecordHistoryOutputMutableBuilder[Self <: ListRecordHistoryOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setRecordDetails(value: RecordDetails): Self = StObject.set(x, "RecordDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordDetailsUndefined: Self = StObject.set(x, "RecordDetails", js.undefined)
    
    @scala.inline
    def setRecordDetailsVarargs(value: RecordDetail*): Self = StObject.set(x, "RecordDetails", js.Array(value :_*))
  }
}
