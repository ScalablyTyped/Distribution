package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatalogImportStatus extends StObject {
  
  /**
    *  True if the migration has completed, or False otherwise.
    */
  var ImportCompleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The time that the migration was started.
    */
  var ImportTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the person who initiated the migration.
    */
  var ImportedBy: js.UndefOr[NameString] = js.undefined
}
object CatalogImportStatus {
  
  inline def apply(): CatalogImportStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatalogImportStatus]
  }
  
  extension [Self <: CatalogImportStatus](x: Self) {
    
    inline def setImportCompleted(value: Boolean): Self = StObject.set(x, "ImportCompleted", value.asInstanceOf[js.Any])
    
    inline def setImportCompletedUndefined: Self = StObject.set(x, "ImportCompleted", js.undefined)
    
    inline def setImportTime(value: Timestamp): Self = StObject.set(x, "ImportTime", value.asInstanceOf[js.Any])
    
    inline def setImportTimeUndefined: Self = StObject.set(x, "ImportTime", js.undefined)
    
    inline def setImportedBy(value: NameString): Self = StObject.set(x, "ImportedBy", value.asInstanceOf[js.Any])
    
    inline def setImportedByUndefined: Self = StObject.set(x, "ImportedBy", js.undefined)
  }
}
