package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePartitionRequest extends js.Object {
  
  /**
    * The AWS account ID of the catalog in which the partition is to be created.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The name of the metadata database in which the partition is to be created.
    */
  var DatabaseName: NameString = js.native
  
  /**
    * A PartitionInput structure defining the partition to be created.
    */
  var PartitionInput: typings.awsSdk.glueMod.PartitionInput = js.native
  
  /**
    * The name of the metadata table in which the partition is to be created.
    */
  var TableName: NameString = js.native
}
object CreatePartitionRequest {
  
  @scala.inline
  def apply(DatabaseName: NameString, PartitionInput: PartitionInput, TableName: NameString): CreatePartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionInput = PartitionInput.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePartitionRequest]
  }
  
  @scala.inline
  implicit class CreatePartitionRequestOps[Self <: CreatePartitionRequest] (val x: Self) extends AnyVal {
    
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
    def setPartitionInput(value: PartitionInput): Self = this.set("PartitionInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: NameString): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
  }
}
