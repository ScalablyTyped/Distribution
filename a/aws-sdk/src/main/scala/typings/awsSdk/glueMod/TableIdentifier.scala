package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableIdentifier extends StObject {
  
  /**
    * The ID of the Data Catalog in which the table resides.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The name of the catalog database that contains the target table.
    */
  var DatabaseName: js.UndefOr[NameString] = js.native
  
  /**
    * The name of the target table.
    */
  var Name: js.UndefOr[NameString] = js.native
}
object TableIdentifier {
  
  @scala.inline
  def apply(): TableIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableIdentifier]
  }
  
  @scala.inline
  implicit class TableIdentifierMutableBuilder[Self <: TableIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
