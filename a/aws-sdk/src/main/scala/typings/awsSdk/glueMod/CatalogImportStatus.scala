package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatalogImportStatus extends StObject {
  
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
  implicit class CatalogImportStatusMutableBuilder[Self <: CatalogImportStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportCompleted(value: Boolean): Self = StObject.set(x, "ImportCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportCompletedUndefined: Self = StObject.set(x, "ImportCompleted", js.undefined)
    
    @scala.inline
    def setImportTime(value: Timestamp): Self = StObject.set(x, "ImportTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportTimeUndefined: Self = StObject.set(x, "ImportTime", js.undefined)
    
    @scala.inline
    def setImportedBy(value: NameString): Self = StObject.set(x, "ImportedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportedByUndefined: Self = StObject.set(x, "ImportedBy", js.undefined)
  }
}
