package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Database extends js.Object {
  
  /**
    * The ID of the Data Catalog in which the database resides.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * Creates a set of default permissions on the table for principals. 
    */
  var CreateTableDefaultPermissions: js.UndefOr[PrincipalPermissionsList] = js.native
  
  /**
    * The time at which the metadata database was created in the catalog.
    */
  var CreateTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * A description of the database.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  
  /**
    * The location of the database (for example, an HDFS path).
    */
  var LocationUri: js.UndefOr[URI] = js.native
  
  /**
    * The name of the database. For Hive compatibility, this is folded to lowercase when it is stored.
    */
  var Name: NameString = js.native
  
  /**
    * These key-value pairs define parameters and properties of the database.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
  
  /**
    * A DatabaseIdentifier structure that describes a target database for resource linking.
    */
  var TargetDatabase: js.UndefOr[DatabaseIdentifier] = js.native
}
object Database {
  
  @scala.inline
  def apply(Name: NameString): Database = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Database]
  }
  
  @scala.inline
  implicit class DatabaseOps[Self <: Database] (val x: Self) extends AnyVal {
    
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
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
    
    @scala.inline
    def setCreateTableDefaultPermissionsVarargs(value: PrincipalPermissions*): Self = this.set("CreateTableDefaultPermissions", js.Array(value :_*))
    
    @scala.inline
    def setCreateTableDefaultPermissions(value: PrincipalPermissionsList): Self = this.set("CreateTableDefaultPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTableDefaultPermissions: Self = this.set("CreateTableDefaultPermissions", js.undefined)
    
    @scala.inline
    def setCreateTime(value: Timestamp): Self = this.set("CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("CreateTime", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setLocationUri(value: URI): Self = this.set("LocationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationUri: Self = this.set("LocationUri", js.undefined)
    
    @scala.inline
    def setParameters(value: ParametersMap): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    
    @scala.inline
    def setTargetDatabase(value: DatabaseIdentifier): Self = this.set("TargetDatabase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetDatabase: Self = this.set("TargetDatabase", js.undefined)
  }
}
