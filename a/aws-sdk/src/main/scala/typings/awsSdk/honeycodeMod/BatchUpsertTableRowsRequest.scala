package typings.awsSdk.honeycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpsertTableRowsRequest extends StObject {
  
  /**
    *  The request token for performing the update action. Request tokens help to identify duplicate requests. If a call times out or fails due to a transient error like a failed network connection, you can retry the call with the same request token. The service ensures that if the first call using that request token is successfully performed, the second call will not perform the action again.   Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests spanning hours or days. 
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    *  The list of rows to upsert in the table. Each item in this list needs to have a batch item id to uniquely identify the element in the request, a filter expression to find the rows to update for that element and the cell values to set for each column in the upserted rows. You need to specify at least one item in this list.   Note that if one of the filter formulas in the request fails to evaluate because of an error or one of the column ids in any of the rows does not exist in the table, then the request fails and no updates are made to the table. 
    */
  var rowsToUpsert: UpsertRowDataList
  
  /**
    * The ID of the table where the rows are being upserted.  If a table with the specified id could not be found, this API throws ResourceNotFoundException. 
    */
  var tableId: ResourceId
  
  /**
    * The ID of the workbook where the rows are being upserted.  If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. 
    */
  var workbookId: ResourceId
}
object BatchUpsertTableRowsRequest {
  
  inline def apply(rowsToUpsert: UpsertRowDataList, tableId: ResourceId, workbookId: ResourceId): BatchUpsertTableRowsRequest = {
    val __obj = js.Dynamic.literal(rowsToUpsert = rowsToUpsert.asInstanceOf[js.Any], tableId = tableId.asInstanceOf[js.Any], workbookId = workbookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpsertTableRowsRequest]
  }
  
  extension [Self <: BatchUpsertTableRowsRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setRowsToUpsert(value: UpsertRowDataList): Self = StObject.set(x, "rowsToUpsert", value.asInstanceOf[js.Any])
    
    inline def setRowsToUpsertVarargs(value: UpsertRowData*): Self = StObject.set(x, "rowsToUpsert", js.Array(value*))
    
    inline def setTableId(value: ResourceId): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setWorkbookId(value: ResourceId): Self = StObject.set(x, "workbookId", value.asInstanceOf[js.Any])
  }
}
