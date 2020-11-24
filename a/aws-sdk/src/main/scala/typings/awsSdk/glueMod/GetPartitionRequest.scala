package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPartitionRequest extends js.Object {
  
  /**
    * The ID of the Data Catalog where the partition in question resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The name of the catalog database where the partition resides.
    */
  var DatabaseName: NameString = js.native
  
  /**
    * The values that define the partition.
    */
  var PartitionValues: ValueStringList = js.native
  
  /**
    * The name of the partition's table.
    */
  var TableName: NameString = js.native
}
object GetPartitionRequest {
  
  @scala.inline
  def apply(DatabaseName: NameString, PartitionValues: ValueStringList, TableName: NameString): GetPartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionValues = PartitionValues.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPartitionRequest]
  }
  
  @scala.inline
  implicit class GetPartitionRequestOps[Self <: GetPartitionRequest] (val x: Self) extends AnyVal {
    
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
    def setPartitionValuesVarargs(value: ValueString*): Self = this.set("PartitionValues", js.Array(value :_*))
    
    @scala.inline
    def setPartitionValues(value: ValueStringList): Self = this.set("PartitionValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: NameString): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
  }
}
