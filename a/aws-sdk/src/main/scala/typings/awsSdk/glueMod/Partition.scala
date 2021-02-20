package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Partition extends StObject {
  
  /**
    * The ID of the Data Catalog in which the partition resides.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The time at which the partition was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the catalog database in which to create the partition.
    */
  var DatabaseName: js.UndefOr[NameString] = js.native
  
  /**
    * The last time at which the partition was accessed.
    */
  var LastAccessTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The last time at which column statistics were computed for this partition.
    */
  var LastAnalyzedTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * These key-value pairs define partition parameters.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
  
  /**
    * Provides information about the physical location where the partition is stored.
    */
  var StorageDescriptor: js.UndefOr[typings.awsSdk.glueMod.StorageDescriptor] = js.native
  
  /**
    * The name of the database table in which to create the partition.
    */
  var TableName: js.UndefOr[NameString] = js.native
  
  /**
    * The values of the partition.
    */
  var Values: js.UndefOr[ValueStringList] = js.native
}
object Partition {
  
  @scala.inline
  def apply(): Partition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partition]
  }
  
  @scala.inline
  implicit class PartitionMutableBuilder[Self <: Partition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    @scala.inline
    def setLastAccessTime(value: Timestamp): Self = StObject.set(x, "LastAccessTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAccessTimeUndefined: Self = StObject.set(x, "LastAccessTime", js.undefined)
    
    @scala.inline
    def setLastAnalyzedTime(value: Timestamp): Self = StObject.set(x, "LastAnalyzedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAnalyzedTimeUndefined: Self = StObject.set(x, "LastAnalyzedTime", js.undefined)
    
    @scala.inline
    def setParameters(value: ParametersMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setStorageDescriptor(value: StorageDescriptor): Self = StObject.set(x, "StorageDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageDescriptorUndefined: Self = StObject.set(x, "StorageDescriptor", js.undefined)
    
    @scala.inline
    def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    
    @scala.inline
    def setValues(value: ValueStringList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: ValueString*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
