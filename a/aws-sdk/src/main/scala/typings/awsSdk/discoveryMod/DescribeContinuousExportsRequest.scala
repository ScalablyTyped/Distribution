package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeContinuousExportsRequest extends js.Object {
  
  /**
    * The unique IDs assigned to the exports.
    */
  var exportIds: js.UndefOr[ContinuousExportIds] = js.native
  
  /**
    * A number between 1 and 100 specifying the maximum number of continuous export descriptions returned.
    */
  var maxResults: js.UndefOr[DescribeContinuousExportsMaxResults] = js.native
  
  /**
    * The token from the previous call to DescribeExportTasks.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeContinuousExportsRequest {
  
  @scala.inline
  def apply(): DescribeContinuousExportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContinuousExportsRequest]
  }
  
  @scala.inline
  implicit class DescribeContinuousExportsRequestOps[Self <: DescribeContinuousExportsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExportIdsVarargs(value: ConfigurationsExportId*): Self = this.set("exportIds", js.Array(value :_*))
    
    @scala.inline
    def setExportIds(value: ContinuousExportIds): Self = this.set("exportIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportIds: Self = this.set("exportIds", js.undefined)
    
    @scala.inline
    def setMaxResults(value: DescribeContinuousExportsMaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
