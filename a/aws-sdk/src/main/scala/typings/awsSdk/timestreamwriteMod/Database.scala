package typings.awsSdk.timestreamwriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Database extends js.Object {
  
  /**
    * The Amazon Resource Name that uniquely identifies this database.
    */
  var Arn: js.UndefOr[String] = js.native
  
  /**
    * The time when the database was created, calculated from the Unix epoch time.
    */
  var CreationTime: js.UndefOr[Date] = js.native
  
  /**
    * The name of the Timestream database.
    */
  var DatabaseName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The identifier of the KMS key used to encrypt the data stored in the database.
    */
  var KmsKeyId: js.UndefOr[StringValue2048] = js.native
  
  /**
    *  The last time that this database was updated. 
    */
  var LastUpdatedTime: js.UndefOr[Date] = js.native
  
  /**
    * The total number of tables found within a Timestream database. 
    */
  var TableCount: js.UndefOr[Long] = js.native
}
object Database {
  
  @scala.inline
  def apply(): Database = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Database]
  }
  
  @scala.inline
  implicit class DatabaseOps[Self <: Database] (val x: Self) extends AnyVal {
    
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
    def setKmsKeyId(value: StringValue2048): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: Date): Self = this.set("LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setTableCount(value: Long): Self = this.set("TableCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableCount: Self = this.set("TableCount", js.undefined)
  }
}
