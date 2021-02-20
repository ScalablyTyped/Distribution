package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseIdentifier extends StObject {
  
  /**
    * The ID of the Data Catalog in which the database resides.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The name of the catalog database.
    */
  var DatabaseName: js.UndefOr[NameString] = js.native
}
object DatabaseIdentifier {
  
  @scala.inline
  def apply(): DatabaseIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseIdentifier]
  }
  
  @scala.inline
  implicit class DatabaseIdentifierMutableBuilder[Self <: DatabaseIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
  }
}
