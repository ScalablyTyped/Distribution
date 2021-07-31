package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table extends StObject {
  
  /**
    * The Amazon Resource Name that uniquely identifies this table.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The time when the Timestream table was created. 
    */
  var CreationTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The name of the Timestream database that contains this table.
    */
  var DatabaseName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The time when the Timestream table was last updated.
    */
  var LastUpdatedTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The retention duration for the memory store and magnetic store.
    */
  var RetentionProperties: js.UndefOr[typings.awsSdk.timestreamwriteMod.RetentionProperties] = js.undefined
  
  /**
    * The name of the Timestream table.
    */
  var TableName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The current state of the table:    DELETING - The table is being deleted.    ACTIVE - The table is ready for use.  
    */
  var TableStatus: js.UndefOr[typings.awsSdk.timestreamwriteMod.TableStatus] = js.undefined
}
object Table {
  
  @scala.inline
  def apply(): Table = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table]
  }
  
  @scala.inline
  implicit class TableMutableBuilder[Self <: Table] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: ResourceName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setRetentionProperties(value: RetentionProperties): Self = StObject.set(x, "RetentionProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionPropertiesUndefined: Self = StObject.set(x, "RetentionProperties", js.undefined)
    
    @scala.inline
    def setTableName(value: ResourceName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    
    @scala.inline
    def setTableStatus(value: TableStatus): Self = StObject.set(x, "TableStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableStatusUndefined: Self = StObject.set(x, "TableStatus", js.undefined)
  }
}
