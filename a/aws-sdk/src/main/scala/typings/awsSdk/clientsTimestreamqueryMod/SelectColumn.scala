package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectColumn extends StObject {
  
  /**
    * True, if the column name was aliased by the query. False otherwise.
    */
  var Aliased: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    *  Database that has this column.
    */
  var DatabaseName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * Name of the column.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * Table within the database that has this column. 
    */
  var TableName: js.UndefOr[ResourceName] = js.undefined
  
  var Type: js.UndefOr[typings.awsSdk.clientsTimestreamqueryMod.Type] = js.undefined
}
object SelectColumn {
  
  inline def apply(): SelectColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectColumn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectColumn] (val x: Self) extends AnyVal {
    
    inline def setAliased(value: NullableBoolean): Self = StObject.set(x, "Aliased", value.asInstanceOf[js.Any])
    
    inline def setAliasedUndefined: Self = StObject.set(x, "Aliased", js.undefined)
    
    inline def setDatabaseName(value: ResourceName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTableName(value: ResourceName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
