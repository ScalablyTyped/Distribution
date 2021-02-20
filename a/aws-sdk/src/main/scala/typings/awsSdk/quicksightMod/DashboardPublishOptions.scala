package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashboardPublishOptions extends StObject {
  
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
  implicit class DashboardPublishOptionsMutableBuilder[Self <: DashboardPublishOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdHocFilteringOption(value: AdHocFilteringOption): Self = StObject.set(x, "AdHocFilteringOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdHocFilteringOptionUndefined: Self = StObject.set(x, "AdHocFilteringOption", js.undefined)
    
    @scala.inline
    def setExportToCSVOption(value: ExportToCSVOption): Self = StObject.set(x, "ExportToCSVOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportToCSVOptionUndefined: Self = StObject.set(x, "ExportToCSVOption", js.undefined)
    
    @scala.inline
    def setSheetControlsOption(value: SheetControlsOption): Self = StObject.set(x, "SheetControlsOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetControlsOptionUndefined: Self = StObject.set(x, "SheetControlsOption", js.undefined)
  }
}
