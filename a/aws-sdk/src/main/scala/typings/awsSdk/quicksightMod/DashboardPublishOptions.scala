package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashboardPublishOptions extends js.Object {
  
  /**
    * Ad hoc (one-time) filtering option.
    */
  var AdHocFilteringOption: js.UndefOr[typings.awsSdk.quicksightMod.AdHocFilteringOption] = js.native
  
  /**
    * Export to .csv option.
    */
  var ExportToCSVOption: js.UndefOr[typings.awsSdk.quicksightMod.ExportToCSVOption] = js.native
  
  /**
    * Sheet controls option.
    */
  var SheetControlsOption: js.UndefOr[typings.awsSdk.quicksightMod.SheetControlsOption] = js.native
}
object DashboardPublishOptions {
  
  @scala.inline
  def apply(): DashboardPublishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardPublishOptions]
  }
  
  @scala.inline
  implicit class DashboardPublishOptionsOps[Self <: DashboardPublishOptions] (val x: Self) extends AnyVal {
    
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
    def setAdHocFilteringOption(value: AdHocFilteringOption): Self = this.set("AdHocFilteringOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdHocFilteringOption: Self = this.set("AdHocFilteringOption", js.undefined)
    
    @scala.inline
    def setExportToCSVOption(value: ExportToCSVOption): Self = this.set("ExportToCSVOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportToCSVOption: Self = this.set("ExportToCSVOption", js.undefined)
    
    @scala.inline
    def setSheetControlsOption(value: SheetControlsOption): Self = this.set("SheetControlsOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetControlsOption: Self = this.set("SheetControlsOption", js.undefined)
  }
}
