package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatalogTarget extends StObject {
  
  /**
    * The name of the database to be synchronized.
    */
  var DatabaseName: NameString
  
  /**
    * A list of the tables to be synchronized.
    */
  var Tables: CatalogTablesList
}
object CatalogTarget {
  
  inline def apply(DatabaseName: NameString, Tables: CatalogTablesList): CatalogTarget = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], Tables = Tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogTarget]
  }
  
  extension [Self <: CatalogTarget](x: Self) {
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setTables(value: CatalogTablesList): Self = StObject.set(x, "Tables", value.asInstanceOf[js.Any])
    
    inline def setTablesVarargs(value: NameString*): Self = StObject.set(x, "Tables", js.Array(value :_*))
  }
}
