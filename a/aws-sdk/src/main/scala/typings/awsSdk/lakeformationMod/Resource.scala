package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your AWS Lake Formation environment. 
    */
  var Catalog: js.UndefOr[CatalogResource] = js.undefined
  
  /**
    * The location of an Amazon S3 path where permissions are granted or revoked. 
    */
  var DataLocation: js.UndefOr[DataLocationResource] = js.undefined
  
  /**
    * The database for the resource. Unique to the Data Catalog. A database is a set of associated table definitions organized into a logical group. You can Grant and Revoke database permissions to a principal. 
    */
  var Database: js.UndefOr[DatabaseResource] = js.undefined
  
  /**
    * The table for the resource. A table is a metadata definition that represents your data. You can Grant and Revoke table privileges to a principal. 
    */
  var Table: js.UndefOr[TableResource] = js.undefined
  
  /**
    * The table with columns for the resource. A principal with permissions to this resource can select metadata from the columns of a table in the Data Catalog and the underlying data in Amazon S3.
    */
  var TableWithColumns: js.UndefOr[TableWithColumnsResource] = js.undefined
}
object Resource {
  
  @scala.inline
  def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  
  @scala.inline
  implicit class ResourceMutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalog(value: CatalogResource): Self = StObject.set(x, "Catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogUndefined: Self = StObject.set(x, "Catalog", js.undefined)
    
    @scala.inline
    def setDataLocation(value: DataLocationResource): Self = StObject.set(x, "DataLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLocationUndefined: Self = StObject.set(x, "DataLocation", js.undefined)
    
    @scala.inline
    def setDatabase(value: DatabaseResource): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "Database", js.undefined)
    
    @scala.inline
    def setTable(value: TableResource): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
    
    @scala.inline
    def setTableWithColumns(value: TableWithColumnsResource): Self = StObject.set(x, "TableWithColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableWithColumnsUndefined: Self = StObject.set(x, "TableWithColumns", js.undefined)
  }
}
