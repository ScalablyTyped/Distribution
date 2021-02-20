package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeImportTasksResponse extends StObject {
  
  /**
    * The token to request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A returned array of import tasks that match any applied filters, up to the specified number of maximum results.
    */
  var tasks: js.UndefOr[ImportTaskList] = js.native
}
object DescribeImportTasksResponse {
  
  @scala.inline
  def apply(): DescribeImportTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImportTasksResponse]
  }
  
  @scala.inline
  implicit class DescribeImportTasksResponseMutableBuilder[Self <: DescribeImportTasksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setTasks(value: ImportTaskList): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    @scala.inline
    def setTasksVarargs(value: ImportTask*): Self = StObject.set(x, "tasks", js.Array(value :_*))
  }
}
