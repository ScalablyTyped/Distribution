package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetAssetPropertyAggregatesSkippedEntry extends StObject {
  
  /**
    * The completion status of each entry that is associated with the BatchGetAssetPropertyAggregates API.
    */
  var completionStatus: BatchEntryCompletionStatus
  
  /**
    * The ID of the entry.
    */
  var entryId: EntryId
  
  /**
    * The error information, such as the error code and the timestamp.
    */
  var errorInfo: js.UndefOr[BatchGetAssetPropertyAggregatesErrorInfo] = js.undefined
}
object BatchGetAssetPropertyAggregatesSkippedEntry {
  
  inline def apply(completionStatus: BatchEntryCompletionStatus, entryId: EntryId): BatchGetAssetPropertyAggregatesSkippedEntry = {
    val __obj = js.Dynamic.literal(completionStatus = completionStatus.asInstanceOf[js.Any], entryId = entryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetAssetPropertyAggregatesSkippedEntry]
  }
  
  extension [Self <: BatchGetAssetPropertyAggregatesSkippedEntry](x: Self) {
    
    inline def setCompletionStatus(value: BatchEntryCompletionStatus): Self = StObject.set(x, "completionStatus", value.asInstanceOf[js.Any])
    
    inline def setEntryId(value: EntryId): Self = StObject.set(x, "entryId", value.asInstanceOf[js.Any])
    
    inline def setErrorInfo(value: BatchGetAssetPropertyAggregatesErrorInfo): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
    
    inline def setErrorInfoUndefined: Self = StObject.set(x, "errorInfo", js.undefined)
  }
}
