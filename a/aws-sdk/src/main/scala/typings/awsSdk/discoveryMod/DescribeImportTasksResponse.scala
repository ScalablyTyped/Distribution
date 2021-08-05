package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImportTasksResponse extends StObject {
  
  /**
    * The token to request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A returned array of import tasks that match any applied filters, up to the specified number of maximum results.
    */
  var tasks: js.UndefOr[ImportTaskList] = js.undefined
}
object DescribeImportTasksResponse {
  
  inline def apply(): DescribeImportTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImportTasksResponse]
  }
  
  extension [Self <: DescribeImportTasksResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTasks(value: ImportTaskList): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    inline def setTasksVarargs(value: ImportTask*): Self = StObject.set(x, "tasks", js.Array(value :_*))
  }
}
