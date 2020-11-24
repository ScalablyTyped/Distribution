package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableWithColumnsResource extends js.Object {
  
  /**
    * The identifier for the Data Catalog. By default, it is the account ID of the caller.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The list of column names for the table. At least one of ColumnNames or ColumnWildcard is required.
    */
  var ColumnNames: js.UndefOr[typings.awsSdk.lakeformationMod.ColumnNames] = js.native
  
  /**
    * A wildcard specified by a ColumnWildcard object. At least one of ColumnNames or ColumnWildcard is required.
    */
  var ColumnWildcard: js.UndefOr[typings.awsSdk.lakeformationMod.ColumnWildcard] = js.native
  
  /**
    * The name of the database for the table with columns resource. Unique to the Data Catalog. A database is a set of associated table definitions organized into a logical group. You can Grant and Revoke database privileges to a principal. 
    */
  var DatabaseName: NameString = js.native
  
  /**
    * The name of the table resource. A table is a metadata definition that represents your data. You can Grant and Revoke table privileges to a principal. 
    */
  var Name: NameString = js.native
}
object TableWithColumnsResource {
  
  @scala.inline
  def apply(DatabaseName: NameString, Name: NameString): TableWithColumnsResource = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableWithColumnsResource]
  }
  
  @scala.inline
  implicit class TableWithColumnsResourceOps[Self <: TableWithColumnsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
    
    @scala.inline
    def setColumnNamesVarargs(value: NameString*): Self = this.set("ColumnNames", js.Array(value :_*))
    
    @scala.inline
    def setColumnNames(value: ColumnNames): Self = this.set("ColumnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnNames: Self = this.set("ColumnNames", js.undefined)
    
    @scala.inline
    def setColumnWildcard(value: ColumnWildcard): Self = this.set("ColumnWildcard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnWildcard: Self = this.set("ColumnWildcard", js.undefined)
  }
}
