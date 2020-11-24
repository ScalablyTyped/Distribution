package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportConfigurationsResponse extends js.Object {
  
  /**
    * A unique identifier that you can use to query the export status.
    */
  var exportId: js.UndefOr[ConfigurationsExportId] = js.native
}
object ExportConfigurationsResponse {
  
  @scala.inline
  def apply(): ExportConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportConfigurationsResponse]
  }
  
  @scala.inline
  implicit class ExportConfigurationsResponseOps[Self <: ExportConfigurationsResponse] (val x: Self) extends AnyVal {
    
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
    def setExportId(value: ConfigurationsExportId): Self = this.set("exportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportId: Self = this.set("exportId", js.undefined)
  }
}
