package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTableRequest extends js.Object {
  
  /**
    * The ID of the Data Catalog in which to create the Table. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The catalog database in which to create the new table. For Hive compatibility, this name is entirely lowercase.
    */
  var DatabaseName: NameString = js.native
  
  /**
    * A list of partition indexes, PartitionIndex structures, to create in the table.
    */
  var PartitionIndexes: js.UndefOr[PartitionIndexList] = js.native
  
  /**
    * The TableInput object that defines the metadata table to create in the catalog.
    */
  var TableInput: typings.awsSdk.glueMod.TableInput = js.native
}
object CreateTableRequest {
  
  @scala.inline
  def apply(DatabaseName: NameString, TableInput: TableInput): CreateTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableInput = TableInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTableRequest]
  }
  
  @scala.inline
  implicit class CreateTableRequestOps[Self <: CreateTableRequest] (val x: Self) extends AnyVal {
    
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
    def setTableInput(value: TableInput): Self = this.set("TableInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
    
    @scala.inline
    def setPartitionIndexesVarargs(value: PartitionIndex*): Self = this.set("PartitionIndexes", js.Array(value :_*))
    
    @scala.inline
    def setPartitionIndexes(value: PartitionIndexList): Self = this.set("PartitionIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionIndexes: Self = this.set("PartitionIndexes", js.undefined)
  }
}
