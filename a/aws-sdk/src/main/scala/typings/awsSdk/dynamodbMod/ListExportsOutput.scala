package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListExportsOutput extends js.Object {
  
  /**
    * A list of ExportSummary objects.
    */
  var ExportSummaries: js.UndefOr[typings.awsSdk.dynamodbMod.ExportSummaries] = js.native
  
  /**
    * If this value is returned, there are additional results to be displayed. To retrieve them, call ListExports again, with NextToken set to this value.
    */
  var NextToken: js.UndefOr[ExportNextToken] = js.native
}
object ListExportsOutput {
  
  @scala.inline
  def apply(): ListExportsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExportsOutput]
  }
  
  @scala.inline
  implicit class ListExportsOutputOps[Self <: ListExportsOutput] (val x: Self) extends AnyVal {
    
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
    def setExportSummariesVarargs(value: ExportSummary*): Self = this.set("ExportSummaries", js.Array(value :_*))
    
    @scala.inline
    def setExportSummaries(value: ExportSummaries): Self = this.set("ExportSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportSummaries: Self = this.set("ExportSummaries", js.undefined)
    
    @scala.inline
    def setNextToken(value: ExportNextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
