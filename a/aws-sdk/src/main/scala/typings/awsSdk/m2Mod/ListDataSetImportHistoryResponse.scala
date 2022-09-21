package typings.awsSdk.m2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataSetImportHistoryResponse extends StObject {
  
  /**
    * The data set import tasks.
    */
  var dataSetImportTasks: DataSetImportTaskList
  
  /**
    * If there are more items to return, this contains a token that is passed to a subsequent call to this operation to retrieve the next set of items.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDataSetImportHistoryResponse {
  
  inline def apply(dataSetImportTasks: DataSetImportTaskList): ListDataSetImportHistoryResponse = {
    val __obj = js.Dynamic.literal(dataSetImportTasks = dataSetImportTasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataSetImportHistoryResponse]
  }
  
  extension [Self <: ListDataSetImportHistoryResponse](x: Self) {
    
    inline def setDataSetImportTasks(value: DataSetImportTaskList): Self = StObject.set(x, "dataSetImportTasks", value.asInstanceOf[js.Any])
    
    inline def setDataSetImportTasksVarargs(value: DataSetImportTask*): Self = StObject.set(x, "dataSetImportTasks", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
