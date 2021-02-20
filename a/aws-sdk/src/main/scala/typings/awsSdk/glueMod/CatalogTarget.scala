package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatalogTarget extends StObject {
  
  /**
    * The name of the database to be synchronized.
    */
  var DatabaseName: NameString = js.native
  
  /**
    * A list of the tables to be synchronized.
    */
  var Tables: CatalogTablesList = js.native
}
object CatalogTarget {
  
  @scala.inline
  def apply(DatabaseName: NameString, Tables: CatalogTablesList): CatalogTarget = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], Tables = Tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogTarget]
  }
  
  @scala.inline
  implicit class CatalogTargetMutableBuilder[Self <: CatalogTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTables(value: CatalogTablesList): Self = StObject.set(x, "Tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesVarargs(value: NameString*): Self = StObject.set(x, "Tables", js.Array(value :_*))
  }
}
