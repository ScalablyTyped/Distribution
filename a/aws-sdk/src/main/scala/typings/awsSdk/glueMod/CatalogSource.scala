package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatalogSource extends StObject {
  
  /**
    * The name of the database to read from.
    */
  var Database: EnclosedInStringProperty
  
  /**
    * The name of the data store.
    */
  var Name: NodeName
  
  /**
    * The name of the table in the database to read from.
    */
  var Table: EnclosedInStringProperty
}
object CatalogSource {
  
  inline def apply(Database: EnclosedInStringProperty, Name: NodeName, Table: EnclosedInStringProperty): CatalogSource = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Table = Table.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogSource]
  }
  
  extension [Self <: CatalogSource](x: Self) {
    
    inline def setDatabase(value: EnclosedInStringProperty): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTable(value: EnclosedInStringProperty): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
  }
}
