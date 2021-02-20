package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeImportImageTasksResult extends StObject {
  
  /**
    * A list of zero or more import image tasks that are currently active or were completed or canceled in the previous 7 days.
    */
  var ImportImageTasks: js.UndefOr[ImportImageTaskList] = js.native
  
  /**
    * The token to use to get the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeImportImageTasksResult {
  
  @scala.inline
  def apply(): DescribeImportImageTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImportImageTasksResult]
  }
  
  @scala.inline
  implicit class DescribeImportImageTasksResultMutableBuilder[Self <: DescribeImportImageTasksResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportImageTasks(value: ImportImageTaskList): Self = StObject.set(x, "ImportImageTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportImageTasksUndefined: Self = StObject.set(x, "ImportImageTasks", js.undefined)
    
    @scala.inline
    def setImportImageTasksVarargs(value: ImportImageTask*): Self = StObject.set(x, "ImportImageTasks", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
