package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeExportImageTasksResult extends StObject {
  
  /**
    * Information about the export image tasks.
    */
  var ExportImageTasks: js.UndefOr[ExportImageTaskList] = js.native
  
  /**
    * The token to use to get the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
}
object DescribeExportImageTasksResult {
  
  @scala.inline
  def apply(): DescribeExportImageTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportImageTasksResult]
  }
  
  @scala.inline
  implicit class DescribeExportImageTasksResultMutableBuilder[Self <: DescribeExportImageTasksResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportImageTasks(value: ExportImageTaskList): Self = StObject.set(x, "ExportImageTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportImageTasksUndefined: Self = StObject.set(x, "ExportImageTasks", js.undefined)
    
    @scala.inline
    def setExportImageTasksVarargs(value: ExportImageTask*): Self = StObject.set(x, "ExportImageTasks", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
