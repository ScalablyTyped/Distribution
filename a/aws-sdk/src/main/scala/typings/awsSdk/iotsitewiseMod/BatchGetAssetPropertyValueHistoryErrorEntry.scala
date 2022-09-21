package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetAssetPropertyValueHistoryErrorEntry extends StObject {
  
  /**
    * The ID of the entry.
    */
  var entryId: EntryId
  
  /**
    * The error code.
    */
  var errorCode: BatchGetAssetPropertyValueHistoryErrorCode
  
  /**
    * The associated error message.
    */
  var errorMessage: ErrorMessage
}
object BatchGetAssetPropertyValueHistoryErrorEntry {
  
  inline def apply(
    entryId: EntryId,
    errorCode: BatchGetAssetPropertyValueHistoryErrorCode,
    errorMessage: ErrorMessage
  ): BatchGetAssetPropertyValueHistoryErrorEntry = {
    val __obj = js.Dynamic.literal(entryId = entryId.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetAssetPropertyValueHistoryErrorEntry]
  }
  
  extension [Self <: BatchGetAssetPropertyValueHistoryErrorEntry](x: Self) {
    
    inline def setEntryId(value: EntryId): Self = StObject.set(x, "entryId", value.asInstanceOf[js.Any])
    
    inline def setErrorCode(value: BatchGetAssetPropertyValueHistoryErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
  }
}
