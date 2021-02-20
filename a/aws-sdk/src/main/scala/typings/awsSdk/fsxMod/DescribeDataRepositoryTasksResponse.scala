package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDataRepositoryTasksResponse extends StObject {
  
  /**
    * The collection of data repository task descriptions returned.
    */
  var DataRepositoryTasks: js.UndefOr[typings.awsSdk.fsxMod.DataRepositoryTasks] = js.native
  
  var NextToken: js.UndefOr[typings.awsSdk.fsxMod.NextToken] = js.native
}
object DescribeDataRepositoryTasksResponse {
  
  @scala.inline
  def apply(): DescribeDataRepositoryTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataRepositoryTasksResponse]
  }
  
  @scala.inline
  implicit class DescribeDataRepositoryTasksResponseMutableBuilder[Self <: DescribeDataRepositoryTasksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataRepositoryTasks(value: DataRepositoryTasks): Self = StObject.set(x, "DataRepositoryTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRepositoryTasksUndefined: Self = StObject.set(x, "DataRepositoryTasks", js.undefined)
    
    @scala.inline
    def setDataRepositoryTasksVarargs(value: DataRepositoryTask*): Self = StObject.set(x, "DataRepositoryTasks", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
