package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MySQLCatalogSource extends StObject {
  
  /**
    * The name of the database to read from.
    */
  var Database: EnclosedInStringProperty
  
  /**
    * The name of the data source.
    */
  var Name: NodeName
  
  /**
    * The name of the table in the database to read from.
    */
  var Table: EnclosedInStringProperty
}
object MySQLCatalogSource {
  
  inline def apply(Database: EnclosedInStringProperty, Name: NodeName, Table: EnclosedInStringProperty): MySQLCatalogSource = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Table = Table.asInstanceOf[js.Any])
    __obj.asInstanceOf[MySQLCatalogSource]
  }
  
  extension [Self <: MySQLCatalogSource](x: Self) {
    
    inline def setDatabase(value: EnclosedInStringProperty): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTable(value: EnclosedInStringProperty): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
  }
}
