package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableInput extends js.Object {
  
  /**
    * A description of the table.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  
  /**
    * The last time that the table was accessed.
    */
  var LastAccessTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The last time that column statistics were computed for this table.
    */
  var LastAnalyzedTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The table name. For Hive compatibility, this is folded to lowercase when it is stored.
    */
  var Name: NameString = js.native
  
  /**
    * The table owner.
    */
  var Owner: js.UndefOr[NameString] = js.native
  
  /**
    * These key-value pairs define properties associated with the table.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
  
  /**
    * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys. When you create a table used by Amazon Athena, and you do not specify any partitionKeys, you must at least set the value of partitionKeys to an empty list. For example:  "PartitionKeys": [] 
    */
  var PartitionKeys: js.UndefOr[ColumnList] = js.native
  
  /**
    * The retention time for this table.
    */
  var Retention: js.UndefOr[NonNegativeInteger] = js.native
  
  /**
    * A storage descriptor containing information about the physical storage of this table.
    */
  var StorageDescriptor: js.UndefOr[typings.awsSdk.glueMod.StorageDescriptor] = js.native
  
  /**
    * The type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.).
    */
  var TableType: js.UndefOr[TableTypeString] = js.native
  
  /**
    * A TableIdentifier structure that describes a target table for resource linking.
    */
  var TargetTable: js.UndefOr[TableIdentifier] = js.native
  
  /**
    * If the table is a view, the expanded text of the view; otherwise null.
    */
  var ViewExpandedText: js.UndefOr[ViewTextString] = js.native
  
  /**
    * If the table is a view, the original text of the view; otherwise null.
    */
  var ViewOriginalText: js.UndefOr[ViewTextString] = js.native
}
object TableInput {
  
  @scala.inline
  def apply(Name: NameString): TableInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableInput]
  }
  
  @scala.inline
  implicit class TableInputOps[Self <: TableInput] (val x: Self) extends AnyVal {
    
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
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setLastAccessTime(value: Timestamp): Self = this.set("LastAccessTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAccessTime: Self = this.set("LastAccessTime", js.undefined)
    
    @scala.inline
    def setLastAnalyzedTime(value: Timestamp): Self = this.set("LastAnalyzedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAnalyzedTime: Self = this.set("LastAnalyzedTime", js.undefined)
    
    @scala.inline
    def setOwner(value: NameString): Self = this.set("Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
    
    @scala.inline
    def setParameters(value: ParametersMap): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    
    @scala.inline
    def setPartitionKeysVarargs(value: Column*): Self = this.set("PartitionKeys", js.Array(value :_*))
    
    @scala.inline
    def setPartitionKeys(value: ColumnList): Self = this.set("PartitionKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionKeys: Self = this.set("PartitionKeys", js.undefined)
    
    @scala.inline
    def setRetention(value: NonNegativeInteger): Self = this.set("Retention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetention: Self = this.set("Retention", js.undefined)
    
    @scala.inline
    def setStorageDescriptor(value: StorageDescriptor): Self = this.set("StorageDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageDescriptor: Self = this.set("StorageDescriptor", js.undefined)
    
    @scala.inline
    def setTableType(value: TableTypeString): Self = this.set("TableType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableType: Self = this.set("TableType", js.undefined)
    
    @scala.inline
    def setTargetTable(value: TableIdentifier): Self = this.set("TargetTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetTable: Self = this.set("TargetTable", js.undefined)
    
    @scala.inline
    def setViewExpandedText(value: ViewTextString): Self = this.set("ViewExpandedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewExpandedText: Self = this.set("ViewExpandedText", js.undefined)
    
    @scala.inline
    def setViewOriginalText(value: ViewTextString): Self = this.set("ViewOriginalText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewOriginalText: Self = this.set("ViewOriginalText", js.undefined)
  }
}
