package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatalogEntry extends StObject {
  
  /**
    * The database in which the table metadata resides.
    */
  var DatabaseName: NameString = js.native
  
  /**
    * The name of the table in question.
    */
  var TableName: NameString = js.native
}
object CatalogEntry {
  
  @scala.inline
  def apply(DatabaseName: NameString, TableName: NameString): CatalogEntry = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogEntry]
  }
  
  @scala.inline
  implicit class CatalogEntryMutableBuilder[Self <: CatalogEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
