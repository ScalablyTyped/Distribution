package typings.awsSdk.marketplacecommerceanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartSupportDataExportResult extends js.Object {
  
  /**
    * A unique identifier representing a specific request to the StartSupportDataExport operation. This identifier can be used to correlate a request with notifications from the SNS topic.
    */
  var dataSetRequestId: js.UndefOr[DataSetRequestId] = js.native
}
object StartSupportDataExportResult {
  
  @scala.inline
  def apply(): StartSupportDataExportResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSupportDataExportResult]
  }
  
  @scala.inline
  implicit class StartSupportDataExportResultOps[Self <: StartSupportDataExportResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataSetRequestId(value: DataSetRequestId): Self = this.set("dataSetRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSetRequestId: Self = this.set("dataSetRequestId", js.undefined)
  }
}
