package typings.awsSdk.honeycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateTableRowsRequest extends StObject {
  
  /**
    *  The request token for performing the update action. Request tokens help to identify duplicate requests. If a call times out or fails due to a transient error like a failed network connection, you can retry the call with the same request token. The service ensures that if the first call using that request token is successfully performed, the second call will not perform the action again.   Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests spanning hours or days. 
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    *  The list of rows to update in the table. Each item in this list needs to contain the row id to update along with the map of column id to cell values for each column in that row that needs to be updated. You need to specify at least one row in this list, and for each row, you need to specify at least one column to update.   Note that if one of the row or column ids in the request does not exist in the table, then the request fails and no updates are made to the table. 
    */
  var rowsToUpdate: UpdateRowDataList
  
  /**
    * The ID of the table where the rows are being updated.  If a table with the specified id could not be found, this API throws ResourceNotFoundException. 
    */
  var tableId: ResourceId
  
  /**
    * The ID of the workbook where the rows are being updated.  If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. 
    */
  var workbookId: ResourceId
}
object BatchUpdateTableRowsRequest {
  
  inline def apply(rowsToUpdate: UpdateRowDataList, tableId: ResourceId, workbookId: ResourceId): BatchUpdateTableRowsRequest = {
    val __obj = js.Dynamic.literal(rowsToUpdate = rowsToUpdate.asInstanceOf[js.Any], tableId = tableId.asInstanceOf[js.Any], workbookId = workbookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateTableRowsRequest]
  }
  
  extension [Self <: BatchUpdateTableRowsRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setRowsToUpdate(value: UpdateRowDataList): Self = StObject.set(x, "rowsToUpdate", value.asInstanceOf[js.Any])
    
    inline def setRowsToUpdateVarargs(value: UpdateRowData*): Self = StObject.set(x, "rowsToUpdate", js.Array(value*))
    
    inline def setTableId(value: ResourceId): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setWorkbookId(value: ResourceId): Self = StObject.set(x, "workbookId", value.asInstanceOf[js.Any])
  }
}
