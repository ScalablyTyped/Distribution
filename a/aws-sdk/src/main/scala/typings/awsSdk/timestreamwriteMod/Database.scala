package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Database extends StObject {
  
  /**
    * The Amazon Resource Name that uniquely identifies this database.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The time when the database was created, calculated from the Unix epoch time.
    */
  var CreationTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The name of the Timestream database.
    */
  var DatabaseName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The identifier of the KMS key used to encrypt the data stored in the database.
    */
  var KmsKeyId: js.UndefOr[StringValue2048] = js.undefined
  
  /**
    *  The last time that this database was updated. 
    */
  var LastUpdatedTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The total number of tables found within a Timestream database. 
    */
  var TableCount: js.UndefOr[Long] = js.undefined
}
object Database {
  
  @scala.inline
  def apply(): Database = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Database]
  }
  
  @scala.inline
  implicit class DatabaseMutableBuilder[Self <: Database] (val x: Self) extends AnyVal {
    
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
    def setKmsKeyId(value: StringValue2048): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setTableCount(value: Long): Self = StObject.set(x, "TableCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableCountUndefined: Self = StObject.set(x, "TableCount", js.undefined)
  }
}
