package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGlobalClusterMessage extends js.Object {
  
  /**
    *  The name for your database of up to 64 alpha-numeric characters. If you do not provide a name, Amazon Aurora will not create a database in the global database cluster you are creating. 
    */
  var DatabaseName: js.UndefOr[String] = js.native
  
  /**
    *  The deletion protection setting for the new global database. The global database can't be deleted when deletion protection is enabled. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The name of the database engine to be used for this DB cluster.
    */
  var Engine: js.UndefOr[String] = js.native
  
  /**
    * The engine version of the Aurora global database.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    * The cluster identifier of the new global database cluster.
    */
  var GlobalClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    *  The Amazon Resource Name (ARN) to use as the primary cluster of the global database. This parameter is optional. 
    */
  var SourceDBClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    *  The storage encryption setting for the new global database cluster. 
    */
  var StorageEncrypted: js.UndefOr[BooleanOptional] = js.native
}
object CreateGlobalClusterMessage {
  
  @scala.inline
  def apply(): CreateGlobalClusterMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGlobalClusterMessage]
  }
  
  @scala.inline
  implicit class CreateGlobalClusterMessageOps[Self <: CreateGlobalClusterMessage] (val x: Self) extends AnyVal {
    
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
    def setDatabaseName(value: String): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseName: Self = this.set("DatabaseName", js.undefined)
    
    @scala.inline
    def setDeletionProtection(value: BooleanOptional): Self = this.set("DeletionProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionProtection: Self = this.set("DeletionProtection", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    
    @scala.inline
    def setGlobalClusterIdentifier(value: String): Self = this.set("GlobalClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalClusterIdentifier: Self = this.set("GlobalClusterIdentifier", js.undefined)
    
    @scala.inline
    def setSourceDBClusterIdentifier(value: String): Self = this.set("SourceDBClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceDBClusterIdentifier: Self = this.set("SourceDBClusterIdentifier", js.undefined)
    
    @scala.inline
    def setStorageEncrypted(value: BooleanOptional): Self = this.set("StorageEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageEncrypted: Self = this.set("StorageEncrypted", js.undefined)
  }
}
