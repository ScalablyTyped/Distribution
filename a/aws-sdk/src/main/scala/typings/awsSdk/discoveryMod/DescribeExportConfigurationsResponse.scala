package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeExportConfigurationsResponse extends js.Object {
  
  /**
    * 
    */
  var exportsInfo: js.UndefOr[ExportsInfo] = js.native
  
  /**
    * The token from the previous call to describe-export-tasks.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeExportConfigurationsResponse {
  
  @scala.inline
  def apply(): DescribeExportConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportConfigurationsResponse]
  }
  
  @scala.inline
  implicit class DescribeExportConfigurationsResponseOps[Self <: DescribeExportConfigurationsResponse] (val x: Self) extends AnyVal {
    
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
    def setExportsInfoVarargs(value: ExportInfo*): Self = this.set("exportsInfo", js.Array(value :_*))
    
    @scala.inline
    def setExportsInfo(value: ExportsInfo): Self = this.set("exportsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportsInfo: Self = this.set("exportsInfo", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
