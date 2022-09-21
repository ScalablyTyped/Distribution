package typings.awsSdk.honeycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRowData extends StObject {
  
  /**
    *  An external identifier that represents the single row that is being created as part of the BatchCreateTableRows request. This can be any string that you can use to identify the row in the request. The BatchCreateTableRows API puts the batch item id in the results to allow you to link data in the request to data in the results. 
    */
  var batchItemId: BatchItemId
  
  /**
    *  A map representing the cells to create in the new row. The key is the column id of the cell and the value is the CellInput object that represents the data to set in that cell. 
    */
  var cellsToCreate: RowDataInput
}
object CreateRowData {
  
  inline def apply(batchItemId: BatchItemId, cellsToCreate: RowDataInput): CreateRowData = {
    val __obj = js.Dynamic.literal(batchItemId = batchItemId.asInstanceOf[js.Any], cellsToCreate = cellsToCreate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRowData]
  }
  
  extension [Self <: CreateRowData](x: Self) {
    
    inline def setBatchItemId(value: BatchItemId): Self = StObject.set(x, "batchItemId", value.asInstanceOf[js.Any])
    
    inline def setCellsToCreate(value: RowDataInput): Self = StObject.set(x, "cellsToCreate", value.asInstanceOf[js.Any])
  }
}
