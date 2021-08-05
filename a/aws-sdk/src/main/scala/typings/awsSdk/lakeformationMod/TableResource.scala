package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableResource extends StObject {
  
  /**
    * The identifier for the Data Catalog. By default, it is the account ID of the caller.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The name of the database for the table. Unique to a Data Catalog. A database is a set of associated table definitions organized into a logical group. You can Grant and Revoke database privileges to a principal. 
    */
  var DatabaseName: NameString
  
  /**
    * The name of the table.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  
  /**
    * A wildcard object representing every table under a database. At least one of TableResource$Name or TableResource$TableWildcard is required.
    */
  var TableWildcard: js.UndefOr[typings.awsSdk.lakeformationMod.TableWildcard] = js.undefined
}
object TableResource {
  
  inline def apply(DatabaseName: NameString): TableResource = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableResource]
  }
  
  extension [Self <: TableResource](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTableWildcard(value: TableWildcard): Self = StObject.set(x, "TableWildcard", value.asInstanceOf[js.Any])
    
    inline def setTableWildcardUndefined: Self = StObject.set(x, "TableWildcard", js.undefined)
  }
}
