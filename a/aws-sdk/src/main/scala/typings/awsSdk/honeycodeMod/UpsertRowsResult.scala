package typings.awsSdk.honeycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpsertRowsResult extends StObject {
  
  /**
    *  The list of row ids that were changed as part of an upsert row operation. If the upsert resulted in an update, this list could potentially contain multiple rows that matched the filter and hence got updated. If the upsert resulted in an append, this list would only have the single row that was appended. 
    */
  var rowIds: RowIdList
  
  /**
    *  The result of the upsert action. 
    */
  var upsertAction: UpsertAction
}
object UpsertRowsResult {
  
  inline def apply(rowIds: RowIdList, upsertAction: UpsertAction): UpsertRowsResult = {
    val __obj = js.Dynamic.literal(rowIds = rowIds.asInstanceOf[js.Any], upsertAction = upsertAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpsertRowsResult]
  }
  
  extension [Self <: UpsertRowsResult](x: Self) {
    
    inline def setRowIds(value: RowIdList): Self = StObject.set(x, "rowIds", value.asInstanceOf[js.Any])
    
    inline def setRowIdsVarargs(value: RowId*): Self = StObject.set(x, "rowIds", js.Array(value*))
    
    inline def setUpsertAction(value: UpsertAction): Self = StObject.set(x, "upsertAction", value.asInstanceOf[js.Any])
  }
}
