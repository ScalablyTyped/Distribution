package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportConfigurationsResponse extends StObject {
  
  /**
    * A unique identifier that you can use to query the export status.
    */
  var exportId: js.UndefOr[ConfigurationsExportId] = js.undefined
}
object ExportConfigurationsResponse {
  
  @scala.inline
  def apply(): ExportConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportConfigurationsResponse]
  }
  
  @scala.inline
  implicit class ExportConfigurationsResponseMutableBuilder[Self <: ExportConfigurationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportId(value: ConfigurationsExportId): Self = StObject.set(x, "exportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportIdUndefined: Self = StObject.set(x, "exportId", js.undefined)
  }
}
