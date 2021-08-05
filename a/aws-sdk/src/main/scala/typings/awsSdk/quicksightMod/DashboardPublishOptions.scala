package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashboardPublishOptions extends StObject {
  
  /**
    * Ad hoc (one-time) filtering option.
    */
  var AdHocFilteringOption: js.UndefOr[typings.awsSdk.quicksightMod.AdHocFilteringOption] = js.undefined
  
  /**
    * Export to .csv option.
    */
  var ExportToCSVOption: js.UndefOr[typings.awsSdk.quicksightMod.ExportToCSVOption] = js.undefined
  
  /**
    * Sheet controls option.
    */
  var SheetControlsOption: js.UndefOr[typings.awsSdk.quicksightMod.SheetControlsOption] = js.undefined
}
object DashboardPublishOptions {
  
  inline def apply(): DashboardPublishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardPublishOptions]
  }
  
  extension [Self <: DashboardPublishOptions](x: Self) {
    
    inline def setAdHocFilteringOption(value: AdHocFilteringOption): Self = StObject.set(x, "AdHocFilteringOption", value.asInstanceOf[js.Any])
    
    inline def setAdHocFilteringOptionUndefined: Self = StObject.set(x, "AdHocFilteringOption", js.undefined)
    
    inline def setExportToCSVOption(value: ExportToCSVOption): Self = StObject.set(x, "ExportToCSVOption", value.asInstanceOf[js.Any])
    
    inline def setExportToCSVOptionUndefined: Self = StObject.set(x, "ExportToCSVOption", js.undefined)
    
    inline def setSheetControlsOption(value: SheetControlsOption): Self = StObject.set(x, "SheetControlsOption", value.asInstanceOf[js.Any])
    
    inline def setSheetControlsOptionUndefined: Self = StObject.set(x, "SheetControlsOption", js.undefined)
  }
}
