package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatalogImportStatus extends js.Object {
  
  /**
    *  True if the migration has completed, or False otherwise.
    */
  var ImportCompleted: js.UndefOr[Boolean] = js.native
  
  /**
    * The time that the migration was started.
    */
  var ImportTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the person who initiated the migration.
    */
  var ImportedBy: js.UndefOr[NameString] = js.native
}
object CatalogImportStatus {
  
  @scala.inline
  def apply(): CatalogImportStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatalogImportStatus]
  }
  
  @scala.inline
  implicit class CatalogImportStatusOps[Self <: CatalogImportStatus] (val x: Self) extends AnyVal {
    
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
    def setImportCompleted(value: Boolean): Self = this.set("ImportCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportCompleted: Self = this.set("ImportCompleted", js.undefined)
    
    @scala.inline
    def setImportTime(value: Timestamp): Self = this.set("ImportTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportTime: Self = this.set("ImportTime", js.undefined)
    
    @scala.inline
    def setImportedBy(value: NameString): Self = this.set("ImportedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportedBy: Self = this.set("ImportedBy", js.undefined)
  }
}
