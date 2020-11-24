package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCatalogImportStatusResponse extends js.Object {
  
  /**
    * The status of the specified catalog migration.
    */
  var ImportStatus: js.UndefOr[CatalogImportStatus] = js.native
}
object GetCatalogImportStatusResponse {
  
  @scala.inline
  def apply(): GetCatalogImportStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCatalogImportStatusResponse]
  }
  
  @scala.inline
  implicit class GetCatalogImportStatusResponseOps[Self <: GetCatalogImportStatusResponse] (val x: Self) extends AnyVal {
    
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
    def setImportStatus(value: CatalogImportStatus): Self = this.set("ImportStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportStatus: Self = this.set("ImportStatus", js.undefined)
  }
}
