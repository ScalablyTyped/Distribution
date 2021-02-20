package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table extends StObject {
  
  /**
    * The ID of the Data Catalog in which the table resides.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The time when the table definition was created in the Data Catalog.
    */
  var CreateTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The person or entity who created the table.
    */
  var CreatedBy: js.UndefOr[NameString] = js.native
  
  /**
    * The name of the database where the table metadata resides. For Hive compatibility, this must be all lowercase.
    */
  var DatabaseName: js.UndefOr[NameString] = js.native
  
  /**
    * A description of the table.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  
  /**
    * Indicates whether the table has been registered with AWS Lake Formation.
    */
  var IsRegisteredWithLakeFormation: js.UndefOr[Boolean] = js.native
  
  /**
    * The last time that the table was accessed. This is usually taken from HDFS, and might not be reliable.
    */
  var LastAccessTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The last time that column statistics were computed for this table.
    */
  var LastAnalyzedTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The table name. For Hive compatibility, this must be entirely lowercase.
    */
  var Name: NameString = js.native
  
  /**
    * The owner of the table.
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
    * The last time that the table was updated.
    */
  var UpdateTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * If the table is a view, the expanded text of the view; otherwise null.
    */
  var ViewExpandedText: js.UndefOr[ViewTextString] = js.native
  
  /**
    * If the table is a view, the original text of the view; otherwise null.
    */
  var ViewOriginalText: js.UndefOr[ViewTextString] = js.native
}
object Table {
  
  @scala.inline
  def apply(Name: NameString): Table = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
  
  @scala.inline
  implicit class TableMutableBuilder[Self <: Table] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setCreateTime(value: Timestamp): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: NameString): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setIsRegisteredWithLakeFormation(value: Boolean): Self = StObject.set(x, "IsRegisteredWithLakeFormation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRegisteredWithLakeFormationUndefined: Self = StObject.set(x, "IsRegisteredWithLakeFormation", js.undefined)
    
    @scala.inline
    def setLastAccessTime(value: Timestamp): Self = StObject.set(x, "LastAccessTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAccessTimeUndefined: Self = StObject.set(x, "LastAccessTime", js.undefined)
    
    @scala.inline
    def setLastAnalyzedTime(value: Timestamp): Self = StObject.set(x, "LastAnalyzedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAnalyzedTimeUndefined: Self = StObject.set(x, "LastAnalyzedTime", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: NameString): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    @scala.inline
    def setParameters(value: ParametersMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setPartitionKeys(value: ColumnList): Self = StObject.set(x, "PartitionKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionKeysUndefined: Self = StObject.set(x, "PartitionKeys", js.undefined)
    
    @scala.inline
    def setPartitionKeysVarargs(value: Column*): Self = StObject.set(x, "PartitionKeys", js.Array(value :_*))
    
    @scala.inline
    def setRetention(value: NonNegativeInteger): Self = StObject.set(x, "Retention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionUndefined: Self = StObject.set(x, "Retention", js.undefined)
    
    @scala.inline
    def setStorageDescriptor(value: StorageDescriptor): Self = StObject.set(x, "StorageDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageDescriptorUndefined: Self = StObject.set(x, "StorageDescriptor", js.undefined)
    
    @scala.inline
    def setTableType(value: TableTypeString): Self = StObject.set(x, "TableType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableTypeUndefined: Self = StObject.set(x, "TableType", js.undefined)
    
    @scala.inline
    def setTargetTable(value: TableIdentifier): Self = StObject.set(x, "TargetTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTableUndefined: Self = StObject.set(x, "TargetTable", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: Timestamp): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "UpdateTime", js.undefined)
    
    @scala.inline
    def setViewExpandedText(value: ViewTextString): Self = StObject.set(x, "ViewExpandedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewExpandedTextUndefined: Self = StObject.set(x, "ViewExpandedText", js.undefined)
    
    @scala.inline
    def setViewOriginalText(value: ViewTextString): Self = StObject.set(x, "ViewOriginalText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewOriginalTextUndefined: Self = StObject.set(x, "ViewOriginalText", js.undefined)
  }
}
