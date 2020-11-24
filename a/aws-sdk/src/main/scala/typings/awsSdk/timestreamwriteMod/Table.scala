package typings.awsSdk.timestreamwriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table extends js.Object {
  
  /**
    * The Amazon Resource Name that uniquely identifies this table.
    */
  var Arn: js.UndefOr[String] = js.native
  
  /**
    * The time when the Timestream table was created. 
    */
  var CreationTime: js.UndefOr[Date] = js.native
  
  /**
    * The name of the Timestream database that contains this table.
    */
  var DatabaseName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The time when the Timestream table was last updated.
    */
  var LastUpdatedTime: js.UndefOr[Date] = js.native
  
  /**
    * The retention duration for the memory store and magnetic store.
    */
  var RetentionProperties: js.UndefOr[typings.awsSdk.timestreamwriteMod.RetentionProperties] = js.native
  
  /**
    * The name of the Timestream table.
    */
  var TableName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The current state of the table:    DELETING - The table is being deleted.    ACTIVE - The table is ready for use.  
    */
  var TableStatus: js.UndefOr[typings.awsSdk.timestreamwriteMod.TableStatus] = js.native
}
object Table {
  
  @scala.inline
  def apply(): Table = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table]
  }
  
  @scala.inline
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: String): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Date): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: ResourceName): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseName: Self = this.set("DatabaseName", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: Date): Self = this.set("LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setRetentionProperties(value: RetentionProperties): Self = this.set("RetentionProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionProperties: Self = this.set("RetentionProperties", js.undefined)
    
    @scala.inline
    def setTableName(value: ResourceName): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("TableName", js.undefined)
    
    @scala.inline
    def setTableStatus(value: TableStatus): Self = this.set("TableStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableStatus: Self = this.set("TableStatus", js.undefined)
  }
}
